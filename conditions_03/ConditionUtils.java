package conditions_03;

import java.util.Scanner;
import java.util.Arrays;

public class ConditionUtils {

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public int calculateFuelPrice(String fuel, int count){
        if(fuel.equals("STAR100")){
            return count * 70;
        } else if (fuel.equals("STAR500")){
            return count * 120;
        } else if (fuel.equals("STAR1000")){
            return count * 200;
        } else {
            return count * 50;
        }
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 20;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower(){
       Scanner scanner = new Scanner(System.in);

       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
       int max = Math.max(a, Math.max(b, c));

       float maxPower;

    if (max < 10) {
        maxPower = max * 0.7f;
    } else if (max <= 100) {
        maxPower = max * 1.2f;
    } else {
        maxPower = max * 2.1f;
    }

        System.out.println(maxPower);
    scanner.close();
}

public String getMyPrizes(int ticket) {
    String result = "";

    if (ticket % 10 == 0) {
        result += "crystall ";
    }

    if (ticket % 10 == 7) {
        result += "chip ";
    }

    if (ticket > 200) {
        result += "coin ";
    }

    return result.trim();
}

    public boolean isHangarOk(int side1, int side2, int price){
        int min = Math.min(side1, side2);
        int max = Math.max(side1, side2);
        int area = side1 * side2;

        boolean isSquareOk = area >= 1500;
        boolean isLongestSideOk = max <= min * 2;
        boolean isPriceOk = price <= area * 1000;

        return isSquareOk && isLongestSideOk && isPriceOk;
    }

    public static void main(String[] args) {
        ConditionUtils ship = new ConditionUtils();

        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        System.out.println(ship.calculateNeededFuel(1001));

        ship.calculateMaxPower();

        System.out.println(ship.getMyPrizes(250));

        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}