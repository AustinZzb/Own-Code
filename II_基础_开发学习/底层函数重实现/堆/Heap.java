/*
 *	�ѽӿ�
 */
package ��;

/**
 * 	@author ���°�
 *
 * 	2020��3��21��-����3:39:15
 */
public interface Heap<E> {
	int size();				// Ԫ�ص�����
	boolean isEmpty();		// �ж϶��Ƿ�Ϊ��
	void clear();			// ���
	void add(E element);	// ���Ԫ��
	E get();				// ��ȡ�Ѷ�Ԫ��
	E remove();				// �Ƴ��Ѷ�Ԫ��
	E replace(E element);	// �滻�Ѷ�Ԫ��
}
