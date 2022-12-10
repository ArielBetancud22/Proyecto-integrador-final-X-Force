//Conversor de grados Farenheit a grados celsius

package app.xforce.integradorjava.operaciones.convTemperatura;

public class GradosFaC extends ConversorDeTemperatura{
    public GradosFaC(){
        super();
           }
    
    public float gradosFaC(){
        return (this.getGradosIngresados()-32) * 0.55f;
    }
}
