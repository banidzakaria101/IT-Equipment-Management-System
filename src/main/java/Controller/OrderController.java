package Controller;

import Services.OrderService;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(name = "/add")
    public Order addOrder(@RequestParam Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping(name = "/delete")
    public void deleteOrder(@RequestBody Order order){
        orderService.deleteOrder(order);
    }

    @GetMapping(name = "/all")
    public List<Order> getAllUser(){
        return orderService.getAllOrders();
    }

    @GetMapping(name = "/by-name")
    public Order getOrderByName(@RequestBody Order order){
        return orderService.findOrderByName(order);
    }

}
