public class HomeWork02 {
    public void homeWork02() {
        /*1���������鶨����ȷ���У�B��D
        A��String strs[]  = {'a','b','c'};
        B��String[] strs = {"a","b","c"};
        C��String[] strs = new String{"a" "b" "c"}
        D��String strs[] = new String[]{"a","b","c"};
        E��String[] strs = new String[3]{"a","b","c"};

        ��1�֣�
        String[] s = {"a","b","c"};//��̬��ʼ����ֵ
        ��2�֣�
        String[] s = new String[3];��̬��ʼ��
        ��3�֣�
        String s[] = new String[]{"a","b","c"};��̬��ʼ������ֵ
         */

        /*2�������blue
        String foo = "blue";
        boolean[] bar = new boolean[2];
        if(bar[0]) {//booleanĬ��ֵ��false
            foo = "green";
        }
        System.out.println(foo);
        * */

        /*3������Java�����������Ϊ��
        int num = 1;
        while(num < 10) {
            System.out.println(num);
            if(num > 5) {
                break;
            }
            num += 2;
        }
        * */

        /*4����֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ�����򣬱���[10,12,45,90]�����23������Ϊ[10��12��23��45��90]

        */

        /*5���������10������(1-100�ķ�Χ)���浽���飬�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±ꡢ�����������Ƿ���8
        * */

        /*6����д�����´���Ĵ�ӡ���
        char[] arr1 = {'a','z','b','c'};
        char[] arr2 = arr1;
        arr1[2] = '��';

        for(int i = 0;i < arr2.length;i++) {
            System.out.println(arr1[i] + "," + arr2[i])
        }
        * */

        }

        /*
        *    7��ð������
        *
        * ˼·������1������һ�����飬�����Ƚ����ڵ�Ԫ�أ������ģ��������
        * */

        public void bubArr(int[] array) {
            int temp = 0;
            //�������鲢����Ԫ��
            for (int i = 0; i < array.length - 1;i++) {//һ���Ƚ��������-1�Σ�����3��Ԫ�أ��ǾͱȽ�2��
                for (int j = 0;j < array.length - 1 - i;j++) {//�Ƚ���һ�ξͼ���
                    if (array[j] < array [j+1]) {//���ǰ�����С�ں���������ͽ������Ӵ�С����
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }


        }


    }
