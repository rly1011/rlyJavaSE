package com.renly;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ${任岚杨}
 * @title: My_12SocketServer
 * @projectName workspace_renly
 * @description: 网络编程
 * @date 2019/4/25 11:57
 *
 * Socket套接字使用TCP提供了两台计算机之间的通信机制。 客户端程序创建一个套接字，并尝试连接服务器的套接字。
 * 当连接建立时，服务器会创建一个 Socket 对象。客户端和服务器现在可以通过对 Socket 对象的写入和读取来进行通信。
 * myjava.net.Socket 类代表一个套接字，并且 myjava.net.ServerSocket 类为服务器程序提供了一种来监听客户端，
 * 并与他们建立连接的机制。以下步骤在两台计算机之间使用套接字建立TCP连接时会出现：
 *
 * 步骤：
 *1.服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信。
 *2.服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
 *3.服务器正在等待时，一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接。
 *4.Socket类的构造函数试图将客户端连接到指定的服务器和端口号。如果通信被建立，则在客户端创建一个
 * Socket 对象能够与服务器进行通信。
 *5.在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket。
 */
public class My_12SocketServer extends Thread {

    public static void main(String[] args) throws IOException {

        //需求1：

        /**
         * 步骤1：服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信
         */
        int port = 7000;// 端口号
        ServerSocket sskt = new ServerSocket(port);// 在端口上创建一个服务器套接字

        /**
         * 步骤2：调用 ServerSocket类的accept()方法监听来自客户端的连接
         */
        Socket socket = sskt.accept();

        /**
         * 步骤3:调用DataInputStream数据输入流读取基本Java数据类型写入输入流
         */
        InputStream ips =socket.getInputStream();
        BufferedInputStream bips = new BufferedInputStream(ips);
        DataInputStream dips = new DataInputStream( bips );

        /**
         * 步骤4：调用DataOutputStream数据输出流将基本Java数据类型写入输出流
         */

        OutputStream ops = socket.getOutputStream();
        BufferedOutputStream bops = new BufferedOutputStream( ops );
        DataOutputStream dops = new DataOutputStream( bops );

        /**
         * 步骤5：对接输入、输出流内容
         */
        double length = dips.readDouble();
        System.out.println("服务器端收到的请求为：" + length);
        double result = length+1;
        dops.writeDouble(result);
        dops.flush();


        socket.close();
        sskt.close();
    }
}
