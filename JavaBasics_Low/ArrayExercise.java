package JavaBasics_Low;

import java.util.Scanner;

public class ArrayExercise {
    public void arrayExercise() {
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = new int[array1.length];

        for (int i = 0, j = array1.length - 1 ; i < array1.length; i++,j--) {
//            array2[i] = array1[i];//array1����ֵ��array2
//            System.out.print(array2[i] + "\t");
//            array2[i] = array1[j];////array1����ֵ��array2
//            System.out.print(array2[i] + "\t");
        }
        }

        public void arrayUpdate() throws InterruptedException {
        int[] array1 = new int[100];
        char isInput = 'y';

        Scanner sc = new Scanner(System.in);

        if (isInput == 'y') {
            for (int i = 0; i< array1.length; i++) {
                System.out.println("��������Ҫ���������ֵ��");
                array1[i] = sc.nextInt();//�����û����������Ԫ��
                System.out.println("�Ƿ�Ҫ�������룿y/n");
                isInput = sc.next().charAt(0);
                if (isInput != 'n') {
                    System.out.println("��������Ҫ���������ֵ��");
                    array1[++i] = sc.nextInt();//�����û����������Ԫ��
                    System.out.println("�Ƿ�Ҫ�������룿y/n");
                    isInput = sc.next().charAt(0);
                }else {
                    isInput = 'n';
                    System.out.print("������������ǣ�");
                    break;
                }
            }

        }


        //�������������
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
                    System.out.print("array1���飺");
                    for (int i = 0; i < array1.length; i++) {//����array1
                        System.out.print(array1[i] + "\t");
                    }
                    System.out.println();
                    System.out.println("�Ƿ��������飬ʹ���С(ֻ������һ��������)    y/n");
                    isRed = sc.next().charAt(0);
                    if (isRed == 'y') {
                        if (array1.length == 1) {
                            System.out.println("�Ѿ������һ�����ˣ��޷��ټ�������");
                            break ;

                        } else  {
                            array2 = new int[array1.length - 1];
                            for (int i = 0; i < array2.length; i++) {//���Ȱ�array1��ֵ������array2
                                array2[i] = array1[i];
                        }
                            array1 = array2;
                        }
                    } else  {
                            break;
                    }
                }while (true) ;
                    System.out.println("�������");


                }
            }


