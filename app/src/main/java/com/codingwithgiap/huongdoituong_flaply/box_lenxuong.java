package com.codingwithgiap.huongdoituong_flaply;

import android.widget.ImageView;

public class box_lenxuong extends box {
    // thuoc tinh-----------------------------------------------------------------------------------
    public int boxrun_y;
    public boolean check;
    //set-------------------------------------------------------------------------------------------
    public void setCheck(boolean check) {
        this.check = check;
    }
    public void setBoxrun_y(int boxrun_y) { this.boxrun_y = boxrun_y; }
    //get-------------------------------------------------------------------------------------------
    public boolean isCheck() {
        return check;
    }
    public int getBoxrun_y() {
        return boxrun_y;
    }
    //contructor -----------------------------------------------------------------------------------
    public box_lenxuong(){}
    public box_lenxuong(int box_x, int box_y, ImageView box_view, int fram_x, int fram_y,boolean check, int boxrun_y) {
        super(box_x,box_y,box_view,fram_x,fram_y);
        this.check = check;
        this.boxrun_y = boxrun_y;
    }
    //phuong thuc-----------------------------------------------------------------------------------
    //set box di chuyen len xuong+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @Override
    public  void box_run(){
        if (check == true) {
            box_y -= boxrun_y;

        } else if (check == false) {
            box_y += boxrun_y;
        }
        if (box_y < 0) {
            box_y = 0;
        }
        if (box_y > fram_y - box_view.getHeight()) {
            box_y = fram_y - box_view.getHeight();
        }
       // super.box_view.setY(box_y);
    }
    //end###########################################################################################
}
