package epam.util;

import epam.entity.sportEquipment.SportEquipment;
import epam.enums.Category;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by Artem on 08.04.2017.
 */
public class Search {

    public static SportEquipment readItems() {
        SportEquipment qwe = new SportEquipment();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите значение");
        try {
            qwe.setCategory(Category.valueOf(input.readLine().toUpperCase()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ведите значение");
        try {
            qwe.setTitle(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ведите значение");
        try {
            qwe.setPrice(Integer.parseInt(input.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return qwe;
    }



    public static void Search(Map<SportEquipment, Integer> goods)  {
        for (SportEquipment key : goods.keySet()){
            if (key.equals(readItems().getTitle())) {
                SportEquipment item = key.getKey();
                System.out.println(item);
           }
        }


    }


}

