package epam.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem on 06.04.2017.
 */
public class Shop {
    private static Shop ourInstance = new Shop();
    private Map<SportEquipment,Integer> goods = new HashMap<>();
    public static Shop getInstance() {
        return ourInstance;
    }

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public Shop() {

    }
}
