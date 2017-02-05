package com.yangchangming.mcc.transport.netty;

import com.yangchangming.mcc.transport.Channel;
import com.yangchangming.mcc.transport.ChannelFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <p> channel工厂netty实现 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-15 19:34
 */
public class NettyChannelFactory implements ChannelFactory {

    private ConcurrentMap<String,Channel> channels = new ConcurrentHashMap<String, Channel>();

    public Channel getChannel(String identity) {

        if (identity==null || "".equals(identity) || channels==null || channels.isEmpty()){
            return null;
        }
        return channels.get(identity);
    }

    public void initial(){

    }

    public boolean hasChannel(String identity){

        if (channels==null || channels.isEmpty() || !channels.containsKey(identity)){
            return false;
        }
        return true;
    }



}
