import java.util.Scanner;

public class WhileExercise {
    public void whileExercise() {
        //1、while循环练习
        /*1)
        打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ]
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
        打印 40—200 之间所有的偶数 [使用 while, 课后练习]
         */
/*        int start2 = 40;
        int end2 = 200;
        while (start2 <= end2) {
            if (start2 % 2 == 0) {
                System.out.println(start2);
            }
            start2++;
        }*/

        //2、do……while循环练习
        /*1)
        打印 1—100 [学生做]
        */
/*        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);*/

        /*2)
        计算 1—100 的和 [学生做]
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
        统计 1---200 之间能被 5 整除但不能被 3 整除的个数
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
        如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
                [System.out.println("老韩问：还钱吗？y/n")]
        */
        String name1 = "老韩";
        String name2 = "李三";
        char isReturnMoney = 0;//是否还钱
//        boolean flag = false;
        do {
//            if (isReturnMoney == 'y') {
//                System.out.println(name2 + "说：我还我还，别打了！");
//                System.out.println(name1 + "说：算你识相，这次放你一马！");
                //break;//思考，这里除了可以用break跳出循环，也可以在判断条件处看isReturnMoney是否等于y，等于y就退出循环
//            }else if (isReturnMoney == 'n'){
//                System.out.println(name1 + "说：不还是吧！看我五连鞭伺候！");
//            }

            System.out.println(name1 + "问：还钱吗？");

            Scanner sc = new Scanner(System.in);
            System.out.println(name2 + "请回答，还还是不还？请输入y/n");
            isReturnMoney = sc.next().charAt(0);//接收李三的回答

            if (isReturnMoney != 'y') {
                System.out.println(name1 + "说：不还是吧！看我五连鞭伺候！");
            }

    } while (isReturnMoney != 'y');

        System.out.println(name2 + "说：我还我还，别打了！");
        System.out.println(name1 + "说：算你识相，这次放你一马！");
    }
}
