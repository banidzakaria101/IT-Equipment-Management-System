package Services;

import Repository.OrderRepository;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    private Order addOrder(Order order){
        return orderRepo.save(order);
    }

    private Order findOrderByName(Order order){
        return orderRepo.findByName(order);
    }

    private void deleteOrder(Order order){
        orderRepo.delete(order);
    }
}
