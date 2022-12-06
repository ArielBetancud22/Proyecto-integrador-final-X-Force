
package app.xforce.integradorjava.operaciones.calculadora;

public class Resta extends Calculos {
    Resta(){
        super();
    }
    
    public float resta(){
        return this.getValorA() - this.getValorB();
    }
}
