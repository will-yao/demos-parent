package com.xuantuo.file;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/2/11
 **/
public class ChannelFileTest {


    public static void main(String[] args) throws Exception{
        File file = new File("testFile");
        FileChannel fileChannel = new RandomAccessFile(file, "rws").getChannel();
        byte[] bytes = "asdfghi".getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }
}
