package condicionais;

public class Testacondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int indade = 12;
		int quantidadePessoas=3;
		boolean acompanhado=quantidadePessoas>=2;
			
		System.out.println("valor de acompanhado = " + acompanhado);
		
		//or ||
		if (indade >= 18 || acompanhado==true) {
			System.out.println("voce é pode entra! "
					+ "seja bem vindo");
		} else {
            System.out.println("infelizmente você não pode entrar");
            }
		
		// and &&
		if (indade >= 18 && acompanhado==true) {
			System.out.println("voce é pode entra! "
					+ "seja bem vindo");
		} else {
            System.out.println("infelizmente você não pode entrar");
            }
        }
	}
