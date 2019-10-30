package com.xzh.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动
 *
 * @author: 向振华
 * @date: 2019/10/30 10:56
 */
@MapperScan(basePackages = "com.xzh.seckill.dao.mapper")
@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
