package subsistema.cep;

public class CepApi {

	private static CepApi instancy = new CepApi();

	private CepApi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static CepApi getInstacy() {
		return instancy;
	}
	
	public String recuperarCidade() {
		return "Araraquara";

	}
	
	public String recuperarEstado() {
		return "SP";

	}
}
