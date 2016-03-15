/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se3.part.a;

import java.util.TimerTask;

/**
 *
 * @author Paul
 */
public class TimerInterval extends TimerTask{
    private int seconds, minutes, hours, day;
    private String time;

    public void TimerInterval(){
        time = "00:00:00";
        seconds = 0;
        minutes = 0;
        hours = 0;
        day = 1;
    }
    
    @Override
    public void run() {
        if(seconds<59)
            seconds++;
        else{
            seconds = 0;
            if(minutes<59)
                minutes++;
            else{
                minutes = 0;
                if(hours<23)
                    hours++;
                else{
                    hours = 0;
                    if(day<7)
                        day++;
                    else{
                        day = 1;
                    }
                }
            }
        }
        time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    public void setMinutes(int m){
        minutes = m;
    }
    
    public void setHours(int h){
        hours = h;
    }
    
    public String getTime(){
        //System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
        return time;
    }
    
}
