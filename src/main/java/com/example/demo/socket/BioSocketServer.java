package com.example.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @atuthor: mac
 * Create:  2020-05-06  18:24
 * Email: wangbo@unicloud.com
 */
public class BioSocketServer {
    static byte[] bs = new byte[1024];
    static ArrayList<Socket> sockets = null;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6380);
        while (true) {
            System.out.println("wait connection");
            Socket clientSocket = serverSocket.accept();
            System.out.println("connection success");
            System.out.println("wait data");
            clientSocket.getInputStream().read(bs);
            System.out.println("data success");
            System.out.println(new String(bs));
        }
    }
}
