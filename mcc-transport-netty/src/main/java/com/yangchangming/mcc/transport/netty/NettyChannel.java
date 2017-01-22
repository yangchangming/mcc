package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.transport.Channel;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

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
        EventLoopGroup group = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).channel(NioSocketChannel.class).option(ChannelOption.ALLOCATOR.TCP_NODELAY,true).handler(new NettyChannelInitializer());

            //sync open connection
            io.netty.channel.Channel channel =  bootstrap.connect(remoteAddress).sync().channel();

            channel.closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //todo not do this for multi channel
            group.shutdownGracefully();
        }

        return false;
    }

    public void close() {

    }

    public void close(int timeout) {

    }
}
