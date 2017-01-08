package com.yangchangming.mcc.transport;

/**
 * <p> 通讯端点工厂定义 </p>
 *
 * @author changming.Y <changming.yang.ah@gmail.com>
 * @since 2017-01-06 15:07
 */
public interface EndPointFactory {

    /**
     * 初始化
     */
    void init();


    /**
     * 创建通讯端点
     *
     * @return
     */
    EndPoint create();


    /**
     * 销毁
     */
    void destroy();

}
