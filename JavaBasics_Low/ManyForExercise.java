package JavaBasics_Low;

public class ManyForExercise {
    public void manyForExercise() {

        //��ӡ�žų˷���
        //���������99�˷�����ʲô�ص㣿
        /*
        �����ֱ�ʾ������һ�֣�
        1�������ң��ӵ͵���������
                                        7*7=49
                        8*9=72    7*8=56
         9*9=81    8*8=64   7*9=64  ����

         �ڶ��֣�
         ���ҵ��󣬴Ӹߵ��ͣ�
         1*1=1
         1*2=2  2*2=4
         1*3=3  2*3=6    3*3=9
         1*4=4  2*4=8    3*4=12
         1*5=5  2*5=10  3*5=15
         1*6=6  2*6=12  3*6=18
         1*7=7  2*7=14  3*7=21
         1*8=8  2*8=16  3*8=24
         1*9=9  2*9=18  3*9=27  ����

         1.��Ҫ������ѭ��
         2.������������
         */


            //��һ�ִӸߵ���
/*            int proNum = 0;//�˻�
            for (int i = 1; i <= 9; i++) {//����
                for (int j = 1; j <= i; j++) {//������
                    proNum = j * i;
                    System.out.print(j + " x " + i + " = " + proNum + "\t\t");
                    if (i == j) {
                        System.out.println();
                    }
                }
            }*/

            //�ڶ�����͵���
            int proNum = 0;//�˻�

            for (int i = 1; i <= 9 ; i++) {
                boolean flag = true;
                for (int j = i; j >= 1; j--) {
                    if (flag) {
                        flag = false;
                        for (int k = 0; k < 9 - i; k++) {
                            System.out.print("\t\t\t");
                        }
                    }
                    proNum = i * j;
                    System.out.print(j+"x"+ i + "=" + proNum);
                    if(j !=1 ) {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
}
