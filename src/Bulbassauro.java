
public class Bulbassauro extends Pokemon {
	public Bulbassauro() {
		vida = 80;
		nome = "Bulbassauro";
		habilidadeUm = new ChicoteDeVinha();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar());
	}
}
