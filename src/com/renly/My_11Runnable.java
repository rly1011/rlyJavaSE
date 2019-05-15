package com.renly;

/**
 * @author ${任岚杨}
 * @title: My_11Runnable
 * @projectName workspace_renly
 * @description:
 * 1、定义Runnable接口的实现类，重写run()方法，这个run（）方法和Thread中的run()方法一样是线程的执行体
 * 2、创建Runnable实现类的实例，并用这个实例作为Thread的target来创建Thread对象，这个Thread对象才是真正的线程对象
 * 3、第三部依然是通过调用线程对象的start()方法来启动线程
 *
 * @date 2019/5/5 16:10
 */
public class My_11Runnable implements  Runnable {


    @Override
    public void  run() {
        score();


    }

    public  synchronized void  score(){
        int i=0;
        while(i<=24){
            System.out.println("姚明得分："+i);
            i++;
            if (i==24){
                System.out.println("厉害了姚明我的哥，您的总分为:"+i);
            }
        }
    }
}
