import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Foodlist f = new Foodlist("apples", "bananas");
    
    System.out.println("Welcome to the supermarket!" );
    System.out.println("What would you like to buy?");
    f.Foodlist();
    f.Foodlist(5, 3.50);
    
    int apples = 5;
    double money = 20.0;
    double appleprice = 3.5;
    boolean bought = false;
      
    Scanner decision = new Scanner(System.in);
    String decision1 = decision.nextLine();
    System.out.println("You have said " + decision1 + ". Let's buy one apple.");
    bought = true;
    money = money - appleprice;
    System.out.println("You now have $" + money);
    apples -= 1;
    System.out.println("There are now " + apples + " apples");
    
    int bananas = 10;
    double bananaprice = 2.0;
      
    f.Foodlist(10, 2.0, "I love bananas!");
    String decision2 = decision.nextLine();
    System.out.println("You have said " + decision2 + ". Let's buy a banana.");
    money = money - bananaprice;
    System.out.println("You now have $" + money);
    bananas -= 1;
    System.out.println("There are now " + bananas + " bananas");
  }
}
