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
                    "\tpost=" + post + "\tsalary=" + (salary * level)+ "\tlevel=" + level;
        }

    }
        //     * ��3����д��ʦ����������ࣺ������(Professor)���������ࡢ��ʦ�ࡣ
        public class Professor extends Teacher{

            public Professor(String name, int age, String post, double salary, double level) {
                super(name, age, post, salary, level);
            }

        }
        public class ViceProfessor extends Teacher{

            public ViceProfessor(String name, int age, String post, double salary, double level) {
                super(name, age, post, salary, level);
            }
        }
        public class  Instructor extends Teacher{

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

    public class DepartManager extends Employee{
        private double level = 1.2;
        public DepartManager(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }
        @Override
        public void getSalary() {//��1�����ž�����=1000+���չ���*����*�ȼ���1.2��
            System.out.println("\n=====���ž���=====\n" + getName() +
                                          "\t����=" + (1000 + getDaySalary() * getWorkDays() * level) +
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
        public Employee2(String name,double salary) {
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
            System.out.println(name + "��н��" + (salary * 12)/10000 +"w");
        }
    }

    public class Worker extends Employee2{//�����ࣨWorker��
        public Worker(String name, double salary) {
            super(name, salary);
        }
    }
    public class Peasant extends Employee2{//ũ���ࣨPeasant��
        public Peasant(String name, double salary) {
            super(name, salary);
        }
    }
    public class Teacher2 extends Employee2{//��ʦ�ࣨTeacher��
        private int classDay;
        private double classSal;
        public Teacher2(String name, double salary, int classDay, double classSal) {
            super(name, salary);
            this.classDay = classDay;
            this.classSal = classSal;
        }
        @Override
        public void yearSal() {
            System.out.println(getName() + "��н��" + ((getSalary() * 12) + (classDay * classSal))/10000 +"w");
        }
    }
    public class Scientist extends Employee2{//��ѧ���ࣨScientist��
        private double bonus;
        public Scientist(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }
        @Override
        public void yearSal() {
            System.out.println(getName() + "��н��" + ((getSalary() * 12) + bonus)/10000 +"w");
        }
    }
    public class Waiter extends Employee2 {//�������ࣨWaiter��
        public Waiter(String name, double salary) {
            super(name, salary);
        }
    }

    /**
     * 6���ٶ�Grand��Father��Son��ͬһ�������ʣ������������ͨ��this��super�����Ե�����Щ���Ժͷ���
     *
     */
    class Grand{//����
        String name = "AA";
        private int age = 100;
        public void g1() {}
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
    class Son extends Father{//����
        String name = "BB";
        public void g1() {}
        private void show() {
            //super���Է�����Щ��Ա�����Ժͷ�������
//            super.name;super.id;super.g1();super.f1();
            //this���Է�����Щ��Ա��
//            this.name;this.id;this.g1();this.f1();this.show();
        }
    }

    /**
     * 7��д��������
     */
    class Test{ //����
        String name = "Rose";
        Test(){
            System.out.println("Test");//1
        }
        Test(String name){//name=john
            this.name = name;//����Ѹ���� name �޸� john
        }
    }
    public class Demo extends Test{//����
        String name="Jack";
        public Demo()	{
            super();
            System.out.println("Demo");//2
        }
        public Demo(String s){
            super(s);
        }
        public void test(){
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
        private double balance ;//���
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        //���
        public void deposit(double amount)  {
            balance += amount;
        }
        //ȡ��
        public void withdraw(double amount)  {
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
