package com.codingwithgiap.huongdoituong_flaply;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import com.codingwithgiap.huongdoituong_flaply.method_module;

public class MainActivity extends AppCompatActivity {
//thuoc tinh----------------------------------------------------------------------------------------
    protected LinearLayout li;
    //ghi diem
    protected TextView txcore;
    //tao tap to start
    protected TextView txtap;
    //box
    public static ImageView img;
    public static ImageView img1;
    public static ImageView img2;
    public static ImageView img3;
    //fram layout
    public   FrameLayout framv;
    //khoi doi tuong module
    public method_module m= new method_module();
    //khoi doi tuong box
//set-----------------------------------------------------------------------------------------------

//get-----------------------------------------------------------------------------------------------

//contructor----------------------------------------------------------------------------------------
box_lenxuong b1 = new box_lenxuong(200, 200,img,500,500,user_play.touch_checker, 20);
//phuong thuc---------------------------------------------------------------------------------------
    //anh xa++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void anhxa(){
        txcore = (TextView) findViewById(R.id.textView);
        txtap = (TextView) findViewById(R.id.textView2);
        img = (ImageView) findViewById(R.id.imageView);
        img1 = (ImageView) findViewById(R.id.imageView1);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        li=(LinearLayout)findViewById(R.id.li);
    }
    //oncreate++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        anhxa();
        //set checker + insivi textview tap to start
        m.changlog(txcore);
    }
    //ontouch++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public boolean onTouchEvent(MotionEvent  ev) {
        // anh xa fram #no-delete
        if (method_module.checker_start == false) {
              framv = (FrameLayout) findViewById(R.id.fr);
        }
            //xy ly ontouch
            m.processEvent(ev, txtap);

        return true;
    }
//end###############################################################################################

}
