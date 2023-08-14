package zasadaOdwroceniaZaleznosci;

import java.util.Scanner;

public class ConsoleMessageProducer extends SimpleMessageProducer {
    @Override
    String getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to print:");
        return sc.nextLine();
    }
}
