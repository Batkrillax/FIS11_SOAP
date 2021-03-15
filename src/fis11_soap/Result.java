/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis11_soap;

/**
 *
 * @author squoz
 */
import java.io.Serializable;

public class Result implements Serializable {

    private double y;

    public Result() {
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("\nОтвет: Y = %.3f", y);
    }

}
