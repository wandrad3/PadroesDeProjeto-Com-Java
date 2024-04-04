package one.digitalinnovation.gof.singleton;


/**
 * Sigleton "preguiçoso"
 * @author wandrad3_
 */
public class SingletonLazy {

	private static SingletonLazy instancy;

	private SingletonLazy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazy getInstacy() {
		
		if(instancy == null) {
			instancy = new SingletonLazy();
		}
		return instancy;
	}
	
}
