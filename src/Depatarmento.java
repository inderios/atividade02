import java.util.ArrayList;
import java.util.Objects;

public class Depatarmento implements Comparable<Depatarmento>{
    private String departamentoId;
    private String nomeDepartamento;
    private ArrayList<Empregado> empregadosLista;

    public ArrayList<Empregado> getEmpregadosLista() {
        return empregadosLista;
    }

    public void setEmpregadosLista(ArrayList<Empregado> empregadosLista) {
        this.empregadosLista = empregadosLista;
    }

    public Depatarmento(String departamentoId, String nomeDepartamento, ArrayList<Empregado> empregadosLista) {
        this.departamentoId = departamentoId;
        this.nomeDepartamento = nomeDepartamento;
        this.empregadosLista = empregadosLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depatarmento that = (Depatarmento) o;
        return Objects.equals(departamentoId, that.departamentoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamentoId);
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    @Override
    public int compareTo(Depatarmento o) {
        return 0;
    }
}
