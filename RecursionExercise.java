public class RecursionExercise {
    //��ǲ�����
    public  int  fibonacciNum(int i) {
        /*
        ˼·������
        ��ǲ������е��ص㣺1��1��2��3��5��8��13��21��34��55����
        ��i����1ʱ��fn=1,
        ��i����2ʱ��fn=1
        ��i����3ʱ��fn= f1+f2 = 2  ǰһ����+ǰǰһ����
        ��i����4ʱ��fn= f2+f3 = 3,  ǰһ����+ǰǰһ����
        * */
        if (i == 1 || i == 2) {
            return 1;
        }else {
            return fibonacciNum(i - 2) + fibonacciNum(i - 1);
        }
    }
    //�׳�
    public long factorial(int n) {
        /*
        ˼·������
        n! = n * (n-1)
        2��=2 *��2-1��
        ����:2�Ľ׳�=2 *��2-1��
        * */
        if (n == 1 || n == 0) {
            return 1;
        }else if(n > 0) {
            return n * factorial  (n-1);
        }else {
            System.out.println("n����Ϊ����");
            return n;
        }
    }

    //���ӳ���
    public double monkeyEatPeach(int day) {
        /*
        ���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
        �Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ���������� 10 ��ʱ��
        ���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ����⣺��������ٸ����ӣ�
        ˼·������
        ���ƣ�
        4 ��4-4/2�� -1
        //��һ�������4�����ӣ���ô���ӳԵ���һ�룬�ټ�ȥ1�������ʣ1��
        1 ��1+1��  *2
        //��ô�ڶ�����ʣ�µ�1�����ӣ���+1���ٳ���2���Ϳ��Եõ�ǰһ���������
        * */
        //����ʵ��
        if (day == 10) {
            return 1;
        }else if (day>=1 && day <=9){
            return (monkeyEatPeach(day+1)+1)*2 ;//��(day+1)+1)��ʾ�������ڵ���
        }else {
            return -1;
        }
    }

    /*public void eightQueen() {
        int[] queen = {0,4,7,5,2,6,1,3};//������ȷ�Ľ��,��������
        //����һ�����̶�ά����
        int[][] chessboard = new int[queen.length][queen.length];
        //����ȷ�����ֵ������
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

        //��������
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
