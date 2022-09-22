/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.time.Duration;
import java.time.LocalTime;
import static lab01.ThreeTasks.task;

/**
 *
 * @author 2227093
 */
public class Ex3 {
    
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        System.out.println("Main thread started at "+start);
        
        Thread MyThread1 = new Task();
        Thread MyThread2 = new Task();
        Thread MyThread3 = new Task();
        
        MyThread1.start();
        MyThread2.start();
        MyThread3.start();
        
        LocalTime finish = LocalTime.now();
        System.out.println("Main thread ended at " + finish
                + " after running for " + Duration.between(start, finish).toMillis()
                + " milliseconds");
    }
    
}
