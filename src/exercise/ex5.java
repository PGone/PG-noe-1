package exercise;

public class ex5 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i < 100; i +=2) {
			sum = sum + i;
		}
		System.out.println("一百以内的奇数之和为" + sum);
	}
}
