package others;
/**
 * ����������                  20�����ӣ�ֻ�������������Ծ���󡰴������������л����ж����п���
 * ����������
 * ����������
 * �������л�
 * 
 * @author ���°�
 *
 * 2020��2��1��-����4:15:21
 */
public class _�����л� {
	
	private static char[][] a = {{'��','��','��','��','��'},
		      					 {'��','��','��','��','��'},
		      					 {'��','��','��','��','��'},
		      					 {'��','��','��','��','��'}};
	
	private static char[] b = {'��','��','��','��','��','��','��','��'};
	
	static int count = 0,sum = 0;
	
	private static void fun(int x, int y, int count) {
		
		if(x > 3 || y > 4)
			return ;
		
		if(b[count] == '��') {
			sum ++;
			return ;
		}
			
		fun(x+1, y, count + 1);
		fun(x, y+1, count + 1);			
		
	}
	
	private static int fun(int x, int y) {
		
		if(x == 3 || y == 4)
			return 1;
		
		return fun(x+1, y) + fun(x, y+1);		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(0, 0, count);
		System.out.println(sum);
		System.out.println(fun(0, 0));
	}

}
