package JavaBasics_Mid;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/23 10:28
 * @×¢ÊÍ ¼Ì³Ð
 */
public class Father extends Grandpa {
    private String FamilyBook = super.FamilyBook;
    private String sword = "¸¸Ç×µÄ½£";
    public int num = 10;

    public String getFamilyBook() {
        return FamilyBook;
    }

    public void setFamilyBook(String familyBook) {
        FamilyBook = familyBook;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public Father() {
//        this.InnerKungfu();
    }

    @Override
    public void InnerKungfu() {
        System.out.println(this.sword);
    }


}
