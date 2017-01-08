package com.yangchangming.mcc.cache.memcached;

/**
 * 
 * SocketIO Pool������
 * @author wenchu.cenwc<wenchu.cenwc@alibaba-inc.com>
 *
 */
public class MemcachedClientSocketPoolConfig
{
	private String name;
	private boolean failover = true;
	private int initConn = 10;
	private int minConn = 5;
	private int maxConn = 250;
	private int maintSleep = 1000 * 3;
	private boolean nagle = false;

	private int socketTo = 3000;

	private boolean aliveCheck = true;

	/**
	 * max idle time in ms
	 */
	private int maxIdle = 3 * 1000;
	
	/**
	 * �ֲ���memcached���������б��ֶΣ��ö��ŷָ��������ַ�Ӷ˿ں�
	 */
	private String servers;
	/**
	 * �Ƿ���Ҫ������Щ��������Ȩ��
	 */
	private String weights;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public boolean isFailover()
	{
		return failover;
	}
	public void setFailover(boolean failover)
	{
		this.failover = failover;
	}
	public int getInitConn()
	{
		return initConn;
	}
	public void setInitConn(int initConn)
	{
		this.initConn = initConn;
	}
	public int getMinConn()
	{
		return minConn;
	}
	public void setMinConn(int minConn)
	{
		this.minConn = minConn;
	}
	public int getMaxConn()
	{
		return maxConn;
	}
	public void setMaxConn(int maxConn)
	{
		this.maxConn = maxConn;
	}
	public int getMaintSleep()
	{
		return maintSleep;
	}
	public void setMaintSleep(int maintSleep)
	{
		this.maintSleep = maintSleep;
	}
	public boolean isNagle()
	{
		return nagle;
	}
	public void setNagle(boolean nagle)
	{
		this.nagle = nagle;
	}
	public int getSocketTo()
	{
		return socketTo;
	}
	public void setSocketTo(int socketTo)
	{
		this.socketTo = socketTo;
	}
	public boolean isAliveCheck()
	{
		return aliveCheck;
	}
	public void setAliveCheck(boolean aliveCheck)
	{
		this.aliveCheck = aliveCheck;
	}
	public String getServers()
	{
		return servers;
	}
	public void setServers(String servers)
	{
		this.servers = servers;
	}
	public String getWeights()
	{
		return weights;
	}
	public void setWeights(String weights)
	{
		this.weights = weights;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	
}
