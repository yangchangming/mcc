package com.yangchangming.mcc.config;

import com.yangchangming.mcc.cache.Client;
import com.yangchangming.mcc.cache.MClient;

import java.util.concurrent.ConcurrentMap;

/**
 * <p> 配置管理 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 14:35
 */
public class ConfigMgr {

    private ConcurrentMap<String,Client> clients;

    private ConcurrentMap<String,MClient> mclients;


    public void initial(){

        loadConfig();
    }


    /**
     * 加载配置文件
     */
    private void loadConfig(){

    }

}
