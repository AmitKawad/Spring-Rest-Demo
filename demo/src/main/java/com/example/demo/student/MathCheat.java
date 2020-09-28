package com.example.demo.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Math")

public class MathCheat implements Cheat {


    public MathCheat() {
        System.out.println("MatheCheat constructor called");
    }


    @Override
    public void cheating() {
        System.out.println("Math cheating started...");

    }
}
