package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Version 1.0.0 已弃用
 * Version 1.0.1 已弃用
 * Version 1.0.2 正在启用       Bug1热修复成功
 * Version 1.0.3 测试阶段
 * Version 1.0.2 正在启用       Bug1热修复成功       Bug2热修复成功
 */
@SpringBootApplication
public class GitBootApplication {

    public static void main(String[] args) {
        //在Github上修改过后的代码
        SpringApplication.run(GitBootApplication.class, args);
    }

}
