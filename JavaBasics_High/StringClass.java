package JavaBasics_High;

import JavaBasics_High.HomeWork.Person;

/**
 * @Author tor
 * @Date 2023/12/5 20:55
 * @PackageName:JavaBasics_High
 * @Description: String类练习
 * @Version 1.0
 */

public class StringClass {

    public void testString() {
        String s1 = "tor";
        String s2 = new String("tor");
        String s3 = "tor";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s2.intern());
        System.out.println(s2 == s2.intern());
    }

    public void testString2() {
        Person p1 = new Person();
        p1.setName("tor");
        Person p2 = new Person();
        p2.setName("tor");
        System.out.println(p1.getName().equals(p2.getName()));
        System.out.println(p1.getName() == p2.getName());
        System.out.println(p1.getName() == "tor");
    }

    /**
     * String的常用方法
     *CompareTO
     */
    public void CompareString() {
        String s1 = "hyc";
        String s2 = "黑洋葱";
        System.out.println(s1.compareTo(s2));
    }

}