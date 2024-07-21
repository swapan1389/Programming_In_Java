enum Laptop{
    Macbook(2000),XPS(2200),Surface,Thinkpad(1800);
    private int price;

    private Laptop() {
        price=2300;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }        
}

public class enum_as_class {
    public static void main(String[] args) {
        Laptop[] lap=Laptop.values();
        for (Laptop laptop : lap) {
            System.out.println(laptop+" :"+laptop.getPrice());
            
        }
        
    }
    
}
