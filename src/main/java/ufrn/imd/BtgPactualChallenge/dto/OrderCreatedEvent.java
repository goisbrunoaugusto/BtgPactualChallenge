package ufrn.imd.BtgPactualChallenge.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItensEvent> itens) {
}
