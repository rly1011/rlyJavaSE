package com.renly;

import java.util.Properties;

/**
 * @author ${任岚杨}
 * @title: My_08Properties
 * @projectName workspace_renly
 * @description: 操作文件内对象
 * @date 2019/4/29 11:17
 */
public class My_08Properties {
   /* public static void main(String[] args) throws IOException {
        *//**
         * 1.需求一：读取文件中内容
         *//*
        Properties pps = new Properties();
        FileInputStream fips = new FileInputStream( "java/Test.properties" );
//      IDEA中文件相对路径要加上模块名称，这里与eclispe不一样
        pps.load(fips);

        Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
        while(enum1.hasMoreElements()) {
            String strKey = (String) enum1.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }





    }*/

    /**
     * 2.需求：根据key读取value，读取properties的全部信息写入新的properties信息
     *

    //根据Key读取Value
    public static String GetValueByKey(String filePath, String key) {
        Properties pps = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            pps.load(in);
            String value = pps.getProperty(key);
            System.out.println(key + " = " + value);
            return value;

        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //读取Properties的全部信息
    public static void GetAllProperties(String filePath) throws IOException {
        Properties pps = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(filePath));
        pps.load(in);
        Enumeration en = pps.propertyNames(); //得到配置文件的名字

        while(en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }

    }

    //写入Properties信息
    public static void WriteProperties (String filePath, String pKey, String pValue) throws IOException {
        Properties pps = new Properties();

        InputStream in = new FileInputStream(filePath);
        //从输入流中读取属性列表（键和元素对）
        pps.load(in);
        //调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。
        //强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
        OutputStream out = new FileOutputStream(filePath);
        pps.setProperty(pKey, pValue);
        //以适合使用 load 方法加载到 Properties 表中的格式，
        //将此 Properties 表中的属性列表（键和元素对）写入输出流
        pps.store(out, "Update " + pKey + " name");
    }

    public static void main(String [] args) throws IOException {
        //String value = GetValueByKey("Test.properties", "name");
        //System.out.println(value);
        //GetAllProperties("Test.properties");
        WriteProperties("java/Test.properties","long", "212");
    }
     */


    /**
     * 3.需求读取JVM文件信息
     */
    public static void main(String[] args) {
        Properties properties =  new Properties(  );
        properties= System.getProperties();
        properties.list( System.out );
    }




}
