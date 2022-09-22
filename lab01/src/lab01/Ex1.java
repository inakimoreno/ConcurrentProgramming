/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author 2227093
 */
public class Ex1 {
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        
        Thread MyThread1 = new Thread(r,"thread1");
        Thread MyThread2 = new Thread(r,"thread2");
        Thread MyThread3 = new Thread(r,"thread3");
        
        MyThread1.start();
        MyThread2.start();
        MyThread3.start();
    }
}
