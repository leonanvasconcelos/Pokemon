
public class ChicoteDeVinha extends Grama {
	public ChicoteDeVinha() {
		dano = 14;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Chicote de Vinhas!!!");
		return dano;
	}
}
