/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerfileexample;

import java.util.ArrayList;

/**
 *
 * @author Valentina
 */
public  class FileMonitor implements IFileMonitor 
{
  private ArrayList<IConsoleMonitor> observers;
    
  private ArrayList<FileStatus> fileObj;
    
  FileMonitor()
    {
      observers = new ArrayList<IConsoleMonitor>();
      fileObj   = new ArrayList<FileStatus>();
    }

    @Override
    public void AddConsoleMonitor(IConsoleMonitor cmObj){
        if(cmObj!=null)
        {
            for(IConsoleMonitor obj:observers)
            {
                if(obj == cmObj)
                    return;
            }
          observers.add(cmObj);
          System.out.println("ADD MONITOR");
        }
    }
    @Override
    public void RemoveConsoleMonitor(IConsoleMonitor cmObj)
    {
        
    }
    @Override
    public void NotifyConsoleMonitor()
    {
         
        ArrayList<String> list = new ArrayList<String>();
      
        for(FileStatus objF: fileObj)
        {   if(objF.UpdateInfo()==true)
        {
                list.add(objF.getInfoMsg());
            }       
        }
        if(!list.isEmpty()){
        for(IConsoleMonitor obj: observers)
        {
            obj.UpdateConsoleMonitor(list);
        }
      }    
    }  
    
    public void addFile(String filePath)
    {//Не добавляем объекты с одинаковыми параметрами, такие как имя файла и путь 
        FileStatus obj  = new FileStatus(filePath);
        fileObj.add(obj);
    }

//    @Override
//    public void RemoveConsoleMonitor(IConsoleMonitor cmObj) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
