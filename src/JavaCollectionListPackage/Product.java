package JavaCollectionListPackage;

public class Product {

    private String name, brand;
    private int qty, price;
    private double amount;

    public Product (String name, String brand, int qty, int price, double amount) {
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void display () {
        System.out.println("Name = " + name + " Brand = " + brand + " Price = " + price + " Quantity = " + qty + " Amount = " + amount);
    }

    

}
