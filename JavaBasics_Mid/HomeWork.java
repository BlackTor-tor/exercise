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
}
