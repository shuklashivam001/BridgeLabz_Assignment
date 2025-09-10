class Item {
    int itemCode;
    String itemName;
    double price;

    void display(int quantity) {
        System.out.println("Code : " + itemCode);
        System.out.println("Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Total Cost : " + (price * quantity));
    }
}