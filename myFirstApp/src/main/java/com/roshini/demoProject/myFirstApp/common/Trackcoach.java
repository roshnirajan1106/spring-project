package com.roshini.demoProject.myFirstApp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Trackcoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a half mile";
    }
}
