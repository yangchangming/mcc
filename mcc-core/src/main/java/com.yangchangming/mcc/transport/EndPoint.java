package com.yangchangming.mcc.transport;

import com.yangchangming.mcc.protocal.Response;
import com.yangchangming.mcc.protocal.Request;

/**
 * <p> 通讯端点 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-06 14:32
 */
public interface EndPoint extends Channel {

    /**
     * 发送请求
     *
     * @param request
     * @return
     * @throws TransportException
     */
    Response request(Request request) throws TransportException;


    /**
     * 获取关联的通讯管道
     *
     * @return
     */
    Channel channel();

}
