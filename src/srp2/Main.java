package srp2;

import srp2.model.Order;
import srp2.model.OrderInput;
import srp2.model.OrderSaver;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        Order order = OrderInput.inputFromConsole();
        OrderSaver.saveToJson(order);
    }
}
