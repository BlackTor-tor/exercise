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
//        HomeWork.Teacher zhang = new HomeWork().new Instructor("����ʦ",22,"��ʦ",3000,1.1);
//        HomeWork.Teacher li = new HomeWork().new ViceProfessor("����ʦ",30,"������",5000,1.2);
//        HomeWork.Teacher wang = new HomeWork().new Professor("����ʦ",40,"����",10000,1.3);
//        System.out.println(zhang.introduce());
//        System.out.println(li.introduce());
//        System.out.println(wang.introduce());

        //HomeWork��ʵ�� 4
//        HomeWork.Employee normEmp = new HomeWork().new NormEmp("ϲ����", 100, 30);
//        HomeWork.Employee departManager = new HomeWork().new DepartManager("�峤", 1000, 365);
//        normEmp.getSalary();
//        departManager.getSalary();

        //HomeWork��ʵ�� 5
//        HomeWork.Employee2 worker = new HomeWork().new Worker("����", 5000);
//        HomeWork.Employee2 peasant = new HomeWork().new Peasant("����ͷ", 2000);
//        HomeWork.Employee2 Teacher = new HomeWork().new Teacher2("����ʦ", 6000,30,250);
//        HomeWork.Employee2 Scientist = new HomeWork().new Scientist("�ʿ", 8000,8000);
//        HomeWork.Employee2 Waiter = new HomeWork().new Waiter("С������Ա", 3000);
//
//        worker.yearSal();
//        peasant.yearSal();
//        Teacher.yearSal();
//        Scientist.yearSal();
//        Waiter.yearSal();

        //HomeWork��ʵ�� 7
//        new HomeWork().new Demo().test(); //��������  �����test��Demo��Rose��jack
//        new HomeWork().new Demo("john").test();//���� �����john��jack

        //HomeWork��ʵ�� 8
//        HomeWork.BankAccount checkingAccount = new HomeWork().new CheckingAccount(1000);
//        checkingAccount.deposit(20);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(50);
//        System.out.println(checkingAccount.getBalance());
        HomeWork.SavingsAccount savingsAccount = new HomeWork().new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.deposit(500);
        savingsAccount.deposit(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(500);//��4�δ����ȡ1Ԫ������
        System.out.println(savingsAccount.getBalance());//2500+500=3000-1
        savingsAccount.earnMonthlyInterest();//�����������Ѵ���
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);//��4��ȡ����ȡ1Ԫ������
        System.out.println(savingsAccount.getBalance());//2699-100=2599 - 1




        //HomeWork��ʵ�� 10
//        HomeWork.Doctor doctor1 = new HomeWork().new Doctor("��ҽ��", 25, "��������", "Ů", 20000);
//        HomeWork.Doctor doctor2 = new HomeWork().new Doctor("��ҽ��", 25, "��������", "Ů", 20000);
//        HomeWork.Doctor doctor3 = new HomeWork().new Doctor("��ҽ��", 35, "Ƥ���Ƹ�����", "��", 30000);
//        HomeWork.Doctor doctor4 = new HomeWork().new Doctor("֣ҽ��", 50, "Ժ��", "��", 100000);
//        System.out.println(doctor1.equals(doctor2));
//        System.out.println(doctor3.equals(doctor4));

        //HomeWork��ʵ�� 11
//        HomeWork.Person2 person = new HomeWork().new Student();
//        person.run();
//        person.eat();
//        HomeWork.Student student = (HomeWork.Student) person;
//        student.study();
//        student.run();
//        student.eat();

        //HomeWork��ʵ�� 12
/*        HomeWork.Person3[] people = new HomeWork.Person3[4];
        people[0] = new HomeWork().new Student2("С��",'��',15,"001");
        people[1] = new HomeWork().new Student2("С��",'Ů',13,"002");
        people[2] = new HomeWork().new Teacher3("����ʦ",'��',30,10);
        people[3] = new HomeWork().new Teacher3("����ʦ",'Ů',25,5);
        System.out.println("====��������ǰ====");
        for (HomeWork.Person3 person : people) {
            System.out.println(person);
        }

        for (int i = 0; i < people.length; i++) {
            HomeWork.Person3 person = people[i];
            if (people[i] != null && people[i] instanceof HomeWork.Student2) {
//                ((HomeWork.Student2) people[i]).study();
                ((HomeWork.Student2) people[i]).printInfo();
            }else if (people[i] != null && people[i] instanceof HomeWork.Teacher3) {
//                ((HomeWork.Teacher3)people[i]).teach();
                ((HomeWork.Teacher3)people[i]).printInfo();
            }else {
                System.out.println("���Ķ�����������");
            }
            people[i].highToLowAge(people);
        }
        System.out.println("====���������====");
        for (HomeWork.Person3 person : people) {
            System.out.println(person);
        }*/

        //HomeWork��ʵ�� 14
//        HomeWork.C c = new HomeWork().new C();

    }
}


