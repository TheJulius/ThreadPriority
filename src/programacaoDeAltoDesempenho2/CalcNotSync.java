package programacaoDeAltoDesempenho2;

public class CalcNotSync implements Runnable {
	
	private int soma;
	private int[] vet;
	private String nome;
	private static CalcNotSync_Calc calc = new CalcNotSync_Calc();
	
	public synchronized int somaVet(int[] vet) {
		soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
			System.out.println(Thread.currentThread().getName() + 
								" - somando " + vet[i] + 
								" - total = " + soma);
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return soma;
	}
	
	public CalcNotSync (String nome, int[] vet) {
		this.nome = nome;
		this.vet = vet;
		new Thread(this.nome).start();
	}
	
	public void run() {
		System.out.println("Inicio de " + nome);
		int soma = calc.somaVet(vet);
		System.out.println("Fim de " + nome + " - soma = " + soma);
	}

}
