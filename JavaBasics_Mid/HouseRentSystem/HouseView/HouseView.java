package JavaBasics_Mid.HouseRentSystem.HouseView;

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
                    System.out.println(3);
                    break;
                case '4':
                    System.out.println(4);
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
        System.out.println("------------------房 屋 列 表------------------");
        System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
        System.out.println("你需要根据什么条件来查找房屋信息，目前仅支持根据编号、地址和状态，其它暂不支持，请输入你要查询的条件");
        System.out.println("根据编号查找(按回车跳过)：");
        int tempId = Utool.readInt(-1);
        if (tempId == -1) {
            System.out.println("根据地址查找(按回车跳过)：");
            String tempAddress = Utool.readString(20, "");
            if (tempAddress.equals("")) {
                System.out.println("根据房屋状态查找：");
                String tempState = Utool.readString(3);
                System.out.println("------------------房 屋 列 表------------------");
                System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
                System.out.println(houseService.findByState(tempState));
            }else {
                System.out.println("------------------房 屋 列 表------------------");
                System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
                System.out.println(houseService.findByAddress(tempAddress));
            }
        }else {
            System.out.println("------------------房 屋 列 表------------------");
            System.out.print("房屋编号\t\t" + "房屋标题\t\t" + "联系电话\t\t" + "地址\t\t" + "租金\t\t" + "房屋状态\n");
            System.out.println(houseService.findById(tempId));
        }
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
