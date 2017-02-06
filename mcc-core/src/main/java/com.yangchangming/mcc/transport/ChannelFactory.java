package com.yangchangming.mcc.transport;

/**
 * <p> channel工厂接口定义 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-15 18:54
 */
public interface ChannelFactory {

    /**
     * 初始化所有需要建立的channel
     */
    void initial();

    /**
     * 获取channel
     *
     * @param identity   channel identity
     * @return
     * @throws TransportException
     */
    Channel getChannel(String identity);

    /**
     * 是否存在指定的channel
     *
     * @param  identity
     * @return
     */
    boolean hasChannel(String identity);
}
