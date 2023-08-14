package WstrzykiwanieZaleznosci;

public class Main {
    public static void main(String[] args) {
        SimpleMessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(simpleMessageProducer);
        messagePrinter.printMessage();
    }
}
