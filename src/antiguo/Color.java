/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiguo;

/**
 *
 * @author Asus
 */
public class Color {
    int colorR;
    int colorG;
    int colorB; 

    public Color(int colorR, int colorG, int colorB) {
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }

    public int getColorR() {
        return colorR;
    }

    public void setColorR(int colorR) {
        this.colorR = colorR;
    }

    public int getColorG() {
        return colorG;
    }

    public void setColorG(int colorG) {
        this.colorG = colorG;
    }

    public int getColorB() {
        return colorB;
    }

    public void setColorB(int colorB) {
        this.colorB = colorB;
    }
    
}
