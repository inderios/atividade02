import java.util.Objects;

public class Empregado implements Comparable<Empregado> {
    private String nome;
    private int numeroID;
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Empregado(String nome, int numeroID) {
        this.nome = nome;
        this.numeroID = numeroID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return Objects.equals(numeroID, empregado.numeroID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroID);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    @Override
    public int compareTo(Empregado o) {
        if (this.getNumeroID() == o.numeroID) {
            return 0;
        } else if (this.getNumeroID() > o.getNumeroID()) {
            return 1;
        } else {
            return -1;// if this numeroId < o numeroId.
        }
    }
}
