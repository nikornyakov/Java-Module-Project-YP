import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Приветствую!\nНа сколько персон желаете разделить счёт ?");
        int numberPerson = checkNumberPersons();

        Dish dish = new Dish();
        System.out.println(dish.addDish());

        float paymentPerson = dish.allCost / (float) numberPerson;
        System.out.printf("К оплате с каждой персоны: %.2f " + rublesCases(dish.allCost, numberPerson), paymentPerson);
    }

    public static int checkNumberPersons() {
        Scanner scanner = new Scanner(System.in);
        int numberPerson;

        while (true) {
            if (scanner.hasNextInt()) {
                numberPerson = Integer.parseInt(scanner.nextLine());
                if (numberPerson <=1) {
                    System.out.println("Некорректное значение");
                } else {
                    break;
                }
            } else {
                System.out.println("ОШИБКА!\nНекорректное значение");
                scanner.nextLine();
            }
        }
        return numberPerson;
    }

    public static String rublesCases(float cost, int numberPerson) {
        float allRubles = cost / numberPerson;
        int ruble = (int) (allRubles % 10);
        String cases;
        if (ruble == 1) {
            cases = "рубль";
        } else if (ruble >= 2 && ruble <= 4) {
            cases = "рубля";
        } else if (ruble >= 5 && ruble <= 9) {
            cases = "рублей";
        } else {
            cases = "рублей";
        }
        return cases;
    }

}