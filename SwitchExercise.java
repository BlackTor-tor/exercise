import java.util.Scanner;
public class SwitchExercise {

//	public static void main(String[] args) {
		/*
		1)
		ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��ֻת�� a, b, c, d, e. ��������� "other"��
		*/
		
	/*	//����Scanner���󣬽����ַ�ֵ
		Scanner sc = new Scanner(System.in);

		System.out.println("���������һ���ַ���");
		char ziFu = sc.next().charAt(0);

		switch (ziFu) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");

		}*/



		/*2)
		��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
		*/
		
		/*//����Scanner���󣬽����ַ�ֵ
		Scanner sc = new Scanner(System.in);

		System.out.println("�����������ĳɼ���");
		int score = sc.nextInt();
		if (score >= 1 && score <= 100) {
			switch (score / 60) {
				case 0 :
					System.out.println("���ϸ�");
					break;
				case 1 :
					System.out.println("�ϸ�");
					break;

			}
		}else {
			System.out.println("������ĳɼ���������������");
		}*/



		/*3)
		��������ָ���·ݣ� ��ӡ���·������ļ��ڡ� 3,4,5 ���� 6,7,8 �ļ�
		9,10,11 �＾ 12, 1, 2 ���� [������ϰ, ��ʾ ʹ�ô�͸ ]
		*/

	/*	//����Scanner���󣬽����ַ�ֵ
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ���·ݣ�");
		int month = sc.nextInt();

		switch (month) {
			case 12 :
			case 1:
			case 2 :
				System.out.println(month + "�·����ڶ���");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println(month + "�·����ڴ���");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println(month + "�·������ļ�");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println(month + "�·������＾");
				break;
			default :
				System.out.println("��������·���������������");

			}*/
//		}
	}
