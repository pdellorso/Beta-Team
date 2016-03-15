/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se3.part.a;

import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Paul
 */
public class Se3PartA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer main = new Timer();
        Scanner in = new Scanner(System.in);
        TimerInterval run = new TimerInterval();
        main.scheduleAtFixedRate(run, 1000, 1000);
        
        Runnable r = new Runnable() {
            public void run() {
                while(in.hasNext()){
                    String function = in.next();
                    if("setTime".equals(function)){
                        System.out.println("Set Minute Value as Integer");
                        run.setMinutes(in.nextInt());
                        System.out.println("Set Hour Value as Integer");
                        run.setHours(in.nextInt());
                
                    }
                    if("getTime".equals(function)){
                        System.out.println(run.getTime());
                    }
                }
                
            }
        };

        new Thread(r).start();
        /*When run starts loop based on timer
        timer redraws screen every minute possibly 
        every second depending on preference

        When timer hits a minute the program checks
        if there are any alarms set
        if so it plays a tune and the time flashes every second
        the user can press the alarm to reset it
        or press it twice to disable it.
        if the alarm has the repeat modifier it will reset for the given day.
        if niether are done or the time displayed is pressed the
        clock creates a temporary alarm and adds it to the arraylist
        the arraylist is sorted in order of the next alarm to 
        play.
        if an alarm is temporary the next time it rings it will delete itself
        and possibly create a new one
        this way we only check the first one and possibly any one
        after with the same time set.
        timer starts at 0000 and cycles to 2400
        if time is between 0000 and 1200 it is am
        after 1200 it is pm
        alarms can be cycled through and the user can set up to *4
        possibly more
        can possibly color code the alarms
        a temporary alarm is created when an alarm is snoozed
        multiple alarms can be snoozed s

        when the digit is pressed it performs an assigned function.
        this function can be set and activated.
        
        each touch digit has a character/string
        */
        
    }
    
}
