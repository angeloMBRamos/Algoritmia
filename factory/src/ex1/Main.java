package ex1;

public class Main {
    public static void main(String[] args) {

        Product book = ProductFactory.createProduct("book");
        Product electronics = ProductFactory.createProduct("eletronics");
        Product clothing = ProductFactory.createProduct("clothing");

        book.display();
        electronics.display();
        clothing.display();

    }
}