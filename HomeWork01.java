public class HomeWork01 {
    public void homeWork01() {
        /*1、某人有100,000元，每经过一次路口，需要交费，规则如下：
            (1)当现金>50000时，每次交5%
            (2)当现金<=50000时，每次交1000
            计算该人可以经过多少次路口，要求：使用while break方式完成

            分析：double money = 100000;
            while(money > 0)
            1、money>50000，money *= 5%
            2、money<=50000，money -= 1000
        * */
        //代码实现
        /*double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
//                money *= 0.05;//要交的钱
                money *= 0.95;//过完路口剩下的钱
                count++;
                System.out.println("还剩下" + money);
            } else if (money >= 1000) {
                money -= 1000;
                count++;
                System.out.println("还剩下" + money);
            } else {
                break;
            }
        }
        System.out.println("一共路过" + count + "次");*/

        /*2、实现判断一个整数，属于哪个范围：大于0；小于0；等于0

         分析：整数的特点：>0，<0，=0
        * */
        //代码实现
/*        int number;
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("请随便输入一个数：");
                number = sc.nextInt();
                //如果大于0
                if (number >= 0) {
                    System.out.println("这是一个正数");
                } else if (number < 0) {
                    System.out.println("这是一个负数");
                }
            }
        }catch (InputMismatchException ie) {
            System.out.println("您输入的不是数字或者系统无法判断");
        }*/

        /*3、判断一个年份是否为闰年
         * */
/*
        int year;
        System.out.println("请输入一个年份：");

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("今年是闰年");
        }else {
            System.out.println("今年是平年");
        }
*/

        /*4、判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位数上数字立方和等于其本身。例如：153=1*1*1 + 3*3*3 +5*5*5
         *
         * 分析：int daffNum = 153  //接收一个数
         * */
/*        //代码实现
        String daffNum;//水仙花数
        String aNum = null;//个位数
        String tenNum = null;//十位数
        String hunNum = null;//百位数

        System.out.println("请输入一个三位数数字：");
        Scanner sc = new Scanner(System.in);

        while (true) {
            daffNum = sc.next();

            hunNum = daffNum.substring(0, 1);
            tenNum = daffNum.substring(1, 2);
            aNum = daffNum.substring(daffNum.length() - 1);

            if (Double.parseDouble(daffNum) == Math.pow(Double.parseDouble(aNum), 3)
                    + Math.pow(Double.parseDouble(tenNum), 3)
                    + Math.pow(Double.parseDouble(hunNum), 3)) {

                System.out.println("这是个水仙花数");
            } else {
                System.out.println(daffNum + "这不是一个水仙花数");
                break;
            }
        }*/

        /*5、
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
        //答案：没有任何输出结果
        * */

        /*6、输出1-100之间的不能被5整除的数，每5个一行

        分析：number 5% == 0
        定义一个计数器
       * */
        //代码实现
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


        /*7、输出小写的a-z以及大写的Z-A
         * */
        //代码实现
/*        //1、定义数组
        char[] letBox = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] letter = new char[26];
        //获取letBox中的元素，并赋值给letter
        for (int i = 0; i < letBox.length; i++) {
            letter[i] = letBox[i];
        }
        //遍历letter
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + "\t");
        }
        //输出Z-A
        for (int i = 0, j = letter.length - 1; i < letter.length; i++, j--) {
            String temp = letter[j] + "";
            System.out.print(temp.toUpperCase() + "\t");
        }*/
/*            //2、利用字母对应的ascll码的值，然后使用for循环实现
        char letter = 'a';//97
        char LETTER = 'Z';//90
        //遍历得到所有26个小写字母
        for (int i = letter; i <= 'z' ; i++) {
            System.out.print(letter);
            System.out.print("\t");
            letter++;
        }
        System.out.println();//换行
        //遍历得到倒序的26个大写字母
        for (int i = LETTER; i >= 'A' ; i--) {//65是大写A的值
            System.out.print(LETTER);
            System.out.print("\t");
            LETTER--;
        }*/



        /*8、求出1-1/2+1/3-1/4……1/100的和
        分析：
        分子不变，分母递增，分母是偶数则-，奇数则加
        * */
        //代码实现
/*        double sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0) {//奇数
                sum += 1.0/i;
            }else {
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);*/

        /*9、 1  +（1+2）+（1+2+3）+（1+2+3+4） +……+（1+2+3+……+100）的结果
     分析： 
        * */
        //代码实现
/*        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);*/

        /*10、 求出(1+99)+(2+98)+(3+97)+(4+96)……100+0的结果
        分析：i+j
         */
/*        int sum = 0;
        for (int i = 0, j = 100; i <= 100; i++, j--) {
            sum += i + j;
        }
        System.out.println(sum);*/
    }
}