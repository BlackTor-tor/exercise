package JavaBasics_Low;

public class Method {
    //�ж���������ż��
    public boolean isOdd(int number) {
        return  number % 2 != 0;
    }

    //�����к�������� ? ? ? ? ? ?? ? ? ? ?????? ?   ps���������⣬�޷�������ӡ�������
    //�����к������һ���ַ���
    public void printHeart(int row, int colu, String heart) {
        for (int i = 0; i < row; i++) {//��
            for (int j = 0; j < colu; j++) {//��
                System.out.print(heart);
            }
            System.out.println();
        }
    }
}
