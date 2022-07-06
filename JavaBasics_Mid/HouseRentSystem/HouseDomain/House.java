package JavaBasics_Mid.HouseRentSystem.HouseDomain;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 9:01
 * @注释  房屋实体类
 */
public class House {
    private int houseId = 1;
    private String houseName;
    private String housePhone;
    private String houseAddress;
    private double houseMoney;
    private String state;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHousePhone() {
        return housePhone;
    }

    public void setHousePhone(String housePhone) {
        this.housePhone = housePhone;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public double getHouseMoney() {
        return houseMoney;
    }

    public void setHouseMoney(double houseMoney) {
        this.houseMoney = houseMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  "\t" + houseId +
                "\t\t" + houseName +
                "\t\t" + housePhone +
                "\t\t\t" + houseAddress +
                "\t" + houseMoney +
                "\t" + state;
    }
}
