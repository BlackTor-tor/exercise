package JavaBasics_Low;

import java.util.Scanner;

public class ArrayExercise {
    public void arrayExercise() {
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = new int[array1.length];

        for (int i = 0, j = array1.length - 1 ; i < array1.length; i++,j--) {
//            array2[i] = array1[i];//array1正序赋值给array2
//            System.out.print(array2[i] + "\t");
//            array2[i] = array1[j];////array1逆序赋值给array2
//            System.out.print(array2[i] + "\t");
        }
        }

        public void arrayUpdate() throws InterruptedException {
        int[] array1 = new int[100];
        char isInput = 'y';

        Scanner sc = new Scanner(System.in);

        if (isInput == 'y') {
            for (int i = 0; i< array1.length; i++) {
                System.out.println("请输入您要存入数组的值：");
                array1[i] = sc.nextInt();//接收用户输入的数组元素
                System.out.println("是否还要继续输入？y/n");
                isInput = sc.next().charAt(0);
                if (isInput != 'n') {
                    System.out.println("请输入您要存入数组的值：");
                    array1[++i] = sc.nextInt();//接收用户输入的数组元素
                    System.out.println("是否还要继续输入？y/n");
                    isInput = sc.next().charAt(0);
                }else {
                    isInput = 'n';
                    System.out.print("您输入的数组是：");
                    break;
                }
            }

        }


        //遍历输入的数组
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != 0) {
                    System.out.print(+ array1[i] + "\t");
                }else {
                    continue;
                }
                }

            }

            public void arrayReduce() {
                int[] array1 = {1,2,3,4,5};
                int[] array2 = new int[0];
                char isRed = 0;

                Scanner sc = new Scanner(System.in);

                do {
                    System.out.print("array1数组：");
                    for (int i = 0; i < array1.length; i++) {//遍历array1
                        System.out.print(array1[i] + "\t");
                    }
                    System.out.println();
                    System.out.println("是否缩减数组，使其变小(只会从最后一个数缩减)    y/n");
                    isRed = sc.next().charAt(0);
                    if (isRed == 'y') {
                        if (array1.length == 1) {
                            System.out.println("已经是最后一个数了，无法再继续缩减");
                            break ;

                        } else  {
                            array2 = new int[array1.length - 1];
                            for (int i = 0; i < array2.length; i++) {//首先把array1的值拷贝给array2
                                array2[i] = array1[i];
                        }
                            array1 = array2;
                        }
                    } else  {
                            break;
                    }
                }while (true) ;
                    System.out.println("程序结束");


                }
            }


