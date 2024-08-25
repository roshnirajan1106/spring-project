package com.roshini.demoProject.myFirstApp.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.roshini.demoProject.myFirstApp.common.Coach;

@RestController
public class DemoController {
    
    private Coach coach;
    
    //this tell Spring to inject a dependency
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        coach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getMethodName() {
        return coach.getDailyWorkout();
    }
    

}
