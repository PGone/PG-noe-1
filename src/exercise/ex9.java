package exercise;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		int sum = 3;
		String name = "";
		int password = 0;
		int i ;
		Scanner input = new Scanner(System.in);
		for ( i = 0; i < 3; i++) {
			System.out.println("�������û���: ");
			name = input.next();
			System.out.println("����������:");
			password = input.nextInt();
			if (("jim").equals(name) && password == 123456) {
				System.out.println("��ӭ��½Myshoppingϵͳ��");
				break;
			} else {
				sum--;
				System.out.println("�������������" + sum + "�λ���");

				continue;

			}

		}
		if (i == 3) {
			System.out.println("�Բ�����3�ξ��������");
		}
	}
}
