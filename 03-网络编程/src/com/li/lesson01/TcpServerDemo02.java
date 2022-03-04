package com.li.lesson01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端口
        ServerSocket serverSocket = new ServerSocket(9000);
        //2.监听客户端的连接
        Socket socket = serverSocket.accept();//阻塞式监听，会一直等待客户端连接
        //3.获取输入流
        InputStream is = socket.getInputStream();

        //4.文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.jpeg"));
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }


        //通知客户端接收完毕
        OutputStream os = socket.getOutputStream();
        os.write("我接收完毕，可以断开连接了".getBytes());

        //5.关闭所有连接
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
