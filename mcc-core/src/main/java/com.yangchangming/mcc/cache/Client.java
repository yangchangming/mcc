package com.yangchangming.mcc.cache;

import com.yangchangming.mcc.protocal.Request;
import com.yangchangming.mcc.protocal.Response;
import com.yangchangming.mcc.transport.Channel;
import com.yangchangming.mcc.transport.EndPoint;
import com.yangchangming.mcc.transport.TransportException;

import java.net.InetSocketAddress;

/**
 * <p> memcached客户端，与memcached服务端一一对应 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 14:55
 */
public class Client implements EndPoint {

    private InetSocketAddress localAddress;

    private InetSocketAddress remoteAddress;

    private Channel channel;

    /**
     * Constructor
     *
     * @param localAddress
     * @param remoteAddress
     */
    public Client(InetSocketAddress localAddress, InetSocketAddress remoteAddress){

        this.localAddress = localAddress;
        this.remoteAddress = remoteAddress;
    }

    public Response request(Request request) throws TransportException {
        return null;
    }

    public InetSocketAddress getLocalAddress() {
        return this.localAddress;
    }

    public InetSocketAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public Channel channel() {
        return this.channel;
    }

    public String getIdentity() {
        return null;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean open() {
        return false;
    }

    public void close() {

    }

    public void close(int timeout) {

    }
}
