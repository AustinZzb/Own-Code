package lanqiao;
/**
 * ������������
 * �� 2019 �ֽ�� 3 ��������ͬ��������֮�ͣ�����Ҫ��ÿ�������������� ������ 2 �� 4��һ���ж����ֲ�ͬ�ķֽⷽ����
 * ע�⽻�� 3 ��������˳����Ϊͬһ�ַ��������� 1000+1001+18 �� 1001+1000+18 ����Ϊͬһ�֡�
 * 
 * @author ���°�
 *
 * 2020��2��3��-����9:03:27
 */
public class _�ֽ�2019 {
	
	public static int fun() {
		
		int num = 0;
		for (int i = 1; i <=2019 ; i++) {
			if((i+"").indexOf("2") != -1 && (i+"").indexOf("4") != -1) continue;
			for (int j = i+1; j <= 2019; j++) {
				if((j+"").indexOf("2") != -1 && (j+"").indexOf("4") != -1) continue;
				int k = 2019 - i - j;
				if(k > i && k > j) num++;
			}
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());
	}

}
