public class TestProgram {
    public static void main(String[] args) {
        //ForExercise.java的实例
//        new ForExercise()..ForExercise();

        //WhileExercise.java的实例
//        new WhileExercise().WhileExercise();

        //ManyForExercise.java的实例
//        new ManyForExercise().manyForExercise();

        //PrintStar.java的实例
//            new TeacherPrintStar().printStar();
//            new MyPrintStar().myPrintStar();

        //ArrayExercise的实例
//        new ArrayExercise().arrayReduce();

        //HomeWork01的实例
//        new HomeWork01().homeWork01();

        //HomeWork02  7的实例
/*        int[] testArr = {100, 10, 55, 8};
        new HomeWork02().bubArr(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + "\t");
        }*/

        //Method的实例
//        new Method().printHeart(20,20,"*");

        //MethodExercise的实例
//        new MethodExercise().m1();
//        new MethodExercise().m2();

        //RecursionExercise的实例
//        System.out.println(new RecursionExercise().factorial(4));
//        RecursionExercise RE = new RecursionExercise();
//        System.out.println(RE.monkeyEatPeach(1));
//        RE.eightQueen();

        //Calculator的实例
//        System.out.println(new Calculator().add(1.5,5.0));

        //Constructor的实例
//        Constructor constructor = new Constructor();//输出：构造器执行了。
//        System.out.println("1" + c1.name);//女神
//        Constructor c2 = new Constructor(20,150,45);

//       homewor03的实例  1
//        double[] testArrayMax = {10.0,3.0,100.0,500.0};
//        System.out.println(new HomeWork03.A01().max(testArrayMax));

//       homewor03的实例  2
        //第一种创建内部类对象实例化的写法
//        String[] testArr = {"a","black","blacktor","tor"};
//        HomeWork03.A02 hwA02 = new HomeWork03().new A02();
//        int test = hwA02.find(testArr);
//        if (test != -1) {
//            System.out.println("查到了，存在");
//        }else {
//            System.out.println("查询不到，请确认");
//        }

        //优化版，代码有点bug，等后续处理
/*        do {
            if (test == -1) {
                System.out.println("对不起，您输入要查询的字符不存在数组中。"+"\n"+"您是否要重新输入查询？");
                Scanner sc = new Scanner(System.in);
                char isNext = sc.next().charAt(0);
                if ('n' == isNext) {
                    break;
                }else if ('y' == isNext) {
                    hwA02.find(testArr);
                }else {
                    System.out.println("请输入y或者n");
                }
            }else {
                System.out.println("查到了");
                break;
            }
        }while (test != -2);*/
        //第二种直接调用内部类方法的写法
//        System.out.println(new HomeWork03().new A02().find(testArr));

        //测试多态
//        PolymExercise pe = new sonPolymExercise();
//        pe.inherit();
//        pe.close();
//        pe.polym();
//        sonPolymExercise spe = (sonPolymExercise) new PolymExercise();//错误示范，这样会报ClassCastException类型转换错误
////        sonPolymExercise spe = (sonPolymExercise) pe;//如果需要强制转换，应当强制转换父类的对象
//        spe.polym();
//        spe.inherit();
//        spe.close();

//       homewor03的实例  3
//        System.out.println(new HomeWork03().new book().updatePrice(50));

//       homewor03的实例  4
//        int[] oldArray = {1,3,5,7,9};
//        HomeWork03.A03 hwA03 = new HomeWork03().new A03();
//        int[] newArray = hwA03.copyArr(oldArray);
//        for (int i : newArray) {
//            System.out.print(i+"\t");
//        }




    }
}

