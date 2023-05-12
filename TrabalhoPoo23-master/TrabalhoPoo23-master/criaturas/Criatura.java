package criaturas;

import java.util.Random;

public abstract class Criatura {
	private static final Random random = new Random();
	private int poder;
	private int ataque;
	private int defesa;
	private int velocidade;
	private int pontoDeVida;
	private int pontosDeVidaInicial;
	private Tipos tipo;
	
	public Criatura(Tipos tipo) {
		this.poder = 10 + random.nextInt(21);
		this.ataque = 5 + random.nextInt(11);
		this.defesa = 5 + random.nextInt(11);
		this.velocidade = 1 + random.nextInt(10);
		this.pontoDeVida = 200 + random.nextInt(201);
		this.pontosDeVidaInicial = this.pontoDeVida;
		this.tipo = tipo;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPontoDeVida() {
		return pontoDeVida;
	}

	public void setPontoDeVida(int PontoDeVida) {
		this.pontoDeVida = PontoDeVida;
	}
	
	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}

	public void setPontosDeVidaInicial() {
		setPontoDeVida(this.pontosDeVidaInicial);
	}

	public void receberDano (int dano) {
		setPontoDeVida(getPontoDeVida() - dano);
	}
	
	// Metodos
	@Override
	public String toString() {
		return String.format("Poder: %d%nAtaque: %d%nDefesa: %d%nVelocidade: %d%nPontos de vida: %d",
				this.poder,this.ataque,this.defesa,
				this.velocidade,this.pontoDeVida);
	}
	
	public void levarAtaque(Criatura criaturaAdversaria, Criatura minhaCriatura) {
		calcularDano(criaturaAdversaria, minhaCriatura);
	}
	
	public abstract void levarAtaqueElemental(Criatura adversaria, Criatura minhaCriatura);
	
	public void atacar(Criatura criaturaSendoAtacada, Criatura minhaCriatura){
		criaturaSendoAtacada.levarAtaque(minhaCriatura ,criaturaSendoAtacada);
	}
	public void mostrarAtributosDaCriatura (){
		System.out.printf("\nEsses são os atributos da sua criatura:\nTipo: %s\nPontos de vida: %d\nPoder: %d\nAtaque: %d\nDefesa: %d\nVelocidade: %d\n",
		getTipo().toString(),getPontoDeVida(),getPoder(),getAtaque(),getDefesa(),getVelocidade());
	}
	protected void calcularDano(Criatura adversaria, Criatura minhaCriatura) {
		int dano = (adversaria.getPoder() * adversaria.getAtaque()) / minhaCriatura.getDefesa();
		minhaCriatura.receberDano(dano);
	}
	public abstract void criarMensagemDeAtaque();

	public abstract Criatura[] criarInimigos();
}
	