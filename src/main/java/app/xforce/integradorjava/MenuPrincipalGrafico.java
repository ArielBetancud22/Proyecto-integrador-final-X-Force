package app.xforce.integradorjava;

public class MenuPrincipalGrafico {

    public MenuPrincipalGrafico() {
        super();
    }        
    public void menuPrincipalGrafico(){
        System.out.println("MENU");
        System.out.println("Opción #1 Calculadora");
        System.out.println("Opción #2 Conversor de Monedas");
        System.out.println("Opción #3 Conversor de Temperaturas");
        System.out.println("Opción #4 Salir");
        System.out.println("");
    }
    
    public void ingresarOpcion(){
        System.out.println("Ingrese opcion: ");
    }
   
    public void errorNumeroIncorrecto(Integer num){
        System.out.println("Numero de opcion incorrecto = "+ num );
    }
    
    public void errorNoNumero(){
        System.out.println("La Opcion no es un numero");
    }
    
}
