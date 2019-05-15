package com.renly;

import java.io.*;

/**
 * 1.序列化 (Serialization)是将对象的状态信息转换为可以存储或传输的形式的过程
 * 2.Java 提供了一种对象序列化机制，该机制中，一个对象可以被表示为一个字节序列，
 * 	该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
 * 	将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，
 * 	也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
 * 3.要继承java.io.Serializable接口
 */
  public class My_07Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 1.需求：把一个txt文件写入到另一个mp8文件中
         * [南水北调工程]
         * 注意：你的角色是项目经理，不是工人，你关注每个过程是否符合规范，不用亲自动手
         */

        /*//步骤一：让File对象找到文件【安排File水源探索队找到南边水源】
        File file =new File("D:/abcdf.txt");

        //步骤二：让FileInputStream对象将文件转化成二进制流【安排FileInputStream将水管插入到南边的水源】
        FileInputStream fileIn =new FileInputStream(file);

        //步骤三：让InputStreamReader对象读取二级制流中的字节并将其解码为字符【安排InputStreamReader净化水管里的水】
        InputStreamReader inputStreamReader =new InputStreamReader(fileIn,"UTF-8");

        //步骤四：让FileOutputStream对象制定水流向具体地方【安排FileOutputStream把蓄水池修好】
        FileOutputStream fileOutputStream = new FileOutputStream( "D:/abcdf.mp8" );

        //步骤五: 让InputStreamReader对象将读出的内容放入到缓存区【安排StringBuffer对象提供动力】
        StringBuffer sb = new StringBuffer();
        while (inputStreamReader.ready()){
            sb.append((char) inputStreamReader.read());
        }

        //步骤六：让ObjectOutputStream对象，将二级制流序列化【安排ObjectOutputStream对象搭建到北边的水管】
        ObjectOutputStream objectOutputStream = new ObjectOutputStream( fileOutputStream );

        //步骤七：让ObjectOutputStream对象，获取缓存区内容【安排ObjectOutputStream对象将水从缓存区流向北边水源】
        objectOutputStream.writeObject( sb.toString() );

        //步骤八：关闭所有流
        objectOutputStream.close();
        fileOutputStream.close();;
        fileOutputStream.close();
        inputStreamReader.close();
        System.out.println("序列化完成");*/


        /**
         * 2.需求：把一个mp8文件写入到另一个txt文件中
         * [北水南调工程]
         * 注意：你的角色是项目经理，不是工人，你关注每个过程是否符合规范，不用亲自动手
         */

        // 步骤一：让File对象找到文件【安排File水源探索队找到北边水源】
        File file =new File("D:/abcdf.mp8");

        // 步骤二：让FileInputStream对象将文件转化成二进制流【安排FileInputStream将水管插入到北边的水源】
        FileInputStream fileIn =new FileInputStream(file);

        // 步骤三：让ObjectInputStream对象，将二级制流反序列化【安排ObjectOutputStream对象搭建到南边的水管】
        ObjectInputStream objectInputStream = new ObjectInputStream( fileIn );

        // 步骤四：让ObjectInputStream对象，读取序列化输入流内容【安排ObjectOutputStream对象将水从缓存区流向南边水源】
        String content= (String) objectInputStream.readObject();
        StringBuffer sb =  new StringBuffer(  );
        sb.append(content);
        System.out.println("这是该文件内容:");
        System.out.println(sb);

        //步骤六：[断电]关闭所有流
        objectInputStream.close();
        fileIn.close();





    }
}
