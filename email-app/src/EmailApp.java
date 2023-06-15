public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Tomo", "Khan");
        //Email email2 = new Email("Tim", "White");

        System.out.println(email1.displayInfo());

        email1.setAlternateEmail("tomo.kh@gmail.com");
        System.out.println("Your alternate email is: " + email1.getAlternateEmail());
    }

}
