package com.yangchangming.mcc.cache;

import com.yangchangming.mcc.protocal.Request;
import com.yangchangming.mcc.protocal.Response;
import com.yangchangming.mcc.transport.EndPoint;
import com.yangchangming.mcc.transport.TransportException;

import java.net.InetSocketAddress;

/**
 * <p> memcached客户端，物理节点 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 14:55
 */
public class Client implements EndPoint {


    public Response request(Request request) throws TransportException {
        return null;
    }

    public InetSocketAddress getLocalAddress() {
        return null;
    }

    public InetSocketAddress getRemoteAddress() {
        return null;
    }

    public String getIdentity() {
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean open(InetSocketAddress remoteAddress) {
        return false;
    }

    public void close() {

    }

    public void close(int timeout) {

    }
}
