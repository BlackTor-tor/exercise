public class HomeWork01 {
    public void homeWork01() {
        /*1��ĳ����100,000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
            (1)���ֽ�>50000ʱ��ÿ�ν�5%
            (2)���ֽ�<=50000ʱ��ÿ�ν�1000
            ������˿��Ծ������ٴ�·�ڣ�Ҫ��ʹ��while break��ʽ���

            ������double money = 100000;
            while(money > 0)
            1��money>50000��money *= 5%
            2��money<=50000��money -= 1000
        * */
        //����ʵ��
        /*double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
//                money *= 0.05;//Ҫ����Ǯ
                money *= 0.95;//����·��ʣ�µ�Ǯ
                count++;
                System.out.println("��ʣ��" + money);
            } else if (money >= 1000) {
                money -= 1000;
                count++;
                System.out.println("��ʣ��" + money);
            } else {
                break;
            }
        }
        System.out.println("һ��·��" + count + "��");*/

        /*2��ʵ���ж�һ�������������ĸ���Χ������0��С��0������0

         �������������ص㣺>0��<0��=0
        * */
        //����ʵ��
/*        int number;
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("���������һ������");
                number = sc.nextInt();
                //�������0
                if (number >= 0) {
                    System.out.println("����һ������");
                } else if (number < 0) {
                    System.out.println("����һ������");
                }
            }
        }catch (InputMismatchException ie) {
            System.out.println("������Ĳ������ֻ���ϵͳ�޷��ж�");
        }*/

        /*3���ж�һ������Ƿ�Ϊ����
         * */
/*
        int year;
        System.out.println("������һ����ݣ�");

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("����������");
        }else {
            System.out.println("������ƽ��");
        }
*/

        /*4���ж�һ�������Ƿ���ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�������������͵����䱾�����磺153=1*1*1 + 3*3*3 +5*5*5
         *
         * ������int daffNum = 153  //����һ����
         * */
/*        //����ʵ��
        String daffNum;//ˮ�ɻ���
        String aNum = null;//��λ��
        String tenNum = null;//ʮλ��
        String hunNum = null;//��λ��

        System.out.println("������һ����λ�����֣�");
        Scanner sc = new Scanner(System.in);

        while (true) {
            daffNum = sc.next();

            hunNum = daffNum.substring(0, 1);
            tenNum = daffNum.substring(1, 2);
            aNum = daffNum.substring(daffNum.length() - 1);

            if (Double.parseDouble(daffNum) == Math.pow(Double.parseDouble(aNum), 3)
                    + Math.pow(Double.parseDouble(tenNum), 3)
                    + Math.pow(Double.parseDouble(hunNum), 3)) {

                System.out.println("���Ǹ�ˮ�ɻ���");
            } else {
                System.out.println(daffNum + "�ⲻ��һ��ˮ�ɻ���");
                break;
            }
        }*/

        /*5��
                class Demo {
            public static void main(String[] agrs) {
                int m = 0, n = 3;
                if (m > 0) {
                    if (n > 2)
                        System.out.println("ok1");
                    else
                        System.out.println("ok2");
                }
            }
        }
        //�𰸣�û���κ�������
        * */

        /*6�����1-100֮��Ĳ��ܱ�5����������ÿ5��һ��

        ������number 5% == 0
        ����һ��������
       * */
        //����ʵ��
/*            int step = 0;
            for (int i = 1; i <=100 ; i++) {
                if (i % 5 != 0) {
                    System.out.print(i + "\t");
                    step++;
                    if (step % 5 == 0) {
                        System.out.println();
                        }
                    }
        }*/


        /*7�����Сд��a-z�Լ���д��Z-A
         * */
        //����ʵ��
/*        //1����������
        char[] letBox = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] letter = new char[26];
        //��ȡletBox�е�Ԫ�أ�����ֵ��letter
        for (int i = 0; i < letBox.length; i++) {
            letter[i] = letBox[i];
        }
        //����letter
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + "\t");
        }
        //���Z-A
        for (int i = 0, j = letter.length - 1; i < letter.length; i++, j--) {
            String temp = letter[j] + "";
            System.out.print(temp.toUpperCase() + "\t");
        }*/
/*            //2��������ĸ��Ӧ��ascll���ֵ��Ȼ��ʹ��forѭ��ʵ��
        char letter = 'a';//97
        char LETTER = 'Z';//90
        //�����õ�����26��Сд��ĸ
        for (int i = letter; i <= 'z' ; i++) {
            System.out.print(letter);
            System.out.print("\t");
            letter++;
        }
        System.out.println();//����
        //�����õ������26����д��ĸ
        for (int i = LETTER; i >= 'A' ; i--) {//65�Ǵ�дA��ֵ
            System.out.print(LETTER);
            System.out.print("\t");
            LETTER--;
        }*/



        /*8�����1-1/2+1/3-1/4����1/100�ĺ�
        ������
        ���Ӳ��䣬��ĸ��������ĸ��ż����-���������
        * */
        //����ʵ��
/*        double sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0) {//����
                sum += 1.0/i;
            }else {
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);*/

        /*9�� 1  +��1+2��+��1+2+3��+��1+2+3+4�� +����+��1+2+3+����+100���Ľ��
     ������ 
        * */
        //����ʵ��
/*        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);*/

        /*10�� ���(1+99)+(2+98)+(3+97)+(4+96)����100+0�Ľ��
        ������i+j
         */
/*        int sum = 0;
        for (int i = 0, j = 100; i <= 100; i++, j--) {
            sum += i + j;
        }
        System.out.println(sum);*/
    }
}