//Menu logico de la calculadora
package app.xforce.integradorjava;

import app.xforce.integradorjava.operaciones.calculadora.Division;
import app.xforce.integradorjava.operaciones.calculadora.Multiplicacion;
import app.xforce.integradorjava.operaciones.calculadora.Resta;
import app.xforce.integradorjava.operaciones.calculadora.Suma;
import java.util.Scanner;

public class MenuCalculadoraLogico {
    
    private Scanner entrada = new Scanner(System.in);
        
    private MenuCalculadoraGrafico menuCalculadoraGrafico = new MenuCalculadoraGrafico();
    
    private Suma suma = new Suma();
    
    private Resta resta = new Resta();
    
    private Multiplicacion multiplicacion = new Multiplicacion();
    
    private MenuPrincipalGrafico menuPrincipalGrafico = new MenuPrincipalGrafico();
    
    private Division division = new Division();
    
    private SalidaDeTexto salidaDeTexto = new SalidaDeTexto();
  
    
    public MenuCalculadoraLogico(){
        super();
    }
    
    public void menuCalculadoraLogico(){
        
        while (true) {
            menuCalculadoraGrafico.menuCalculadoraGrafico();
            menuCalculadoraGrafico.ingresaropcion();
            Integer opcion = Integer.parseInt(entrada.nextLine());
            try {
                if (opcion == 1) {//Suma
                    this.salidaDeTexto.entradaA();
                    this.suma.setValorA(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.entradaB();
                    this.suma.setValorB(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.resultado(this.suma.suma());
                }else if(opcion == 2){//Resta
                    this.salidaDeTexto.entradaA();
                    this.resta.setValorA(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.entradaB();
                    this.resta.setValorB(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.resultado(this.resta.resta());
                    
                }else if(opcion == 3){//Multiplicacion
                    this.salidaDeTexto.entradaA();
                    this.multiplicacion.setValorA(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.entradaB();
                    this.multiplicacion.setValorB(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.resultado(this.multiplicacion.multiplicacion());
                }else if(opcion == 4){//Division
                    this.salidaDeTexto.entradaA();
                    this.division.setValorA(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.entradaB();
                    this.division.setValorB(Float.parseFloat(entrada.nextLine()));
                    this.salidaDeTexto.resultado(this.division.division());
                
                }else if(opcion == 5){
                    break;
                }
                else {
                    menuCalculadoraGrafico.errorNumeroIncorrecto(opcion);
                }
            } catch (Exception e) {
                menuPrincipalGrafico.errorNoNumero();
            }
        }
    }
}
