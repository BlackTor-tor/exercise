
public class MyPrintStar {
    public void myPrintStar() {
        /*
               *
             *   *
           *       *
         *           *
        ***********
        //打印镂空金字塔
        分析：第1层有i颗星                                     有5个空格——层数-i
                  第2层开始有一颗星，结束有一颗星     有4个空格——层数-i
                  第3层开始有一颗星，结束有一颗星     有3个空格——层数-i
                  第4层开始有一颗星，结束有一颗星     有2个空格——层数-i
                  第5层输出全部星                               有1个空格——层数-i
         */
/*        int upFloor = 5; //层数

        for(int i = 1; i <= upFloor; i++) { ////控制层数

            //在输出*之前，还有输出 对应空格 = 总层数-当前层
            for(int k = 1; k <= upFloor - i; k++ ) {//打印空格
                System.out.print(" ");
            }

            //控制打印每层的*个数
            for(int j = 1;j <= 2 * i - 1;j++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == 1 || j == 2 * i - 1 || i == upFloor) {
                    System.out.print("*");//打印星星
                } else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
*/


        //打印菱形
        /*
               *
             *   *
           *       *
         *           *
        *               *
          *            *
            *        *
              *    *
                 *
         分析：上部分：
                   第1层有一颗星                                   有4个空格——层数-i
                   第2层开始有一颗星，结束有一颗星     有3个空格——层数-i
                   第3层开始有一颗星，结束有一颗星     有2个空格——层数-i
                   第4层开始有一颗星，结束有一颗星     有1个空格——层数-i
                   第5层输出全部星                               有0个空格——层数-i

                   下部分(和上面的相反)：
                   第1层开始有一颗星，结束有一颗星     有0个空格——当前层i-1
                   第2层开始有一颗星，结束有一颗星     有1个空格——当前层i-1
                   第3层开始有一颗星，结束有一颗星     有2个空格——当前层i-1
                   第4层开始有一颗星，结束有一颗星     有3个空格——当前层i-1
                   第5层输出全部星                               有4个空格——当前层i-1

        * */

        int upFloor = 5;//上部分层数
        for(int i = 1; i <= upFloor; i++) { //控制上部分层数

            //在输出*之前，还要输出上半部分对应空格 = 总层数-当前层
            for(int k = 1; k <= upFloor - i; k++ ) {//打印空格
                System.out.print(" ");
            }

            //控制上半部分打印每层的*个数
            for(int j = 1;j <= 2 * i - 1;j++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");//打印星星
                } else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        int downFloor = 5;//下部分层数
        for (int i = 1; i <= downFloor; i++) {//控制下部分层数
            //在输出*之前，还要输出下半部分对应空格 = 当前层-1
            for(int k = 0; k <= i - 1; k++ ) {//打印空格
                System.out.print(" ");
            }
            //控制下半部分打印每层的*个数
            for(int j = downFloor ;j >= i ;j--) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == downFloor || j == i || i == downFloor) {
                    System.out.print("*");//打印星星
                } else { //其他情况输出空格
                    System.out.print("  ");
                }
            }
            System.out.println();
            }



    }
}
