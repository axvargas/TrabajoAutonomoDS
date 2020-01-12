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
public class Tanque {
    int maxCombustible;
    int restanteCombustible;

    public Tanque(int fuel) {
        maxCombustible = restanteCombustible = fuel;
    }

    public int getMaxCombustible() {
        return maxCombustible;
    }

    public void setMaxCombustible(int maxCombustible) {
        this.maxCombustible = maxCombustible;
    }

    public int getRestanteCombustible() {
        return restanteCombustible;
    }

    public void setRestanteCombustible(int restanteCombustible) {
        this.restanteCombustible = restanteCombustible;
    }
    
}
