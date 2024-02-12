package JavaBasics_High.HomeWork;

/**
 * @Author tor
 * @Date 2024/2/5 13:27
 * @PackageName:JavaBasics_High.HomeWork
 * @Description:
 * @Version 1.0
 */
public class HomeWork03 {
    /*��һ�⣺
     * (1)���ַ�����ָ�����ֽ��з�ת�����罫"abcdef"��תΪ"aedcbf"
     * (2)��д���� public static String reverse(String str, int start , int end) �㶨
     * */

    /*
     *˼·��1����Ҫ���ַ����е��ַ����в�������Ҫ�õ�toCharArray()����;
     * 2����ȡ���ӿ�ʼ������λ�õ��ַ������н�����
     * */
    public static String reverse(String str, int start, int end) {
        char[] cStr = str.toCharArray();
        // ȷ�� start �� end λ���ַ����ĺϷ���Χ�ڣ����� start С�� end
        if (start >= 0 && end < str.length() && start < end) {
            // ֻҪ start λ���� end ֮ǰ���ͽ�������λ�õ��ַ�
            while (start < end) {
                char temp = cStr[start];
                cStr[start] = cStr[end];
                cStr[end] = temp;
                // ���� start �� end ��λ��
                start++;
                end--;
            }
            return new String(cStr);
        } else {
            return "��ʼ�ͽ���λ�ó������ַ������Ȼ��߿�ʼλ�ô��ڽ���λ�ã�����������";
        }
    }

    /*�ڶ���
    �����û��������롢���䣬�����Ϣ¼����ȷ������ʾע��ɹ������������쳣����
    Ҫ��:
    (1) �û�������Ϊ2��3��4
    (2)����ĳ���Ϊ6��Ҫ��ȫ������ isDigital
    (3)�����а���@��.����@��.��ǰ��
    */
    //�ȿ������ַ���������������ڿ����ܲ����Ż���Scanner��������
    public String loginUserNameOrPwdOrEmail(String userName, Integer pwd, String email) {
        try {
            if (userName == null || userName.length() < 2 || userName.length() > 4) {
                throw new Exception("ע�᲻ͨ������������û�����������2-4λ֮�䣬����������");
            }

            if (pwd.toString().length() != 6 || !pwd.toString().chars().allMatch(Character::isDigit)) {
                throw new Exception("ע�᲻ͨ��������������볤����Ϊ6λ��ȫ�����֣�����������");
            }

            if (!email.contains("@") || !email.contains(".") || email.indexOf("@") > email.indexOf(".")) {
                throw new Exception("ע�᲻ͨ����������������ʽ����ȷ������������");
            }
        } catch (Exception e) {
            // �쳣�����߼����������Ƿ����쳣��Ϣ
            return e.getMessage();
        }
        return "ע��ɹ�";
    }
}
