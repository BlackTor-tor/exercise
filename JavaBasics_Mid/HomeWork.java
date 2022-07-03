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
                    "\tpost=" + post + "\tsalary=" + (salary * level) + "\tlevel=" + level;
        }

    }

    //     * （3）编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。
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

    public class DepartManager extends Employee {
        private double level = 1.2;

        public DepartManager(String name, double daySalary, int workDays) {
            super(name, daySalary, workDays);
        }

        @Override
        public void getSalary() {//（1）部门经理工资=1000+单日工资*天数*等级（1.2）
            System.out.println("\n=====部门经理=====\n" + getName() +
                    "\t工资=" + (1000 + getDaySalary() * getWorkDays() * level) +//1000其实是奖金，应该写成变量，是一个动态的特有的属性。以后分析时候需要注意
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
            System.out.println(name + "年薪是" + (salary * 12) / 10000 + "w");
        }
    }

    public class Worker extends Employee2 {//工人类（Worker）

        public Worker(String name, double salary) {
            super(name, salary);
        }
    }

    public class Peasant extends Employee2 {//农民类（Peasant）

        public Peasant(String name, double salary) {
            super(name, salary);
        }
    }

    public class Teacher2 extends Employee2 {//教师类（Teacher）
        private int classDay;
        private double classSal;

        public Teacher2(String name, double salary, int classDay, double classSal) {
            super(name, salary);
            this.classDay = classDay;
            this.classSal = classSal;
        }

        @Override
        public void yearSal() {
            System.out.println(getName() + "年薪是" + ((getSalary() * 12) + (classDay * classSal)) / 10000 + "w");
        }
    }

    public class Scientist extends Employee2 {//科学家类（Scientist）
        private double bonus;

        public Scientist(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        public void yearSal() {
            System.out.println(getName() + "年薪是" + ((getSalary() * 12) + bonus) / 10000 + "w");
        }
    }

    public class Waiter extends Employee2 {//服务生类（Waiter）

        public Waiter(String name, double salary) {
            super(name, salary);
        }
    }

    /**
     * 6、假定Grand、Father和Son在同一个包，问：父类和子类中通过this和super都可以调用哪些属性和方法
     */
    class Grand {//超类
        String name = "AA";
        private int age = 100;

        public void g1() {
        }
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

    class Son extends Father {//子类
        String name = "BB";

        public void g1() {
        }

        private void show() {
            //super可以访问哪些成员（属性和方法）？
//            super.name;super.id;super.g1();super.f1();
            //this可以访问哪些成员？
//            this.name;this.id;this.g1();this.f1();this.show();
        }
    }

    /**
     * 7、写出程序结果
     * 输出：1   test、2  Demo、3  Rose、4  jack 、5  john、 6 jack
     */
    class Test { //父类
        String name = "Rose";

        Test() {
            System.out.println("Test");//1
        }

        Test(String name) {//name=john
            this.name = name;//这里把父类的 name 修改 john
        }
    }

    public class Demo extends Test {//子类
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
     * 8、扩展如下的BankAccount类
     * 要求：
     * （1）在上面类的基础上扩展 新类CheckingAccount对每次存款和取款都收取1美元的手续费
     * （2）扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生（earnMonthlyInterest方法被调用），并且有每月三次免手续费的存款或取款。
     * 在earnMonthlyInterest方法中重置交易计数
     * （3）体会重写的好处
     */
    public class BankAccount {//父类
        private double balance;//余额

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        //存款
        public void deposit(double amount) {
            balance += amount;
        }

        //取款
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
     * @Description: 手续费
     * @Date: 2022/6/30 11:28
     * @Params:
     * @Return:
     **/
    public class CheckingAccount extends BankAccount {//子类

        public CheckingAccount(double initialBalance) {
            super(initialBalance);
        }

        @Override
        public void deposit(double amount) {
            super.deposit(amount - 1);//存款各收1元手续费
        }

        @Override
        public void withdraw(double amount) {//取款各收1元手续费
            super.withdraw(amount + 1);
        }
    }

    //新类SavingsAccount每个月都有利息产生（earnMonthlyInterest方法被调用），并且有每月三次免手续费的存款或取款。
    //     * 在earnMonthlyInterest方法中重置交易计数
    public class SavingsAccount extends BankAccount {
        private int count = 3;//默认每个月都有3次免收手续费的次数
        private double rate;//利率

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
         * @Description: 每月产生利息
         * @Date: 2022/6/30 11:45
         * @Params: []
         * @Return: double
         **/
        public void earnMonthlyInterest() {
            count = 3;//重置免手续费次数
            super.deposit(getBalance() * getRate());//增加利率。相当于把利息当成存款存了一下。非常巧妙
        }
        @Override
        public void deposit(double amount) {//重写存款方法，增加免3次手续费的功能
            if (count > 0) {
                super.deposit(amount);
                count--;
            }else {
                super.deposit(amount - 1);
            }
        }
        @Override
        public void withdraw(double amount) {//重写取款方法，增加免3次手续费的功能
            if (count > 0) {
                super.withdraw(amount);
                count--;
            }else {
                super.withdraw(amount + 1);
            }
        }
    }

        /**
         * 9、设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint，
         * 其构造器接受一个标签值和x,y坐标，比如new LabeledPoint("balck",1929,230.07)，写出对应的构造器即可
         */
        public class Point {//父类
            private String name;
            private double x;
            private double y;

            public Point(String name,double x, double y) {
                this.name = name;
                this.x = x;
                this.y = y;
            }
        }
        public class LabeledPoint extends Point{//子类
            public LabeledPoint(String name, double x, double y) {
                super(name, x, y);
            }
        }

    /**
     * 10、编写Doctor类{name, age, job, gender. sal}，相应的getter()和setter()方法，5个参数的构造器，重写父类(object)的equals()方法：
     * public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
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
     * 11、现有Person类，里面有方法run、eat、Student类继承了Person类，并重写了run方法，自定义了study方法，
     * 试写出对象向上转型和向下转型的代码，并写出各自都可以调用哪些方法，并写出方法输出什么？
     * 父类可以调用：person.run();、person.eat();
     * 子类可以调用：student.study();、student.run();、student.eat();
     */
    public class Person2 {//父类
        public void run() {
            System.out.println("Person2的run()……");
        }
        public void eat() {
            System.out.println("Persion2的eat()……");
        }
    }
    public class Student extends Person2 {//子类
        @Override
        public void run() {
            System.out.println("Student的run()……");
        }
        public void study() {
            System.out.println("Student的study()方法");
        }
    }

    /**
     * 12、说出==和equals的区别：
     *  ==是比较运算符：（1）基本类型比较的是值是否相等；（2）引用类型比较的是对象引用的地址是否相等
     * equals是object类中的方法：比较的是对象的值是否相等。不可以用来判断基本数据类型
     */

    /**
     * 13、写一个Person类，一个Student类、一个Teacher类
     */
    //抽取一个父类Person类，将共同属性和方法放到Person类
    public class Person3 {//父类
        private String name;
        private char gender;
        private int age;
        //方法
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
        //编写一个play 方法, 把共有的输出内容写到父类
        public String play() {
            return name + "爱玩";
        }
        //返回一个基本信息
        /*
        姓名：张飞
        年龄：30
        性别：男
         */
        public String basicInfo() {
            return "姓名: " + name + "\n年龄: " + age + "\n性别: " + gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
        public void highToLowAge(Person3[] person) {//年龄从高到底排序
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
     * Student类有名称（name），性别(sex),年龄（age），学号（stu_id），
     * 做合理封装，通过构造器在创建对象时将4个属性赋值。
     * 学生需要有学习的方法（study），在方法里写生“我承诺，我会好好学习。”
     */
     public class Student2 extends Person3{ //
        //属性
        private String stu_id;//学号
        //方法
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

        //我承诺，我会好好学习
        public void study() {
            System.out.println(getName() + "承诺，我会好好学习。");
        }

        /**
         * 学生爱玩足球
         * @return
         */
        @Override
        public String play() {
            return super.play() + "足球";
        }

        //编写一个输出信息的方法，这样体现封装
        public void printInfo() {
            System.out.println("学生的信息:");
            System.out.println(super.basicInfo());
            System.out.println("学号: " + stu_id);
            study();//组合， 变化万千
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
     * 写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age),
     * 做合理封装，通过构造器在创建对象时将4个属性赋值
     */
    public class Teacher3 extends Person3 {
        //属性
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

        //教师需要有教学的方法（teach），在方法里写上“我承诺，我会认真教学。
        public void teach() {
            System.out.println(getName() + "承诺，我会认真教学");
        }
        /**
         * 老师爱玩象棋
         */
        @Override
        public String play() {
            return super.play() + "象棋";
        }
        //输出信息方法
        public void printInfo() {
            System.out.println("老师的信息：");
            System.out.println(super.basicInfo());
            System.out.println("工龄: " + work_age);
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
     * 14、执行C c = new C();输出什么内容？//答案：
     */
    public class A {
        public A() {
            System.out.println("我是A类的无参构造");//1
        }
    }
    public class B extends A {//父类
        public B() {
            System.out.println("我是B类的无参构造");
        }
        public B(String name) {
            System.out.println("我是B类的有参构造" + name);//2
        }
    }
    public class C extends B {//子类
        public C() {
            this("hello");
            System.out.println("我是C类的无参构造");//4
        }

        public C(String name) {
            super("hahah");
            System.out.println("我是C类的有参构造");//3
        }
    }

    /**
     * 15、什么是多态，多态具体体现有哪些？
     * （1）对象的多种形态，比如向上转型和向下转型
     * 在具体应用的时候，可以通过父类的对象引用指向不同的子类，来调用子类中的方法。
     * 比如说子类重写了父类的方法，会触发动态绑定机制。
     * 多态的前提是类之间必须有继承关系
     */

    /**
     * 16、java的动态绑定机制是什么？
     * 答：1、在多态的机制中，往往会出现父类的引用指向子类的情况，这个时候子类是运行类型，
     * 意味着子类如果重写了父类的方法，就可以实现动态绑定机制，在实际运行时，父类引用会调用子类自己的方法。这个就叫做动态绑定机制。
     * 官方说法：当调用对象的方法时，该方法会和对象的内存地址/运行类型绑定
     *                  当调用对象的属性时，没有动态绑定机制，哪里声明，哪里使用。
     */

}