
public class LancaChamas extends Fogo {
	public LancaChamas() {
		dano = 15;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Lança Chamas!!!");
		return dano;
	}
}
