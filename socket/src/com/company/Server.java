package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5432);
            System.out.println("启动服务器,等待连接....");
            Socket socket = serverSocket.accept();
            System.out.println("客户端:" + socket.getInetAddress() + ":" + socket.getLocalPort() + "已连接到服务器");
//读取客户端消息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println("接收客户端的消息：" + msg);
//向客户端发送消息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("hi,我是服务器\n"); // '\n'必须
            bw.flush();
            br.close();
            bw.close();
            socket.close();
            serverSocket.close(); // 关闭所有流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
