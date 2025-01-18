import model.Order;
import model.Product;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vusal", 007L);
        Product product = new Product("Tesbeh",9999);
        Order order = new Order(01L,user.getId());
        System.out.println(order);
        System.out.println(product);
        System.out.println(user);


    }
}
