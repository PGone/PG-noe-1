package exercise;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("\t�������ع������ϵͳ");
		System.out.println("\n");
		System.out.println("\t\t1����¼ϵͳ");
		System.out.println("\n");
		System.out.println("\t\t2���˳�");
		System.out.println("\n");
		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ���½�����˳���");
		int dengLu = sc.nextInt();
		switch (dengLu) {
		case 1:
			System.out.println("\t\t1���ͻ���Ϣ����");
			System.out.println("\n");
			System.out.println("\t\t2���������");
			System.out.println("\n");
			System.out.println("\t\t3���������");
			System.out.println("\n");
			System.out.println("\t\t4��ע��");
			break;
		case 2:
			System.out.println("\tллʹ��");
			break;
		default:
			System.out.println("\tллʹ��");
			break;
		}
	}
}
