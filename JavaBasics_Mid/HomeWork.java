package JavaBasics_Mid;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/26 18:03
 * @ע��
 */
public class HomeWork {
    /**
     * 1������һ��Person��{name, age, job}����ʼ��Person�������飬��3��person����
     * ������age�Ӵ�С����������ʾ��ʹ��ð������
     */
    public class Person {
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    '}';
        }

        public void maxAge1(int[] age) {//�Լ�д�ġ�
            int temp;
            for (int i = 0; i < age.length - 1; i++) {//��ð����������Ӵ�С�����ѭ���Ƚ����������1��
                for (int j = 0; j < age.length - 1 - i; j++) {//�ȹ��Ĳ��ñȣ���ȥi
                    if (age[j] < age[j + 1]) {
                        temp = age[j + 1];
                        age[j + 1] = age[j];
                        age[j] = temp;
                    }
                }
            }
        }

        public void maxAge2(Person[] people) {//����ʦ�汾
            Person temp;
            for (int i = 0; i < people.length - 1; i++) {//��ð����������Ӵ�С�����ѭ���Ƚ����������1��
                for (int j = 0; j < people.length - 1 - i; j++) {//�ȹ��Ĳ��ñȣ���ȥi
                    if (people[j].getAge() < people[j + 1].getAge()) {
                        temp = people[j + 1];
                        people[j + 1] = people[j];
                        people[j] = temp;
                    }
                }
            }
        }
    }

    /**
     * 2��д�����ַ������η��͸��Եķ���Ȩ��
     */
    public int public1 = 1;//���Է��ʣ�ͬ��ͬ��/��ͬ�ࡢ��ͬ��������/������
    protected int protected2 = 2;//���Է��ʣ�ͬ��ͬ��/��ͬ�ࡢ��ͬ��������
    int default3 = 3;//���Է��ʣ�ͬ��ͬ��/��ͬ��
    private int private4 = 4;//���Է��ʣ�ͬ��ͬ��

    /**
     * 3����д��ʦ��
     * ��1��Ҫ�������� ����name������age��ְ��post����������salary
     * ��2����дҵ�񷽷���introduce()��ʵ�����һ����ʦ����Ϣ
     * ��3����д��ʦ����������ࣺ������(Professor)���������ࡢ��ʦ�ࡣ���ʼ���ֱ�Ϊ����Ϊ1.3��������Ϊ1.2����ʦ��1.1��
     * �������������涼��д�����introduce()������
     * ��4�����岢��ʼ��һ����ʦ���󣬵���ҵ�񷽷���ʵ�ֶ��������Ϣ�ĺ�̨��ӡ
     */
    //��1����д��ʦ�ࡣҪ�������� ����name������age��ְ��post����������salary
    public class Teacher {
        private String name;
        private int age;
        private String post;
        private double salary;
        private double level;

        public Teacher(String name, int age, String post, double salary, double level) {
            this.name = name;
            this.age = age;
            this.post = post;
            this.salary = salary;
            this.level = level;
        }

        public double getLevel() {
            return level;
        }

        public void setLevel(double level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        //��2����дҵ�񷽷���introduce()��ʵ�����һ����ʦ����Ϣ
        public String introduce() {
            return "Teacher" + "Name=" + name + "\tage=" + age +
                    "\tpost=" + post + "\tsalary=" + (salary * level) + "\tlevel=" + level;
        }

    }

    //     * ��3����д��ʦ����������ࣺ������(Professor)���������ࡢ��ʦ�ࡣ
    public class Professor extends Teacher {

        public Professor(String name, int age, String post, double salary, double level) {
            super(name, age, post, salary, level);
        }

    }

    public class ViceProfessor extends Teacher {

        public ViceProfessor(String name, int age, String post, double salary, double level) {
            super(name, age, post, salary, level);
        }
    }

    public class Instructor extends Teacher {

        public Instructor(String name, int age, String post, double salary, double level) {
            super(name, age, post, salary, level);
        }
    }

    /**
     * 4��ͨ���̳�ʵ��Ա�����ʺ����ӡ����
     * ���ࣺԱ����
     * ���ࣺ���ž����ࡢ��ͨԱ����
     * ��1�����ž�����=1000+���չ���*����*�ȼ���1.2��
     * ��2����ͨԱ������=���չ���*����*�ȼ���1.0����
     * ��3��Ա�����ԣ����������չ��ʡ���������
     * ��4��Ա����������ӡ���ʣ�
     * ��5����ͨԱ�������ž�����Ա�����࣬��Ҫ��д��ӡ���ʷ���
     * ��6�����岢��ʼ����ͨԱ�����󣬵��ô�ӡ���ʷ������빤�ʣ����岢��ʼ�����ž�����󣬵��ô�ӡ���ʷ������빤��
     */
    public class Employee {
        private String name;
        private double daySalary;
        private int workDays;
        private double level;

        public Employee(String name, double daySalary, int workDays, double level) {
            this.name = name;
            this.daySalary = daySalary;
            this.workDays = workDays;
            this.level = level;
        }

        public Employee(String name, double daySalary, int workDays) {
            this.name = name;
            this.daySalary = daySalary;
            this.workDays = workDays;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getDaySalary() {
            return daySalary;
        }

        public void setDaySalary(double daySalary) {
            this.daySalary = daySalary;
        }

        public int getWorkDays() {
            return workDays;
        }

        public void setWorkDays(int workDays) {
            this.workDays = workDays;
        }

        public double getLevel() {
            return level;
        }

        public void setLevel(double level) {
            this.level = level;
        }

        public void getSalary() {
            System.out.println("Ա��" + name + "\t���չ���=" + daySalary + "\t��������=" + workDays + "\tְ��=" + level);
        }
    }

    public class NormEmp extends Employee {
        private double level = 1.0;

        public NormEmp(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }

        @Override
        public void getSalary() {//��2����ͨԱ������=���չ���*����*�ȼ���1.0��
            System.out.println("=====��ͨԱ��=====\n" + getName() +
                    "\t����=" + (getDaySalary() * getWorkDays() * level) +
                    "\t��������=" + getWorkDays() +
                    "\tְ��=" + level);
        }
    }

    public class DepartManager extends Employee {
        private double level = 1.2;

        public DepartManager(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }

        @Override
        public void getSalary() {//��1�����ž�����=1000+���չ���*����*�ȼ���1.2��
            System.out.println("\n=====���ž���=====\n" + getName() +
                    "\t����=" + (1000 + getDaySalary() * getWorkDays() * level) +//1000��ʵ�ǽ���Ӧ��д�ɱ�������һ����̬�����е����ԡ��Ժ����ʱ����Ҫע��
                    "\t��������=" + getWorkDays() +
                    "\tְ��=" + level);
        }
    }

    /**
     * 5����Ƹ��ࡪԱ���ࡣ���ࣺ�����ࣨWorker��,ũ���ࣨPeasant��,��ʦ�ࣨTeacher��,��ѧ���ࣨScientist��,�������ࣨWaiter����
     * ��1�����й��ˣ�ũ�񣬷�����ֻ�л�������
     * ��2����ʦ�����������⣬���пγ꣨Ԫ/�죩classDay��classSal
     * ��3����ѧ�ҳ����������⣬�������ս� bonus
     * ��4����дһ�������࣬���������͵�Ա����ȫ�깤�ʴ�ӡ����
     */
    public class Employee2 {
        private String name;
        private double salary;

        public Employee2(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void yearSal() {
            System.out.println(name + "��н��" + (salary * 12) / 10000 + "w");
        }
    }

    public class Worker extends Employee2 {//�����ࣨWorker��

        public Worker(String name, double salary) {
            super(name, salary);
        }
    }

    public class Peasant extends Employee2 {//ũ���ࣨPeasant��

        public Peasant(String name, double salary) {
            super(name, salary);
        }
    }

    public class Teacher2 extends Employee2 {//��ʦ�ࣨTeacher��
        private int classDay;
        private double classSal;

        public Teacher2(String name, double salary, int classDay, double classSal) {
            super(name, salary);
            this.classDay = classDay;
            this.classSal = classSal;
        }

        @Override
        public void yearSal() {
            System.out.println(getName() + "��н��" + ((getSalary() * 12) + (classDay * classSal)) / 10000 + "w");
        }
    }

    public class Scientist extends Employee2 {//��ѧ���ࣨScientist��
        private double bonus;

        public Scientist(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        public void yearSal() {
            System.out.println(getName() + "��н��" + ((getSalary() * 12) + bonus) / 10000 + "w");
        }
    }

    public class Waiter extends Employee2 {//�������ࣨWaiter��

        public Waiter(String name, double salary) {
            super(name, salary);
        }
    }

    /**
     * 6���ٶ�Grand��Father��Son��ͬһ�������ʣ������������ͨ��this��super�����Ե�����Щ���Ժͷ���
     */
    class Grand {//����
        String name = "AA";
        private int age = 100;

        public void g1() {
        }
    }

    class Father extends Grand {//����
        String id = "001";
        private double score;

        public void f1() {
            //super���Է�����Щ��Ա�����Ժͷ�������
//            super.name;super.g1();
            //this���Է�����Щ��Ա��
//            this.name;this.g1();this.id;this.f1();this.score;
        }
    }

    class Son extends Father {//����
        String name = "BB";

        public void g1() {
        }

        private void show() {
            //super���Է�����Щ��Ա�����Ժͷ�������
//            super.name;super.id;super.g1();super.f1();
            //this���Է�����Щ��Ա��
//            this.name;this.id;this.g1();this.f1();this.show();
        }
    }

    /**
     * 7��д��������
     * �����1   test��2  Demo��3  Rose��4  jack ��5  john�� 6 jack
     */
    class Test { //����
        String name = "Rose";

        Test() {
            System.out.println("Test");//1
        }

        Test(String name) {//name=john
            this.name = name;//����Ѹ���� name �޸� john
        }
    }

    public class Demo extends Test {//����
        String name = "Jack";

        public Demo() {
            super();
            System.out.println("Demo");//2
        }

        public Demo(String s) {
            super(s);
        }

        public void test() {
            System.out.println(super.name);//3
            System.out.println(this.name);//4
        }
    }

    /**
     * 8����չ���µ�BankAccount��
     * Ҫ��
     * ��1����������Ļ�������չ ����CheckingAccount��ÿ�δ���ȡ���ȡ1��Ԫ��������
     * ��2����չǰһ����ϰ��BankAccount�࣬����SavingsAccountÿ���¶�����Ϣ������earnMonthlyInterest���������ã���������ÿ�������������ѵĴ���ȡ�
     * ��earnMonthlyInterest���������ý��׼���
     * ��3�������д�ĺô�
     */
    public class BankAccount {//����
        private double balance;//���

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        //���
        public void deposit(double amount) {
            balance += amount;
        }

        //ȡ��
        public void withdraw(double amount) {
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    /**
     * @Author: tor
     * @Description: ������
     * @Date: 2022/6/30 11:28
     * @Params:
     * @Return:
     **/
    public class CheckingAccount extends BankAccount {//����

        public CheckingAccount(double initialBalance) {
            super(initialBalance);
        }

        @Override
        public void deposit(double amount) {
            super.deposit(amount - 1);//������1Ԫ������
        }

        @Override
        public void withdraw(double amount) {//ȡ�����1Ԫ������
            super.withdraw(amount + 1);
        }
    }

    //����SavingsAccountÿ���¶�����Ϣ������earnMonthlyInterest���������ã���������ÿ�������������ѵĴ���ȡ�
    //     * ��earnMonthlyInterest���������ý��׼���
    public class SavingsAccount extends BankAccount {
        private int count = 3;//Ĭ��ÿ���¶���3�����������ѵĴ���
        private double rate;//����

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public SavingsAccount(double initialBalance) {
            super(initialBalance);
        }

        /**
         * @Author: tor
         * @Description: ÿ�²�����Ϣ
         * @Date: 2022/6/30 11:45
         * @Params: []
         * @Return: double
         **/
        public void earnMonthlyInterest() {
            count = 3;//�����������Ѵ���
            super.deposit(getBalance() * getRate());//�������ʡ��൱�ڰ���Ϣ���ɴ�����һ�¡��ǳ�����
        }
        @Override
        public void deposit(double amount) {//��д������������3�������ѵĹ���
            if (count > 0) {
                super.deposit(amount);
                count--;
            }else {
                super.deposit(amount - 1);
            }
        }
        @Override
        public void withdraw(double amount) {//��дȡ�����������3�������ѵĹ���
            if (count > 0) {
                super.withdraw(amount);
                count--;
            }else {
                super.withdraw(amount + 1);
            }
        }
    }

        /**
         * 9�����һ��Point�࣬��x��y�������ͨ���������ṩ���ṩһ������LabeledPoint��
         * �乹��������һ����ǩֵ��x,y���꣬����new LabeledPoint("balck",1929,230.07)��д����Ӧ�Ĺ���������
         */
        public class Point {//����
            private String name;
            private double x;
            private double y;

            public Point(String name,double x, double y) {
                this.name = name;
                this.x = x;
                this.y = y;
            }
        }
        public class LabeledPoint extends Point{//����
            public LabeledPoint(String name, double x, double y) {
                super(name, x, y);
            }
        }

    /**
     * 10����дDoctor��{name, age, job, gender. sal}����Ӧ��getter()��setter()������5�������Ĺ���������д����(object)��equals()������
     * public boolean equals(Object obj)�����жϲ������д��������������Ƿ���ȡ���Ⱦ����ж������Ƿ���ͬ
     */
    public class Doctor {
        private String name;
        private int age;
        private String job;
        private String gender;
        private double sal;

        public Doctor(String name, int age, String job, String gender, double sal) {
            this.name = name;
            this.age = age;
            this.job = job;
            this.gender = gender;
            this.sal = sal;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) { return true;}
            if (!(obj instanceof Doctor) || obj == null) { return false;}
            Doctor doctor = (Doctor) obj;
            return doctor.age == this.age && doctor.name.equals(this.name) && doctor.job.equals(this.job)
                                                            && doctor.gender.equals(this.gender) && doctor.sal == this.sal;

        }
    }

    /**
     * 11������Person�࣬�����з���run��eat��Student��̳���Person�࣬����д��run�������Զ�����study������
     * ��д����������ת�ͺ�����ת�͵Ĵ��룬��д�����Զ����Ե�����Щ��������д���������ʲô��
     * ������Ե��ã�person.run();��person.eat();
     * ������Ե��ã�student.study();��student.run();��student.eat();
     */
    public class Person2 {//����
        public void run() {
            System.out.println("Person2��run()����");
        }
        public void eat() {
            System.out.println("Persion2��eat()����");
        }
    }
    public class Student extends Person2 {//����
        @Override
        public void run() {
            System.out.println("Student��run()����");
        }
        public void study() {
            System.out.println("Student��study()����");
        }
    }

    /**
     * 12��˵��==��equals������
     *  ==�ǱȽ����������1���������ͱȽϵ���ֵ�Ƿ���ȣ���2���������ͱȽϵ��Ƕ������õĵ�ַ�Ƿ����
     * equals��object���еķ������Ƚϵ��Ƕ����ֵ�Ƿ���ȡ������������жϻ�����������
     */

    /**
     * 13��дһ��Person�࣬һ��Student�ࡢһ��Teacher��
     */
    //��ȡһ������Person�࣬����ͬ���Ժͷ����ŵ�Person��
    public class Person3 {//����
        private String name;
        private char gender;
        private int age;
        //����
        public Person3(String name, char gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public char getGender() {
            return gender;
        }
        public void setGender(char gender) {
            this.gender = gender;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        //��дһ��play ����, �ѹ��е��������д������
        public String play() {
            return name + "����";
        }
        //����һ��������Ϣ
        /*
        �������ŷ�
        ���䣺30
        �Ա���
         */
        public String basicInfo() {
            return "����: " + name + "\n����: " + age + "\n�Ա�: " + gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
        public void highToLowAge(Person3[] person) {//����Ӹߵ�������
            Person3 temp;
            for (int i = 0; i < person.length - 1; i++) {
                for (int j = 0; j < person.length - 1 - i; j++) {
                    if (person[j].age < person[j+1].age) {
                        temp = person[j];
                        person[j] = person[j+1];
                        person[j+1] = temp;
                    }
                }
            }
        }
    }

    /**
     * Student�������ƣ�name�����Ա�(sex),���䣨age����ѧ�ţ�stu_id����
     * �������װ��ͨ���������ڴ�������ʱ��4�����Ը�ֵ��
     * ѧ����Ҫ��ѧϰ�ķ�����study�����ڷ�����д�����ҳ�ŵ���һ�ú�ѧϰ����
     */
     public class Student2 extends Person3{ //
        //����
        private String stu_id;//ѧ��
        //����
        public Student2(String name, char gender, int age, String stu_id) {
            super(name, gender, age);
            this.stu_id = stu_id;
        }

        public String getStu_id() {
            return stu_id;
        }

        public void setStu_id(String stu_id) {
            this.stu_id = stu_id;
        }

        //�ҳ�ŵ���һ�ú�ѧϰ
        public void study() {
            System.out.println(getName() + "��ŵ���һ�ú�ѧϰ��");
        }

        /**
         * ѧ����������
         * @return
         */
        @Override
        public String play() {
            return super.play() + "����";
        }

        //��дһ�������Ϣ�ķ������������ַ�װ
        public void printInfo() {
            System.out.println("ѧ������Ϣ:");
            System.out.println(super.basicInfo());
            System.out.println("ѧ��: " + stu_id);
            study();//��ϣ� �仯��ǧ
            System.out.println(play());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stu_id='" + stu_id + '\'' +
                    '}' + super.toString();
        }
    }

    /**
     * дһ��Teacher�࣬Teacher�������ƣ�name�����Ա�sex�������䣨age�������䣨work_age),
     * �������װ��ͨ���������ڴ�������ʱ��4�����Ը�ֵ
     */
    public class Teacher3 extends Person3 {
        //����
        private int work_age;

        public Teacher3(String name, char gender, int age, int work_age) {
            super(name, gender, age);
            this.work_age = work_age;
        }


        public int getWork_age() {
            return work_age;
        }

        public void setWork_age(int work_age) {
            this.work_age = work_age;
        }

        //��ʦ��Ҫ�н�ѧ�ķ�����teach�����ڷ�����д�ϡ��ҳ�ŵ���һ������ѧ��
        public void teach() {
            System.out.println(getName() + "��ŵ���һ������ѧ");
        }
        /**
         * ��ʦ��������
         */
        @Override
        public String play() {
            return super.play() + "����";
        }
        //�����Ϣ����
        public void printInfo() {
            System.out.println("��ʦ����Ϣ��");
            System.out.println(super.basicInfo());
            System.out.println("����: " + work_age);
            teach();
            System.out.println(play());
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "work_age=" + work_age +
                    '}' + super.toString();
        }
    }

    /**
     * 14��ִ��C c = new C();���ʲô���ݣ�//�𰸣�
     */
    public class A {
        public A() {
            System.out.println("����A����޲ι���");//1
        }
    }
    public class B extends A {//����
        public B() {
            System.out.println("����B����޲ι���");
        }
        public B(String name) {
            System.out.println("����B����вι���" + name);//2
        }
    }
    public class C extends B {//����
        public C() {
            this("hello");
            System.out.println("����C����޲ι���");//4
        }

        public C(String name) {
            super("hahah");
            System.out.println("����C����вι���");//3
        }
    }

    /**
     * 15��ʲô�Ƕ�̬����̬������������Щ��
     * ��1������Ķ�����̬����������ת�ͺ�����ת��
     * �ھ���Ӧ�õ�ʱ�򣬿���ͨ������Ķ�������ָ��ͬ�����࣬�����������еķ�����
     * ����˵������д�˸���ķ������ᴥ����̬�󶨻��ơ�
     * ��̬��ǰ������֮������м̳й�ϵ
     */

    /**
     * 16��java�Ķ�̬�󶨻�����ʲô��
     * ��1���ڶ�̬�Ļ����У���������ָ��������ָ���������������ʱ���������������ͣ�
     * ��ζ�����������д�˸���ķ������Ϳ���ʵ�ֶ�̬�󶨻��ƣ���ʵ������ʱ���������û���������Լ��ķ���������ͽ�����̬�󶨻��ơ�
     * �ٷ�˵���������ö���ķ���ʱ���÷�����Ͷ�����ڴ��ַ/�������Ͱ�
     *                  �����ö��������ʱ��û�ж�̬�󶨻��ƣ���������������ʹ�á�
     */

}