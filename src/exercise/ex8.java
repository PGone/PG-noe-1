package exercise;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		int kaHao = 0;
		String sR = "";
		int jiFen = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("�������Ա���ţ�4λ������");
			kaHao = input.nextInt();
			System.out.println("�������Ա���գ���/��<����λ������ʾ>��");
			sR = input.next();
			System.out.println("�������Ա����");
			jiFen = input.nextInt();
			if (kaHao < 1000 || kaHao > 9999) {
				System.out.println("������Ǵ���Ļ�Ա���ţ����������룡");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ��:" + "��Ա����" + kaHao + "��Ա����" + sR + "��Ա����" + jiFen);
		}
		System.out.println("���������");
	}
}
