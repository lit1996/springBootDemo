package com.lit.boot;

import com.lit.TextMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lit
 * @date 2020/1/11 17:06:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TextMain.class)
public class SpBootTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void me(){
        redisTemplate.opsForValue().set("hello","dage");
        String str =(String)redisTemplate.opsForValue().get("hello");
        System.out.println(str);
    }
}
