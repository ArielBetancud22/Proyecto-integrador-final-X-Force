//Conversor de grados kelvin a celsius
package app.xforce.integradorjava.operaciones.convTemperatura;


public class GradosKaC extends ConversorDeTemperatura{

    public GradosKaC(){
        super();
    }
    public float gradosKaC(){
        return this.getGradosIngresados()- 273.5f;
    }
}
