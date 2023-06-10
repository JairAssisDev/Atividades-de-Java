package Conversao;

public class TestaConversao {
	
	public static void main(String[]args) {
		double salario = 1270.50;
		int valor = (int)salario;
		System.out.println(valor);
		//64byte de memoria
		long numeroGrade = 12323213123123213l;
		System.out.println("numeroGrade: "+numeroGrade);
		//32byte de memoria
		int numeroNormal = 1231232222;
		System.out.println("numeroNormal: "+numeroNormal);
		//16byte de memoria
		short numeroPequeno = 3333;
		System.out.println("numeroPequeno: "+numeroPequeno);
		//8byte de memoria 
		byte numeroMenor = 99;
		
		System.out.println("numeroMenor: "+numeroMenor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
		
		//64byte de memoria
		double pontoFutuante1 =3.14222222222222222222222222;
		System.out.println("pontoFutuante 64 byte :"+pontoFutuante1);
		//32byte de memoria 
		float pontoFutuante2 =3.3222222222222222222222f;
		System.out.println("pontoFutuante 32 byte tem que ter f no final:"+pontoFutuante2);
		
		

	}
}
