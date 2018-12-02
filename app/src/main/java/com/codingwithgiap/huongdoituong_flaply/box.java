package com.codingwithgiap.huongdoituong_flaply;

import android.widget.ImageView;

public  class box {
    //thuoc tinh------------------------------------------------------------------------------------
    public int box_x;
    public int box_y;
    public ImageView box_view;
    public int fram_x;
    public int fram_y;
    protected box() {
    }
    //set-------------------------------------------------------------------------------------------
    public void setFram_y(int fram_y) {
        this.fram_y = fram_y;
    }
    public void setBox_x(int box_x) {
        this.box_x = box_x;
    }
    public void setBox_y(int box_y) {
        this.box_y = box_y;
    }
    public void setBox_view(ImageView box_view) {
        this.box_view = box_view;
    }
    public void setFram_x(int fram_x) {
        this.fram_x = fram_x;
    }
    //get-------------------------------------------------------------------------------------------
    public int getBox_x() {
        return box_x;
    }
    public int getBox_y() {
        return box_y;
    }
    public ImageView getBox_view() {
        return box_view;
    }
    public int getFram_x() {
        return fram_x;
    }
    public int getFram_y() {
        return fram_y;
    }
    //contructor------------------------------------------------------------------------------------
    public box(int box_x, int box_y, ImageView box_view, int fram_x, int fram_y) {
        this.box_x = box_x;
        this.box_y = box_y;
        this.box_view = box_view;
        this.fram_x = fram_x;
        this.fram_y = fram_y;
    }
    //phuong thuc-----------------------------------------------------------------------------------
    //
    public void box_run(){}
    //
    public void setx_y(){
        box_view.setX(box_x);
        box_view.setY(box_y);
    }
    //end###########################################################################################
}
