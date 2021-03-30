package com.gurpreetKaur_C0780760_A8;
/**
 * @author:Gurpreet Kaur
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

class tempClass {
    private String week;
    private float temperature;
    private float windSpeed;
    private double feelTemperature;
//    empty constructor
    public tempClass() {
    }
// override constructor
    public tempClass(String week, float temperature, float windSpeed) {
        this.week = week;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }
//getter and setter
    public String getWeek() {
        boolean found=false;
        int count = 0;
        String[] arr={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String week;
        week = JOptionPane.showInputDialog(null, "Hi Welcome to my App \nPlease enter day of week (e.g Monday)").toLowerCase(Locale.ROOT);
        for(String weekdayCheck : arr){
            if(weekdayCheck.equals(week)){
                found = true;
                break;
            }
        }
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public float getTemperature() {
        temperature = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter temperature"));
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindSpeed() {
        windSpeed = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter windSpeed"));
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }
//calculating fell like temperature
    public double calculateTemperature(){
        this.feelTemperature=this.windSpeed*this.temperature;
        JOptionPane.showMessageDialog(null,"Feel like temperature is "+this.feelTemperature);
        return feelTemperature;
    }

}
//Main class
public class Assignment8 {
    public static void main(String[] args) {
        tempClass i1 = new tempClass();
        String week=i1.getWeek();
        StringBuilder week1=new StringBuilder();
        week1.append(week);
        float temp = i1.getTemperature();
        StringBuilder temp1=new StringBuilder();
        temp1.append(temp);
        float wind = i1.getWindSpeed();
        StringBuilder windSpeed=new StringBuilder();
        windSpeed.append(wind);
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(week1);
        list.add(temp1);
        list.add(windSpeed);
        i1.calculateTemperature();
    }
}



