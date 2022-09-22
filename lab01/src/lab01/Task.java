/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.time.Duration;
import java.time.LocalTime;
import static lab01.ThreeTasks.MAX;

/**
 *
 * @author 2227093
 */
public class Task extends Thread {
    public Task(String id){
        super(id);
    }
    
    public Task(){
        super();
    }
    
    @Override public void run(){
        LocalTime start = LocalTime.now();
        System.out.println("Task " + Task.currentThread().getName() + " started at " + start);
        long sum = 0;
        for (long i = 0; i<MAX; i++)
            sum++;
        LocalTime finish = LocalTime.now();
        System.out.println("Task " + Task.currentThread().getName() + " ended at "+finish 
                + " after running for "+ Duration.between(start, finish).toMillis()
                +" milliseconds, with sum = "+sum);
    }
}
