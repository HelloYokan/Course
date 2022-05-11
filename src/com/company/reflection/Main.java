package com.company.reflection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName();
        Class<ClassExample> classExampleClass = (Class<ClassExample>) Class.forName("com.company.reflection.ClassExample");
        //Class *name* = new Class(***);
        //Class<ClassExample> name = (Class<ClassExample>) name.getClass();
        ClassExample classExample = new ClassExample();
        Class<ClassExample> classExampleClass1 = (Class<ClassExample>) classExample.getClass();
        //Class<classExample> *name* = classExample.class;
        Class<ClassExample> classExampleClass2 = ClassExample.class;

        System.out.println(Arrays.toString(classExampleClass.getInterfaces()));
        System.out.println(classExampleClass.getSuperclass());

        System.out.println(Arrays.toString(classExampleClass.getFields()));
        System.out.println(Arrays.toString(classExampleClass.getDeclaredFields()));

        System.out.println(Arrays.toString(classExampleClass.getMethods()));
        System.out.println(Arrays.toString(classExampleClass.getDeclaredMethods()));

        System.out.println(Arrays.toString(classExampleClass.getConstructors()));
    }
}
