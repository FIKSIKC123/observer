/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observerfileexample;

/**
 *
 * @author Student
 */
public interface IFileMonitor {
    
    void AddConsoleMonitor(IConsoleMonitor cmObj);
    void RemoveConsoleMonitor(IConsoleMonitor cmObj);
    void NotifyConsoleMonitor();    
}
