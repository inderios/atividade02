public class SistemaCadastramento implements DepartamentoInt, EmpregadoInt{
    @Override
    public boolean adicionarEmpregado(Empregado e, Depatarmento d) {
        for (Empregado m: d.getEmpregadosLista()) {
            if (m.equals(e)) {
                return false;
            } else {
                d.getEmpregadosLista().add(e);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removerEmpregado(Empregado e, Depatarmento d) {
        for (Empregado m: d.getEmpregadosLista()) {
            if (m.equals(e)) {
                return true;
            } else {
                d.getEmpregadosLista().add(e);
                return false;
            }
        }
        return false;
    }

    @Override
    public void registrar() {

    }

    @Override
    public void atualizar() {

    }
}
