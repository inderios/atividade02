import java.util.ArrayList;
import java.util.List;

public class SistemaCadastramento implements DepartamentoInt, EmpregadoInt{
    private List<Empregado> todosEmpregados = new ArrayList<>();
    private List<Depatarmento> departamentos = new ArrayList<>();

    public List<Empregado> getTodosEmpregados() {
        return todosEmpregados;
    }

    public List<Depatarmento> getDepartamentos() {
        return departamentos;
    }
    @Override
    public void adicionarEmpregado(Empregado empregado, Depatarmento departamento) {
        todosEmpregados.add(empregado);
        departamento.getEmpregadosLista().add(empregado);
    }

    @Override
    public boolean removerEmpregado(Empregado e, Depatarmento d) {
        return d.getEmpregadosLista().remove(e);
    }

    @Override
    public Empregado atualizarEmpregadoNome(Depatarmento depatarmentoPrcurar, Empregado empregadoProcurar, String nome) {
        //todo
    }
    public Empregado atualizarEmpregadoID(Depatarmento depatarmentoPrcurar, Empregado empregadoProcurar, int numeroID) {
        //todo
    }
    public Empregado atualizarEmpregadoSalario(Depatarmento depatarmentoPrcurar, Empregado empregadoProcurar, String salario) {
        //todo
    }

    public void adicionarDepartamento (Depatarmento dep) {
        departamentos.add(dep);
    }
}
