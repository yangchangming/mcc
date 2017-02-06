package com.yangchangming.mcc.cache;

import com.yangchangming.mcc.config.ChannelFactoryConfig;
import com.yangchangming.mcc.protocal.Request;
import com.yangchangming.mcc.protocal.Response;
import com.yangchangming.mcc.transport.ChannelFactory;

/**
 * <p> 缓存访问上下文 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 16:21
 */
public class CacheContext {

    private Request request;

    private Response response;

    private static ChannelFactory channelFactory;

    private static final ThreadLocal<CacheContext> currentContext = new ThreadLocal<CacheContext>(){

        @Override
        protected CacheContext initialValue() {
            return new CacheContext();
        }
    };


    public static CacheContext getContext(){
        return currentContext.get();
    }


    public static CacheContext initialChannelFactory( ChannelFactoryConfig channelFactoryConfig){

        if (channelFactoryConfig!=null){

            //todo 解析xml
            this.channelFactory = new NettyChannelFactory();
        }

    }






    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public ChannelFactory getChannelFactory() {
        return channelFactory;
    }

    public void setChannelFactory(ChannelFactory channelFactory) {
        this.channelFactory = channelFactory;
    }
}
