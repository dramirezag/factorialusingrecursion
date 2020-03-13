/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfactorial;

import java.io.*;

public class AplicacionFactorial {
	   private static BufferedReader ent = new BufferedReader(
            new InputStreamReader(System.in));
    private static PrintWriter sal = new PrintWriter(System.out, true);
    private static PrintWriter salErr = new PrintWriter(System.err, true);

	private static int factorial (int n) {
		if (n  == 0) {
			return 1;
		}
		else {
			return n * factorial (n-1);
		}
	}
        
public static void main(String[] args) throws IOException {
		int numero;
		
	    
            boolean error = true;
            while(error){
                salErr.println("Da el numero");
                try{
                numero = Integer.parseInt(ent.readLine());
                if(numero>=0){
	        sal.println("Factorial de " + numero + " = " + factorial(numero));
                error = false;
                }
                else{
                salErr.println("ingrese un numero entero positivo");
                }
                }
                catch(NumberFormatException e){
                    
                salErr.println("ingrese un numero entero positivo " +e);
                }
            }
	    
	}
}
