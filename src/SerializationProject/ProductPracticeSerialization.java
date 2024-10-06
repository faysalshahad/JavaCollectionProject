package SerializationProject;

import java.io.Serializable;

public class ProductPracticeSerialization implements Serializable {

    private String name, category, brand; private int qty; private double price;

    ProductPracticeSerialization (){}; //default constructor

    ProductPracticeSerialization(String name, String category, String brand, int qty, double price) { // parameterized constructor
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    public void setName (String name) {

        this. name = name;

    }

    public String getName(){
        return name;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getBrand () {
        return brand;
    }

    public void setQuantity (int qty) {
        this.qty = qty;
    }

    public int getQuantity () {
        return qty;
    }

    public void setPrice (double price) {
        this.price = price;

    }

    public double getPrice () {
        return price;
    }

    @Override
    public String toString() {
        return "Product = {" +
                "Product Name='" + name + '\'' +
                ", Product Category='" + category + '\'' +
                ", Product Brand='" + brand + '\'' +
                ", Product Quantity='" + qty + '\'' +
                ", Product Price='" + price + '\'' +
                '}';
    }

}
