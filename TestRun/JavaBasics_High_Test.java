package TestRun;

import JavaBasics_High.ExceptionExercise;
import JavaBasics_High.PackClass;
import JavaBasics_High.StringClass;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/22 12:47
 * @ע�� java�߼����ֲ�����
 */
@SuppressWarnings("all")
public class JavaBasics_High_Test {
    public static void main(String[] args) {
    /**����args���о���args��ר���������������в����ġ�
     *  ��:��һ�������У����иó���ʱ�� java Test1 365 156 "China"  ������ν��365 156 "China"���������в���
     *  �ڿ���̨����ʱ�����ڵ��Կ���̨���������java JavaBasics_High_Test aa bb
        ��������Ĵ��룬������Ϊ��
        0   aa
        1   bb

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println( i + "\t" + args[i]);
        }
     }*/
//        JavaBasics_High_Test.main(new String[]{"11", "22"});//�ᱨerrorOutstanding����ջ���
        //StaticExercise��ʵ��
//        System.out.println(StaticExercise.d);
//        StaticExercise staticExercise = new StaticExercise();

        //Single��ʵ��
//        Single.Single_Hunger();
//        Single.Single_Lazy();

        //Template��ʵ��
//        new A().print();
//        new B().print();

        //Implements��ʵ��
//        new Implements();

        //InnerClass��ʵ��
//        InnerClass innerClass = new InnerClass();
//        innerClass.innerClassTest();

        //AnonymousClass��ʵ��
//        AnonymousClass anonymousClass = new AnonymousClass();
//        anonymousClass.AnonymousTest();

        //Bell��ʵ��
/*        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("��������");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("С����Ͽ���");
            }
        });*/

        //EnumExercise��ʵ��
        //�������дö�����toString�������ͻᵼ����EnumExercise.������������ǳ�����
        // ������ö��������Ӧ�Ķ����е��������ԣ��������д����ӡ�Ľ����APPLE
//        System.out.println(EnumExercise.APPLE);
//        System.out.println(EnumExercise.ANDROID);
//        EnumExercise EE1 = EnumExercise.APPLE;
//        EnumExercise EE2 = EnumExercise.ANDROID;
//        System.out.println(EE1.valueOf("APPL"));//���ֲ�ƥ��ᱨjava.lang.IllegalArgumentException
//        System.out.println(EE1.valueOf("APPLE"));//���ַ���ȥƥ��ö�������Ƿ�������ַ�������Ӧ�ĳ�����
//        System.out.println(Arrays.toString(EnumExercise.values()));//���ص���һ��ö�������飬����ֱ����Array.toString��ӡ����
//        System.out.println(EE1.ordinal());//��ӡ��APPLE���������ö�����еĶ���Ĵ������0
//        System.out.println(EE1.name());//���ض�������Ҳ���ǳ�����
//        System.out.println(EE1.compareTo(EE2));//EE1�Ĵ�����0��EE2��1�����Խ������-1
//        System.out.println(EE1.equals(EE2));//�Ƚ�����ö�ٶ����Ƿ����

        //Week��ʵ��
//        Week.show();

        //ExceptionExercise��ʵ��
//        System.out.println(ExceptionExercise.testException());

        //CustomException��ʵ��
//        ExceptionExercise.testAge();

        //EcmDef��ʵ��
//        double[] temp = EcmDef.show();
//        for (int i = 0; i < temp.length - 1; i++) {
//            System.out.println(EcmDef.cal(temp[i], temp[i + 1]));
//        }

//        PackClass��ʵ��
//        PackClass packClass = new PackClass();
//        System.out.println(packClass.inPack());
//        System.out.println(packClass.outPack());
//        System.out.println(packClass.inPack2());
//        System.out.println(packClass.outPack2());

        //testAnnotation��ʵ��
//        testAnnotation annotation = new testAnnotation();
//        annotation.haha();

        //StringClass��ʵ��
        StringClass stringClass = new StringClass();
//        stringClass.testString2();
        stringClass.CompareString();


    }
}

