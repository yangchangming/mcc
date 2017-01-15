package com.yangchangming.mcc.transport;

/**
 * <p> channel工厂接口定义 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-15 18:54
 */
public interface ChannelFactory {

    /**
     * 获取channel
     *
     * @return
     * @throws TransportException
     */
    Channel getChannel();
}
