public class Card {
    private int creditBalance;
    private int ticketBalance;
    private int cardNumber;

    int counter =0;

    public Card() {
        this.creditBalance=0;
        this.ticketBalance=0;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getTicketBalance() {

        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
