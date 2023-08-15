package klasyKonfiguracji;

import klasyKonfiguracji.producer.MessageProducer;
import org.springframework.stereotype.Service;

@Service
public class MessagePrinter {

    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}