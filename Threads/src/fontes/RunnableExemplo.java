package fontes;

public class RunnableExemplo implements Runnable {
	public void run () {
		for (int i = 1; i <= 10; i++) {
         		System.out.println ("Runnable: " + i);
      	}
   	}

}
