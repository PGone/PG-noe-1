package exercise;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\t1���ͻ���Ϣ����");
		System.out.println("\t2���������");
		System.out.println("\t3������ع�");
		System.out.println("\t4��ע��");
		System.out.println("��ѡ����������:");
		i = input.nextInt();
		while (i <= 4) {
			if (i == 1) {
				System.out.println("\t1���ͻ���Ϣ����");
			} else if (i == 2) {
				System.out.println("\t2���������");
			} else if (i == 3) {
				System.out.println("\t3������ع�");
			} else if (i == 4) {
				System.out.println("\t4��ע��");

			}else{
				System.out.println("��������ȷ��ţ�");
			}
			System.out.println("���������");
		}
	}
}
