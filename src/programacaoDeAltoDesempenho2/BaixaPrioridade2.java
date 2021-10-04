package programacaoDeAltoDesempenho2;

public class BaixaPrioridade2 extends Thread {
	
	public void run() {
		setPriority(1);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Baixa Prioridade...");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.exit(0);
			}
		}
	}

}
