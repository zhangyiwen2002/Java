package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            char s ;
            while (true) {
                s= (char) br.read();
                if(s=='q'){
                    break;
                }else{
                    bw.write((int) s);
                    bw.flush();
                }


            }
            br.close();
            bw.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}
