import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExampleInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Juan", 5000);
        employee.setAge(80);
        employee.setGenre('M');
        employee.setDirection("False street 123");
        System.out.println(employee);

        Client client = new Client(new Date(), true);
        client.setName("Karla");
        System.out.println(client);
    }
}