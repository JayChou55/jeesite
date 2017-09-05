package com.thinkgem.extra.threadtest;

/**
 * Created by hanji on 2017/9/5.
 */

public class FirstThreadTest extends Thread{
    int i = 0;
    //重写run方法，run方法的方法体就是现场执行体
    public void run()
    {
        for(;i<1000;i++){
            System.out.println(getName()+"  "+i);

        }
    }
    public static void main(String[] args)
    {
        for(int i = 0;i< 1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  : "+i);
            if(i==20)
            {
                new FirstThreadTest().start();
                new FirstThreadTest().start();
            }
        }
    }

}