package lapr.project.ui;

import lapr.project.model.CalculatorExample;
import java.util.Scanner;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

	/**
	 * Private constructor to hide implicit public one.
	 */
	private Main(){

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int cont;
            char resposta;
		CalculatorExample calculatorExample = new CalculatorExample();
		System.out.println(calculatorExample.sum(3, 5));
                //UC2
                /*do{
                    
                    System.out.println("Continuar a introduzir?");
                    resposta = ler.next();
                }while(resposta == 's' || resposta == 'S')*/
	}

}
