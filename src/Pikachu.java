
public class Pikachu extends TipoEletrico {
	public Pikachu() {
		vida = 65;
		nome = "Pikachu";
		habilidadeUm = new ChoqueDoTrovao();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar(alvo.tipo), habilidadeUm.desvantagemElemental(alvo.tipo), habilidadeUm.vantagemElemental(alvo.tipo));
	}
}
