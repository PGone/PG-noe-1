package exercise;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int suiSu;
		double tongJi = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println("��" + i + "λ������:");
			suiSu = input.nextInt();
			if(suiSu<=0){
				System.out.println("������������ǷǷ�ֵ������������:");
			}
			if (suiSu > 30) {
				tongJi++;
			}
		}
		System.out.println("30��������Ⱥ����Ϊ:" + tongJi * 10 + "%");
		System.out.println("30��������Ⱥ����Ϊ:" + (100 - tongJi * 10) + "%");
	}
}