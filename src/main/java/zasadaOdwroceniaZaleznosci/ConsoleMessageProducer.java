package zasadaOdwroceniaZaleznosci;

import java.util.Scanner;

public class ConsoleMessageProducer implements MessageProducer {
    @Override
   public String getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to print:");
        return sc.nextLine();
    }
}
