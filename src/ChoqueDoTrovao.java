
public class ChoqueDoTrovao extends Eletrica {
	public ChoqueDoTrovao() {
		dano = 13;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Choque do Trovão!!!");
		return dano;
	}

}
