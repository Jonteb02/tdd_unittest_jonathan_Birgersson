package se.jonathanb;

import org.junit.jupiter.api.*;

import static se.jonathanb.Main.shoppingBasket;

public class MainTest {

    @DisplayName("Added dummy values to shoppingBasket")
    @BeforeEach
    public void addItemsToBasket(){
        Games game1 = new Ps5(649, "Digital");
        Games game2 = new Ps5(400, "Physical");
        Games game3 = new Ps5(500, "Digital");
        Main.addingItem(game1);
        Main.addingItem(game2);
        Main.addingItem(game3);
        Assertions.assertTrue(true);
    }

    @DisplayName("Cleared shopping basket")
    @AfterEach
    public void emptyBasket(){
        shoppingBasket.clear();
    }


    @Test
    @DisplayName("Remove all items from Basket")
    public void removeAllItemsFromBasket(){
        Main.removeAllItems();
        Assertions.assertEquals(0, shoppingBasket.size());
    }


    @Test
    @DisplayName("Total cost of all items in shopping basket")
    public void totalCostOfItemsInBasket(){
        double expectedCost = 1549; // 649+400+500
        System.out.println("expectedCost= " + expectedCost + " totalCostOfItems=" + Main.totalCostOfItems(shoppingBasket));
        Assertions.assertEquals(expectedCost, Main.totalCostOfItems(shoppingBasket), 0);
    }

    @Test
    @DisplayName("Cost of most expensive item in basket")
    public void costOfItemInBasket(){
        double expectedCostOfItem = 649;
        System.out.println("expectedCostOfItem=" + expectedCostOfItem + " costOfItem=" + Main.costOfMostExpensiveItem(shoppingBasket));
        Assertions.assertEquals(expectedCostOfItem, Main.costOfMostExpensiveItem(shoppingBasket), 0);
    }

    @Test
    public void doesConstructorWork() {
        Games games = new Ps5(450,"Physical");
        Assertions.assertEquals(450, games.getPrice());

    }
}
