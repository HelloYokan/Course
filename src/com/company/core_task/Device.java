package com.company.core_task;

import java.util.Comparator;

public class Device implements Comparable<Device> {
    private long serialNumber;
    private String brand;
    private String info;
    private int price;

    public Device(long serialNumber, String brand, String info, int price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.info = info;
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return serialNumber +
                ", " + brand +
                ", " + info  +
                ", " + price;
    }

    @Override
    public int compareTo(Device o) {
        int result = this.brand.compareTo(o.brand);
        if (result == 0) {
            result = this.info.compareTo(o.info);
        }
        return result;
    }
    public static Comparator<Device> brandComparator(){
        Comparator<Device> departmentComparator = (o1, o2) -> o2.getBrand().compareTo(o1.getBrand());

        return departmentComparator;
    }
}
