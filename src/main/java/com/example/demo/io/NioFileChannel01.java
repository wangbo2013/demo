package com.example.demo.io;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 本地文件写入
 * @atuthor: mac
 * Create:  8/5/21  10:48 PM
 * Email: wangbo@unicloud.com
 */
public class NioFileChannel01 {
    public static void main(String[] args) throws Exception {
        String str = "Hello, world";

        // 输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D://file01.txt");

        // 定义channel
        FileChannel fileChannel = fileOutputStream.getChannel();

        // 定义buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 将str放入buffer
        byteBuffer.put(str.getBytes());

        // 对buffer进行flip
        byteBuffer.flip();

        // 将buffer写入channel
        fileChannel.write(byteBuffer);

        // 关闭输出流
        fileOutputStream.close();
    }
}
