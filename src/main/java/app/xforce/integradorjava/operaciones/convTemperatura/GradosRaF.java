//Conversor de grados Rankine a Grados Fahrenheit
package app.xforce.integradorjava.operaciones.convTemperatura;

public class GradosRaF extends ConversorDeTemperatura{
    
    public GradosRaF(){
        super();
    }
    public float gradosRaF(){
        return this.getGradosIngresados()- 459.67f;
    }
}