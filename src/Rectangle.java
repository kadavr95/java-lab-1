/**
 * Created by Yaskovich Dmitry on 21/12/2016.
 */

import java.lang.*;


public class Rectangle {
    private double lenght;
    private double width;
    private String color;
    public Rectangle(){
        lenght = 3.0;
        width = 7.0;
        color = "red";
    }
    public Rectangle(double l, double w){
        lenght = l;
        width = w;
        color = "blue";
    }
    public Rectangle(double l, double w, String c){
        lenght = l;
        width = w;
        color = c;
    }
    public double getLenght(){
        return lenght;
    }
    public double getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return lenght*width;
    }
}
