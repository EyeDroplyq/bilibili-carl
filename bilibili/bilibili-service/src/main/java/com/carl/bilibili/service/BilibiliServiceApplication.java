package com.carl.bilibili.service;

import com.carl.bilibili.dao.BilibiliDaoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: 小琦
 * @createDate: 2024-03-10 15:14
 * @version: 1.0
 */
@SpringBootApplication
public class BilibiliServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BilibiliDaoApplication.class,args);
    }
}
