package com.renly;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
程序：我的第一个java
日期：2019-04-23
 */
public class My_01HelloWorld {
    public static void main(String[] args) {
       /* int day=0;
        //3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
        for (int i = 3000; i >=5 ; i=i/2) {
            day++;
        }
        System.out.println("天数"+day);*/

        for (int i = 0; i < 1000000000; i++) {
            Date now = new Date(  );
            SimpleDateFormat sdf = new SimpleDateFormat( "yyyy年MM月dd日 hh:mm:ss" );
            String sb = sdf.format( now );
            if (sb.equals( "2019年04月29日 11:14:00" )){
                System.out.println("时间到");break;
            }
            System.out.println(i++);
        }

// }

    }


}
