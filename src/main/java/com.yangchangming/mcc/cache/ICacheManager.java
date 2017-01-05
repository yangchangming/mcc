package com.yangchangming.mcc.cache; /**


/**
 * CacheManager ͳһ�ӿ�
 * @author wenchu.cenwc<wenchu.cenwc@alibaba-inc.com>
 *
 */
public interface ICacheManager<T extends ICache<?,?>>
{
	/**
	 * ��ȡ������memcached.xml�е�Cache�ͻ���
	 * @param name
	 * @return
	 */
	public T getCache(String name);
	
	
	/**
	 * ����Cache��ϵͳ�ļ�
	 * @param configFile
	 */
	public void setConfigFile(String configFile);
	
	/**
	 * ��һ���ĳ�ʼ������
	 */
	public void start();
	
	/**
	 * ����Դ���չ���
	 */
	public void stop();
	
	/**
	 * ��������Cache����
	 * @param configFile
	 */
	public void reload(String configFile);
	
	/**
	 * ������Ⱥ��node���ݿ���
	 * @param fromCache
	 * @param cluster
	 */
	public void clusterCopy(String fromCache, String cluster);
	
	/**
	 * ������Ӧͳ��ʱ����(��λ��,Ĭ��Ϊ0,0��ʾ����Ҫ����Ӧͳ��)
	 * @param seconds
	 */
	public void setResponseStatInterval(int seconds);
	
}
