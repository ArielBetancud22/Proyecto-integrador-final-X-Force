//Conversor de grados Centigrados a grados Farenheit

package app.xforce.integradorjava.operaciones.convTemperatura;

public class GradosCaF extends ConversorDeTemperatura {

    public GradosCaF(){
        super();
    }
    
    public float gradosCaF (){
        return this.getGradosIngresados()* 1.8f + 32;
    }
}
