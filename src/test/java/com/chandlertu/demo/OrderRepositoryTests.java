package com.chandlertu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OrderRepositoryTests {

  @Autowired
  private OrderRepository repository;

  @Test
  public void test() {
    Order order1 = new Order();
    order1.setOrderId(1L);
    order1.setUserId(1L);
    repository.save(order1);
    Order order2 = new Order();
    order2.setOrderId(2L);
    order2.setUserId(2L);
    repository.save(order1);

  }

}
