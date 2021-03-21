package commandpattern;

import java.util.Map;

public class Restaurant {

    // Command Pattern 實作!!
    public static void main(String[] args) {

        // receiver 主要執行相應command的動作
        final Chief chief = hireChief();

        // invoker 主要選擇哪種command 讓receiver執行
        final Waiter waiter = new Waiter();

        // command 用來乘載需要執行的動作, 主要執行動作由 receiver 執行
        // 所以command 內會攜帶receiver去執行
        final Command cookSteakCommand = new ChiefCommand(chief, "cookSteak");
        final Command cookFishCommand = new ChiefCommand(chief, "cookFish");
        waiter.setCommand(cookSteakCommand);
        waiter.setCommand(cookFishCommand);

        waiter.executeCommand();
    }

    private static Chief hireChief() {
        CookSkill skill1 = new CookSkill("Cook Steak");
        CookSkill skill2 = new CookSkill("Cook Pork");
        CookSkill skill3 = new CookSkill("Cook Fish");
        return new Chief(Map.of("cookSteak", skill1, "cookPork", skill2, "cookFish", skill3));
    }

}
