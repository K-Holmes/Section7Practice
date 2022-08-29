import java.util.Random;
import java.util.Scanner;

public class Terminal {
    //addtobalance, prizes, checkbalance, redeemprizes, transfercreditsortickets, playrandomticketgame

    public int playRandomGames(Card c) {
        c.setCreditBalance(c.getCreditBalance()-2);
        Random rn = new Random();
        int reward = rn.nextInt(100);
        return reward;
    }

    public int addToBalance(int cash, int originalBalance){
        int credits = originalBalance + (cash * 2);
        return credits;
    }

    public void checkBalance(int balance, int credits, int c) {
        String message = "";
        message = "The balance on Card "+ c+ " is " + balance + " tickets and "+ credits + " credits.";
        System.out.println(message);
    }

    public void transferInfo(Card c1, Card c2, int amount, boolean transferTickets) {
       if (transferTickets) {
           c2.setTicketBalance(c2.getTicketBalance()+ amount);
           c1.setTicketBalance(c1.getTicketBalance()-amount);
       }
       else {
           c2.setCreditBalance(c2.getCreditBalance()+ amount);
           c1.setCreditBalance(c1.getCreditBalance()-amount);
       }
   }

   public void buyPrize(Card c) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Would you like a small (10 tickets), medium (25 tickets), or large (50 tickets) prize on card " + c.getCardNumber()+"? s, m, or l");
       String choice = sc.nextLine();
       if (choice.equals("s")) {
           if (c.getTicketBalance() >= 10) {
               c.setTicketBalance(c.getTicketBalance()-10);
               System.out.println("You received a small toy");
           }
           else {
               System.out.println("Insufficient tickets");
           }
       }
       else if (choice.equals("m")) {
           if (c.getTicketBalance() >= 25) {
               c.setTicketBalance(c.getTicketBalance()-25);
               System.out.println("You received a medium toy");
           }
           else {
               System.out.println("Insufficient tickets");
           }
       }
       else if (choice.equals("l")) {
           if (c.getTicketBalance() >= 50) {
               c.setTicketBalance(c.getTicketBalance()-50);
               System.out.println("You received a large toy");
           }
           else {
               System.out.println("Insufficient tickets");
           }
       }
       else {
           System.out.println("Invalid choice");
       }
   }


}
