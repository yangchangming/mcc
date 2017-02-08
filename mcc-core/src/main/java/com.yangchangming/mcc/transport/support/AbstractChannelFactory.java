package com.yangchangming.mcc.transport.support;

import com.yangchangming.mcc.transport.Channel;
import com.yangchangming.mcc.transport.ChannelFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <p> channel工厂抽象类 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-07 11:48
 */
public abstract class AbstractChannelFactory implements ChannelFactory {

    protected ConcurrentMap<String,Channel> channels = new ConcurrentHashMap<String, Channel>();

    protected abstract void get();

    public Channel getChannel(String identity) {

        if (identity==null || "".equals(identity) || channels==null || channels.isEmpty()){
            return null;
        }
        return channels.get(identity);
    }


    public boolean hasChannel(String identity) {

        if (channels==null || channels.isEmpty() || !channels.containsKey(identity)){
            return false;
        }
        return true;
    }

}
