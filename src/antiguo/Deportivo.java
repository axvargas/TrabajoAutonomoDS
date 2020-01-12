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
public class Deportivo extends Vehicle {

    @Override
    public void acelerar() {
        if(manejo == 0){
            if(maxPotencia > rpm + 5 && restanteCombustible > 1 ){ 
                rpm += 5; 
                restanteCombustible--; 
            }
            //Si ya no hay combustible el carro se debe detener
            if(restanteCombustible == 0 ){ rpm = 0; }
        }
    }

   
    
}
