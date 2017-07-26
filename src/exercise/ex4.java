package exercise;

public class ex4 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 0; i < 100; i++) {
			if (i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("不能被三整除的数之和为:" + sum);
	}
}
