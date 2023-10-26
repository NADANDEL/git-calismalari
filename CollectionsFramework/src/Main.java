import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            ArrayList<Customer> customers = new ArrayList<>();

            Customer customer1 = new Customer("Ahmet", "ahmet@gmail.com", "555-1237");
            Customer customer2 = new Customer("Mehmet", "mehmet@hotmail.com", "555-9643");

            customers.add(customer1);
            customers.add(customer2);

        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
            System.out.println();
        }
    }
}