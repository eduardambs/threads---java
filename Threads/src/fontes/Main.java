package fontes;

public class Main {
	public static void main (String [] args) {

		//new ThreadExemplo ().start ();
	    //new Thread(new RunnableExemplo ()).start ();
	    
	    PrintThread1 a = new PrintThread1("*");
	    PrintThread1 b = new PrintThread1("$");
	    PrintThread1 c = new PrintThread1("=");
	    a.start(); 
	    b.start(); 
	    c.start(); 

	}
}
