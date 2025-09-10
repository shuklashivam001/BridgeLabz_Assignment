class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void book(String name, int seat, double cost) {
        movieName = name;
        seatNumber = seat;
        price = cost;
    }

    void display() {
        System.out.println("Movie : " + movieName);
        System.out.println("Seat : " + seatNumber);
        System.out.println("Price : " + price);
    }
}