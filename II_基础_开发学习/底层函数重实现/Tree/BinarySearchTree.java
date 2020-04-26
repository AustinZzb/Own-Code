/**
 *	 二叉搜索树: 左节点小于右节点（当然可以自定义比较器）
 */
package Tree;

import java.util.Comparator;

/**
 * 	@author 张致邦
 *
 * 	2020年2月28日-上午9:51:04
 */

@SuppressWarnings("unchecked")
public class BinarySearchTree<E> extends BinaryTree<E>{
	private Comparator<E> comparator = null;
	
	public BinarySearchTree() {
		this(null);
	}
	
	
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
		
	public boolean contains(E element) {
		return node(element) != null;
	}
	
	
	public void add(E element) {
		elementNotNullCheck(element);
		
		// @note 添加根节点
		if(root == null) {
			root = createNode(element, null);
//			System.out.println("根节点：" + root.element);
			// @note 新添加节点之后的处理
			afteradd(root);
			size ++;
			return ;
		}
		
		// @note 添加其他节点，通过找到他的父节点进行添加
		Node<E> parent = root;
		Node<E> node = root;
		int n = 0;
		while(node != null) {
			n = equles(node.element, element);
			parent = node;
			if(n < 0) {
				node = node.right;
			}else if(n > 0) {
				node = node.left;
			}else {
				node.element = element;
				return ;
			}
		}
		
		Node<E> newnode = createNode(element, parent);
		if(n < 0) {
			parent.right = newnode;
//			System.out.println(parent.element + "的右节点：" + newnode.element);
		}else {
			parent.left = newnode;
//			System.out.println(parent.element + "的左节点：" + newnode.element);
		}
		// @note 新添加节点之后的处理
		afteradd(newnode);
		size++;
	}
	
	
	/**
	 *  @method 加入新节点之后的操作
	 */
	protected void afteradd(Node<E> node) { }
	
	/**
	 *  @method 删除新节点之后的操作
	 */
	protected void afteRemove(Node<E> node) { }
	
	/**
	 * 	@method 删除节点
	 */
	public void remove(E element) {
		remove(node(element));
	}
	
	
	private int equles(E e1, E e2) {	
		if(comparator != null)
			return comparator.compare(e1, e2);
		return ((Comparable<E>)e1).compareTo(e2); 
	}
	
		
	/**
	 * 	@method 判断是否为空，抛出类型错误异常
	 */
	private void elementNotNullCheck(E elemnt) {
		if(elemnt == null) {
			throw new IllegalArgumentException("element must not be null");
		}
	}
	
	
	private void remove(Node<E> node){
		if (node == null) return ;
		
		/**
		 * 	@thinking 巧妙的利用度为2节点的前驱或后继节点都是度为1或0的节点
		 */
		if (node.hasTwoChildren()) { // 度为2的节点
			// @note 找到该节点的前驱或后继节点
			Node<E> bef = befnode(node);	
			// @note 用前驱或后继节点覆盖node的值
			node.element = bef.element;
			// @note 删除前驱或后继节点
			node = bef;
		}
		
		Node<E> replacement = node.left != null ? node.left : node.right;
		
		if (replacement != null) { // 度为1的节点
			replacement.parent = node.parent;
			
			if (node.parent == null) { // 度为1的根节点
				root = replacement;
			} else if (node == node.parent.left) {
				node.parent.left = replacement;
			} else {
				node.parent.right = replacement;
			}
		} else if (node.parent == null) { // 度为0的跟节点
			root = null;
		} else {
			if (node == node.parent.left) {
				node.parent.left = null;
			} else {
				node.parent.right = null;
			}
		}
		
		afteRemove(node);
	}
	
	
	/**
	 * 	@method 根据节点值寻找到节点
	 */
	private Node<E> node(E element) {		
		Node<E> node = root;
		while (node != null) {
			int temp = equles(element, node.element);
			
			if (temp == 0) {
				return node;
			} else if (temp > 0) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		
		return null;
	}
}






















