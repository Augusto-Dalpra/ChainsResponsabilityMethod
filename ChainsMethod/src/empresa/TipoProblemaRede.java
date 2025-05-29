package empresa;

public class TipoProblemaRede implements TipoProblema {
    private static final TipoProblemaRede instance = new TipoProblemaRede();

    private TipoProblemaRede() {}

    public static TipoProblemaRede getInstance() {
        return instance;
    }
}