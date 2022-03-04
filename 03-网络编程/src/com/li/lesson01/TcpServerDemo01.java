package com.li.lesson01;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务端
 */
public class TcpServerDemo01 {

    public static void main(String[] args) {
        ByteArrayOutputStream baos = null;
        InputStream inputStream  =null;
        Socket socket = null;
        ServerSocket serverSocket  = null;
        try {
            //1.服务器需要有一个地址
            serverSocket = new ServerSocket(9999);
            while(true) {
                //2.等待客户端连接进来
                socket = serverSocket.accept();
                //3.读取客户端的消息
                inputStream = socket.getInputStream();

                /*在传输的过程中，可能会出现问题
                byte[] buffer = new byte[1024];
                int len;
                while((len = inputStream.read(buffer)) != -1){
                String msg = new String(bytes,0,len);
                System.out.println(msg);
                }*/

                //管道流
                baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len =inputStream.read(buffer)) != -1) {
                    baos.write(buffer, 0, len);
                }
                System.out.println(baos.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!= null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!= null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


