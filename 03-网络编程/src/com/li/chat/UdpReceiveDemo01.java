package com.li.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        while (true) {

            //准备接收数据
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
            socket.receive(packet); //阻塞式接收包裹

            //断开连接：如果接收到 bye就退出循环
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(receiveData);

            if (receiveData.equals("bye")) {
                break;
            }
        }

        socket.close();

    }
}
