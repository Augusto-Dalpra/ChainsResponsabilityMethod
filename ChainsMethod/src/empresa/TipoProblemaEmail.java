package empresa;

public class TipoProblemaEmail implements TipoProblema {
    private static final TipoProblemaEmail instance = new TipoProblemaEmail();

    private TipoProblemaEmail() {}

    public static TipoProblemaEmail getInstance() {
        return instance;
    }
}
