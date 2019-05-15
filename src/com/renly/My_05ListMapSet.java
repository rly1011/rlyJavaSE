package com.renly;

import java.util.*;

public class My_05ListMapSet {

    public static void main(String[] args) {
        /**
         * 1.List接口是一个有序的Collection，使用此接口能够精确的控制每个元素插入的位置，
         * 能够通过索引(元素在List中位置，类似于数组的下标)来访问List中的元素，
         * 第一个元素的索引为 0，而且允许有相同的元素。
         * List 接口存储一组不唯一，有序（插入顺序）的对象。
         */
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add( 3 );
        list.add( 100 );

        //for遍历list集合
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get( i ));
//        }

        //foreach遍历
//        for(int i:list){
//            System.out.println(i);
//        }



        //List中CRUD值
        //中途增加
//        list.add( 2,1000 );
        //中途删除
//        list.remove( 2 );
        //中途修改
//        list.set( 1,9 );
//        list.add( 100 );
        //Iterator迭代器遍历
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        /**
         * 2.Set具有与 Collection 完全一样的接口，只是行为上不同，Set 不保存重复的元素
         * Set 接口存储一组唯一，无序的对象。
         */

        //需求：商标名注册，只允许同一个商标
        Set set = new HashSet(  );
        set.add( "可口可乐" );
        set.add( "百事可乐" );
        set.add( "好爽可乐" );
        set.add( "12" );
        System.out.print("请输入商标名：");
        Scanner scanner =new Scanner( System.in );
        while (scanner.hasNext()){
            String str = scanner.next();
            if (set.contains( str )){
                System.out.print("对不起，商标已被注册，请再次输入商标名：");
            }else {
                System.out.println("商标注册成功！商标库为：");
                set.add( str );
                Iterator integer =  set.iterator();
                while (integer.hasNext()){
                    System.out.println(integer.next());
                }
            }
        }
        scanner.close();



        /**
         * 3.Map 接口存储一组键值对象，提供key（键）到value（值）的映射
         * HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
         * 该类实现了Map接口，根据键的HashCode值存储数据，具有很快的访问速度，
         * 最多允许一条记录的键为null，不支持线程同步。
         * Map中键不能重复
         */
//        Map<Integer,String> map =new HashMap<Integer,String>();
//        map.put( 1,"刘备" );
//        map.put( 2,"关羽" );
//        map.put( 3,"张飞" );
//
//
//        //通过Map.entrySet遍历key和value，遍历Map
//        System.out.println("桃园三结义兄弟：");
//        for(Map.Entry entry : map.entrySet()){
//            System.out.println("键="+entry.getKey()+",键="+entry.getValue());
//        }
//
//
//        //Map中的CURD
//        //增加
//        System.out.println("古城四兄弟相聚：");
//        map.put( 4,"赵云" );
//        System.out.println(map.values());
//
//        //删除
//        System.out.println("关公败走麦城：");
//        map.remove( 2 );
//        System.out.println(map.values());



    }
}
