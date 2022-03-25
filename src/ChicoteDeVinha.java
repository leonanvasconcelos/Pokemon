
public class ChicoteDeVinha extends Grama {
	public ChicoteDeVinha() {
		dano = 14;
	}

	@Override
	public int executar() {
		System.out.println("Chicote de Vinhas!!!");
		return dano;
	}
}
