package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.transport.Channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;

/**
 * <p> 通讯管道netty实现 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-08 23:19
 */
public class NettyChannel implements Channel {

    private InetSocketAddress localAddress;

    private InetSocketAddress remoteAddress;

    /**
     * 不支持获取通讯的本地地址
     *
     * @return
     */
    public InetSocketAddress getLocalAddress() {

        return null;
    }

    public InetSocketAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean open(InetSocketAddress remoteAddress) {

        if (remoteAddress==null){
            return false;
        }

        try {
            Socket socket = null;
            this.remoteAddress = remoteAddress;
            SocketChannel channel = SocketChannel.open();

            if (channel.connect(remoteAddress)){
                socket = channel.socket();
            }







        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void close() {

    }

    public void close(int timeout) {

    }
}
