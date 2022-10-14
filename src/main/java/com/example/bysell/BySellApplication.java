package com.example.bysell;

import com.github.lalyos.jfiglet.FigletFont;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BySellApplication {

    public static void main(String[] args) {
        try {
            System.err.println(FigletFont.convertOneLine("Shakh Urin 13"));
        }catch (IOException e){
            System.out.println("Shakhboz Urinboev");
        }
        SpringApplication.run(BySellApplication.class, args);
    }

}
