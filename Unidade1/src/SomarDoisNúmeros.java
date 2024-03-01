import java.util.Scanner;

public class SomarDoisNúmeros {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		resultado = num1 + num2;
		
		System.out.print("Resultado = " + resultado);
	}
}
