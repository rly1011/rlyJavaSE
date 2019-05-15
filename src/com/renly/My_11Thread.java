package com.renly;

/**
 * @author ${任岚杨}
 * @title: MyRunnable
 * @projectName workspace_renly
 * @description: 通过继承Thread类来创建并启动多线程的一般步骤如下
 *
 *  1、定义Thread类的子类，并重写该类的run()方法，该方法的方法体就是线程需要完成的任务，run()方法也称为线程执行体。
 *  2、创建Thread子类的实例，也就是创建了线程对象
 *  3、启动线程，即调用线程的start()方法
 *
 * @date 2019/4/2613:38
 */
public class My_11Thread extends  Thread{


    /**
     * 比赛谁先得24分
     */
    @Override
    public void  run() {
        score();


    }

    public  synchronized void  score(){
        int i=0;
        while(i<=24){
            System.out.println("科比得分："+i);
            i++;
            if (i==24){
                System.out.println("厉害了科比我的哥，您的总分为:"+i);
            }
        }
    }



}
