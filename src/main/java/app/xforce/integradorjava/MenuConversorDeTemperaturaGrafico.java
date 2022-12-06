//Menu grafico del conversor  de temperaturas
package app.xforce.integradorjava;

public class MenuConversorDeTemperaturaGrafico {
    public void menuGraficoConversor(){
        System.out.println("Menu");
        System.out.println("Opción: #1 Grados Celsius a Kelvin");
        System.out.println("Opción: #2 Grados Kelvin a Celsius");
        System.out.println("Opción: #3 Grados Fahrenheit a Rankine");
        System.out.println("Opción: #4 Grados Rankine a Fahrenheit");
        System.out.println("Opción: #5 Grados Celsius a Fahrenheit");
        System.out.println("Opción: #6 Grados Fahrenheit a Celsius");
        System.out.println("Opción: #7");
    }
    public void ingresaropcion(){
    System.out.println("Ingresar una opció");
}
public void errorNumeroIncorrecto(Integer num){
        System.out.println("Numero de opcion incorrecto = "+ num );
    }
    
    public void errorNoNumero(){
        System.out.println("La Opcion no es un numero");
    }

    void menuConversorDeTemperaturaGrafico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
