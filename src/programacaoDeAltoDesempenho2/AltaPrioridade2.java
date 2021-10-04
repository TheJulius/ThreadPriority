package programacaoDeAltoDesempenho2;

public class AltaPrioridade2 extends Thread{
	
	public void run() {
		setPriority(10);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Alta Prioridade...");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.exit(0);
			}
		}
	}

}
