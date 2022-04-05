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
        int[] testArr = {100, 10, 55, 8};
        new HomeWork02().bubArr(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + "\t");
        }

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

//        double[] testArrayMax = {10.0,3.0,100.0};
//        System.out.println(new HomeWork03.A01().max(testArrayMax));

    }
}

