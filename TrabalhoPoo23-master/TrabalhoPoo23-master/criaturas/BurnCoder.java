package criaturas;

public class BurnCoder extends Criatura {
    private String nome = "criaturas.BurnCoder";

    public BurnCoder() {
        super(Tipos.FOGO);
    }

    @Override
    public void levarAtaqueElemental(Criatura adversaria, Criatura minhaCriatura) {
        int dano = 0;
        switch (adversaria.getTipo()) {
            case TERRA:
            case AR:
                calcularDano(adversaria, minhaCriatura);
                break;
            case AGUA:
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
        return new Criatura[]{new BreezeHacker(), new StoneDev(), new WaveNerd()};
    }
}