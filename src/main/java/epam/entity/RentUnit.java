package epam.entity;

import epam.entity.sportEquipment.SportEquipment;
import epam.util.Search;

import java.util.ArrayList;
import java.util.List;



public class RentUnit {
    private static List<SportEquipment> basket = new ArrayList<>();

    public static List<SportEquipment> getBasket() {
        return basket;
    }

    public static void rentUnit() {
        if(Search.getList() != null) {
            List<SportEquipment> list = Search.getList();
            for (SportEquipment sportEquipment : list) {
                basket.add(sportEquipment);
            }
        } else {
            System.out.println("Корзина пуста !");
        }

    }

    public RentUnit() {
    }
}

