package JavaBasics_Mid.HouseRentSystem.HouseService;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseView.HouseView;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 12:17
 * @注释 房屋出租系统业务层
 */
public class HouseService {
    private int houseNum = 2;
    //创建房屋对象保存房屋信息
    private int initHouseNum = 0;//给房屋数组赋第一个值，并且第一次先新增房屋，不判断大小
    private House[] houses = new House[houseNum];

    /**
     * @Author: tor
     * @Description: 房屋列表
     * @Date: 2022/7/4 12:49
     * @Params:
     * @Return: house[]
     **/
    public House[] houseList() {
        return houses;
    }

    /**
     * @Author: tor
     * @Description: 新增房源
     * @Date: 2022/7/4 14:11
     * @Params:
     * @Return:
     **/
    public void addHouse() {
        houses[initHouseNum] = new House();
        for (int i = initHouseNum; i < 1; i++) {//先增加一次房屋
            System.out.println("请输入你要出租的房屋标题：");
            houses[initHouseNum].setHouseName(Utool.readString(20));
            System.out.println("请输入你要出租的房屋联系电话：");
            houses[initHouseNum].setHousePhone(Utool.readString(11));
            System.out.println("请输入你要出租的房屋地址：");
            houses[initHouseNum].setHouseAddress(Utool.readString(20));
            System.out.println("请输入你要出租的房屋租金");
            houses[initHouseNum].setHouseMoney(Utool.readInt());
            System.out.println("请输入你要出租的房屋状态(已/未出租)");
            houses[initHouseNum].setState(Utool.readString(3));

            System.out.println("输入完成，请确认是否提交");
            if (Utool.readConfirmSelection() == 'Y') {//确认是否提交，不确认即视为放弃
                System.out.println("新增房源成功");
                initHouseNum++;
                return;
            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("你放弃了本次新增操作");
                houses[initHouseNum] = null;
                return;
            }
        }
        int i;
        for (i = 0; i < houses.length; i++) {
        }
        if (i == 2) {//房屋上限最多2个
            System.out.println("房屋列表已满，无法继续新增");
            System.out.println("新增房源失败！");

        } else {
            System.out.println("请输入你要出租的房屋标题：");
            houses[initHouseNum].setHouseName(Utool.readString(5));
            System.out.println("请输入你要出租的房屋联系电话：");
            houses[initHouseNum].setHousePhone(Utool.readString(11));
            System.out.println("请输入你要出租的房屋地址：");
            houses[initHouseNum].setHouseAddress(Utool.readString(20));
            System.out.println("请输入你要出租的房屋租金");
            houses[initHouseNum].setHouseMoney(Utool.readInt());
            System.out.println("请输入你要出租的房屋状态(已/未出租)");
            houses[initHouseNum].setState(Utool.readString(3));

            System.out.println("输入完成，请确认是否提交");
            if (Utool.readConfirmSelection() == 'Y') {//确认是否提交，不确认即视为放弃
                System.out.println("新增房源成功");
                houses[initHouseNum].setHouseId(houses[initHouseNum].getHouseId() + 1);//序号自增
                initHouseNum++;
                return;
            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("你放弃了本次新增操作");
                houses[initHouseNum] = null;
                return;
            }
        }

    }


    /**
     * @Author: tor
     * @Description: 退出租房菜单
     * @Date: 2022/7/3 18:55
     * @Params: [houseView]
     * @Return: void
     **/
    public void exit(HouseView houseView) {
        if (Utool.readConfirmSelection() == 'Y') {
            houseView.setIsexit(false); //创建HouseView对象获取菜单属性
            System.out.println("你已经退出了房屋出租系统");
        } else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("你放弃了退出操作");
        }
    }
}
