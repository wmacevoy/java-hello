/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;

/**
 *
 * @author wmacevoy
 */

enum Timezone {
    MST,
    UTC
};

public class TimezoneClock extends Clock {
    TimezoneClock(Timezone tz) {
        setTimezone(tz);
    }
    
    TimezoneClock() {
        setTimezone(Timezone.UTC);
    }
    
    void setTimezone(Timezone tz) {
        super.setHours(time()/3600);
        super.start();
        switch(tz) {
            case MST : timezoneShift = -7*3600; break;
            case UTC : timezoneShift =  0*3600; break;
        }
    }
    
    double mod(double a, double b) {
        double u = a/b;
        return b*(u-Math.floor(u));
    }
    double timezoneShift = 0.0;
    @Override 
    double getHours() {
        return mod(super.getHours()+timezoneShift,12.0);
    }
    
    @Override
    void setHours(double _hours) {
        super.setHours(mod(_hours - timezoneShift,12.0));
    }
       
    void testGetTime() {
        Clock clock = new TimezoneClock();
        double hours = clock.getHours();
        double minutes = clock.getMinutes();
        double seconds = clock.getSeconds();
    }
    void testGetCorrectTime() {
        Clock clock = new TimezoneClock();
        clock.setHours(6.50);
        assert clock.getHours() == 6.50;
        assert clock.getMinutes() == 30.0;
        assert clock.getSeconds() ==  0.0;
    }
    
    void testGetFlowingTime() {
        Clock clock = new TimezoneClock();
        clock.setHours(1.00);
        clock.start();
        pause(1.0);
        double now = clock.getHours();
        double shouldBe = 1.00 + 1.0/3600.0;
        assert abs(now-shouldBe) < 0.1/3600.0;
    }
    
    void testMST() {
        Clock clock = new TimezoneClock(Timezone.MST);
        println("time: " + clock.getHours());
    }
 
    
}
