package Sockets.EchoSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("waiting for client connection");
            ServerSocket ss=new ServerSocket(1111);
            Socket soc=ss.accept();
            System.out.println("connection Establised");
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str=in.readLine();
            PrintWriter pw=new PrintWriter(soc.getOutputStream(),true);
            pw.println("server says"+ str);
            System.out.println(str);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
