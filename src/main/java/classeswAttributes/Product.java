package classeswAttributes;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String color) {

        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.stockAmount = stockAmount;
        this.description = description;
        System.out.println("Constructor çalıştı.");
    }

    public Product() {

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }


}
