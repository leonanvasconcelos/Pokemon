
public class ChoqueDoTrovao extends Eletrica {
	public ChoqueDoTrovao() {
		dano = 13;
	}

	@Override
	public int executar() {
		System.out.println("Choque do Trov�o!!!");
		return dano;
	}

}
