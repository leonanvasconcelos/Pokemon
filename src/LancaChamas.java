
public class LancaChamas extends Fogo {
	public LancaChamas() {
		dano = 15;
	}

	@Override
	public int executar() {
		System.out.println("Lan�a Chamas!!!");
		return dano;
	}
}
