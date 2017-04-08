package epam;

import epam.entity.sportEquipment.SportEquipment;
import epam.enums.Category;
import epam.menu.ConsoleMenu;
import epam.util.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        //Shop.getInstance().getGoods();
        ConsoleMenu.showMainMenu();
    }
    //Search.Search(goo);

    /*public static SportEquipment readItems() throws IOException {
        SportEquipment qwe = new SportEquipment();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите значение");
        qwe.setCategory(Category.valueOf(input.readLine().toUpperCase()));
        qwe.setTitle(input.readLine());
        qwe.setPrice(Integer.parseInt(input.readLine()));
        return(qwe);
    }



    public static void Search(Map<SportEquipment, Integer> goods) {
        for (SportEquipment k : goods.keySet()) {
            try {
                k.equals(readItems());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }*/
}
