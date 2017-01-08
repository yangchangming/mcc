/**
 * 
 */
package com.yangchangming.mcc.cache.memcached;

/**
 * Cluster������
 * @author wenchu.cenwc<wenchu.cenwc@alibaba-inc.com>
 *
 */
public class MemcachedClientClusterConfig
{
	private String name;
	private String[] memCachedClients;
	/**
	 * ��Ⱥģʽ��active/standby/fullcopy��
	 * 1.��ڵ㸺�ؾ��
	 * 2.������ࣨ�첽��
	 * 3.�ڵ�����л�
	 * 4.�ڵ�ظ�������Lazy����
	 * 5.��ݵݹ����
	 * 
	 * active��1,2,3,4,5;  standby:1,2,3;
	 * 
	 * Ĭ����active
	 * 
	 */
	private String mode = CLUSTER_MODE_ACTIVE;
	
	public final static String CLUSTER_MODE_ACTIVE = "active";
	public final static String CLUSTER_MODE_STANDBY = "standby";
	public final static String CLUSTER_MODE_NONE = "none";

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getMemCachedClients()
	{
		return memCachedClients;
	}

	public void setMemCachedClients(String[] memCachedClients)
	{
		this.memCachedClients = memCachedClients;
	}

	public String getMode()
	{
		return mode;
	}

	public void setMode(String mode)
	{
		this.mode = mode;
	}
}
