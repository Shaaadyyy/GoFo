/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.ArrayList;

public class Time {
    String time;
    ArrayList<Time> timeslots = new ArrayList();

    public Time(String time){

        this.time = time;
    }

    public Time() {

    }

    public void addTime(Time t){
        timeslots.add(t);
    }

    public void removeTime(int i){
        timeslots.remove(i);
    }

    @Override
    public String toString() {
        return "Time{" +
                 time +"}"+ '\''
                ;
    }
}
