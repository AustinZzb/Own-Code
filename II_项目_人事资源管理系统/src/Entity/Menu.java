/*
 *	�˵�ʵ����
 */
package Entity;

/**
 * 	@author ���°�
 *
 * 	2020��5��9��-����4:22:37
 */
public class Menu {
	private int menuId;
	private String menuName;
	private String menuMemo;
	
	public Menu() {
	}
	
	public Menu(int menuId, String menuName, String menuMemo) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuMemo = menuMemo;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuMemo() {
		return menuMemo;
	}

	public void setMenuMemo(String menuMemo) {
		this.menuMemo = menuMemo;
	}
	
	
}
