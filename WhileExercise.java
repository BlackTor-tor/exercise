import java.util.Scanner;

public class WhileExercise {
    public void whileExercise() {
        //1��whileѭ����ϰ
        /*1)
        ��ӡ 1��100 ֮�������ܱ� 3 �������� [ʹ�� while, ��ʦ���� ]
         */
/*        int start = 1;
        int end = 100;
        while (start <= end) {
            if (start % 3 == 0) {
                System.out.println(start);
            }
            start++;
        }*/

        /*2)
        ��ӡ 40��200 ֮�����е�ż�� [ʹ�� while, �κ���ϰ]
         */
/*        int start2 = 40;
        int end2 = 200;
        while (start2 <= end2) {
            if (start2 % 2 == 0) {
                System.out.println(start2);
            }
            start2++;
        }*/

        //2��do����whileѭ����ϰ
        /*1)
        ��ӡ 1��100 [ѧ����]
        */
/*        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);*/

        /*2)
        ���� 1��100 �ĺ� [ѧ����]
        */
/*        int i = 1;
        int sum = 0;
        do {
            sum += i;
            System.out.println(sum);
            i++;
        } while (i <= 100);*/

        /*
        3)
        ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ���
        */
/*        int i = 1;
        int count = 0;
        do {
            if (i % 5 == 0 && i % 3 !=0) {
                count++;
            }
            i++;
        } while (i <= 200);
        System.out.println(count);*/

        /*4)
        �����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
                [System.out.println("�Ϻ��ʣ���Ǯ��y/n")]
        */
        String name1 = "�Ϻ�";
        String name2 = "����";
        char isReturnMoney = 0;//�Ƿ�Ǯ
//        boolean flag = false;
        do {
//            if (isReturnMoney == 'y') {
//                System.out.println(name2 + "˵���һ��һ�������ˣ�");
//                System.out.println(name1 + "˵������ʶ�࣬��η���һ��");
                //break;//˼����������˿�����break����ѭ����Ҳ�������ж���������isReturnMoney�Ƿ����y������y���˳�ѭ��
//            }else if (isReturnMoney == 'n'){
//                System.out.println(name1 + "˵�������ǰɣ������������ź�");
//            }

            System.out.println(name1 + "�ʣ���Ǯ��");

            Scanner sc = new Scanner(System.in);
            System.out.println(name2 + "��ش𣬻����ǲ�����������y/n");
            isReturnMoney = sc.next().charAt(0);//���������Ļش�

            if (isReturnMoney != 'y') {
                System.out.println(name1 + "˵�������ǰɣ������������ź�");
            }

    } while (isReturnMoney != 'y');

        System.out.println(name2 + "˵���һ��һ�������ˣ�");
        System.out.println(name1 + "˵������ʶ�࣬��η���һ��");
    }
}
