package JavaBasics_Mid.HouseRentSystem.HouseView;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseService.HouseService;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 9:46
 * @注释
 */
public class HouseView {
    private boolean isexit = true;//控制菜单属性

    //创建Service对象，调用业务层
    HouseService houseService = new HouseService();

    public boolean getIsexit() {
        return isexit;
    }

    public void setIsexit(boolean isexit) {
        this.isexit = isexit;
    }

    /**
     * @Author: tor
     * @Description: 显示主菜单
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showMenu() {
        do {
            System.out.println("------------------房屋出租系统主菜单------------------");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋 信 息");
            System.out.println("\t\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退         出");
            System.out.println("---------------------------------------------------------");
            System.out.print("请输入你要进入的菜单数字(1-6)：");
            switch (Utool.readMenuSelection()) {
                case '1':
                    showHouseList();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delMenu();
                    break;
                case '4':
                    updateMenu();
                    break;
                case '5':
                    showHouse();
                    break;
                case '6':
                    houseService.exit(this);
                    break;
            }
        } while (isexit);
    }

    /**
     * @Author: tor
     * @Description: 1 新增房源菜单
     * @Date: 2022/7/3 19:05
     * @Params:
     * @Return: void
     **/
    public void showHouseList() {
        System.out.println("------------------正在新增房源中------------------");
        houseService.addHouse();
    }

    /**
     * @Author: tor
     * @Description: 2 查找房屋信息
     * @Date: 2022/7/6 11:44
     * @Params:
     * @Return: void
     **/
    public void findHouse() {
        int tempId; //保存输入的房屋编号
        String tempAddress; //保存输入的房屋地址

        System.out.println("------------------房 屋 列 表------------------");
        System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
        System.out.println("你需要根据什么条件来查找房屋信息，目前仅支持根据编号、地址和状态，其它暂不支持。");
        System.out.println("请选择你要查询的条件(1.编号/2.地址/3.状态/4.退出)：");

        do {
            switch (Utool.readMenuSelection1_4()) {
                case '1':
                    //1、根据编号查找房屋信息
                    do {
                        System.out.println("根据编号查找(按回车退出查询)：");
                        tempId = Utool.readInt(-1);
                        if (tempId == -1) {
                            break;
                        } else {
                            System.out.println("------------------房 屋 列 表------------------");
                            System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
                            if (houseService.findById(tempId) != null) {
                                System.out.println(houseService.findById(tempId));
                                break;
                            } else {
                                System.out.println("对不起，你要查找的房屋编号不存在。请重新输入");
                            }
                        }
                    } while (true);
                    break;
                case '2':
                    //2、根据地址查找房屋信息
                    do {
                        System.out.println("根据地址查找(按回车退出查询)：");
                        tempAddress = Utool.readString(20, "");
                        if (tempAddress.equals("")) {
                            break;
                        } else {
                            System.out.println("------------------房 屋 列 表------------------");
                            System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
                            if (houseService.findByAddress(tempAddress) != null) {
                                System.out.println(houseService.findByAddress(tempAddress));
                                break;
                            } else {
                                System.out.println("对不起，你所查找的房屋地址暂时没有相关房屋信息。请重新输入");
                            }
                        }
                    } while (true);
                    break;
                case '3':
                    //3、根据房屋状态查找房屋信息
                    do {
                        System.out.println("根据房屋状态查找(按回车退出查询)：");
                        String tempState = Utool.readString(3, "");
                        if (houseService.findByState(tempState) != null) {
                            System.out.println("------------------房 屋 列 表------------------");
                            System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
                            System.out.println(houseService.findByState(tempState));
                            break;
                        }
                        if (tempState == "") {
                            break;
                        } else {
                            System.out.println("对不起，你所查找的房屋状态暂时没有相关房屋信息。请重新输入");
                        }
                    } while (true);
                    break;
                case '4':
                    break;
            }
            break;
        } while (isexit);
    }

    /**
     * @Author: tor
     * @Description: 3 删除房屋菜单
     * @Date: 2022/7/10 15:15
     * @Params: []
     * @Return: void
     **/
    public void delMenu() {
        System.out.println("------------------正在删除房源中------------------");
        do {
            System.out.println("请输入你要删除的房屋编号(按回车退出删除房屋菜单)：");
            int houseId = Utool.readInt(-1);
            if (houseId == -1) {
                return;
            }
            System.out.println(houseService.delHouse(houseId));
        } while (true);
    }

    /**
     * @Author: tor
     * @Description:  4 修改房屋信息
     * @Date: 2022/7/11 22:05
     * @Params: []
     * @Return: void
     **/
    public void updateMenu() {
        System.out.println("------------------正在修改房源中------------------");
        do {
            System.out.println("请输入要修改的房屋编号(按回车放弃修改)：");
            int houseId = Utool.readInt(-1);
            if (houseId == -1) {
                return;
            }
            House house = houseService.findById(houseId);
            if (house != null) {
                System.out.println("原房屋编号" + houseId + "信息如下");
                System.out.println("房屋标题：" + house.getHouseName());
                System.out.print("请输入要修改的新的房屋标题：(按回车默认不修改原来的信息)");
                house.setHouseName(Utool.readString(20,house.getHouseName()));
                System.out.println("原联系电话：" + house.getHousePhone());
                System.out.print("请输入要修改的新的联系电话：(按回车默认不修改原来的信息)");
                house.setHousePhone(Utool.readString(11,house.getHousePhone()));
                System.out.println("原地址：" + house.getHouseAddress());
                System.out.print("请输入要修改的新的地址：(按回车默认不修改原来的信息)");
                house.setHouseAddress(Utool.readString(20,house.getHouseAddress()));
                System.out.println("原租金：" + house.getHouseMoney());
                System.out.print("请输入要修改的新的租金：(按回车默认不修改原来的信息)");
                house.setHouseMoney(Utool.readDouble(house.getHouseMoney()));
                System.out.println("原房屋状态：" + house.getState());
                System.out.print("请输入要修改的新的房屋状态：(按回车默认不修改原来的信息)");
                house.setState(Utool.readString(3, house.getState()));
                System.out.println("修改成功");
                return;
            } else {
                System.out.println("该房屋编号不存在，请确认后重新输入");
            }
        }while (true);
    }

    /**
     * @Author: tor
     * @Description: 5 显示房屋列表
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showHouse() {
        System.out.println("------------------房 屋 列 表------------------");
        System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
        for (int i = 0; i < houseService.houseList().length; i++) {
            if (houseService.houseList()[i] == null) {
                break;
            }
            System.out.println(houseService.houseList()[i]);

        }
    }


}
