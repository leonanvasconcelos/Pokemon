
public class Charmander extends TipoFogo {
	public Charmander() {
		vida = 70;
		nome = "Charmander";
		habilidadeUm = new LancaChamas();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar(alvo.tipo), habilidadeUm.desvantagemElemental(alvo.tipo));
	}
}
