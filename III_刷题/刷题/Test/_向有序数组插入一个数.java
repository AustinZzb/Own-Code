package Test;

public class _向有序数组插入一个数 {
	public static int fun(int[] arr, int n) {
		if(arr.length == 0 || arr[0] >= n) return 0;
		if(arr[arr.length - 1] < n) return arr.length;
		if(arr[arr.length - 1] == n) return arr.length - 1;
		
		return fun_0(arr, n, 0, arr.length - 1);
	}
	
	public static int fun_0(int[] arr, int n, int from, int to) {
		
		if(to - from == 1) {
			if(arr[from] > n)
				return from - 1;
			if(arr[from] == n)
				return from;
			if(arr[to] == n)
				return to;
			return to;
		}
		
		int index = (from + to) / 2;
		if(n >= arr[index]) {
			return fun_0(arr, n, index, to);
		}else {
			return fun_0(arr, n, from, index);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,5,8,25,36,98,99,100};
		System.out.println(fun(arr, 0));
	}
}
