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
    public void compare() {
        String s1 = "hyc";
        String s2 = "hyc2";
        System.out.println(s1.compareTo(s2));
    }

    public void concat() {
        String s1 = "tor";
        String s2 = "black";
        System.out.println(s2.concat(s1));//在s2的后面拼接一个s1
    }

    public void contains() {
        String s = "tor";
        System.out.println(s.contains("aor"));//精确匹配，只要不包含指定字符串中的其中一个值，就返回false
    }

}