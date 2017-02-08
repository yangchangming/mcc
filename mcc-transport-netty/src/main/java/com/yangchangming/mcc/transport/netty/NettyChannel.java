package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.transport.Channel;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
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

    private io.netty.channel.Channel channel;

    /**
     * Constructor
     *
     * @param localAddress
     * @param remoteAddress
     */
    public NettyChannel(InetSocketAddress localAddress, InetSocketAddress remoteAddress){
        this.localAddress = localAddress;
        this.remoteAddress = remoteAddress;
    }

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

    public String getIdentity() {

        if (localAddress!=null && remoteAddress!=null){
            return localAddress.getAddress().getHostAddress() + "-" + localAddress.getPort() + "-" +
                    remoteAddress.getAddress().getHostAddress() + "-" + remoteAddress.getPort();
        }
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean open() {

        if (this.remoteAddress==null){
            return false;
        }
        EventLoopGroup group = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).channel(NioSocketChannel.class).option(ChannelOption.ALLOCATOR.TCP_NODELAY,true).handler(new NettyChannelInitializer());

            //sync open connection,block?
            ChannelFuture channelFuture =  bootstrap.connect(remoteAddress).sync();

            if (channelFuture.isSuccess()){
                if (channelFuture.channel().isOpen()){
                    this.channel = channelFuture.channel();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            //todo not do this for multi channel
            group.shutdownGracefully();
        }
        return true;
    }


    public Object channel() {

        if (channel!=null && channel instanceof io.netty.channel.Channel){
            return channel;
        }
        return null;
    }

    public void close() {

    }

    public void close(int timeout) {

    }
}
