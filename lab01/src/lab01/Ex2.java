/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author 2227093
 */
public class Ex2 extends Thread{
    
    public Ex2(String name){
        super(name);
    }
    
    public Ex2(){
        super();
    }
 
    @Override public void run(){
        String tname = Thread.currentThread().getName();
        int count = 0;
        while(!interrupted()){
            System.out.println("This thread is " + tname + " "+ count++);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Ex2");
        Thread MyThread1 = new Ex2("thread1");
        Thread MyThread2 = new Ex2("thread2");
        Thread MyThread3 = new Ex2("thread3");
     
//        MyThread1.setDaemon(true);
//        MyThread2.setDaemon(true);
//        MyThread3.setDaemon(true);
        
        MyThread1.start();
        MyThread2.start();
        MyThread3.start();
        
        try{
            Thread.sleep(10L);
            MyThread1.interrupt();
        }catch(InterruptedException ex){}

    }
    
}
