package programacaoDeAltoDesempenho2;

public class BaixaPrioridade extends Thread{
	
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
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
