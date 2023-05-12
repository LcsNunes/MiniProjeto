package criaturas;

public class StoneDev extends Criatura {
    private String nome = "criaturas.StoneDev";

    public StoneDev() {
        super(Tipos.TERRA);
    }

    @Override
    public void levarAtaqueElemental(Criatura adversaria, Criatura minhaCriatura) {
        int dano = 0;
        switch (minhaCriatura.getTipo()) {
            case AGUA:
            case FOGO:
                calcularDano(adversaria, minhaCriatura);
                break;
            case AR:
                dano = (adversaria.getPoder() * adversaria.getAtaque()) / (getDefesa() * 2);
                receberDano(dano);
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }

    @Override
    public void criarMensagemDeAtaque() {
        // criar mensagem personalizada para a classe
    }

    @Override
    public Criatura[] criarInimigos() {
        return new Criatura[]{new BreezeHacker(), new WaveNerd(), new BurnCoder()};
    }
}