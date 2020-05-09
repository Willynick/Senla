package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack {

    private List<Thing> bestThings = null;
    private List<Thing> things = new ArrayList<>();

    private double maxWeight;

    private double bestPrice;

    public Backpack() {

    }

    public Backpack(double maxWeight) {

        this.maxWeight = maxWeight;
    }

    public List<Thing> getBestThings() {
        return bestThings;
    }

    public void setBestThings(List<Thing> bestThings) {
        this.bestThings = bestThings;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(double bestPrice) {
        this.bestPrice = bestPrice;
    }

    public void addNewThing(Thing newThing) {
        things.add(newThing);
    }

    public double calculateWeight(List<Thing> things)
    {
        double sumWeight = 0;

        for(Thing i : things)
        {
            sumWeight += i.getWeight();
        }

        return sumWeight;
    }

    public double calculatePrice(List<Thing> things)
    {
        double sumPrice = 0;

        for(Thing i : things)
        {
            sumPrice += i.getPrice();
        }

        return sumPrice;
    }

    private void checkSetThings(List<Thing> things)
    {
        if (bestThings == null)
        {
            if (calculateWeight(things) <= maxWeight)
            {
                bestThings = things;
                bestPrice = calculatePrice(things);
            }
        }
        else {
            if (calculateWeight(things) <= maxWeight && calculatePrice(things) > bestPrice) {
                bestThings = things;
                bestPrice = calculatePrice(things);
            }
        }
    }

    public void makeAllSets(List<Thing> things)
    {
        if (things.size() > 0)
            checkSetThings(things);

        for (int i = 0; i < things.size() ; i++)
        {
            List<Thing> newSet = new ArrayList<Thing>(things);

            newSet.remove(i);

            makeAllSets(newSet);
        }
    }

    public List<Thing> getBestBackpacks() {
        makeAllSets(things);

        return bestThings;
    }
}
