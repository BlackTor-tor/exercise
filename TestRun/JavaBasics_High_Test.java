package TestRun;

import JavaBasics_High.Bell;
import JavaBasics_High.CellPhone;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/22 12:47
 * @ע�� java�߼����ֲ�����
 */
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
//        System.out.println(StaticExercise.s);

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
        CellPhone cellPhone = new CellPhone();
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
        });
    }
}

