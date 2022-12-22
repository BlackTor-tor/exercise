package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/20 11:21
 * @×¢ÊÍ
 */
@SuppressWarnings("all")
public enum Color implements TestColor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue£º" + redValue + "\ngreenValue£º" + greenValue + "\nblueValue£º" + blueValue);
    }
}

interface TestColor {
    void show();
}