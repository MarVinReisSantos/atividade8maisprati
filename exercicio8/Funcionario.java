import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public double calcularBonus() {
        return 0;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }
}

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario() + funcionario.calcularBonus();
        }
        return total;
    }

    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();
        sistema.adicionarFuncionario(new Gerente("Ana", 8000));
        sistema.adicionarFuncionario(new Desenvolvedor("Carlos", 5000));
        sistema.adicionarFuncionario(new Estagiario("Lucas", 2000));

        System.out.println("Total da folha de pagamento: " + sistema.calcularFolhaPagamento());
    }
}
