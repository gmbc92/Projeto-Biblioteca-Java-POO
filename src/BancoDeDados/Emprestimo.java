package BancoDeDados;

import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public class Emprestimo {

    private String codigo_Emprestimo;
    private ArrayList<Emprestimo_Livro> livro;
    private Aluno aluno;
    private Funcionario funcionario;
    private String data_Do_Emprestimo;
    private String data_da_Devolucao;
    
     public Emprestimo (){
        aluno = new Aluno();
        funcionario = new Funcionario();
        livro = new ArrayList<>();
    }

    public String getcodigo_Emprestimo() {
        return codigo_Emprestimo;
    }

    public void setcodigo_Emprestimo(String codigo_Emprestimo) {
        this.codigo_Emprestimo = codigo_Emprestimo;
    }

    public ArrayList<Emprestimo_Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Emprestimo_Livro> livro) {
        this.livro = livro;
    }


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getData_Do_Emprestimo() {
        return data_Do_Emprestimo;
    }

    public void setData_Do_Emprestimo(String data_Do_Emprestimo) {
        this.data_Do_Emprestimo = data_Do_Emprestimo;
    }

    public String getData_da_Devolucao() {
        return data_da_Devolucao;
    }

    public void setData_da_Devolucao(String data_da_Devolucao) {
        this.data_da_Devolucao = data_da_Devolucao;
    }

    

    
}
