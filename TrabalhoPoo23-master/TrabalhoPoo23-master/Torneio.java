import criaturas.*;

import java.util.ArrayList;
import java.util.Collections;

public class Torneio {
    public void iniciar() {
        Menus.criarMenuPrincipal();
        int opcao = Menus.criarMenuCriaturas();
        Criatura minhaCriatura;
        ArrayList<Criatura> criaturasAdversarias = new ArrayList<Criatura>();

        switch (opcao) {
            case 1:
                minhaCriatura = new StoneDev();
                criaturasAdversarias.add(new WaveNerd());
                criaturasAdversarias.add(new BurnCoder());
                criaturasAdversarias.add(new BreezeHacker());
                Collections.shuffle(criaturasAdversarias);
                break;
            case 2:
                minhaCriatura = new WaveNerd();
                criaturasAdversarias.add(new StoneDev());
                criaturasAdversarias.add(new BurnCoder());
                criaturasAdversarias.add(new BreezeHacker());
                Collections.shuffle(criaturasAdversarias);
                break;
            case 3:
                minhaCriatura = new BurnCoder();
                criaturasAdversarias.add(new WaveNerd());
                criaturasAdversarias.add(new StoneDev());
                criaturasAdversarias.add(new BreezeHacker());
                Collections.shuffle(criaturasAdversarias);
                break;
            case 4:
                minhaCriatura = new BreezeHacker();
                criaturasAdversarias.add(new StoneDev());
                criaturasAdversarias.add(new BurnCoder());
                criaturasAdversarias.add(new WaveNerd());
                Collections.shuffle(criaturasAdversarias);
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + opcao);
        }

        Menus.criarMenuTorneio();
        Batalha.batalhar(minhaCriatura, criaturasAdversarias.get(0));
    }

    public void escolherStone() {
        // andré criou não sei qual o motivo
    }

    public static void mensagemCampeao() {
        System.out.println("Parabéns! Você venceu o jogo!");
    }
}
