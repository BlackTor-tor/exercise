package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/29 10:49
 * @注释 匿名内部类实际应用
 */
public class CellPhone {
        /**
         * @Author: tor
         * @Description: 闹钟功能用接口作为参数传递
         * @Date: 2022/11/29 10:50
         * @Params: [bell]
         * @Return: void
         **/
        public void alarmclock(Bell bell) {
            bell.ring();
    }
}
