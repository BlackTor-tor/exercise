package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:19
 * @ע��
 */
public class A {
    private final String name = "AA";
    {
        class B {//�ڲ���B
            private final String name = "BB";
            public void show() {
                System.out.println(name);//BB
            }
        }
        new B().show();
    }
    public void show() {
        System.out.println(name);//AA
    }
}
