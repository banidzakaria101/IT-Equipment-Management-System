package Services;

import Repository.OrderRepository;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public Order findOrderByName(Order order){
        return orderRepo.findByName(order);
    }

    public void deleteOrder(Order order){
        orderRepo.delete(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }
}
