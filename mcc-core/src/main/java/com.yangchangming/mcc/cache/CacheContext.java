package com.yangchangming.mcc.cache;

import com.yangchangming.mcc.protocal.Request;
import com.yangchangming.mcc.protocal.Response;

/**
 * <p> 缓存访问上下文 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-02-06 16:21
 */
public class CacheContext {

    private Request request;

    private Response response;

    private static final ThreadLocal<CacheContext> currentContext = new ThreadLocal<CacheContext>(){

        @Override
        protected CacheContext initialValue() {
            return new CacheContext();
        }
    };

    /**
     * 获取当前线程中的上下文对象
     *
     * @return
     */
    public static CacheContext getContext(){
        return currentContext.get();
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

}
