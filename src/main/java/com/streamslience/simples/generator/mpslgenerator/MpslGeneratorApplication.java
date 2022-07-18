package com.streamslience.simples.generator.mpslgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.streamslience.simples.generator.mpslgenerator.dao")
public class MpslGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpslGeneratorApplication.class, args);
    }

}
