/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.time;

/**
 *
 * @author cui
 */
import java.util.Scanner;
public class Time {
    private int years;
    private int months;
    private int days;
    private int hours;
    private int min;
    private int sec;
    public Time(){
        this.years=12;
        this.months=12;
        this.days=12;
        this.hours=12;
        this.min=12;
        this.sec=12;
        System.out.println(this.years+"/"+this.months+"/"+this.days+"\nTime:"+this.hours+":"+this.min+":"+this.sec);
    }
    public Time(int y,int mon,int d,int h,int m,int s){
        this.years=y;
        this.months=m;
        this.days=d;
        this.hours=h;
        this.min=mon;
        this.sec=s;
        System.out.println("Date:"+y+"/"+mon+"/"+d+"\nTime:"+h+":"+m+":"+s);
    }
    public Time(Time ref){
        this.years=ref.years;
        this.months=ref.months;
        this.days=ref.days;
        this.hours=ref.hours;
        this.min=ref.min;
        this.sec=ref.sec;
        System.out.println("Date:"+this.years+"/"+this.months+"/"+this.days+"\nTime:"+this.hours+":"+this.min+":"+this.sec);
        //System.out.println(h+":"+m+":"+s);
    }
    public void setyear(int y){
        this.years=y;
    }
    public int getyear(){
        return this.years;
    }
    public void setmonth(int g){
        if(g>0&&g<=12){
            this.months=g;
        }}
     public int getmonth(){
        return this.months;
    }
        public void setday(int z){
          if(z>0&&z<=30){
            this.days=z;
        }    
    }
        public int getday(){
            return this.days;
        }
    public void sethours(int h){
       if(h>=0&&h<24){
           this.hours=h;
       }
       else{
           System.out.println("Enter valid hours");
       }
}
    public int gethours(){
        return this.hours;
    }
    public void setmin(int m){
        if(m>=0&&m<=59){
        this.min=m;}
        else{
           System.out.println("Enter valid minute");}
    }
    public int getmin(){
        return this.min;
    }
    public void setsec(int s){
        if(s>=0&&s<=59)
        this.sec=s;
        else
            System.out.println("Enter valid secs");
    }
    public int getsec(){
        return this.sec;
    }
    public void ShowUniversalTime(){
        System.out.printf("%d:%d:%d:%d:%d:%d\n",this.getyear(),this.getmonth(),this.days,this.gethours(),this.getmin(),this.getsec());
    }
    public void ShowTime(){
        int h=this.hours;
        if(this.hours>12)
          h=h-12;
        String S=(this.hours<12)?"AM":"PM";  
    System.out.println("Date:"+this.getyear()+"/"+this.getmonth()+"/"+this.getday()+"\nTime:"+h+":"+this.getmin()+":"+this.getsec()+""+S);
}
    public void input(){
        Scanner S=new Scanner(System.in);
        //int h=S.nextInt(min);
        //int m=S.nextInt();
        //int s=S.nextByte(min);
        System.out.println("Ente years");
        this.setyear(S.nextInt());
        System.out.println("Enter Month");
        this.setmonth(S.nextInt());
        System.out.println("Enter days");
        this.setday(S.nextInt(days));
        System.out.println("Enter hours:");
        this.sethours(S.nextInt());
        System.out.println("Enter minutes:");
        this.setmin(S.nextInt());
        System.out.println("Enter Seconds:");
        this.setsec(S.nextInt());
    }
    public void add(Time t){
    int ts=this.sec+t.sec;
    int m=ts/60;
    int rs=ts%60;
    int tm=this.min+t.min+m;
    int h=tm/60;
    int rm=tm%60;
    int th=this.hours+t.hours+h;
    int d=th/24;
    int rh=th%24;
    int td=this.days=t.days+d;
    int mon=td/30;
    int rdays=td%30;
    int tmon=mon+this.months+t.months;
    int year=tmon/12;
    int rmon=tmon%12;
    int tyear=year+this.years+t.years;        
    System.out.printf("Date:%d/%d/%d\nTime:%d:%d:%d",tyear,rmon,rdays,rh,rm,rs);
}
}
