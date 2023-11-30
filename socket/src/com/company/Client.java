package com.company;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5432);
            System.out.println("启动客户端....");
//向服务器端发送消息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("hi,我是客户端\n"); // '\n'必须
            bw.flush();
//读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println("接收服务器信息：" + msg);
            br.close();
            bw.close();
            socket.close(); // 关闭所有流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



