/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerfileexample;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Student
 */
public class FileStatus {

    /**
     *
     */
    File obj;
    String nameFile;
    String pathFile;
    long length;
    long lastModif;
    boolean exist;
    String msgStatus;
    
// Инициализируем все параметры
    FileStatus(String pathNameFile) {
        obj       = new File(pathNameFile);
        nameFile  = obj.getName();
        pathFile  = obj.getPath();
        length    = obj.length();
        lastModif = obj.lastModified();
        exist     = obj.exists();
        //Date d = new Date(lastModif);
        msgStatus = "File name - " + nameFile +"\n" +
                "File exist - " +  exist +"\n" +
               "Last modify - " + new Date(lastModif)+ "\n" +
               "File size - " + length +"\n";
    }
    
    
    boolean UpdateInfo() {
        boolean infoChanged = false;
        if (exist != obj.exists()) {
            exist = obj.exists();
            infoChanged = true;
            if (exist == true) {
                length = obj.length();
                lastModif = obj.lastModified();
            } else {
                length = 0;
                lastModif = 0;
            }
        }
        else
        {
            if(this.lastModif != obj.lastModified())
            {
                this.lastModif = obj.lastModified();
                this.length = obj.length();
                infoChanged = true;
            }                
        }
        
       if(infoChanged == true){
           
        msgStatus =
               "1.File name - " + nameFile +"\n" +
               "2.File exist - " +  exist +"\n" +
               "3.Last modify - " + new Date(lastModif)+ "\n" +
               "4.File size - " + length +"\n";
       } 
           
        return infoChanged;
    }
    
    
    String getInfoMsg()
    {
    return msgStatus ;
    }
}
