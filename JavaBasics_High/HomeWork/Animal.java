package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/11 12:31
 * @ע��
 */
public abstract class Animal {
    abstract void shout();
}

class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("������~");
    }
}

class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("������~");
    }
}
