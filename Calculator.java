import java.util.Scanner;

public class Calculator {
    //�ӷ���������
    public int add(int... nums) {
        /*//�����û����루�����ã�ԭ���޷����ɷ����������С����
        System.out.println("������Ҫ��͵����֣�");
        Scanner scanner = new Scanner(System.in);

        int count = 0;//��¼scanner�ĳ���
        boolean flag = scanner.hasNextLine();
        while (flag) {
            count++;
            if (count >= 5) {//�������5����
                flag = false;
            }
        }
        int[] nums = new int[count];
        //���
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();//�����û����������
            sum += nums[i];
        }
            scanner.close();*/
        int sumAll = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAll += nums[i];
        }
        return sumAll;
    }


    //�ӷ���С����
    public double add(double... nums) {
        double sumAll = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAll += nums[i];
        }
        return sumAll;
    }

    //����
    public int minus() {
        return 1;
    }

    //�˷�
    public void times() {

    }

    //����
    public void into() {

    }

}

