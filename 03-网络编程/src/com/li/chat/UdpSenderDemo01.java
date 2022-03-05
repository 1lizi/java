package com.li.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSenderDemo01 {
    public static void main(String[] args) throws  Exception{
        DatagramSocket socket = new DatagramSocket(8888);
        //准备数据：控制台读取System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            //打包
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("127.0.0.1", 6666));

            socket.send(packet);

            if(data.equals("bye")) break; //bye退出循环接收
        }

        socket.close();


    }
}
