package task6;

import task6.util.BackpackUtility;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max weight: ");

        int weight;
        boolean isNeedToClose = false;

        do
        {
            weight = scanner.nextInt();
            if (weight < 1) {
                System.out.println("Incorrect data entered, enter again");
            }
        }
        while (weight < 1);

        Backpack backpack = new Backpack(weight);

        while(!isNeedToClose)
        {
            int menu = 0;

            System.out.println(
                    "If you want to add item, enter - 1\n"+
                    "If you want output the backpack with the highest value and not exceeding a certain weight, enter - 2" +'\n' +
                    "If you want to close program, enter - 3\n"
            );
            do
            {

                menu = scanner.nextInt();
                if(menu < 1 || menu > 3) {
                    System.out.println("Incorrect input, enter again");
                }

            }
            while (menu < 1 || menu > 3);

            if (menu == 1) {
                backpack.addNewThing(BackpackUtility.readNewThing());
            }
            else if (menu == 2) {
                BackpackUtility.writeBestThings(backpack.getBestBackpacks());
            }
            else {
                isNeedToClose = true;
            }
        }
    }
}
