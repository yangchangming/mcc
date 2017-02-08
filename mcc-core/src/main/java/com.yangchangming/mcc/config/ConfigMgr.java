package com.yangchangming.mcc.config;

import com.yangchangming.mcc.cache.Client;
import com.yangchangming.mcc.cache.MClient;
import com.yangchangming.mcc.transport.ChannelFactory;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <p> 配置管理 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 14:35
 */
public class ConfigMgr {

    private ConcurrentMap<String,Client> clients = new ConcurrentHashMap<String, Client>();

    private ConcurrentMap<String,MClient> mclients = new ConcurrentHashMap<String, MClient>();

    public void initial(){

        loadConfig();

        if (clients!=null && clients.size()>0){

            //todo jdk spi ..... extension class
            ServiceLoader<ChannelFactory> serviceLoader = ServiceLoader.load(ChannelFactory.class);
            Iterator iterator = serviceLoader.iterator();

            if (iterator.hasNext()){
                ChannelFactory channelFactory = (ChannelFactory) iterator.next();
                channelFactory.initial(clients.values());
            }
        }
    }


    /**
     * 加载配置文件
     */
    private void loadConfig(){

        //todo 加载配置文件 建立配置对象，放入相应容器中
    }

}
