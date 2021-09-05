import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
	    Scanner ent = new Scanner(System.in);
	        int num, contadorPar = 0, contadorImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = ent.nextInt();
	            
	            if(num % 2 == 0){
	            	contadorPar++;
	            }

	            
	            if(num % 2 == 1){
	            	contadorImpar++;
	            }
	            
	        }
	        
	        System.out.println("Voce informou um total de " + contadorPar + " números pares \n");
	         System.out.println("e " + contadorImpar + " números ímpares");
	  }
	}