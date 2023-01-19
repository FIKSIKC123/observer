/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerfileexample;

import java.io.File;

/**
 *
 * @author СПТ
 */
public class SingleConsoleMonitor {

    private static SingleConsoleMonitor myInstance;

    public void InfoFile(String pathNameFile) {
       File obj = new File(pathNameFile);
        System.out.println(obj.getName());
        System.out.println(obj.getPath());
        System.out.println(obj.length());
        System.out.println(obj.lastModified());
       System.out.println( obj.exists());
    }

    public static SingleConsoleMonitor getInstance() {
        if (myInstance == null) {
            myInstance = new SingleConsoleMonitor();
        }
        return myInstance;
    }

    private SingleConsoleMonitor() {
    }
}
