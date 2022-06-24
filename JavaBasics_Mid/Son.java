package JavaBasics_Mid;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/23 10:28
 * @×¢ÊÍ ¼Ì³Ð
 */
public class Son extends Father{
    private String sword = "¶ù×ÓµÄ½£";
    public int num = 20;

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    @Override
    public void InnerKungfu() {
        System.out.println(this.sword);
    }

}
