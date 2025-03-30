package ufrn.imd.BtgPactualChallenge.dto;

import java.math.BigDecimal;

public record OrderItensEvent(String produto,
                              Integer quantidade,
                              BigDecimal preco) {
}
