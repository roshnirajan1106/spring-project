package com.roshini.demoProject.myFirstApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    
    private Coach coach;
    
    //this tell Spring to inject a dependency
    public DemoController(Coach theCoach){
        coach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getMethodName() {
        return coach.getDailyWorkout();
    }
    

}
