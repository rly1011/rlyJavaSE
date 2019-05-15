package com.renly;

import java.util.Scanner;

public class My_06Scanner {
    public static void main(String[] args) {
        /**
         * 1.输入字符玩玩
         */
        //从键盘输入数据
//              Scanner scan = new Scanner(System.in);
//
//        //next方式接受字符串
//        System.out.print("请输入：");
//
//        //判断是否还有输入
////        if (scan.hasNext()){
//        if (scan.hasNextLine()){
//            String str = scan.next();
//            System.out.println("输入的数据为"+str);
//        }
//
//        //关闭scanner扫描器
//        scan.close();

        /**
         * 2.一个极简版本的加法计算器
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字，以任何非数字数据结束：");
        double sum =0;
        while (scanner.hasNextDouble()==true){
            double x= scanner.nextDouble();
            sum=sum+x;
        }
        System.out.println("你输入的数字总和为"+sum);



    }
}
