package JavaBasics_Low;

public class Method {
    //判断奇数还是偶数
    public boolean isOdd(int number) {
        return  number % 2 != 0;
    }

    //根据行和列输出心 ? ? ? ? ? ?? ? ? ? ?????? ?   ps：编码问题，无法正常打印，待解决
    //根据行和列输出一个字符串
    public void printHeart(int row, int colu, String heart) {
        for (int i = 0; i < row; i++) {//行
            for (int j = 0; j < colu; j++) {//列
                System.out.print(heart);
            }
            System.out.println();
        }
    }
}
