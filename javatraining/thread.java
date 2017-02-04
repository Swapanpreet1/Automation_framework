package com.th.java;

/**
 * Created by swapanpreetkaur on 2/4/17.
 */
public class thread implements Runnable{
}


    @Override
    public void run() {
        System.out.println("Thread 1 executing");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

    }
}

class thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread 2 executing");
        for (int j=11;j<=20;j++)
        {

            System.out.println(j);
        }

    }

}

class thread3 extends Thread
{
    public void run()
    {
        System.out.println("Thread 3 executing");
        for(int i=21;i<=30;i++)
        {

            System.out.println(i);
        }
    }
}
public class ThreadStart
{
    public static void main(String[] args) {


        thread onethread = new thread();
        thread2 twothread = new thread2();
        thread3 threethread=new thread3();
        Thread t1 = new Thread(onethread);
        Thread t2 = new Thread(threethread);
        Thread t3 = new Thread();
        t2.start();
        t1.start();
        t3.start();
        try{
            t2.join();
            t1.join();
            t3.join();

        }
        catch(Exception e)
        {
            System.out.println("Thread Exception");
        }

    }

}