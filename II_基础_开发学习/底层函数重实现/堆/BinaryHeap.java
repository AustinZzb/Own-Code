/*
 *	完全二叉堆
 *	父节点(i) --> 子节点 左2*i+1 右2*i+2
 *	子节点(i) --> 父节点 (i-1)/2
 */
package 堆;

import java.util.Comparator;

/**
 * 	@author 张致邦
 *
 * 	2020年3月21日-下午3:55:39
 */
public class BinaryHeap<E> implements Heap<E> {
	private E[] element;
	private int size;
	private Comparator<E> comparator;
	private static final int DEFAULT_LEN = 10;

	public BinaryHeap(Comparator<E> comparator) {
		this.comparator = comparator;
		element = (E[])new Object[DEFAULT_LEN];
	}
	
	public BinaryHeap() {
		this(null);
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++)
			element[i] = null;
		size = 0;
	}

	@Override
	public void add(E element) {
		
	}

	@Override
	public E get() {
		emptyCheck();
		return element[0];
	}

	@Override
	public E remove() {
		return null;
	}

	@Override
	public E replace(E element) {
		return null;
	}
	
	/**
	 * 	@method 比较器
	 */
	private int compare(E e1, E e2) {
		return comparator != null ? comparator.compare(e1, e2)
				: ((Comparable<E>)e1).compareTo(e2);
	}
	
	/**
	 * 	@method 堆为空抛出异常
	 */
	private void emptyCheck() {
		if (size == 0)
			throw new IndexOutOfBoundsException("Heap is empty!");
	}
	

}

























