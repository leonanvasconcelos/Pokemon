
public class LancaChamas extends Fogo {
	public LancaChamas() {
		dano = 15;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Lan�a Chamas!!!");
		if (vantagemElemental(elementoAlvo)) {
			System.out.println("� extremamente efetivo!");
			return (float) (dano * 1.3);
		}
		return dano;
	}
}
