import criaturas.Criatura;

public class Batalha {
    public static int batalhar(Criatura minhaCriatura, Criatura adversaria) {
        Turno.repetirTurno(minhaCriatura, adversaria);
        return 1;
    }

    private static void mensagemVitoriaBatalha() {
        System.out.println("Parabéns! Você venceu a batalha!");
    }

    private static void mensagemDerrotaBatalha() {
        System.out.println("Que pena, você perdeu a batalha!");
    }
}
