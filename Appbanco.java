package test;

public class Appbanco {
	public static void main (String[] args) {
		Banco minhaConta = new Banco();
		
		minhaConta.dono = "Jair Victor";
		minhaConta.numerodaConta = 1233323;
		minhaConta.limite= 100000.0;
		minhaConta.saldo = 3000.0;
		System.out.println("Dono da conta : " + minhaConta.dono  );
		System.out.println("Numero da conta : " + minhaConta.numerodaConta  );
		System.out.println("O limite da sua conta é de : " + minhaConta.limite  );
		System.out.println("Seu saldo na sua conta é de : " + minhaConta.saldo  );
	}
}
