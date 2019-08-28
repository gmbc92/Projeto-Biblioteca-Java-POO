package Negocio;

import BancoDeDados.Emprestimo;
import BancoDeDados.EmprestimoDAO;
import Interfaces.InterfaceEmprestimo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public class NegocioEmprestimo implements InterfaceEmprestimo {

    private EmprestimoDAO dao = new EmprestimoDAO();

    public void ValidarEmprestimo(Emprestimo a) throws Exception, SQLException {

        if (a.getData_Do_Emprestimo() == null) {
            throw new Exception("Informar DAta de Emprestimo");
        }
        if (a.getData_Do_Emprestimo().length() > 30) {
            throw new Exception("Informar Data de Emprestimo com menos que 30 caracteres");
        }
        if (a.getData_Do_Emprestimo().trim().equals("") == true) {
            throw new Exception("Informar Data de Emprestimo");
        }

        if (a.getData_da_Devolucao() == null) {
            throw new Exception("Informar Data de Devolução");
        }
        if (a.getData_da_Devolucao().length() > 30) {
            throw new Exception("Informar Data de Devolução com menos que 30 caracteres");
        }
        if (a.getData_da_Devolucao().trim().equals("") == true) {
            throw new Exception("Informar Data de Devolução");
        }

        if (a.getcodigo_Emprestimo() == null) {
            throw new Exception("Informar Codigo de Emprestimo");
        }
        if (a.getcodigo_Emprestimo().length() > 30) {
            throw new Exception("Informar Codigo de Emprestimo com menos que 30 caracteres");
        }
        if (a.getcodigo_Emprestimo().trim().equals("") == true) {
            throw new Exception("Informar Codigo de Emprestimo");
        }
    }

    public void ValidarCodEmprestimo(Emprestimo a) throws Exception, SQLException {

        if (a.getcodigo_Emprestimo() == null) {
            throw new Exception("Informar Codigo de Emprestimo");
        }
        if (a.getcodigo_Emprestimo().length() > 30) {
            throw new Exception("Informar Codigo de Emprestimo com menos que 30 caracteres");
        }
        if (a.getcodigo_Emprestimo().trim().equals("") == true) {
            throw new Exception("Informar Codigo de Emprestimo");

        }
    }

    @Override
    public void createEmprestimo(Emprestimo a) throws Exception, SQLException {
        
        ValidarEmprestimo(a);
        dao.createEmprestimo(a);

    }

    @Override
    public void deleteEmprestimo(Emprestimo a) throws Exception, SQLException {
        
        ValidarCodEmprestimo(a);
        dao.deleteEmprestimo(a);

    }

    @Override
    public void updateEmprestimo(Emprestimo a) throws Exception, SQLException {
        
        ValidarEmprestimo(a);
        dao.deleteEmprestimo(a);

    }

    @Override
    public ArrayList<Emprestimo> select() throws Exception, SQLException {
        
        ArrayList<Emprestimo> array = new ArrayList<>();
        array = dao.select();
        return array;

    }

}
