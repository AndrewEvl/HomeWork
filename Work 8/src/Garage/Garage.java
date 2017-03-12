package Garage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lino on 11.03.2017.
 */
public class Garage {
    public static void main(String[] args) {
        Map<Car, Integer> garage = new HashMap<Car, Integer>();

        RolsRoys roysOne = new RolsRoys("Phantom", 2013, 234);
        RolsRoys roysTwo = new RolsRoys("Ghost", 2016, 546);
        Audi audiOne = new Audi("A8", 2014, 38659);
        Audi audiTwo = new Audi("A4", 2008, 154986);
        Ford fordOne = new Ford("Navigator", 2000, 256128);
        Mersedes mersedesOne = new Mersedes("CLK", 2017, 2346);

        int valueRollsRoys = 0;
        int valueFord = 0;
        int valueMercedes = 0;
        int valueAudi = 0;

        garage.put(roysOne, valueRollsRoys++);
        garage.put(roysTwo, valueRollsRoys++);
        garage.put(audiOne, valueAudi++);
        garage.put(audiTwo, valueAudi++);
        garage.put(fordOne, valueFord++);
        garage.put(mersedesOne, valueMercedes++);

        System.out.println("Автомобили в гараже : " + garage.entrySet());
        System.out.println(" ");
        System.out.println("Колличество автомобилей : " + garage.size());
        System.out.println("Колличество Rolls Roys в гараже : " + valueRollsRoys);
        System.out.println("Колличество Audi в гараже : " + valueAudi);
        System.out.println("Колличество Ford в гараже : " + valueFord);
        System.out.println("Колличество Mercedes в гараже : " + valueMercedes);
        System.out.println(" ");

        garage.remove(roysTwo);
        valueRollsRoys--;

        System.out.println("Автомобили в гараже : " + garage.entrySet());
        System.out.println(" ");
        System.out.println("Колличество автомобилей : " + garage.size());
        System.out.println("Колличество Rolls Roys в гараже : " + valueRollsRoys);
        System.out.println("Колличество Audi в гараже : " + valueAudi);
        System.out.println("Колличество Ford в гараже : " + valueFord);
        System.out.println("Колличество Mercedes в гараже : " + valueMercedes);
        System.out.println(" ");
        System.out.println("Хэш код 2-х элемнтов : 1) " + roysOne.hashCode() + " 2) " + roysTwo.hashCode());
        System.out.println("Сравниваем совпадают ли хэш коды 2-х элементов : " + roysOne.equals(roysTwo));

    }
}


