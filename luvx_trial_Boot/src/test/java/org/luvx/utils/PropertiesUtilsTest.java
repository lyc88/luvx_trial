package org.luvx.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesUtilsTest {

    @Autowired
    private PropertiesUtils properties;

    @Test
    public void propertiesTest() {
        System.out.println("title:" + properties.getTitle());
        System.out.println("description:" + properties.getDescription());
    }
}