package Sockets.EchoSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("client Server");
            Socket soc=new Socket("localhost",1111);
            System.out.println("Enter a String");
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String str=bf.readLine();
            PrintWriter pw=new PrintWriter(soc.getOutputStream(),true);
            pw.println(str);
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
