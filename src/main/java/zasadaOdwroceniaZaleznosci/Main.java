package zasadaOdwroceniaZaleznosci;

public class Main {
    public static void main(String[] args) {
        MessageProducer simpleMessageProducer = new ConsoleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(simpleMessageProducer);
        messagePrinter.printMessage();
    }
}
