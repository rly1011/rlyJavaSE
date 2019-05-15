package com.renly;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author ${任岚杨}
 * @title: MySocket
 * @projectName workspace_renly
 * @description:
 * 1.网络编程是指编写运行在多个设备（计算机）1的程序这些设备都通过网络连接起来；
 *
 * @date 2019/4/2511:46
 */
public class My_12SocketClient {

    /**
     * 描述：Socket编程
     * 套接字使用TCP提供了两台计算机之间的通信机制。客户端程序创建一个套接字，并尝试连接服务器的套接字。
     * 当连接建立时，服务器会创建一个Socket对象。客户端和服务器现在可以通过对Socket对象的写入和读取来进行通信。
     * myjava.net.Socket类代表一个套接字，并且java.net.ServerSocket类为服务器程序提供了一种来监听客户端，
     * 并与他们建立连接的机制
     * <p>
     * 步骤：
     * 1.服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信。
     * 2.服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
     * 3.服务器正在等待时，一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接。
     * 4.Socket 类的构造函数试图将客户端连接到指定的服务器和端口号。如果通信被建立，
     * 则在客户端创建一个 Socket 对象能够与服务器进行通信。
     * 5.在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket。
     */

    public static void main(String[] args) throws UnknownHostException, IOException {

        /**
         * 步骤1：服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信
         */
        int port = 7000;
        String host = "localhost";


        /**
         * 步骤2：一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接
         */
        Socket socket = new Socket(host, port);

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
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的储蓄金额:");
        double length = sc.nextDouble();
        dops.writeDouble(length);
        dops.flush();
        double area = dips.readDouble();
        System.out.println("服务器返回的金额为:" + area);
        socket.close();
    }


}
