package BancoDeDados;

import ConexãoBancoMYSQL.ConexãoBancoMYSQL;
import Interfaces.InterfaceEmprestimo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Frank 2.0 Ultimate
 */
public class EmprestimoDAO extends ConexãoBancoMYSQL implements InterfaceEmprestimo {

    @Override
    public void createEmprestimo(Emprestimo a) throws Exception, SQLException {
        String sql = "INSERT INTO emprestimo ( Cod_Emprestimo , Matricula , Cod_Funcionario , Data_do_Emprestimo , Data_da_Devolução )"
                + "  VALUES  (?,?,?,?,?) ";
        try {
            PreparedStatement create = super.conect().prepareStatement(sql);
            create.setString(1, a.getcodigo_Emprestimo());
            create.setString(2, a.getAluno().getMatricula());
            create.setString(3, a.getFuncionario().getCod_Funcionario());
            create.setString(4, a.getData_Do_Emprestimo());
            create.setString(5, a.getData_da_Devolucao());
            create.executeUpdate();

            for (Emprestimo_Livro liv : a.getLivro()) {

                String sql2 = "INSERT INTO Emprestimo_Livro (Cod_Emprestimo ,Cod_Livro, QuantidadeLivro) ";
                sql2 += " VALUES (?,?,?)";
                PreparedStatement preparedStatement2 = conect().prepareStatement(sql2);
                preparedStatement2.setString(1, a.getcodigo_Emprestimo());
                preparedStatement2.setString(2, liv.getLivro().getCod_livro());
                preparedStatement2.setInt(3, liv.getQuantidade());
                preparedStatement2.executeUpdate();

            }

        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally {
            super.desconect();
        }
    }

    @Override
    public void deleteEmprestimo(Emprestimo a) throws Exception, SQLException {

        String sql = " DELETE FROM emprestimo WHERE Cod_Emprestimo = ?  ";
        try {
            PreparedStatement delete = super.conect().prepareStatement(sql);
            delete.setString(1, a.getcodigo_Emprestimo());
            delete.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public void updateEmprestimo(Emprestimo a) throws Exception, SQLException {

        String sql = " UPDATE emprestimo SET  Matricula = ? , Cod_funcionario = ? , Data_do_Emprestimo = ? , Data_da_Devolução = ?"
                + " WHERE  Cod_Emprestimo = ? ";
        try {
            PreparedStatement update = super.conect().prepareStatement(sql);
            update.setString(1, a.getAluno().getMatricula());
            update.setString(2, a.getFuncionario().getCod_Funcionario());
            update.setString(3, a.getData_Do_Emprestimo());
            update.setString(4, a.getData_da_Devolucao());
            update.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public ArrayList<Emprestimo> select() throws Exception, SQLException {

        ArrayList<Emprestimo> retorno = new ArrayList();
        String sql = "SELECT  e.Cod_Emprestimo , e.Matricula , e.Cod_funcionario , e.Data_do_Emprestimo, e.Data_da_Devolução "
                + " FROM emprestimo AS e ";
        try {

            PreparedStatement select = super.conect().prepareStatement(sql);
            ResultSet reader = select.executeQuery();

            while (reader.next()) {

                Emprestimo e = new Emprestimo();
                e.setcodigo_Emprestimo(reader.getString("Cod_Emprestimo"));
                e.getFuncionario().setCod_Funcionario(reader.getString("Cod_Funcionario"));
                e.setData_Do_Emprestimo(reader.getString("Data_Do_Emprestimo"));
                e.setData_da_Devolucao(reader.getString("Data_da_Devolução"));
                e.getAluno().setMatricula(reader.getString("Matricula"));      // GET PARA PEGAR OS DADOS DO ALUNO E ENTAO SET PARA FINALMENTE ADICIONAR.
                retorno.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao completar o stmt");
        } finally {
            super.desconect();
        }
        return retorno;
    }
    
    
    
    
    
    
}
