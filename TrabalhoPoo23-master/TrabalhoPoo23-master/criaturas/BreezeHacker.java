package criaturas;

public class BreezeHacker extends Criatura {
    private String nome = "criaturas.BreezeHacker";

    public BreezeHacker() {
        super(Tipos.AR);
    }

    @Override
    public void levarAtaqueElemental(Criatura adversaria, Criatura minhaCriatura) {
        int dano = 0;
        switch (adversaria.getTipo()) {
            case TERRA:
            case AGUA:
                calcularDano(adversaria, minhaCriatura);
                break;
            case FOGO:
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
        return new Criatura[]{new BurnCoder(), new StoneDev(), new WaveNerd()};
    }
}