package com.company;

import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5120);
            OutputStream os = socket.getOutputStream();
            PrintWriter bw = new PrintWriter(os);
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while (true){
                Thread.sleep(30000);
                bw.write("isLive?\n");
                bw.flush();
                if(br.readLine().equals("Working")) {
                    System.out.println("Server is working");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
