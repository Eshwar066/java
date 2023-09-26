package Sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        try{
            System.out.println("waiting for client connection");
            ServerSocket ss=new ServerSocket(9806);
            Socket soc=ss.accept();
            System.out.println("Connection Established");
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str=in.readLine();
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println("server says"+ str);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
