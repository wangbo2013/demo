package com.example.demo.io;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @atuthor: mac
 * Create:  1/10/21  10:22 PM
 * Email: wangbo@unicloud.com
 */
public class BioServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                socket = serverSocket.accept();

                inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int length = 0;
                while ((length = inputStream.read(buffer)) > 0) {
                    System.out.println(new String(buffer, 0, length));
                    outputStream = socket.getOutputStream();
                    outputStream.write("end".getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
