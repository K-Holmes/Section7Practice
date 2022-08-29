import java.util.Scanner;

public class ArcadeTest {
    public static void main(String[] args) {
        //make 2 cards for interactions
        Terminal process = new Terminal();

        //Make cards
        Card c1 = new Card();
        Card c2 = new Card();
        c1.setCreditBalance(process.addToBalance(25, c1.getCreditBalance()));
        c2.setCreditBalance(process.addToBalance(50, c1.getCreditBalance()));
        c1.setCardNumber(1);
        c2.setCardNumber(2);


        //Play games
        c1.setTicketBalance(process.playRandomGames(c1));
        System.out.println(c1.getTicketBalance());
        System.out.println();
        c1.setTicketBalance(process.playRandomGames(c1));
        System.out.println(c1.getTicketBalance());

        System.out.println(c2.getTicketBalance());
        c2.setTicketBalance(process.playRandomGames(c2));
        System.out.println(c2.getTicketBalance());
        System.out.println();
        c2.setTicketBalance(process.playRandomGames(c2));
        System.out.println(c2.getTicketBalance());

        //transfer some credits/tickets back and forth
        process.checkBalance(c1.getTicketBalance(), c1.getCreditBalance(), c1.getCardNumber());
        process.checkBalance(c2.getTicketBalance(), c2.getCreditBalance(), c2.getCardNumber());

        process.transferInfo(c1, c2, 5, true);
        process.transferInfo(c2, c1, 6, false);

        process.checkBalance(c1.getTicketBalance(), c1.getCreditBalance(), c1.getCardNumber());
        process.checkBalance(c2.getTicketBalance(), c2.getCreditBalance(), c2.getCardNumber());


        //buy a prize
        process.buyPrize(c1);
        process.buyPrize(c2);
    }
}
