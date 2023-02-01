import java.text.MessageFormat;
import java.util.Scanner;

public class Dish {

    String allNameProducts = " ";
    float allCost = 0;

    public String addDish() {
        System.out.println("Введите название блюда: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String nameProducts = (scanner.nextLine());

            if ("Завершить".equalsIgnoreCase(nameProducts)) {
                return String.format("Список добавленных блюд: %s", allNameProducts);
            } else {
                addCost();
                allNameProducts = MessageFormat.format("{0}\n{1}", allNameProducts, nameProducts);

                System.out.println(nameProducts + "\n" + "Добавлено!\n\nВведите название нового блюда или Завершить");
            }
        }

    }

    public void addCost() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость блюда: ");

        while (true) {
                if (scanner.hasNextFloat()) {

                    float cost = scanner.nextFloat();

                    if (cost > 0) {
                        allCost += cost;
                        break;
                    } else {
                        System.out.println("Некорректная стоимость\nВведите в формате рублей.копеек");
                        scanner.nextLine();
                    }
                    } else {
                        System.out.println("Введите число");
                        scanner.nextLine();
                    }
                }
        }
}




