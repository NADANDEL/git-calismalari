// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer customerOne = new Customer();

        customerOne.setName("Ahmet");
        customerOne.setSurname("Yildiz");
        customerOne.setBalance("2222.333");
        customerOne.setEmail("example@gmail.com");

        System.out.println("Ilk musteri: "+ customerOne.getName());

        Customer customerTwo = new Customer();
        customerTwo.setName("Ayse");
        customerTwo.setSurname("Polat");
        customerTwo.setBalance("3333.333");
        customerTwo.setEmail("eeaasd@gmail.com");

        System.out.println("Ikinci musteri: " + customerTwo.getName());
}
}





