package ufrn.imd.BtgPactualChallenge.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import ufrn.imd.BtgPactualChallenge.dto.OrderCreatedEvent;
import ufrn.imd.BtgPactualChallenge.service.OrderService;

import static ufrn.imd.BtgPactualChallenge.config.RabbitMQConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        logger.info("Message received: {}", message);

        orderService.save(message.getPayload());
    }
}
