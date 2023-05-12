import criaturas.Criatura;

public class Turno {
    public static boolean repetirTurno(Criatura minhaCriatura, Criatura adversaria) {

        if (minhaCriatura.getVelocidade() > adversaria.getVelocidade()) {
            //chama método eu começo
        } else {
            //chama método adversário começa
        }

        do {
            //if ()
            int opcao = Menus.criarMenuAtaque();
            switch (opcao) {
                case 1:
                    adversaria.levarAtaque(adversaria, minhaCriatura);
                    break;
                case 2:
                    adversaria.levarAtaqueElemental(minhaCriatura, adversaria);
                    break;
            }
        } while (minhaCriatura.getPontoDeVida() > 0 || adversaria.getPontoDeVida() > 0);
        {
            System.out.println("Placeholder");
        }
        return true;
    }
}


