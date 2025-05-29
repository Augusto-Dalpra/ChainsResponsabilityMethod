package empresa;

public class Administrador extends Atendente {

    public Administrador(Atendente superior) {
        super(TipoProblemaRede.getInstance(), superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Administrador";
    }
}