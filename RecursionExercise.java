public class RecursionExercise {
    //斐那波契数
    public  int  fibonacciNum(int i) {
        /*
        思路分析：
        斐那波契数列的特点：1、1、2、3、5、8、13、21、34、55……
        当i等于1时，fn=1,
        当i等于2时，fn=1
        当i等于3时，fn= f1+f2 = 2  前一个数+前前一个数
        当i等于4时，fn= f2+f3 = 3,  前一个数+前前一个数
        * */
        if (i == 1 || i == 2) {
            return 1;
        }else {
            return fibonacciNum(i - 2) + fibonacciNum(i - 1);
        }
    }
    //阶乘
    public long factorial(int n) {
        /*
        思路分析：
        n! = n * (n-1)
        2！=2 *（2-1）
        举例:2的阶乘=2 *（2-1）
        * */
        if (n == 1 || n == 0) {
            return 1;
        }else if(n > 0) {
            return n * factorial  (n-1);
        }else {
            System.out.println("n不能为负数");
            return n;
        }
    }

    //猴子吃桃
    public double monkeyEatPeach(int day) {
        /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
        以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
        想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？
        思路分析：
        逆推：
        4 （4-4/2） -1
        //第一天假设有4个桃子，那么猴子吃掉了一半，再减去1个，最后还剩1个
        1 （1+1）  *2
        //那么第二天用剩下的1个桃子，先+1，再乘以2，就可以得到前一天的桃子数
        * */
        //代码实现
        if (day == 10) {
            return 1;
        }else if (day>=1 && day <=9){
            return (monkeyEatPeach(day+1)+1)*2 ;//（(day+1)+1)表示的是日期递增
        }else {
            return -1;
        }
    }

    /*public void eightQueen() {
        int[] queen = {0,4,7,5,2,6,1,3};//最终正确的结果,从下往上
        //创建一个棋盘二维数组
        int[][] chessboard = new int[queen.length][queen.length];
        //把正确结果赋值给棋盘
        //chessboard[7][queen[0]] = 1;
        //chessboard[6][queen[1]] = 1;
        //chessboard[5][queen[2]] = 1;
        //chessboard[4][queen[3]] = 1;
        //chessboard[3][queen[4]] = 1;
        //chessboard[2][queen[5]] = 1;
        //chessboard[1][queen[6]] = 1;
        //chessboard[0][queen[7]] = 1;
        for (int i = chessboard.length - 1, j = 0; i >= 0; i--,j++) {
            chessboard[i][queen[j]] = 1;
            }

        //遍历棋盘
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print(chessboard[i][j] + "\t");
            }
            System.out.println();
        }
    }*/
    public void eightQueen() {

    }
}
