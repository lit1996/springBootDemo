package com.lit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lit
 * @date 2020/1/11 10:19:26
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lit.mapper")
public class TextMain {
    public static void main(String[] args) {
        SpringApplication.run(TextMain.class);
    }

}
