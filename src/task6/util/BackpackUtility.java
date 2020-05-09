package task6.util;

import task6.Backpack;
import task6.Thing;

import java.util.List;
import java.util.Scanner;

public class BackpackUtility {
    public static Thing readNewThing()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();

        return new Thing(name, price, weight);
    }

    public static void writeBestThings(List<Thing> bestThings)
    {
        if (bestThings.isEmpty()) {
            System.out.println("The backpack is empty.");
        } else {
            System.out.print("The backpack with the highest value and not exceeding a certain weight includes: ");

            for (var item : bestThings) {
                System.out.print(item.getName() + " ");
            }

            Backpack backpack = new Backpack();
            System.out.print("\nTotal weight: " + backpack.calculateWeight(bestThings) +
                    "\nTotal price: " + backpack.calculatePrice(bestThings) + "\n");
        }
    }
}
