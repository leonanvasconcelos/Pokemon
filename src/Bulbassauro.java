
public class Bulbassauro extends TipoGrama {
	public Bulbassauro() {
		vida = 80;
		nome = "Bulbassauro";
		habilidadeUm = new ChicoteDeVinha();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar(alvo.tipo), habilidadeUm.desvantagemElemental(alvo.tipo), habilidadeUm.vantagemElemental(alvo.tipo));
	}
}
