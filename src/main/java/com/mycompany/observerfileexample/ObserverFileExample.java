/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.observerfileexample;

import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

/**
 *
 * @author Student
 */
/*

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        
    }
}


 */
public class ObserverFileExample {

    public static void main(String[] args) throws InterruptedException {

        FileMonitor monitorObj = new FileMonitor();
        monitorObj.AddConsoleMonitor(ConsoleMonitor.getInstance());

        monitorObj.addFile("user.txt");
        monitorObj.addFile("userA.txt");
        monitorObj.addFile("userB.txt");
        monitorObj.NotifyConsoleMonitor();
        boolean doCycle = true;
        while (doCycle == true){

            monitorObj.NotifyConsoleMonitor();

        }
//        
//

//        SingleConsoleMonitor.getInstance().InfoFile("user.txt");
//        SingleConsoleMonitor ref = null;
//        ref =SingleConsoleMonitor.getInstance();
//        ref.InfoFile("user.txt");
//        System.out.println(SingleConsoleMonitor.getInstance());
//        System.out.println(SingleConsoleMonitor.getInstance());
//        System.out.println(SingleConsoleMonitor.getInstance());
//        System.out.println(SingleConsoleMonitor.getInstance());
//        System.out.println(SingleConsoleMonitor.getInstance());
        // SingleConsoleMonitor obj = new SingleConsoleMonitor();////
        //Создаем объект  FileStatus
        FileStatus  usrFile  =  new FileStatus("user.txt");
        FileStatus  usrFileA  =  new FileStatus("user.txt");
        System.out.println(usrFile.getInfoMsg());
        System.out.println(usrFile.exist);
        System.out.println(usrFile.lastModif);
        System.out.println(usrFile.length);
        System.out.println(usrFile.nameFile);
        System.out.println(usrFile.pathFile);
//        boolean doCycle = true;
        while(doCycle == true){
        

        if(usrFile.UpdateInfo() == true)
        {
            System.out.println(usrFile.getInfoMsg());
            
//        System.out.println(usrFile.exist);
//        Date d = new Date(usrFile.lastModif);
//        System.out.println(d);
//        System.out.println(usrFile.length);
//        System.out.println(usrFile.nameFile);
//        System.out.println(usrFile.pathFile);
       }
         if(usrFileA.UpdateInfo() == true)
        {
            System.out.println(usrFileA.getInfoMsg());
        }
    }
    }
}
