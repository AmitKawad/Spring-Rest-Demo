package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
   /* @Autowired
    private MathCheat mathCheat;
    @Autowired
    private ScienceCheat scienceCheat;*/
    @Autowired
    @Qualifier("Math")
    private Cheat cheat;

    public void studentCheating(){
       cheat.cheating();

    }


}
