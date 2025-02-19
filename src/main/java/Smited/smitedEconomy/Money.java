package Smited.smitedEconomy;


import java.util.HashMap;
import java.util.UUID;

public class Money {


    public static HashMap<UUID, Integer> cash = new HashMap<>();

    public Money(int money) {
    int MoneyInt = money;
    }



    public static Money SetMoney(int money, UUID player) {
        cash.put(player, money);
        return new Money(money);
    }

    public static Money AddMoney(int money, UUID player, int add) {
        cash.replace(player, money+add);
        return new Money(money+add);
    }

    public static Money SubMoney(int money, UUID player, int sub) {
        cash.replace(player, money-sub);
        return new Money(money-sub);
    }

    public static Money MultMoney(int money, UUID player, int mult) {
        cash.replace(player, money*mult);
        return new Money(money*mult);
    }

    public static Money DivMoney(int money, UUID player, int div) {
        cash.replace(player, money/div);
        return new Money(money/div);
    }
}
