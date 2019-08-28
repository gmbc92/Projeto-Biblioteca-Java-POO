package BancoDeDados;

import ConexãoBancoMYSQL.ConexãoBancoMYSQL;
import Interfaces.InterfaceFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Frank 2.0 Ultimate
 */
public class FuncionarioDAO extends ConexãoBancoMYSQL implements InterfaceFuncionario {

    public void createFuncionario(Funcionario a) throws SQLException, Exception {
        String sql = " INSERT INTO funcionario ( Cod_Funcionario , Nome , Telefone , Rg , CPF , Tipo , Login , Senha ) "
                + "  Values  (?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement create = super.conect().prepareStatement(sql);
            create.setString(1, a.getCod_Funcionario());
            create.setString(2, a.getNome());
            create.setString(3, a.getTelefone());
            create.setString(4, a.getRG());
            create.setString(5, a.getCPF());
            create.setString(6, a.getTipo());
            create.setString(7, a.getLogin());
            create.setString(8, a.getSenha());
            create.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    public void deleteFuncionário(Funcionario a) throws SQLException, Exception {
        String sql = " DELETE from funcionario WHERE Cod_Funcionario = ?";
        try {
            PreparedStatement delete = super.conect().prepareStatement(sql);
            delete.setString(1, a.getCod_Funcionario());
            delete.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    public void updateFuncionário(Funcionario a) throws SQLException, Exception {
        String sql = " UPDATE funcionario SET Nome = ? , Telefone = ? , RG = ? , CPF = ? , Tipo = ? , Login = ? , Senha = ? WHERE Cod_Funcionario = ? ";
        try {
            PreparedStatement update = super.conect().prepareStatement(sql);
            update.setString(1, a.getNome());
            update.setString(2, a.getTelefone());
            update.setString(3, a.getRG());
            update.setString(4, a.getCPF());
            update.setString(5, a.getTipo());
            update.setString(6, a.getLogin());
            update.setString(7, a.getSenha());
            update.setString(8, a.getCod_Funcionario());
            update.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    public ArrayList<Funcionario> select() throws SQLException, Exception {

        ArrayList<Funcionario> retorno = new ArrayList<>();

        String sql = " SELECT f.Cod_Funcionario , f.Nome , f.Telefone , f.RG , f.CPF , f.Tipo , f.Login , f.Senha "
                + "  from funcionario as f ";

        try {
            PreparedStatement select = super.conect().prepareStatement(sql);
            ResultSet reader = select.executeQuery();
            while (reader.next()) {
                Funcionario a = new Funcionario();
                a.setCod_Funcionario(reader.getString("Cod_Funcionario"));
                a.setNome(reader.getString("Nome"));
                a.setTelefone(reader.getString("Telefone"));
                a.setRG(reader.getString("RG"));
                a.setCPF(reader.getString("CPF"));
                a.setTipo(reader.getString("Tipo"));
                a.setLogin(reader.getString("Login"));
                a.setSenha(reader.getString("Senha"));
                retorno.add(a);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao completar o stmt");
        } finally {
            super.desconect();
        }
        return retorno;
    }
}
