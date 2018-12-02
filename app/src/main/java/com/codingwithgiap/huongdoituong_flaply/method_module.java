package com.codingwithgiap.huongdoituong_flaply;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;

import java.util.Timer;
import java.util.TimerTask;

public class method_module  {
//thuoc tinh----------------------------------------------------------------------------------------
    static Boolean checker_start=false;

    //khai bao doi tuong timer,handler dien hoat su thay doi cua view
    private Handler handler = new Handler();
    private Timer timer  = new Timer();
    //khoi tao doi tuong box
    //box_lenxuong b1;
    //box_ngang b2 ;
//set-----------------------------------------------------------------------------------------------

//get-----------------------------------------------------------------------------------------------
  //  public box_lenxuong getB1() { return b1; }
//contructor----------------------------------------------------------------------------------------

//phuong thuc---------------------------------------------------------------------------------------
    //method ontouch screen duoc goi khi cham hoac khong cham man hinh++++++++++++++++++++++++++++++
    public void processEvent(MotionEvent  ev,TextView tx){
        if(checker_start==false){
            tx.setVisibility(View.GONE);
            changlog(tx);
            checker_start=true;


        }else
        //get action luon trong trang thai thay doi, gan vao phan biet cheker

        if(ev.getAction() == MotionEvent.ACTION_DOWN) {

            user_play.settouch_checker(true);

        }else if(ev.getAction() == MotionEvent.ACTION_UP){
            user_play.settouch_checker(false);
        }
    // return true;
    }
    //chanlog+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     boolean changlog(final TextView tx){
        // set thay doi running
        timer.schedule(new TimerTask()  {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //rurning
                            //set box len xuong
                         // b1.box_run();
                            //show core
                            showtext(tx);
                    }
                });
            }
        }, 0,20);
        return true;
    }
    //show Text+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void showtext(TextView tx){
        tx.setText("check: "+user_play.gettouch_checker());
    }
    //xu ly box len xuong+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//end###############################################################################################

}
