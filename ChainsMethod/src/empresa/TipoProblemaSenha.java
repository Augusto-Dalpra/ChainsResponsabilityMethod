package empresa;

public class TipoProblemaSenha implements TipoProblema {
    private static final TipoProblemaSenha instance = new TipoProblemaSenha();

    private TipoProblemaSenha() {}

    public static TipoProblemaSenha getInstance() {
        return instance;
    }
}