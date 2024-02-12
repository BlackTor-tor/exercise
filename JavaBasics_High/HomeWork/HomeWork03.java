package JavaBasics_High.HomeWork;

/**
 * @Author tor
 * @Date 2024/2/5 13:27
 * @PackageName:JavaBasics_High.HomeWork
 * @Description:
 * @Version 1.0
 */
public class HomeWork03 {
    /*第一题：
     * (1)将字符串中指定部分进行反转。比如将"abcdef"反转为"aedcbf"
     * (2)编写方法 public static String reverse(String str, int start , int end) 搞定
     * */

    /*
     *思路：1、需要对字符串中的字符进行操作，需要用到toCharArray()方法;
     * 2、获取到从开始到结束位置的字符，进行交换。
     * */
    public static String reverse(String str, int start, int end) {
        char[] cStr = str.toCharArray();
        // 确保 start 和 end 位于字符串的合法范围内，并且 start 小于 end
        if (start >= 0 && end < str.length() && start < end) {
            // 只要 start 位置在 end 之前，就交换两个位置的字符
            while (start < end) {
                char temp = cStr[start];
                cStr[start] = cStr[end];
                cStr[end] = temp;
                // 更新 start 和 end 的位置
                start++;
                end--;
            }
            return new String(cStr);
        } else {
            return "开始和结束位置超过了字符串长度或者开始位置大于结束位置，请重新输入";
        }
    }

    /*第二题
    输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
    要求:
    (1) 用户名长度为2或3或4
    (2)密码的长度为6，要求全是数字 isDigital
    (3)邮箱中包含@和.并且@在.的前面
    */
    //先考虑用字符串传入参数，后期看看能不能优化用Scanner对象来传
    public String loginUserNameOrPwdOrEmail(String userName, Integer pwd, String email) {
        try {
            if (userName == null || userName.length() < 2 || userName.length() > 4) {
                throw new Exception("注册不通过，您输入的用户名长度需在2-4位之间，请重新输入");
            }

            if (pwd.toString().length() != 6 || !pwd.toString().chars().allMatch(Character::isDigit)) {
                throw new Exception("注册不通过，您输入的密码长度须为6位且全是数字，请重新输入");
            }

            if (!email.contains("@") || !email.contains(".") || email.indexOf("@") > email.indexOf(".")) {
                throw new Exception("注册不通过，您输入的邮箱格式不正确，请重新输入");
            }
        } catch (Exception e) {
            // 异常处理逻辑，这里我们返回异常消息
            return e.getMessage();
        }
        return "注册成功";
    }
}
