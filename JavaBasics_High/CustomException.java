package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/3/3 10:29
 * @注释 自定义异常类
 */
public class CustomException extends RuntimeException /*Exception*/{

    public CustomException(String message) {
        super(message);
    }
}
