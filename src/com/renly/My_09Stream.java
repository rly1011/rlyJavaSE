package com.renly;

import java.io.*;

/**
 * 流分类：方向和粒度
 * 方向分为：输入流（InputStream）与输出流（OutputStream）；
 * 粒度分为：字节流（Reader）与字符流（Writer）；
 *
 * 使用步骤：
 * 1、建立管道 eg: InputStream in = new InputStream();
 * 2、操作管道  in.read();
 * 3、关闭管道  if( in !=null ){ in.close};
 *
 * 对象流分类：
 * 1、对象序列化：将对象以二进制流的形式传输出去  objectOutputStream +FileOutputStream；
 * 2、反序列化：将传入的二进制流传入对象  ObjectInputStream + FileInputStream
 *
 *
 */
public class My_09Stream {
    public static void main(String[] args) throws IOException {
        /*
         * 1.写入文件内容
         */

        //  步骤一：先创建个txt文件，并指定路径
      /*  File f =new File("D:/abcdf.txt");

        // 步骤二：构建文件输出流对象,文件不存在会自动新建
        FileOutputStream fos = new FileOutputStream(f);

        // 步骤三：构建字符转化成字节对象
        // 参数可以指定编码,默认为操作系统默认编码,windows上默认是gbk
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

        // 步骤四：写入到缓冲区
        osw.append("一道残阳铺水中");
        osw.append("\r\n");
        osw.append("半江瑟瑟半江红");

        // 步骤五：关闭写入流,同时会把缓冲区内容写入文件
        osw.close();

        // 步骤六：关闭输出流,释放系统资源
        fos.close();*/


        /**
         * 2.读取文件内容
         */

      /*  // 步骤一：找出文件文件
        File f =new File("D:/abc.txt");

        // 步骤二：构建文件输入流对象，将文件放入输入流
        FileInputStream fis =new FileInputStream(f);

        // 步骤三：构建文件读出流对象
        InputStreamReader isr =new InputStreamReader(fis,"UTF-8");

        // 步骤四: 将读出的内容放入到字符串中打印到控制台
        StringBuffer sb = new StringBuffer();
        int count=0;
        while (isr.ready()){
            sb.append((char) isr.read());
            count+=1;
            System.out.println("读第"+count+"次");
        }

        System.out.println(sb);

        //步骤五：关闭读取流
        fis.close();

        //步骤六：关闭出入流，释放系统资源
        isr.close();*/

        /**
         * 3.创建文件夹
         * mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
         * mkdirs()方法创建一个文件夹和它的所有父文件夹。
         */
       /* String dirname = "D:/tmp";
        File d = new File(dirname);
//        // 现在创建目录
//        d.mkdirs();
        deleteFloder( d);*/

    }


  /*  public static void deleteFloder(File folder){
        File[] file = folder.listFiles();
        if (file!=null){
            for (File f :file){
                if(f.isDirectory()){
                    deleteFloder(f);
                }else {
                    f.delete();
                }
            }
        }


    }*/
}
