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
}
