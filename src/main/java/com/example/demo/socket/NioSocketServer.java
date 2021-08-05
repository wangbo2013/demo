package com.example.demo.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

/**
 * Nio server
 * @atuthor: mac
 * Create:  2020-05-06  22:58
 * Email: wangbo@unicloud.com
 */
public class NioSocketServer {

    static ByteBuffer byteBuffer = ByteBuffer.allocate(512);
    static ArrayList<SocketChannel> socketList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 6380);
        serverSocket.bind(socketAddress);

        serverSocket.configureBlocking(false);
        while (true) {
            for(SocketChannel socketChannel : socketList){
                int read = socketChannel.read(byteBuffer);
                if (read > 0) {
                    System.out.println("read" + read);
                    byteBuffer.flip();
                    byte[] bs = new byte[read];
                    byteBuffer.get(bs);
                    String content = new String(bs);
                    System.out.println(content);
                    byteBuffer.flip();
                }
            }
            SocketChannel clientSocket = serverSocket.accept();
            if(clientSocket != null){
                System.out.println("conn success");
                clientSocket.configureBlocking(false);
                socketList.add(clientSocket);
                System.out.println("socketList size" + socketList.size());
            }
        }
    }
}
