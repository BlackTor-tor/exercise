package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 13:06
 * @ע��
 */
public class Car {
    private Double temperature;

    class Air {
        private void flowOn() {
            System.out.println("���ڿյ��Ѵ�");
        }

        private void flowOff() {
            System.out.println("���ڿյ��ѹر�");
        }
        public void monitor() {
            if (temperature > 0 && temperature < 40 ) {
                flowOff();
            }else if (temperature < 0 ) {
                flowOn();
                System.out.println("ů��~~~");
            }else if (temperature > 40 ) {
                flowOn();
                System.out.println("���~~~");
            }else {
                flowOff();
                System.out.println("�¶������޷������յ�");
            }
        }
    }
    public Car(Double temperature) {
        this.temperature = temperature;
    }
}

