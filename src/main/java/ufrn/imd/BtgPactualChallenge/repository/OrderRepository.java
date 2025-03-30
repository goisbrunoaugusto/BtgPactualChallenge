package ufrn.imd.BtgPactualChallenge.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import ufrn.imd.BtgPactualChallenge.controller.dto.OrderResponse;
import ufrn.imd.BtgPactualChallenge.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageable);
}
