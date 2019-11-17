package task6;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Backpack {
    private ArrayList<Things> things = new ArrayList<Things>();
    private ArrayList<Things> bestBacpack;
    private int maxWeight;
    private double maxPrice;

    public Backpack (int weight)
    {
        maxWeight = weight;
    }

    private double TotalWeight(ArrayList<Things> things)
    {
        double weight = 0;
        for (int i = 0; i < things.size(); i++)
        {
            weight += things.get(i).weight;
        }
        return weight;
    }

    private double TotalPrice(ArrayList<Things> things)
    {
        double price = 0;
        for (int i = 0; i < things.size(); i++)
        {
            price += things.get(i).price;
        }
        return price;
    }

    public void AddNewThing()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: "); String name = scanner.nextLine();
        System.out.println("Enter the price: "); double price = scanner.nextDouble();
        System.out.println("Enter the weight: "); double weight = scanner.nextDouble();
        things.add(new Things(name, price, weight));
    }

    public void BestBackpacks()
    {
        if(things.isEmpty())
        {
            System.out.println("The backpack is empty." );
        }
        else
        {
            System.out.print("The backpack with the highest value and not exceeding a certain weight includes: " );
            SearchAllBackpacks(things);
            for (var item: bestBacpack)
            {
                System.out.print(item.name + " ");
            }
        }
    }

    private void SearchAllBackpacks(ArrayList<Things> things)
    {
        if(!things.isEmpty())
        {
            if(bestBacpack == null)
            {
                if(TotalWeight(things) <= maxWeight)
                {
                    bestBacpack= things;
                    maxPrice = TotalPrice(things);
                }
            }
            else
            {
                if(TotalWeight(things) <= maxWeight && maxPrice < TotalPrice(things))
                {
                    bestBacpack = things;
                    maxPrice = TotalPrice(things);
                }
            }
        }

        for(int i = 0; i < things.size(); i++)
        {
            ArrayList<Things> nextBackpack = new ArrayList<Things>(things);
            nextBackpack .remove(i);
            SearchAllBackpacks(nextBackpack );
        }
    }
}
