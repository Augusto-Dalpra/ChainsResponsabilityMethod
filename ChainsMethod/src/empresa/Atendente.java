package empresa;

public abstract class Atendente {

    private TipoProblema tipoProblemaQueResolve;
    private Atendente superior;

    public Atendente(TipoProblema tipoProblemaQueResolve, Atendente superior) {
        this.tipoProblemaQueResolve = tipoProblemaQueResolve;
        this.superior = superior;
    }

    public TipoProblema getTipoProblemaQueResolve() {
        return tipoProblemaQueResolve;
    }

    public Atendente getSuperior() {
        return superior;
    }

    public void setSuperior(Atendente superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoCargo();

    public String resolverProblema(Problema problema) {
        if (problema.getTipoProblema() == tipoProblemaQueResolve) {
            return getDescricaoCargo();
        } else if (superior != null) {
            return superior.resolverProblema(problema);
        } else {
            return "Problema não resolvido";
        }
    }
}