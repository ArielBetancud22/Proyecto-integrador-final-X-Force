//Conversor de grados Fahrenheit a Rankine
package app.xforce.integradorjava.operaciones.convTemperatura;

public class GradosFaR extends ConversorDeTemperatura{
    
    public GradosFaR(){
        super();
    }
    public float gradosFaR(){
        return this.getGradosIngresados()+ 459.67f;
    }
}
