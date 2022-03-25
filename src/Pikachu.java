
public class Pikachu extends Pokemon {
	public Pikachu() {
		vida = 65;
		nome = "Pikachu";
		habilidadeUm = new ChoqueDoTrovao();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar());
	}
}
