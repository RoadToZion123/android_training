package epam;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import epam.entity.Shop;
import epam.entity.SportEquipment;
import epam.entity.SportEquipmentCreator;
import epam.enums.Category;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
       /* SportEquipment abc = new SportEquipment(Category.ACCESSORY, "kepka",1000);
        SportEquipment qwe = new SportEquipment(Category.CLOTHS, "mayka",100);
        SportEquipment zxc = new SportEquipment(Category.SHOES, "nike",1012312);
        SportEquipment vbn = new SportEquipment(Category.SIMULATORS, "trenashor",9898);
        Shop.getInstance().getGoods().put(abc, 3);
        Shop.getInstance().getGoods().put(qwe, 5);
        Shop.getInstance().getGoods().put(zxc, 12);
        Shop.getInstance().getGoods().put(vbn, 10);


        Map<SportEquipment, Integer> json = Shop.getInstance().getGoods();
        System.out.println(json);
        Gson gson = new Gson();

        Map<SportEquipment, Integer> decoded = gson.fromJson((JsonElement) json, new TypeToken<Shop>(){}.getType());
        System.out.println(decoded);*/

        SportEquipmentCreator huy = new SportEquipmentCreator();
        huy.deserializeToList();




    }
}
