package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 13:06
 * @注释
 */
public class Car {
    private Double temperature;

    class Air {
        private void flowOn() {
            System.out.println("车内空调已打开");
        }

        private void flowOff() {
            System.out.println("车内空调已关闭");
        }
        public void monitor() {
            if (temperature > 0 && temperature < 40 ) {
                flowOff();
            }else if (temperature < 0 ) {
                flowOn();
                System.out.println("暖风~~~");
            }else if (temperature > 40 ) {
                flowOn();
                System.out.println("冷风~~~");
            }else {
                flowOff();
                System.out.println("温度有误，无法开启空调");
            }
        }
    }
    public Car(Double temperature) {
        this.temperature = temperature;
    }
}

