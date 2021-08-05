package com.example.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件读取
 * @atuthor: mac
 * Create:  8/5/21  11:01 PM
 * Email: wangbo@unicloud.com
 */
public class NioFileChannel02 {
    public static void main(String[] args) throws Exception {
        File file = new File("D://file01.txt");
        // 创建输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        // 创建channel
        FileChannel fileChannel = fileInputStream.getChannel();
        // 创建buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        // 将channel的数据读到buffer
        fileChannel.read(byteBuffer);
        // 将字节转成string打印到控制台
        System.out.println(new String(byteBuffer.array()));
        // 关闭输入流
        fileInputStream.close();
    }
}
