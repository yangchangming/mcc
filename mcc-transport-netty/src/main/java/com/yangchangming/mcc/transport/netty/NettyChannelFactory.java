package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.cache.Client;
import com.yangchangming.mcc.transport.Channel;
import com.yangchangming.mcc.transport.support.AbstractChannelFactory;

import java.util.Collection;

/**
 * <p> channel工厂netty实现 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-15 19:34
 */
public class NettyChannelFactory extends AbstractChannelFactory {


    public void initial(Collection<Client> clients) {

        for (Client client : clients) {
            Channel channel = new NettyChannel(client.getLocalAddress(),client.getRemoteAddress());
            channel.open();
            channels.putIfAbsent(client.getIdentity(),channel);
        }
    }

    @Override
    public void get() {
    }
}
