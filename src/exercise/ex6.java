package exercise;

public class ex6 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 11; i++) {
			sum = sum + i;
			if (sum > 20) {
				break;

			}
		}
		System.out.println(sum);
	}
}
