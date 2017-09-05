package com.thinkgem.extra.threadtest;

/**
 * Created by hanji on 2017/9/5.
 */
public class MusicImplements implements Runnable {
    //2):在A类中覆盖Runnable接口中的run方法.
    public void run() {
        //3):在run方法中编写需要执行的操作
        for (int i = 0; i < 50; i++) {
            System.out.println("播放音乐" + i);
        }

    }


    public static void main(String[] args) {
        for (int j = 0; j < 50; j++) {
            System.out.println("运行游戏" + j);
            if (j == 10) {
                //4):在main方法(线程)中,创建线程对象,并启动线程
                MusicImplements mi = new MusicImplements();
                Thread t = new Thread(mi);
                t.start();
            }
        }
    }
}