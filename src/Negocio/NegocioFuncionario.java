package Negocio;

import BancoDeDados.Funcionario;
import BancoDeDados.FuncionarioDAO;
import Interfaces.InterfaceFuncionario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public class NegocioFuncionario implements InterfaceFuncionario {

    private FuncionarioDAO dao = new FuncionarioDAO();

    public void ValidarFuncionario(Funcionario a) throws Exception, SQLException {

        if (a.getNome() == null) {
            throw new Exception("Informar Nome do Funcionario");
        }
        if (a.getNome().length() > 30) {
            throw new Exception("Informar Nome do Funcionario com menos que 30 caracteres");
        }
        if (a.getNome().trim().equals("") == true) {
            throw new Exception("Informar Nome do Funcionario");
        }

        if (a.getCod_Funcionario() == null) {
            throw new Exception("Informar Codigo do Funcionario");
        }
        if (a.getCod_Funcionario().length() > 30) {
            throw new Exception("Informar Codigo do Funcionario com menos que 30 caracteres");
        }
        if (a.getCod_Funcionario().trim().equals("") == true) {
            throw new Exception("Informar Codigo do Funcionario");
        }

        if (a.getLogin() == null) {
            throw new Exception("Informar Login do Funcionario");
        }
        if (a.getLogin().length() > 30) {
            throw new Exception("Informar login do Funcionario com menos que 30 caracteres");
        }
        if (a.getLogin().trim().equals("") == true) {
            throw new Exception("Informar Login do Funcionario");
        }

        if (a.getRG() == null) {
            throw new Exception("Informar RG do Funcionario");
        }
        if (a.getRG().length() > 30) {
            throw new Exception("Informar RG do Funcionario com menos que 30 caracteres");
        }
        if (a.getRG().trim().equals("") == true) {
            throw new Exception("Informar RG do Funcionario");
        }

        if (a.getSenha() == null) {
            throw new Exception("Informar Senha do Funcionario");
        }
        if (a.getSenha().length() > 30) {
            throw new Exception("Informar Senha do Funcionario com menos que 30 caracteres");
        }
        if (a.getSenha().trim().equals("") == true) {
            throw new Exception("Informar Senha do Funcionario");
        }

        if (a.getTelefone() == null) {
            throw new Exception("Informar Telefone do Funcionario");
        }
        if (a.getTelefone().length() > 30) {
            throw new Exception("Informar Telefone do Funcionario com menos que 30 caracteres");
        }
        if (a.getTelefone().trim().equals("") == true) {
            throw new Exception("Informar Telefone do Funcionario");
        }

        if (a.getTipo() == null) {
            throw new Exception("Informar Tipo do Funcionario");
        }
        if (a.getTipo().length() > 30) {
            throw new Exception("Informar Tipo do Funcionario com menos que 30 caracteres");
        }
        if (a.getTipo().trim().equals("") == true) {
            throw new Exception("Informar Tipo do Funcionario");
        }

        if (a.getCPF() == null) {
            throw new Exception("Informar CPF do Funcionario");
        }
        if (a.getCPF().length() > 30) {
            throw new Exception("Informar CPF do Funcionario com menos que 30 caracteres");
        }
        if (a.getCPF().trim().equals("") == true) {
            throw new Exception("Informar CPF do Funcionario");
        }
    }

    public void ValidarCodFunc(Funcionario f) throws Exception, SQLException {

        NegocioFuncionario negocio = new NegocioFuncionario();

        if (f.getCod_Funcionario() == null) {
            throw new Exception("Informar Codigo do Funcionario");
        }
        if (f.getCod_Funcionario().length() > 30) {
            throw new Exception("Informar Codigo do Funcionario com menos que 30 caracteres");
        }
        if (f.getCod_Funcionario().trim().equals("") == true) {
            throw new Exception("Informar Codigo do Funcionario");
        }
    }

    @Override
    public void createFuncionario(Funcionario a) throws SQLException, Exception {

        ValidarFuncionario(a);
        dao.createFuncionario(a);

    }

    @Override
    public void deleteFuncionário(Funcionario a) throws SQLException, Exception {

        ValidarCodFunc(a);
        dao.deleteFuncionário(a);

    }

    @Override
    public void updateFuncionário(Funcionario a) throws SQLException, Exception {

        ValidarFuncionario(a);
        dao.updateFuncionário(a);

    }

    @Override
    public ArrayList<Funcionario> select() throws SQLException, Exception {
        ArrayList<Funcionario> func = new ArrayList<>();
        func = dao.select();
        return func;

    }
}
