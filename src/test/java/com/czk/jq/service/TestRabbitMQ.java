package com.czk.jq.service;

import com.czk.jq.main.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes=App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {
    
    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        helloSender.send();
    }
}