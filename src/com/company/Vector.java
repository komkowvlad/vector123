package com.company;
public class Vector {
    int x1, y1, x2, y2;

    public String toString(){
        return "["+ x1 +","+y1+";"+x2+","+y2+  "]";
    }
    Vector(int X1, int Y1, int X2, int Y2){
        x1 = X1; y1 = Y1; x2 = X2; y2 = Y2;
    }
    public int getX1() {
        return x1;
    }
    public int getX2() {
        return x2;
    }
    public int getY1() {
        return y1;
    }
    public int getY2() {
        return y2;
    }

    public boolean equals(Vector v){
        int toX = v.getX1()- x1;
        int toX1 = v.getX2()- x2;
        int toY = v.getY1()- y1;
        int toY1 = v.getY2()- y2;
        boolean b;
        if(toX == toX1){
            if (toY == toY1){b = true;}
            else {b = false;}
        }
        else {b = false;}
        return b;
    }

    public double length(){
        int x = x2-x1;
        int y = y1-y2;
        double l = Math.hypot(x,y);
        return l;
    }

}
