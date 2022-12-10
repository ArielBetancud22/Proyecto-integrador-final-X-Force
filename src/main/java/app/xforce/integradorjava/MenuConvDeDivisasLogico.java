
package app.xforce.integradorjava;


import app.xforce.integradorjava.operaciones.calculadora.Division;
import app.xforce.integradorjava.operaciones.calculadora.Multiplicacion;
import java.util.Scanner;
import errors.ValorNegativo;


public class MenuConvDeDivisasLogico {
       
    private MenuPrincipalGrafico menuPrincipalGrafico = new MenuPrincipalGrafico();
    
    private Scanner entrada = new Scanner(System.in);
    
    private MenuConvDeDivisasGrafico menuConvDeDivisasGrafico = new MenuConvDeDivisasGrafico();
    
    private TextoDeConverDeDivisas textoDeConverDeDivisas = new TextoDeConverDeDivisas();

    private Multiplicacion multiplicacion = new Multiplicacion();
    
    private Division division = new Division();
    

    
    public MenuConvDeDivisasLogico() {
    }
    
    public void menuConvDeDivisasLogico(){
            
            while (true) {
                try {
                    menuConvDeDivisasGrafico.menuConvDeDivisasGrafico();
                    menuPrincipalGrafico.ingresarOpcion();
                    Integer opcion = Integer.parseInt(entrada.nextLine());
                    if (opcion == 1){
                        textoDeConverDeDivisas.pesoDolar();
                        textoDeConverDeDivisas.entrada();
                        this.division.setValorA(Float.parseFloat(entrada.nextLine()));
                        this.textoDeConverDeDivisas.cambio();
                        this.division.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.division.divisionb());
                 
                    }else if (opcion == 2){
                        textoDeConverDeDivisas.dolarPeso();
                        textoDeConverDeDivisas.entrada();
                        this.multiplicacion.setValorA(Float.parseFloat(entrada.nextLine()));
                        textoDeConverDeDivisas.cambio();
                        this.multiplicacion.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.multiplicacion.multiplicacion());
                        
                    }else if (opcion == 3){
                        textoDeConverDeDivisas.pesoEuro();
                        textoDeConverDeDivisas.entrada();
                        this.division.setValorA(Float.parseFloat(entrada.nextLine()));
                        this.textoDeConverDeDivisas.cambio();
                        this.division.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.division.division());
                        
                    }else if (opcion == 4){
                        textoDeConverDeDivisas.euroPeso();
                        textoDeConverDeDivisas.entrada();
                        this.multiplicacion.setValorA(Float.parseFloat(entrada.nextLine()));
                        textoDeConverDeDivisas.cambio();
                        this.multiplicacion.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.multiplicacion.multiplicacion());
                        
                    }else if (opcion == 5){
                        textoDeConverDeDivisas.dolarEuro();
                        textoDeConverDeDivisas.entrada();
                        this.division.setValorA(Float.parseFloat(entrada.nextLine()));
                        this.textoDeConverDeDivisas.cambio();
                        this.division.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.division.divisionb());
                        
                    }else if (opcion == 6){
                        textoDeConverDeDivisas.euroDolar();
                        textoDeConverDeDivisas.entrada();
                        this.multiplicacion.setValorA(Float.parseFloat(entrada.nextLine()));
                        textoDeConverDeDivisas.cambio();
                        this.multiplicacion.setValorB(Float.parseFloat(entrada.nextLine()));
                        this.ifValorMenor();
                        textoDeConverDeDivisas.salida(this.multiplicacion.multiplicacion());
                        
                    }else if (opcion == 7){
                        break;
                    }
                    else {
                        menuPrincipalGrafico.errorNumeroIncorrecto(opcion);
                      
                    }
                } catch(ValorNegativo val){
                    menuConvDeDivisasGrafico.numMenor();
                } catch (Exception e) {
                    menuPrincipalGrafico.errorNoNumero();
                }
            }
        
    }
    
    
    public void ifValorMenor() throws ValorNegativo {
        if (this.division.getValorA() < 0 || this.division.getValorB() < 0) {
            throw new ValorNegativo("Valor menor a 0");
        }
    }
    
}
