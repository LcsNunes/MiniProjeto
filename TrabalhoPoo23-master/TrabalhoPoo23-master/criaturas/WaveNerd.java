package criaturas;

public class WaveNerd extends Criatura {
    private String nome = "criaturas.WaveNerd";

    public WaveNerd() {
        super(Tipos.AGUA);
    }

    @Override
    public void levarAtaqueElemental(Criatura criaturaAdversaria, Criatura minhaCriatura) {
        int dano = 0;
        switch (super.getTipo()) {
            case FOGO:
            case AR:
                calcularDano(criaturaAdversaria, minhaCriatura);
                break;
            case TERRA:
                dano = (criaturaAdversaria.getPoder() * criaturaAdversaria.getAtaque()) / (getDefesa() * 2);
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
        return new Criatura[]{new BreezeHacker(), new StoneDev(), new BurnCoder()};
    }
}