package com.yangchangming.mcc.transport;

import java.net.InetSocketAddress;

/**
 * <p> 通讯管道 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-06 14:44
 */
public interface Channel {

    /**
     * 获取本地通讯端点网络地址
     *
     * @return
     */
    InetSocketAddress getLocalAddress();


    /**
     * 获取远程通讯端点网络地址
     *
     * @return
     */
    InetSocketAddress getRemoteAddress();


    /**
     * 返回标志该channel的唯一合法标志
     * 默认实现方式：客户端和服务端网络地址与端口的组合
     *
     * @return
     */
    String getIdentity();


    /**
     * 是否可用
     *
     * @return
     */
    boolean isAvailable();

    /**
     * 打开通讯管道，建立连接
     *
     * @return
     */
    boolean open(InetSocketAddress remoteAddress);

    /**
     * 关闭
     */
    void close();

    /**
     * 优雅关闭
     *
     * @param timeout
     */
    void close(int timeout);
}
