package WstrzykiwanieZaleznosci;

public class MessagePrinter {
    private final SimpleMessageProducer messageProducer = new SimpleMessageProducer();

    void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
