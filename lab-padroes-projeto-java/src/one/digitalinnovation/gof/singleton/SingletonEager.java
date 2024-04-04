package one.digitalinnovation.gof.singleton;


/**
 * Sigleton "apressado"
 * @author wandrad3_
 */
public class SingletonEager {

	private static SingletonEager instancy = new SingletonEager();

	private SingletonEager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonEager getInstacy() {
		return instancy;
	}
	
}
