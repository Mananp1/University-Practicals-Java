/*Write a program to create two threads, one thread will print odd numbers and second
thread will print even numbers between 1 to 20 numbers.*/

public class Mythread {
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}
class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<21;i+=2) {
            System.out.println(i);
        }
    }
}
class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=20;i+=2) {
            System.out.println(i);
        }
    }
}
