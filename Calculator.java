import java.util.Scanner;

public class Calculator {
    //加法（整数）
    public int add(int... nums) {
        /*//接收用户输入（不好用，原因：无法构成方法重载求出小数）
        System.out.println("请输入要求和的数字：");
        Scanner scanner = new Scanner(System.in);

        int count = 0;//记录scanner的长度
        boolean flag = scanner.hasNextLine();
        while (flag) {
            count++;
            if (count >= 5) {//最多输入5个数
                flag = false;
            }
        }
        int[] nums = new int[count];
        //求和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();//接收用户输入的数字
            sum += nums[i];
        }
            scanner.close();*/
        int sumAll = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAll += nums[i];
        }
        return sumAll;
    }


    //加法（小数）
    public double add(double... nums) {
        double sumAll = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAll += nums[i];
        }
        return sumAll;
    }

    //减法
    public int minus() {
        return 1;
    }

    //乘法
    public void times() {

    }

    //除法
    public void into() {

    }

}

