package Negocio;

import BancoDeDados.Aluno;
import BancoDeDados.AlunoDAO;
import Interfaces.InterfaceAluno;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public class NegocioAluno implements InterfaceAluno {

    private AlunoDAO dao = new AlunoDAO();

    public void ValidarAluno(Aluno a) throws SQLException, Exception {

        if (a.getMatricula() == null) {
            throw new Exception("Informar o aluno");
        }
        if (a.getMatricula().length() > 30) {
            throw new Exception("A matricula do aluno deverá ter ao menos 5 dígitos");
        }
        if (a.getNome() == null) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().length() > 30) {
            throw new Exception("O nome do aluno não poderá ter mais de 50 caracteres");
        }
        if (a.getTelefone().length() <= 0 || a.getTelefone().length() >= 10) {
            throw new Exception("Digite um Numero de telefone válido de pelo menos 8 dígitos");
        }
        if (a.getTelefone().trim().equals("") == true) {
            throw new Exception("Informar o numero do Telefone.");
        }
        if (a.getTelefone() == null) {
            throw new Exception("Informar o numero do Telefone.");
        }
        if (a.getCPF() == null) {
            throw new Exception("Informar o numero do CPF.");
        }
        if (a.getCPF().trim().equals("") == true) {
            throw new Exception("Informar o numero do CPF.");
        }
        if (a.getLogin() == null) {
            throw new Exception("Informar o numero do Login.");
        }
        if (a.getLogin().trim().equals("") == true) {
            throw new Exception("Informar o numero do Login.");
        }
        if (a.getRG() == null) {
            throw new Exception("Informar o numero do RG.");
        }
        if (a.getRG().trim().equals("")) {
            throw new Exception("Informar o numero do RG.");
        }
        if (a.getSenha() == null) {
            throw new Exception("Informar o numero do Senha.");
        }
        if (a.getSenha().trim().equals("")) {
            throw new Exception("Informar o numero do Senha.");
        }
        if (a.getTipo() == null) {
            throw new Exception("Informar o numero do Tipo.");
        }
        if (a.getTipo().trim().equals("")) {
            throw new Exception("Informar o numero do Tipo.");
        }
    }

    public void ValidarMatricula(Aluno b) throws SQLException, Exception {

        if (b.getMatricula() == null) {
            throw new Exception("Informar o aluno");
        }
        if (b.getMatricula().length() > 30) {
            throw new Exception("A matricula do aluno deverá ter no máximo dígitos");
        }

        if (b.getMatricula().trim().equals("") == true) {
            throw new Exception("Informar a matricula do aluno");
        }
    }

    @Override
    public void createAluno(Aluno a) throws SQLException, Exception {
        ValidarAluno(a);
        dao.createAluno(a);
    }

    @Override
    public void deletAluno(Aluno a) throws SQLException, Exception {

        ValidarMatricula(a);
        dao.deletAluno(a);

    }

    @Override
    public void updateAluno(Aluno a) throws SQLException, Exception {
        ValidarAluno(a);
        dao.updateAluno(a);
    }

    @Override
    public ArrayList<Aluno> select() throws Exception {
        ArrayList<Aluno> aluno = new ArrayList<>();
        aluno = dao.select();
        return aluno;
    }

}
