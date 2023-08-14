package zasadaOdwroceniaZaleznosci;

public class Main {
    public static void main(String[] args) {
        SimpleMessageProducer simpleMessageProducer = new ConsoleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(simpleMessageProducer);
        messagePrinter.printMessage();
    }
}
