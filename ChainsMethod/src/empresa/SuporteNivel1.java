package empresa;

public class SuporteNivel1 extends Atendente {

    public SuporteNivel1(Atendente superior) {
        super(TipoProblemaSenha.getInstance(), superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte Nível 1";
    }
}