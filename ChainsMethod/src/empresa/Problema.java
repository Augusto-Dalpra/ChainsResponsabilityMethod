package empresa;


public class Problema {
    private TipoProblema tipoProblema;

    public Problema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}