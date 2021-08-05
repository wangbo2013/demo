package com.example.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @atuthor: mac
 * Create:  2020-05-06  18:35
 * Email: wangbo@unicloud.com
 */
public class BioSocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6380);
        /*socket.getOutputStream().write("test".getBytes());
        socket.close();*/

        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        socket.getOutputStream().write(next.getBytes());
        socket.close();
    }
}
