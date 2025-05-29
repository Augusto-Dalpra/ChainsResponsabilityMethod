package empresa;


public class SuporteNivel2 extends Atendente {

    public SuporteNivel2(Atendente superior) {
        super(TipoProblemaEmail.getInstance(), superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte Nível 2";
    }
}