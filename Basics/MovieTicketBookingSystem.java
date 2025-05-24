public class MovieTicketBookingSystem {
    String movieName; // To store movei name enter by user
    int price=0; // To store the price of tickets
    String customerName; //To store cuustomer name
    int customerPass;
    int tickets = 0;
    int numberOfTickets=10;
    int money;

    
    MovieTicketBookingSystem(){
        System.out.println("Hello price of the ticket is 1200");
    }
    void Booking(String customerName,int tickets,String movieName,int money){
        this.customerName = customerName;
        this.tickets = tickets;
        this.movieName=movieName;
        this.money=money;
        if (tickets<=10) {
            System.out.println("tickets are available");
            totalPayment();
        }
        else{
            System.out.println(tickets+ " are not availabe");
        }
    }
    int totalPayment(){
    if (this.money==tickets*1200) {
        return 1;
    }
    else{
        return 0;
    }
    }
    int TicketGenerator(){
        this.customerPass=totalPayment()!=0?(int)(Math.random()*10000):0;
        return this.customerPass;
    }
    void customerSlip(){

        System.out.println(TicketGenerator()!=0?"You Booked "+tickets+" Tickets of this "+movieName:"To gennerate the ticket you have to pay");
    }

}