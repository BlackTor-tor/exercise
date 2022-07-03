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
            System.out.println("\t\t\t\t1 新 增 房 源" );
            System.out.println("\t\t\t\t2 查 找 房 屋 信 息" );
            System.out.println("\t\t\t\t3 删 除 房 屋 信 息" );
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息" );
            System.out.println("\t\t\t\t5 房 屋 列表" );
            System.out.println("\t\t\t\t6 退         出" );
            System.out.println("---------------------------------------------------------");
            System.out.print("请输入你要进入的菜单数字(1-6)：");
            switch (Utool.readMenuSelection()) {
                case '1': System.out.println(1);break;
                case '2': System.out.println(2);break;
                case '3': System.out.println(3);break;
                case '4': System.out.println(4);break;
                case '5':
                    showHouse();
                    break;
                case '6':
                    houseService.exit(this);
                break;
            }
        }while (isexit);
    }

    public void showHouse() {
        System.out.println("------------------房 屋 列 表------------------");
        if (houseService.houseList() != null) {
            for (House house : houseService.houseList()) {
                System.out.println(house);
            }
        }else {
            System.out.println("目前暂无房源，请新增");
        }
    }
}
