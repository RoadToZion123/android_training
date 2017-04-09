package epam.util;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import epam.entity.Shop;
import epam.entity.sportEquipment.SportEquipment;
import epam.enums.Category;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Search {

    private static ArrayList<SportEquipment> list;

    public static ArrayList<SportEquipment> getList() {
        return list;
    }

    public static void setList(ArrayList<SportEquipment> list) {
        Search.list = list;
    }

    public static SportEquipment readItems() {
        SportEquipment qwe = new SportEquipment();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Integer step = 1 ;
        do {
            try {
                switch (step) {
                    case 1:
                        System.out.println(Const.ENTER_CATEGORY);
                            qwe.setCategory(Category.valueOf(input.readLine().toUpperCase()));
                        break;
                    case 2:
                        System.out.println(Const.ENTER_TITLE);
                        qwe.setTitle(input.readLine());
                        break;
                    case 3:
                        System.out.println(Const.ENTER_PRICE);
                        qwe.setPrice(Integer.parseInt(input.readLine()));
                        break;
                }
            }catch (IOException e){
                e.printStackTrace();
            }catch (IllegalArgumentException e){
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
                step--;
            }
            step++;
        }while (step < 4);
        return qwe;
    }


    public static List<SportEquipment> search(){
        SportEquipment items = readItems();
        list = new ArrayList<>();
        Map<SportEquipment, Integer> myEquipments = Shop.getInstance().getGoods();
        for (Map.Entry<SportEquipment, Integer> obj : myEquipments.entrySet()){
            SportEquipment equipment = new SportEquipment();
            if(items.equals(obj.getKey())){
                equipment.setCategory(obj.getKey().getCategory());
                equipment.setPrice(obj.getKey().getPrice());
                equipment.setTitle(obj.getKey().getTitle());
                obj.setValue(obj.getValue());
                list.add(equipment);
            }
        }
        return list;

    }

    public Search() {
    }

}

