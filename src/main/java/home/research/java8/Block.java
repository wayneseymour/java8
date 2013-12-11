/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.research.java8;

/**
 *
 * @author wayne
 */
public class Block {
    private Colors color = null;

    Block(String color) {
        this.color = Colors.valueOf(color.toUpperCase());
    }

    /**
     * @return the color
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Colors color) {
        this.color = color;
    }
    
}
