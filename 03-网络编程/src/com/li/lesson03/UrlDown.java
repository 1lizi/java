package com.li.lesson03;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDown {
    public static void main(String[] args) throws IOException {
        //1.下载地址（可以写自己想下的资源链接）
        URL url = new URL("https://m701.music.126.net/20220305130937/292d051724c7fdd34cb5cfec432afdaa/jdyyaac/0f5c/015a/065e/8605fc5b996069d98547143dcbfc978f.m4a");
        //2.连接到这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("8605fc5b996069d98547143dcbfc978f.m4a");
        byte[] buffer = new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            fos.write(buffer,0,len); //写出这个数据到文件
        }

        fos.close();
        inputStream.close();
        urlConnection.disconnect(); //断开连接
    }
}
