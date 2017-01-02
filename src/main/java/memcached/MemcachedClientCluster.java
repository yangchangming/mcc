/**
 * 
 */
package memcached;

import java.util.List;

import com.alisoft.xplatform.asf.cache.IMemcachedCache;

/**
 * Memcache Cluster�Ľṹ
 * @author wenchu.cenwc<wenchu.cenwc@alibaba-inc.com>
 *
 */
public class MemcachedClientCluster
{
	private String name;
	private List<IMemcachedCache> caches;
	/**
	 * ��Ⱥģʽ��active/standby��active֧�ָ��ƣ�standby����֧���л�,Ĭ����active
	 */
	private String mode = MemcachedClientClusterConfig.CLUSTER_MODE_ACTIVE;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public List<IMemcachedCache> getCaches()
	{
		return caches;
	}
	public void setCaches(List<IMemcachedCache> caches)
	{
		this.caches = caches;
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
