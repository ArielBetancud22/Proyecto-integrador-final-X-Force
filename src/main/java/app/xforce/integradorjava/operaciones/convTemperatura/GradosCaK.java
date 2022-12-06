//Converor de Grados Celsius a Grados Kelvin

package app.xforce.integradorjava.operaciones.convTemperatura;

public class GradosCaK extends ConversorDeTemperatura{
   
    public GradosCaK(){
    
        super();     
    }
    public float gradosCak(){
        return this.getGradosIngresados()+273.5f;
    }
}
