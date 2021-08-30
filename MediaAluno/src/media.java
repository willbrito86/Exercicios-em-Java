import java.util.Scanner;

public class media {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); 		
	    double nota1, nota2, nota3, nota4, media;
	    
	    System.out.print("Informe as quatro notas: ");
	    nota1 = teclado.nextDouble();
	    nota2 = teclado.nextDouble();
	    nota3 = teclado.nextDouble();
	    nota4 = teclado.nextDouble();
	    
	    
	    media = (nota1 + nota2 + nota3 + nota4) / 4;
	    System.out.println("Prezado Aluno(a), sua média foi: " + media);
	    
	    
	    if(media >= 7.0){
	        System.out.println("O aluno foi aprovado");
	      }
	      else{
	        System.out.println("O aluno foi reprovado"); 
	      }
	       
	      System.out.println("\n");	     

	}

}
