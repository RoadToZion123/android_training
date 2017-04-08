package epam.menu;

import epam.entity.Shop;
import epam.util.Const;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem on 08.04.2017.
 */
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
                        Shop.getInstance().getGoods();
                        System.out.println("");
                        //showPlanesSortMenu();
                        breakCycle = true;
                        break;
                    /*case 2:
                        AirlineUtils.showEmployeeInfo();
                        System.out.println("");
                        showBackToMainMenu();
                        breakCycle = true;
                        break;
                    case 3:
                        showFindPlanes();
                        System.out.println("");
                        showBackToMainMenu();
                        breakCycle = true;
                        break;*/
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

   /* private static void showFindPlanes() {
        //Search.Search();
        Integer category = 0, title = 0, price = 0;
        System.out.println(Const.ENTER_CATEGORY + " (" + Airline.getAirline().getPlanes().get(0).getConsumption() + ")");
        while (true) {
            category = getConsoleLine();
            if (category != null) {
                break;
            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
        System.out.println(Const.ENTER_TITLE + " (" + Airline.getAirline().getPlanes().get(0).getConsumption() + ")");
        while (true) {
            title = getConsoleLine();
            if (title != null) {
                break;
            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
        System.out.println(Const.ENTER_PRICE + " (" + Airline.getAirline().getPlanes()
                .get(Airline.getAirline().getPlanes().size()-1).getConsumption() + ")");
        while (true) {
            price = getConsoleLine();
            if (price != null) {
                break;
            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }

        List<Plane> findPlanes = AirlineUtils.findPlanesOfParametersFuel(minNumber, maxNumber);
        System.out.println(Const.COUNT_FIND_ITEMS + findPlanes.size());
        for (Plane plane : findPlanes) {
            System.out.println(plane);
        }
    }*/

    /*private static void showItemsSearchMenu(){
        Boolean breakCycle = false;
        System.out.println(Const.ITEMS_SEARCH_MENU);

        while (!breakCycle) {
            choise = getConsoleLine();
            if (choise != null) {
                switch (choise) {
                    case 1:
                        QuickSort.quickSort("peopleCapacity");
                        AirlineUtils.showPlanesInfo();
                        System.out.println("");
                        showPlanesSortMenu();
                        breakCycle = true;
                        break;
                    case 2:
                        QuickSort.quickSort("carryingCapacity");
                        AirlineUtils.showPlanesInfo();
                        System.out.println("");
                        showPlanesSortMenu();
                        breakCycle = true;
                        break;
                    case 3:
                        QuickSort.quickSort("Distance");
                        AirlineUtils.showPlanesInfo();
                        System.out.println("");
                        showPlanesSortMenu();
                        breakCycle = true;
                        break;
                    case 4:
                        QuickSort.quickSort("consumption");
                        AirlineUtils.showPlanesInfo();
                        System.out.println("");
                        showPlanesSortMenu();
                        breakCycle = true;
                        break;
                    case 5:
                        System.out.println("");
                        showMainMenu();
                        breakCycle = true;
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println(Const.CHOOSE_FROM_OPTIONS);
                }

            } else {
                System.out.println(Const.CHOOSE_FROM_OPTIONS);
            }
        }
    }*/
}
