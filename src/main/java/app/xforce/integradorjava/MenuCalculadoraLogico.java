//Menu logico de la calculadora
package app.xforce.integradorjava;

import java.util.Scanner;

public class MenuCalculadoraLogico {
    
    private Scanner entrada = new Scanner(System.in);
        
    private MenuCalculadoraGrafico menuCalculadoraGrafico = new MenuCalculadoraGrafico();
    
    public MenuCalculadoraLogico(){
        super();
    }
    
    public void menuCalculadoraLogico(){
        
        while (true) {
            menuCalculadoraGrafico.menuCalculadoraGrafico();
            Integer opcion = Integer.parseInt(entrada.nextLine());
            try {
                if (opcion == 1) {
                }else if(opcion == 2){
                
                }else if(opcion == 3){
                
                }else if(opcion == 4){
                
                }else if(opcion == 5){
                    break;
                }
                else {
                    menuCalculadoraGrafico.errorNumeroIncorrecto(opcion);
                }
            } catch (Exception e) {
                menuCalculadoraGrafico.errorNoNumero();
            }
        }
    }
}
