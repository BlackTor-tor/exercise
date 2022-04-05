public class HomeWork02 {
    public void homeWork02() {
        /*1、下面数组定义正确的有：B、D
        A、String strs[]  = {'a','b','c'};
        B、String[] strs = {"a","b","c"};
        C、String[] strs = new String{"a" "b" "c"}
        D、String strs[] = new String[]{"a","b","c"};
        E、String[] strs = new String[3]{"a","b","c"};

        第1种：
        String[] s = {"a","b","c"};//静态初始化赋值
        第2种：
        String[] s = new String[3];动态初始化
        第3种：
        String s[] = new String[]{"a","b","c"};动态初始化并赋值
         */

        /*2、输出：blue
        String foo = "blue";
        boolean[] bar = new boolean[2];
        if(bar[0]) {//boolean默认值是false
            foo = "green";
        }
        System.out.println(foo);
        * */

        /*3、以下Java代码的输出结果为：
        int num = 1;
        while(num < 10) {
            System.out.println(num);
            if(num > 5) {
                break;
            }
            num += 2;
        }
        * */

        /*4、已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如[10,12,45,90]，添加23后，数组为[10，12，23，45，90]

        */

        /*5、随机生成10个整数(1-100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8
        * */

        /*6、试写出以下代码的打印结果
        char[] arr1 = {'a','z','b','c'};
        char[] arr2 = arr1;
        arr1[2] = '韩';

        for(int i = 0;i < arr2.length;i++) {
            System.out.println(arr1[i] + "," + arr2[i])
        }
        * */

        }

        /*
        *    7、冒泡排序
        *
        * 思路分析：1、传入一个数组，俩俩比较相邻的元素，如果大的，则往后放
        * */

        public void bubArr(int[] array) {
            int temp = 0;
            //遍历数组并交换元素
            for (int i = 0; i < array.length - 1;i++) {//一共比较数组个数-1次，比如3个元素，那就比较2次
                for (int j = 0;j < array.length - 1 - i;j++) {//比较完一次就减掉
                    if (array[j] < array [j+1]) {//如果前面的数小于后面的数，就交换，从大到小排序
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }


        }


    }
