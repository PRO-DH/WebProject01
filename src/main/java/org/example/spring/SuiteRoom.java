package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class SuiteRoom implements Room{

    public void reserve(){
        System.out.println("스위트룸을 예약합니다.");

    }

}
