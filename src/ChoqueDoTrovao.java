
public class ChoqueDoTrovao extends Eletrica {
	public ChoqueDoTrovao() {
		dano = 13;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Choque do Trov�o!!!");
		if (vantagemElemental(elementoAlvo)) {
			System.out.println("� extremamente efetivo!");
			return (float) (dano * 1.3);
		}
		return dano;
	}

}
