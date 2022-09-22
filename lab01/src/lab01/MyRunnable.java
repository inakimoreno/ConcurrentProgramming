/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01;

/**
 *
 * @author 2227093
 */
public class MyRunnable implements Runnable {

    @Override public void run(){
         String tname = Thread.currentThread().getName();
         int count = 0;
         while(true){
             System.out.println("This thread is " + tname + " "+ count++);
         }
    }
}
