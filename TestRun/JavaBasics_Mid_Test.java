package TestRun;

import JavaBasics_Mid.HomeWork;

public class JavaBasics_Mid_Test {
    public static void main(String[] args) {
        //Father��ʵ��
        //���ڷ���Ȩ�޵����⣬�������ķ���Ȩ�޲���������Ҫ�����Ǹ���ķ�����������ʱ���������취�����
        // 1��ͨ������ʵ����������������ػ��Ƶ����޲ι��������ٵ��ø��������һ��������
        /*Son son = new Son();
        System.out.println(son.getSword());
        System.out.println(son.num);
        son.InnerKungfu();
        System.out.println("----------------------------------");
        Father father = son;
        System.out.println(father.getSword());
        System.out.println(father.num);//���Կ�����
        father.InnerKungfu();*///���ӵĽ���˵���������������ҵĻ��Ƕ��ӵķ����������У����������࣬����û�У����Ҹ���

        //2���ñ���̳и��࣬����ʵ��������ȥ���ø����еķ���
//        JavaBasics_Mid_Test test = new JavaBasics_Mid_Test();
//        test.InnerKungfu();

        //HomeWork��ʵ��  1  �Լ�д��
/*        HomeWork.Person zhangsan = new HomeWork().new Person("����", 20, "����");
        HomeWork.Person lisi = new HomeWork().new Person("����",22, "����");
        HomeWork.Person wangwu = new HomeWork().new Person("����",30,"����");
        HomeWork.Person zhaoliu = new HomeWork().new Person("����",50,"����");
        int[] pAge = {zhangsan.getAge(),lisi.getAge(),wangwu.getAge(), zhaoliu.getAge()};
        System.out.println("========��������ǰ======");
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }
        System.out.println("\n========��������󣨴Ӵ�С��======");
        zhangsan.maxAge1(pAge);
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }*/

        //HomeWork��ʵ��  1  ����ʦ�汾
/*        HomeWork.Person[] people = new HomeWork.Person[4];
        people[0] = new HomeWork().new Person("����", 20, "����");
        people[1] = new HomeWork().new Person("����",22, "����");
        people[2] = new HomeWork().new Person("����",30,"����");
        people[3] = new HomeWork().new Person("����",50,"����");

        System.out.println("\n========��������ǰ======");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("\n========��������󣨴Ӵ�С��======");
        zhangsan.maxAge2(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }*/

        //HomeWork��ʵ�� 3
        HomeWork.Teacher zhang = new HomeWork().new Instructor("����ʦ",22,"��ʦ",3000,1.1);
        HomeWork.Teacher li = new HomeWork().new ViceProfessor("����ʦ",30,"������",5000,1.2);
        HomeWork.Teacher wang = new HomeWork().new Professor("����ʦ",40,"����",10000,1.3);
        System.out.println(zhang.introduce());
        System.out.println(li.introduce());
        System.out.println(wang.introduce());
    }
}


