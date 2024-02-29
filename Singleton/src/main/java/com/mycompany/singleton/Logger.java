/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author edgar
 */
public class Logger {
    
    private static Logger log ;
    private String value;
    
    private Logger(){
        
    }
    
    public static synchronized Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }
    
    public void log(String msj){
        System.out.println(msj);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Logger{" + "value=" + value + '}';
    }
    
    
}
