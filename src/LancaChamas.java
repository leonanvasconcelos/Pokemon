
public class LancaChamas extends Fogo {
	public LancaChamas() {
		dano = 15;
	}

	@Override
	public int executar() {
		System.out.println("Lança Chamas!!!");
		return dano;
	}
}
