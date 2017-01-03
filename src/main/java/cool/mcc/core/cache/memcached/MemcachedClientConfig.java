package cool.mcc.core.cache.memcached;

/**
 * Memcache�Ŀͻ�������
 * @author wenchu.cenwc<wenchu.cenwc@alibaba-inc.com>
 *
 */
public class MemcachedClientConfig
{
	private String name;
	/**
	 * �Ƿ���Ҫѹ��
	 */
	private boolean compressEnable;
	/**
	 * Ĭ�ϱ��뷽ʽUTF-8
	 */
	private String defaultEncoding;
	/**
	 * ��������������Ҫȫ·��
	 */
	private String errorHandler;
	/**
	 * �ͻ��˶�Ӧ��SocketIOPool
	 */
	private String socketPool;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isCompressEnable()
	{
		return compressEnable;
	}

	public void setCompressEnable(boolean compressEnable)
	{
		this.compressEnable = compressEnable;
	}

	public String getDefaultEncoding()
	{
		return defaultEncoding;
	}

	public void setDefaultEncoding(String defaultEncoding)
	{
		this.defaultEncoding = defaultEncoding;
	}

	public String getErrorHandler()
	{
		return errorHandler;
	}

	public void setErrorHandler(String errorHandler)
	{
		this.errorHandler = errorHandler;
	}

	public String getSocketPool()
	{
		return socketPool;
	}

	public void setSocketPool(String socketPool)
	{
		this.socketPool = socketPool;
	}
	
}
