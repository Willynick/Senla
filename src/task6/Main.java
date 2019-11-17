package task6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max weight: ");
        int weight;
        do
        {
            weight = scanner.nextInt();
            if (weight < 1){
                System.out.println("Incorrect data entered, enter again");
            }
        }
        while (weight < 1);
        Backpack backpack = new Backpack(weight);
        while(true)
        {
            int menu = 0;
            System.out.println("If you want to add item, enter - 1" + '\n' +
                    "If you want output the backpack with the highest value and not exceeding a certain weight, enter - 2" +'\n' +
            "If you want to close program, enter - 3");
            do
            {

                menu = scanner.nextInt();
                if(menu < 1 && menu > 3) {
                    System.out.println("Incorrect input, enter again");
                }

            }
            while (menu < 1 && menu > 3);

            if (menu == 1){
                backpack.AddNewThing();
            }
            else if (menu == 2){
                backpack.BestBackpacks();
            }
            else {
                break;
            }
        }
    }
}
