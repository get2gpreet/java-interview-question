package org.lms.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Order order1 = new Order(101,"ABC");
        Order order2 = new Order(102,"DEF");
        Order order3 = new Order(103,"GHI");

        //Using LinkedHashSet to retain insertion order
        Set<Order> orders = new LinkedHashSet<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        System.out.println(orders);
        // What happen when we make order1 and order2 equals
        orders.forEach(order -> {
           if("DEF".equalsIgnoreCase(order.getName())){
               order.setId(101);
           }
        });
        System.out.println(orders);

        // Output -- now set got duplicate
        //[Order{id=101, name='ABC'}, Order{id=102, name='DEF'}, Order{id=103, name='GHI'}]
        //[Order{id=101, name='ABC'}, Order{id=101, name='DEF'}, Order{id=103, name='GHI'}]

        // Now make Order class as immutable so that Set always retains unique values
    }
}

class Order{
    int id;
    String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
