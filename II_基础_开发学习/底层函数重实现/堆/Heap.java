/*
 *	堆接口
 */
package 堆;

/**
 * 	@author 张致邦
 *
 * 	2020年3月21日-下午3:39:15
 */
public interface Heap<E> {
	int size();				// 元素的数量
	boolean isEmpty();		// 判断堆是否为空
	void clear();			// 清空
	void add(E element);	// 添加元素
	E get();				// 获取堆顶元素
	E remove();				// 移除堆顶元素
	E replace(E element);	// 替换堆顶元素
}
