
public class ChoqueDoTrovao extends Eletrica {
	public ChoqueDoTrovao() {
		dano = 13;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Choque do Trovão!!!");
		if (vantagemElemental(elementoAlvo)) {
			System.out.println("É extremamente efetivo!");
			return (float) (dano * 1.3);
		}
		return dano;
	}

}
