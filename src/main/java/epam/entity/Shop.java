package epam.entity;

import com.google.gson.reflect.TypeToken;
import epam.entity.sportEquipment.SportEquipment;
import epam.entity.sportEquipment.SportEquipmentCreator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Shop {

    private static Shop ourInstance = new Shop();
    private Map<SportEquipment, Integer> goods = new HashMap<SportEquipment, Integer>();

    public Shop() {
    }

    public static Shop getInstance() {
        return ourInstance;
    }

    public void setGoods(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }


    SportEquipmentCreator product = new SportEquipmentCreator();

    List<SportEquipment> list = product.deserializeToList("SportEquipment.json", new TypeToken<List<SportEquipment>>(){});

    Map<String, String> Countity =product.deserializeToMap("Countity.json", new TypeToken<Map<String, String>>(){});


    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void enter(){
        Countity.forEach((key, value) -> {
            list.forEach((item) -> {
                if (key.equals(item.getTitle())){
                    goods.put(item,Integer.parseInt(value));
                }
            });

        });
        printValue(goods);
    }


    public void printValue(Map<SportEquipment, Integer> goods){
        for(Map.Entry<SportEquipment, Integer> pair : goods.entrySet())
        {
            SportEquipment item = pair.getKey();
            System.out.println(item);
        }
        }

}

