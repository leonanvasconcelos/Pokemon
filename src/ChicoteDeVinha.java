
public class ChicoteDeVinha extends Grama {
	public ChicoteDeVinha() {
		dano = 14;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Chicote de Vinhas!!!");
		if (vantagemElemental(elementoAlvo)) {
			System.out.println("É extremamente efetivo!");
			return (float) (dano * 1.3);
		}
		return dano;
	}
}
