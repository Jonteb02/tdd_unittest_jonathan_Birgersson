package se.jonathanb;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Games> shoppingBasket = new ArrayList<>();

    public static void main( String[] args ) {

    }

    public static void addingItem(Games item){
        shoppingBasket.add(item);
    }

    public static void removeAllItems(){
        shoppingBasket.clear();
    }

    public static double totalCostOfItems(ArrayList<Games> shoppingBasket){
        double sum = 0;

        for(Games g : shoppingBasket){
            sum += g.getPrice();
        }

        return sum;
    }

    public static double costOfMostExpensiveItem(ArrayList<Games> shoppingBasket){
        double cost = 0;
        if(!shoppingBasket.isEmpty()){
            for (Games c : shoppingBasket) {
                if ( c.getPrice() > cost ) cost = c.getPrice();
            }
        }
        return cost;
    }

}
