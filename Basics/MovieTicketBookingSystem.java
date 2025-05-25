public class MovieTicketBookingSystem {
    String movieName; // To store movei name enter by user
    int price=0; // To store the price of tickets
    String customerName; //To store cuustomer name
    int customerPass;
    int tickets = 0;
    int numberOfTickets=10;
    int money;

    
    MovieTicketBookingSystem(){
        System.out.println("\nPrice of the ticket is 1200");
    }
    void Booking(String customerName,int tickets,String movieName){
        this.customerName = customerName;
        this.tickets = tickets;
        this.movieName=movieName;
        if (tickets<=10) {
            System.out.println("Tickets are available");
        }
        else{
            System.out.println(tickets+ " tickets are not availabe");
        }
    }
    int totalPayment(int money){
        this.money=money;
    if (this.money==tickets*1200) {
        return 1;
    }
    else{
        return 0;
    }
    }
    int TicketGenerator(){ //Generating ticket nuumber for verification uuusing math.random()
        this.customerPass=totalPayment(money)!=0?(int)(Math.random()*10000):0; // Math . random Country givin each car's owner a net
        return this.customerPass;
    }
    void customerSlip(){ //Printing message after complete booking process
        if (tickets<=10) { // Checking if tickets are available or not
            System.out.println(TicketGenerator()!=0?"You Booked "+tickets+" Tickets of "+movieName +"\nYour ticket number is "+TicketGenerator():"To gennerate the ticket number you need to pay "+tickets*1200);// Using terminatory operator which messeege neeed to display 
        }
        
    }

}