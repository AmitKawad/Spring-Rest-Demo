package com.example.demo.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Science")
public class ScienceCheat implements Cheat {


    @Override

    public void cheating() {

        System.out.println("Science Cheating started...");

    }
}
