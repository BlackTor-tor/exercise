package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/3/4 9:18
 * @ע��
 */
public class HomeWork02 {
    /*
     * 2.˵�����´����Ƿ�ᷢ���쳣������ᣬ�������쳣? ������ᣬ���ӡ�����ʲô��
     * */
    public static void main(String[] args) {
        if (args[4].equals("john")) {//���ܷ���NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
            Object o = args[2];//String > Object����ת����
            Integer i = (Integer)o;//����ת�ͣ��Ѹ��ำ�����࣬�ᱨ��
        }
    }

    /*3.д��������:BCD
     */
    public static void func() {//��̬����
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

//    public static void main(String[] args) {///main����
//        try {
//            func();
//            System.out.println("A"):
//        } catch (Exception e) {
//            System.out.println("c");
//        }
//        System.out.println("D");
//    }

    /*4.д��������:BCD
        */
    public static void showExce() throws Exception {
        throw new Exception();
    }
//    public static void main(String[] args) {
//        try {
//            showExce();
//            System.out.println("A");
//        }
//        catch(Exception e) {
//            System.out.println("B");
//        }
//        finally {
//            System.out.println("C");
//        }
//            System.out.println("D");

}