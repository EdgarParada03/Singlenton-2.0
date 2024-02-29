/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleton;

/**
 *
 * @author edgar
 * https://www.youtube.com/watch?v=Z06Phxtj13g
 */
public class Main {

    public static void main(String[] args) {
        Logger logger =  Logger.getInstance();
        Logger logger2 =  Logger.getInstance();
        //logger.log("Log realizado correctamente");
        
        logger.setValue("Mensaje");
        System.out.println(logger2.getValue());
    }
}
