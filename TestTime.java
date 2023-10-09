/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.time;

/**
 *
 * @author cui
 */
public class TestTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t=new Time();
        t.setyear(2014);
        t.setmonth(11);
        t.setday(23);
        t.sethours(10);
        t.setmin(10);
        t.setsec(10);
        Time t1=new Time(11,11,11,11,11,11);
        Time t2=new Time(t1);
        t.ShowUniversalTime();
        t.ShowTime();
        Time t3=new Time();
        t3.input();
        t3.ShowTime();
        t3.add(t);
    }
    
}
