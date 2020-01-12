
import java.util.ArrayList;
import java.util.Random;

public class Vehiculo {
    int maxPotencia;
    int rpm;
    int maxCombustible;
    int restanteCombustible;
    int velocidades;
    String name;
    String serie;
    int colorR;
    int colorG;
    int colorB; 
    ModoConduccion modo;
    TipoVehiculo tipo;
    
    public Vehiculo(String nombre, String serie, int fuel, int power, int vel){
      this.serie =serie;
      name = nombre;
      maxCombustible = restanteCombustible = fuel;
      maxPotencia = power;
      velocidades = vel;
      colorR = colorG = colorB = 255;
      rpm = 1;
      modo = ModoConduccion.MANUAL;
      tipo = TipoVehiculo.TURISMO;
    }
    public ModoConduccion getModo(){ return modo; }
    public void setModo(ModoConduccion mode){modo = mode;}
    public TipoVehiculo getTipo(){return tipo;}
    public void setTipo(TipoVehiculo type){tipo = type; }
    public int getMaxPotencia() { return maxPotencia;  }
    public int getMaxCombustible() {  return maxCombustible; }
    public void setCombustible(final int fuel) { //int
      if (this.maxCombustible >= fuel){ 
        this.restanteCombustible = fuel; }
      else{ restanteCombustible = maxCombustible; }  
    }
    /** Permite acelerar el vehiculo de acuerdo a su 
     * modo de conducción **/
    public void _acc_for_mod(){
      if(rpm < maxPotencia){
        switch (this.modo){
          case AUTOMATICO:
            //Verifica que no se pase de su máxima potencia
            if(maxPotencia > rpm + 2 && restanteCombustible > 1 ){ 
                rpm += 2; 
                restanteCombustible--; 
            }
            //Si ya no hay combustible el carro se debe detener
            if(restanteCombustible == 0 ){ rpm = 0; }
            break;
          case MANUAL:
            //Verifica que no se pase de su máxima potencia
            if(maxPotencia > rpm + 5 && restanteCombustible > 1 ){ 
                rpm += 5; 
                restanteCombustible--; 
            }
            //Si ya no hay combustible el carro se debe detener
            if(restanteCombustible == 0 ){ rpm = 0; }
            break;
        }
      }
    }
  public void inicializar(){
      switch (this.tipo){
        case TURISMO:
          this.setMaxPotencia(50);
          this.maxCombustible(1000);
          this.rpm = 1;
          this.velocidades = 5;
          this.acelerar();
          break;
        case DEPORTIVO:
          this.setMaxPotencia(80);
          this.maxCombustible(700);
          this.rpm = 1;
          this.velocidades = 6;
          this.acelerar();
          break;
        case RALLY:
          this.setMaxPotencia(70);
          this.maxCombustible(1100);
          this.rpm = 1;
          this.velocidades = 5;
          this.acelerar();
          break;
        default:
          this.setMaxPotencia(50);
          this.maxCombustible(500);
          this.rpm = 1;
          this.velocidades = 5;
          this.acelerar();
          break;
      }
    }
}
public class Carreras{
  public static void main(String[] args) {
    ArrayList <Vehiculo> autos = null;
    for(int i = 0 ; i< 25 ; i++){
      Vehiculo v = new Vehiculo("Auto_"+i, 
        "serie0"+i, 0,0,0);
      v.setTipo(TipoVehiculo.DEPORTIVO);
      v.colorR = Random.randInt(0,255);
      v.colorG = Random.randInt(0,255);
      v.colorB = Random.randInt(0,255);
      System.out.println(v.name + " (" 
        + v.colorR + "," + v.colorG + "," + 
        v.colorB + ")");
      autos.add(v);
    }
    // Iniciar la carrera
    for (Vehiculo v : autos) {
        v.inicializar();
    }
    //Proceso para identificar quien 
    //gana la carrera
  }
  
    
}

