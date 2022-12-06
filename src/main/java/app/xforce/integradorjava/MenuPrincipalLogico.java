
package app.xforce.integradorjava;

import java.util.Scanner;

public class MenuPrincipalLogico {
    
    private Scanner entrada = new Scanner(System.in);
    
    private MenuPrincipalGrafico menuPrincipalGrafico = new MenuPrincipalGrafico();
    
    
    public MenuPrincipalLogico() {
    }
    
    public void menuPrincipalLogico(){
        
        
        while (true) {
            
            menuPrincipalGrafico.menuPrincipalGrafico();
            
            try {
                Integer opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 1){
                    MenuCalculadoraLogico menuCalculadoraLogico = new MenuCalculadoraLogico();
                    menuCalculadoraLogico.menuCalculadoraLogico();
                } else if( opcion == 2 ){

                } else if(opcion  == 3 ){

                } else if(opcion  == 4 ){
                    break;
                } else {
                    menuPrincipalGrafico.errorNumeroIncorrecto(opcion);
                }  
            } catch (Exception e) {
                menuPrincipalGrafico.errorNoNumero();
            }
            
        
                    
        }
        
    }
}
