package com.yangchangming.mcc.transport.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;


/**
 * <p> netty channel初始化器 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-18 17:25
 */
public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline pipeline = socketChannel.pipeline();


        //todo 初始化业务handler



    }
}
