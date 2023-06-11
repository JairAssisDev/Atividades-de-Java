package lacodeRepeticao;

public class TestarLacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int mutiplicador=1;mutiplicador<=10;mutiplicador++) {
			System.out.println("----------------");
			System.out.println("tabuada do " + mutiplicador);
			System.out.println("----------------");
			for(int numero=1;numero<=10;numero++) {
				int total = numero *mutiplicador;
				System.out.println("Essa é a tabuada de "+mutiplicador);
				System.out.println(numero+" x "+mutiplicador+ " = "+total );
			}
		}
	}

}
