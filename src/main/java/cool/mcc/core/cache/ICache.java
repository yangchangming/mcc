package cool.mcc.core.cache;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Cacheͳһ�ӿ�
 * @author wenchu.cenwc
 *
 */
public interface ICache<K,V>
{
	/**
	 * �������
	 * @param key
	 * @param value
	 * @return
	 */
	public V put(K key, V value);
	
	/**
	 * ��������Ч�ڵ����
	 * @param key
	 * @param value
	 * @param ��Ч��
	 * @return
	 */
	public V put(K key, V value, Date expiry);
	
	/**
	 * ��������Ч�ڵ����
	 * @param key
	 * @param value
	 * @param ��ݳ�ʱ������
	 * @return
	 */
	public V put(K key, V value, int TTL);
	
	/**
	 * ��ȡ�������
	 * @param key
	 * @return
	 */
	public V get(K key);
	
	/**
	 * �Ƴ��������
	 * @param key
	 * @return
	 */
	public V remove(K key);	
	
	/**
	 * ɾ�����л����ڵ����
	 * @return
	 */
	public boolean clear();
	
	/**
	 * �����������
	 * @return
	 */
	public int size();
	
	/**
	 * �������е�key�ļ���
	 * @return
	 */
	public Set<K> keySet();
	
	/**
	 * ���������value�ļ���
	 * @return
	 */
	public Collection<V> values();
	
	/**
	 * �Ƿ����ָ��key�����
	 * @param key
	 * @return
	 */
	public boolean containsKey(K key);
	
	/**
	 * �ͷ�Cacheռ�õ���Դ
	 */
	public void destroy();

}
