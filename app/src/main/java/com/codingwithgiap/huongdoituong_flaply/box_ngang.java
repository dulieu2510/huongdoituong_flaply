package com.codingwithgiap.huongdoituong_flaply;

import android.widget.ImageView;

public class box_ngang extends box{
    //thuoc tinh------------------------------------------------------------------------------------
        public int boxrun_x;
    //set-------------------------------------------------------------------------------------------
        public void setBoxrun_x(int boxrun_x) { this.boxrun_x = boxrun_x; }
    //get-------------------------------------------------------------------------------------------
        public int getBoxrun_x() { return boxrun_x; }
    //contructor------------------------------------------------------------------------------------
    public box_ngang(){}
    public box_ngang(int box_x, int box_y, ImageView box_view, int fram_x, int fram_y, int boxrun_x) {
        super(box_x,box_y,box_view,fram_x,fram_y);
        this.boxrun_x = boxrun_x;
    }
    //phuong thuc-----------------------------------------------------------------------------------
        //ghi de box_run lop cha++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        @Override
        public  void box_run(){
            if(box_x < 0){
                box_x  = fram_x;
                // set y
                box_y = (int) Math.floor(Math.random() * (fram_y-box_view.getHeight()));
                box_view.setY(box_y);
            }
            // set x
            box_x -= boxrun_x;
        }
    //end###########################################################################################
}
