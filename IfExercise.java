import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IfExercise {

    private static int adultPrice = 60 ;
    private static int childPrice = adultPrice / 2;
    private static int oldPrice = adultPrice / 3;
    private static int month = 3;
    /*public static void main(String[] args) {
                        *//*����
                        ��Ʊϵͳ�����ݵ��������·ݺ����䣬��ӡƱ��
                        4��10 ������
                                 ���ˣ�18-60����60
                                 ��ͯ��<18��:���
                                 ���ˣ�>60��:1/3
                            ������
                                 ���ˣ�40
                                 ������20

                          ���������
                          1.��Ҫʹ��Ƕ�׷�֧�ṹ�������͵���
                          2�����ݲ�ͬ����ʵ�ֳ��۲�ͬ��Ʊ��

                        *//*

                            //����Scanner����,import java.util.Scanner;
                            Scanner sc = new Scanner(System.in);

                            //�����û����������
                            System.out.println("���������䣺");
                            try {
                                int age = sc.nextInt();
                                //����ʱ����󣬻�ȡ��ǰ�·�ʱ�䣬��תΪָ���·ݸ�ʽ
//                                SimpleDateFormat SDF = new SimpleDateFormat("MM");
//                                Date date = new Date(System.currentTimeMillis());
//                                int month = Integer.parseInt(SDF.format(date));

                                //�жϵ�����������
                                if (month >= 4 && month <= 10) {
                                    //�ж��û����������
                                    if (age >= 18 && age <= 60) {

                                        int adultPrice = 60;
                                        System.out.println("���������������ǳ����ˣ�Ʊ���ǣ�" + adultPrice + "Ԫ");

                                    }else if (age < 18 && age >= 1) {

                                        int childPrice = adultPrice / 2;
                                        System.out.println("���������������Ƕ�ͯ��Ʊ���ǣ�" + childPrice + "Ԫ");

                                        //���䲻����120����
                                    }else if (age > 60 && age <= 120) {

                                        int oldPrice = adultPrice / 3;
                                        System.out.println("�������������������ˣ�Ʊ���ǣ�" + oldPrice + "Ԫ");

                                    }else {

                                        System.out.println("���������������������1-120����");

                                    }
                                }else if(month < 4 || month > 10) {
                                    if (age >= 18 && age <= 60) {

                                        int adultPrice = 40;
                                        System.out.println("�����ǵ��������ǳ����ˣ�Ʊ���ǣ�" + adultPrice + "Ԫ");

                                    }else if (age < 18 && age >= 1) {

                                        int childPrice = 20;
                                        System.out.println("�����ǵ��������Ƕ�ͯ��Ʊ���ǣ�" + childPrice + "Ԫ");

                                    }else if (age > 60 && age <= 120) {

                                        int oldPrice = 20;
                                        System.out.println("�����ǵ������������ˣ�Ʊ���ǣ�" + oldPrice + "Ԫ");

                                    }else {

                                        System.out.println("���������������������1-120����");

                                    }
                                }
                            }catch (InputMismatchException IME) {
                                System.out.println("�Բ�������������Ͳ�ƥ�䡣����������1-120������");
                            }

    }*/
}
