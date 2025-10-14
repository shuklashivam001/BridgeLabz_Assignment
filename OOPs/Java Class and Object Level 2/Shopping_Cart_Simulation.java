class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
    }

    void remove() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    void display() {
        System.out.println("Item : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total : " + (price * quantity));
    }
}