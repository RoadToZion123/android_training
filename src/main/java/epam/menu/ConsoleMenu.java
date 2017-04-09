package epam.menu;

import epam.entity.RentUnit;
import epam.entity.Shop;
import epam.entity.sportEquipment.SportEquipment;
import epam.util.Const;
import epam.util.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class ConsoleMenu {

    private static Integer choise = 0;

    private static Integer getConsoleLine() {
        /*Integer chooise;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            chooise = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            chooise = null;
        }
        return chooise;*/

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            return null;
        }
    }

    public static void showMainMenu() {
        Boolean breakCycle = false;
        System.out.println(Const.SHOP_NAME);
        System.out.println(Const.MAIN_MENU);

        while (!breakCycle) {
            choise = getConsoleLine();
            if (choise != null) {
                switch (choise) {
                    case 1:
                        Shop.getInstance().enter();
                        System.out.println("");
                        showItemsSearchMenu();
                        breakCycle = true;
                        break;
                    case 2:
                        RentUnit.rentUnit();
                        List<SportEquipment> list = RentUnit.getBasket();
                        for (SportEquipment item : list){
                            System.out.println(item);
                        }
                        System.out.println("");
                        showBasketMenu();
                        breakCycle = true;
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println(Const.CHOOSE_FROM_OPTIONS);
                }

            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
    }

    public static void showBasketMenu() {
        Boolean breakCycle = false;
        System.out.println(Const.BACK_TO_MAIN_MENU);

        while (!breakCycle) {
            choise = getConsoleLine();
            if (choise != null) {
                switch (choise) {
                    case 1:
                        System.out.println("");
                        showMainMenu();
                        breakCycle = true;
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println(Const.CHOOSE_FROM_OPTIONS);
                }

            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
    }

    private static void showItemsSearchMenu() {
        Boolean breakCycle = false;
        System.out.println(Const.ITEMS_SEARCH_MENU);

        while (!breakCycle) {
            choise = getConsoleLine();
            if (choise != null) {
                switch (choise) {
                    case 1:
                        System.out.println(Search.search());
                        System.out.println("");
                        showAddItemsMenu();
                        breakCycle = true;
                        break;

                    case 2:
                        System.out.println("");
                        showMainMenu();
                        breakCycle = true;
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println(Const.CHOOSE_FROM_OPTIONS);
                }

            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
    }
    private static void showAddItemsMenu() {
        Boolean breakCycle = false;
        System.out.println(Const.ITEMS_ADD_MENU);

        while (!breakCycle) {
            choise = getConsoleLine();
            if (choise != null) {
                switch (choise) {
                    case 1:
                        System.out.println("Товар успешно добавлен");
                        System.out.println("");
                        try {
                            Thread.sleep(2000);
                            showMainMenu();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        breakCycle = true;
                        break;

                    case 2:
                        System.out.println("");
                        showMainMenu();
                        breakCycle = true;
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println(Const.CHOOSE_FROM_OPTIONS);
                }

            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
    }
}
