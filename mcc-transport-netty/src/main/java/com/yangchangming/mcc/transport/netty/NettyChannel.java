package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.transport.Channel;

import java.net.InetSocketAddress;

/**
 * <p> 通讯管道netty实现 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-08 23:19
 */
public class NettyChannel implements Channel {


    public InetSocketAddress getLocalAddress() {
        return null;
    }

    public InetSocketAddress getRemoteAddress() {
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public void close() {

    }

    public boolean open() {
        return false;
    }

    public void close(int timeout) {

    }
}
