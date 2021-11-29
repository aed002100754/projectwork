/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class OrderDirectory {

    ArrayList<Order> orders;

    public OrderDirectory() {
        this.orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Order addOrder() {
        Order order = new Order();
        orders.add(order);
        return order;
    }

    public Order findOrder(int id) {
        Order order = orders.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        return order;
    }

    public void removeSelectedRestaurantOrders(String restaurantName) {
        for (Order order : orders) {
            if (order.getRestaurantName().equals(restaurantName)) {
                int index = orders.indexOf(order);
                orders.remove(order);
            }
        }
    }

}
