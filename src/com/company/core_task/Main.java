package com.company.core_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Device> deviceLinkedList = new LinkedList<>();
        Map<Long, Device> deviceMap = new HashMap<>();
        String goOn;

        try {
            // find the file with devices data
            File deviceFile = new File("D:\\Course\\src\\com\\company\\task.txt");
            //use a scanner that will read data from the file
            Scanner deviceScanner = new Scanner(deviceFile);

            while (deviceScanner.hasNextLine()) {
                String nextLine = deviceScanner.nextLine();

                //Split the files into parts
                String[] deviceComponents = nextLine.split(", ");

                //Get the components of the devices
                long id = Long.parseLong(deviceComponents[0]);
                String brand = deviceComponents[1];
                String info = deviceComponents[2];
                int price = Integer.parseInt(deviceComponents[3]);

                Device newDevice = new Device(id,brand,info,price);
                deviceLinkedList.add(newDevice);
                deviceMap.put(newDevice.getSerialNumber(), newDevice);


            }
            //Menu
            do {
                Menu(deviceLinkedList, deviceMap);
                System.out.println("Wish to continue? ");
                goOn = scanner.next();
            } while (goOn.equalsIgnoreCase("Yes"));


        } catch (FileNotFoundException e) {
            System.out.println("File not found, try again");
        }
    }
    //printing out objects
    private static void show(List<Device> devices){
        for (Device device : devices) {
            System.out.println(device);
        }
    }

    private static void Menu(LinkedList<Device> devices, Map<Long, Device> deviceMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Choose an operation :\s
                1.Print out list of devices.
                2.Search by serial number.
                3.Sort list by brands.
                4.Print out devices, which price bigger than 400.
                5.Print out devices which has '0' in their serial number and price bigger than 800.
                6.Print out the most expensive good""");
        System.out.println("Choose an operation: ");
        int operation = scanner.nextInt();
        //realizing menu through 'switch'
        switch (operation) {
            case 1 -> show(devices);
            case 2 -> {
                System.out.println("Please enter your id : ");
                long lookById = scanner.nextLong();

                if (deviceMap.containsKey(lookById)) {
                    System.out.println(deviceMap.get(lookById));
                } else {
                    System.out.println("Error! There is no such device in our database");
                }
            }
            case 3 -> {
                devices.sort(Device.brandComparator());
                show(devices);
            }
            case 4 -> {
                for (Device device : devices) {
                    if (device.getPrice() > 400) {
                        System.out.println(device);
                    }
                }
            }
            case 5 -> {
                for (Device device : devices) {
                    if (Long.toString(device.getSerialNumber()).contains("0") && device.getPrice() > 800) {
                        System.out.println(device);
                    }
                }
            }
            case 6 -> {
                Device max = (Device) deviceMap.values().stream().max(Comparator.comparing(Device::getPrice)).get();
                System.out.println(max);
            }
        }
    }
}
