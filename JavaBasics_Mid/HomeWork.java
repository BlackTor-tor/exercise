package JavaBasics_Mid;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/26 18:03
 * @注释
 */
public class HomeWork {
    /**
     * 1、定义一个Person类{name, age, job}，初始化Person对象数组，有3个person对象，
     * 并按照age从大到小进行排序，提示，使用冒泡排序
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

        public void maxAge1(int[] age) {//自己写的。
            int temp;
            for (int i = 0; i < age.length - 1; i++) {//用冒泡排序年龄从大到小，外层循环比较数组个数减1次
                for (int j = 0; j < age.length - 1 - i; j++) {//比过的不用比，减去i
                    if (age[j] < age[j + 1]) {
                        temp = age[j + 1];
                        age[j + 1] = age[j];
                        age[j] = temp;
                    }
                }
            }
        }

        public void maxAge2(Person[] people) {//韩老师版本
            Person temp;
            for (int i = 0; i < people.length - 1; i++) {//用冒泡排序年龄从大到小，外层循环比较数组个数减1次
                for (int j = 0; j < people.length - 1 - i; j++) {//比过的不用比，减去i
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
     * 2、写出四种访问修饰符和各自的访问权限
     */
    public int public1 = 1;//可以访问：同包同类/不同类、不同包的子类/非子类
    protected int protected2 = 2;//可以访问：同包同类/不同类、不同包的子类
    int default3 = 3;//可以访问：同包同类/不同类
    private int private4 = 4;//可以访问：同包同类

    /**
     * 3、编写老师类
     * （1）要求有属性 姓名name，年龄age，职称post，基本工资salary
     * （2）编写业务方法，introduce()，实现输出一个教师的信息
     * （3）编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。工资级别分别为教授为1.3，副教授为1.2，讲师类1.1。
     * 在三个子类里面都重写父类的introduce()方法。
     * （4）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
     */
    //（1）编写老师类。要求有属性 姓名name，年龄age，职称post，基本工资salary
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

        //（2）编写业务方法，introduce()，实现输出一个教师的信息
        public String introduce() {
            return "Teacher" + "Name=" + name + "\tage=" + age +
                    "\tpost=" + post + "\tsalary=" + (salary * level)+ "\tlevel=" + level;
        }

    }
        //     * （3）编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。
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
     * 4、通过继承实现员工工资核算打印功能
     * 父类：员工类
     * 子类：部门经理类、普通员工类
     * （1）部门经理工资=1000+单日工资*天数*等级（1.2）
     * （2）普通员工工资=单日工资*天数*等级（1.0）；
     * （3）员工属性：姓名、单日工资、工作天数
     * （4）员工方法（打印工资）
     * （5）普通员工及部门经理都是员工子类，需要重写打印工资方法
     * （6）定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资
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
            System.out.println("员工" + name + "\t单日工资=" + daySalary + "\t工作天数=" + workDays + "\t职级=" + level);
        }
    }

    public class NormEmp extends Employee {
        private double level = 1.0;
        public NormEmp(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }
        @Override
        public void getSalary() {//（2）普通员工工资=单日工资*天数*等级（1.0）
            System.out.println("=====普通员工=====\n" + getName() +
                                          "\t工资=" + (getDaySalary() * getWorkDays() * level) +
                                          "\t工作天数=" + getWorkDays() +
                                          "\t职级=" + level);
        }
    }

    public class DepartManager extends Employee{
        private double level = 1.2;
        public DepartManager(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }
        @Override
        public void getSalary() {//（1）部门经理工资=1000+单日工资*天数*等级（1.2）
            System.out.println("\n=====部门经理=====\n" + getName() +
                                          "\t工资=" + (1000 + getDaySalary() * getWorkDays() * level) +
                                          "\t工作天数=" + getWorkDays() +
                                          "\t职级=" + level);
        }
    }

    /**
     * 5、设计父类—员工类。子类：工人类（Worker）,农民类（Peasant）,教师类（Teacher）,科学家类（Scientist）,服务生类（Waiter）。
     * （1）其中工人，农民，服务生只有基本工资
     * （2）教师除基本工资外，还有课酬（元/天）classDay，classSal
     * （3）科学家除基本工资外，还有年终奖 bonus
     * （4）编写一个测试类，将各种类型的员工的全年工资打印出来
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
            System.out.println(name + "年薪是" + (salary * 12)/10000 +"w");
        }
    }

    public class Worker extends Employee2{//工人类（Worker）
        public Worker(String name, double salary) {
            super(name, salary);
        }
    }
    public class Peasant extends Employee2{//农民类（Peasant）
        public Peasant(String name, double salary) {
            super(name, salary);
        }
    }
    public class Teacher2 extends Employee2{//教师类（Teacher）
        private int classDay;
        private double classSal;
        public Teacher2(String name, double salary, int classDay, double classSal) {
            super(name, salary);
            this.classDay = classDay;
            this.classSal = classSal;
        }
        @Override
        public void yearSal() {
            System.out.println(getName() + "年薪是" + ((getSalary() * 12) + (classDay * classSal))/10000 +"w");
        }
    }
    public class Scientist extends Employee2{//科学家类（Scientist）
        private double bonus;
        public Scientist(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }
        @Override
        public void yearSal() {
            System.out.println(getName() + "年薪是" + ((getSalary() * 12) + bonus)/10000 +"w");
        }
    }
    public class Waiter extends Employee2 {//服务生类（Waiter）
        public Waiter(String name, double salary) {
            super(name, salary);
        }
    }

    /**
     * 6、假定Grand、Father和Son在同一个包，问：父类和子类中通过this和super都可以调用哪些属性和方法
     *
     */
    class Grand{//超类
        String name = "AA";
        private int age = 100;
        public void g1() {}
    }
    class Father extends Grand {//父类
        String id = "001";
        private double score;
        public void f1() {
            //super可以访问哪些成员（属性和方法）？
//            super.name;super.g1();
            //this可以访问哪些成员？
//            this.name;this.g1();this.id;this.f1();this.score;
        }
    }
    class Son extends Father{//子类
        String name = "BB";
        public void g1() {}
        private void show() {
            //super可以访问哪些成员（属性和方法）？
//            super.name;super.id;super.g1();super.f1();
            //this可以访问哪些成员？
//            this.name;this.id;this.g1();this.f1();this.show();
        }
    }

    /**
     * 7、写出程序结果
     */
    class Test{ //父类
        String name = "Rose";
        Test(){
            System.out.println("Test");//1
        }
        Test(String name){//name=john
            this.name = name;//这里把父类的 name 修改 john
        }
    }
    public class Demo extends Test{//子类
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
     * 8、扩展如下的BankAccount类
     * 要求：
     * （1）在上面类的基础上扩展 新类CheckingAccount对每次存款和取款都收取1美元的手续费
     * （2）扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生（earnMonthlyInterest方法被调用），并且有每月三次免手续费的存款或取款。
     * 在earnMonthlyInterest方法中重置交易计数
     * （3）体会重写的好处
     */
    public class BankAccount {//父类
        private double balance ;//余额
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        //存款
        public void deposit(double amount)  {
            balance += amount;
        }
        //取款
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
