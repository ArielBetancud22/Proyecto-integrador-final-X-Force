//Menu grafico del conversor  de temperaturas
package app.xforce.integradorjava;

public class MenuConversorDeTemperaturaGrafico {
    public void menuGraficoConversor(){
        System.out.println("Menu Conversor de temperatura");
        System.out.println("Opción: #1 Grados Celsius a Kelvin");
        System.out.println("Opción: #2 Grados Kelvin a Celsius");
        System.out.println("Opción: #3 Grados Fahrenheit a Rankine");
        System.out.println("Opción: #4 Grados Rankine a Fahrenheit");
        System.out.println("Opción: #5 Grados Celsius a Fahrenheit");
        System.out.println("Opción: #6 Grados Fahrenheit a Celsius");
        System.out.println("Opción: #7 Salir");
    }
    public void ingresaropcion(){
    System.out.println("Ingresar una opción");
}
public void errorNumeroIncorrecto(Integer num){
        System.out.println("Numero de opcion incorrecto = "+ num );
    }
    
    public void errorNoNumero(){
        System.out.println("La Opcion no es un numero");
    }

    
    
}
