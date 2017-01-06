package com.yangchangming.mcc.transport;

import com.yangchangming.mcc.protocal.Request;
import com.yangchangming.mcc.protocal.Response;

/**
 * <p> 通讯端点 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-06 14:32
 */
public interface EndPoint extends Channel {

    Response request(Request request) throws TransportException;

}
