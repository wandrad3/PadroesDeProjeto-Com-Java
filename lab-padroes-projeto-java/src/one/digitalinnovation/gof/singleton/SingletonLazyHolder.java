package one.digitalinnovation.gof.singleton;

/**
 * Sigleton "lazy holder"
 * 
 * @author wandrad3_
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancy = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static SingletonLazyHolder getInstacy() {

		return InstanceHolder.instancy;
	}

}
