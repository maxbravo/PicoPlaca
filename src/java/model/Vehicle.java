/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author mbravo
 */
public class Vehicle {
    private String plate;
    private String date;
    private String lastDigit;    
    private int weekDay;
    private int hour;
    private int minute;    
    private int second;    

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public String getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(String lastDigit) {
        this.lastDigit = lastDigit;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Vehicle(String plate, String date, String lastDigit, int weekDay, int hour, int minute, int second) {
        this.plate = plate;
        this.date = date;
        this.lastDigit = lastDigit;
        this.weekDay = weekDay;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public String restriction(){
        Boolean var = new Boolean(true);
        var = compareDays();
        if (var){
            return "Enjoy your ride";
        }
        else{
            var = compareHours();
            if (var){
                return "Enjoy your ride";
            }
            else{
                return "ALERT!!! you are forbidden to ride youre vehicle. YOU HAVE RESTRICTION.";                
            }
        }
    }
    
    private boolean compareHours(){
        if (this.hour >= 7 && this.hour <=9 ){
            if (this.hour == 9 && this.minute > 30){
                return true;
            }
            else{
                return false;
            }
        }
        if (this.hour >= 16 && this.hour <=19 ){
            if (this.hour == 19 && this.minute > 30){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
       
    
    private boolean compareDays(){
        if( this.weekDay == 2 && ( this.lastDigit.equals("1") || this.lastDigit.equals("2") )){
            return false;
        }
        if( this.weekDay == 3 && ( this.lastDigit.equals("3") || this.lastDigit.equals("4") )){
            return false;
        }
        if( this.weekDay == 4 && ( this.lastDigit.equals("5") || this.lastDigit.equals("6") )){
            return false;
        }
        if( this.weekDay == 5 && ( this.lastDigit.equals("7") || this.lastDigit.equals("8") )){
            return false;
        }
        if( this.weekDay == 6 && ( this.lastDigit.equals("9") || this.lastDigit.equals("0") )){
            return false;
        }
        return true;
    }
    

}
