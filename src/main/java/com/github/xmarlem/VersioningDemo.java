package com.github.xmarlem;

public class VersioningDemo {
    public static void main(String args[]){
        System.out.println("Hello explorers, this is a test.");
        System.out.println();
        System.out.println("This program is running version " +
                VersioningDemo.class.getPackage().getImplementationVersion());
    }
}
