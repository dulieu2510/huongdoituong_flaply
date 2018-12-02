package com.codingwithgiap.huongdoituong_flaply;

import android.widget.TextView;

public class user_play {
//thuoc tinh----------------------------------------------------------------------------------------
    static int us_core;
    static int us_coreneed=1;
    static int us_hightcore=0;
    static int count_timer;
    private double time;
    private int priod;
    static boolean touch_checker;
    private boolean is_over= false;
    private int level;
//set-----------------------------------------------------------------------------------------------
    public static void settouch_checker(Boolean touch_checker) { user_play.touch_checker = touch_checker; }
    public static void setUs_coreneed(int us_coreneed) { user_play.us_coreneed = us_coreneed; }
    public static void setUs_hightcore(int us_hightcore) { user_play.us_hightcore = us_hightcore; }
    public void setLevel(int level) { this.level = level; }
    public void setIs_over(boolean is_over) { this.is_over = is_over; }
    public void setPriod(int priod) { this.priod = priod; }
    public static void setCount_timer(int count_timer) { user_play.count_timer = count_timer; }
    public void setCore(int core) {
        this.us_core = core;
    }
    public void setTouch_checker(boolean touch_checker) {
        this.touch_checker = touch_checker;
    }
//get-----------------------------------------------------------------------------------------------
    public static Boolean gettouch_checker() { return touch_checker; }
    public static int getUs_coreneed() { return us_coreneed; }
    public static int getUs_hightcore() { return us_hightcore; }
    public int getLevel() { return level; }
    public boolean isIs_over() { return is_over; }
    public int getPriod() { return priod; }
    public static int getCount_timer() { return count_timer; }
    public int getCore() {
        return us_core;
    }
    public boolean isTouch_checker() {
        return touch_checker;
    }
//contructor----------------------------------------------------------------------------------------
    public user_play(){}
//phuong thuc---------------------------------------------------------------------------------------
    //phuong thuc game over+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    void over(){

        if((time_count()==5.0)&&(getCore()<us_coreneed)){
            is_over =true;

        }else if(time_count()>5.0){
            count_timer=0;
            level++;
            us_coreneed = us_coreneed+2;
        }
    }
    //hien thi core hight+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static void showhightcore(TextView tx){
        if(us_core>us_hightcore){
            tx.setText("Hight core: "+us_core);
            us_hightcore=us_core;
        }else{tx.setText("Hight core: "+us_hightcore);}
    }
    //them bien dem+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    void add_count(){
        count_timer++;
    }
    //tao timer+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    double time_count(){
        time = priod/1000.0;
        time = time * count_timer;
        return time;
    }
//end###############################################################################################
}
