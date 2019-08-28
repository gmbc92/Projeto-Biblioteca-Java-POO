package BancoDeDados;

import ConexãoBancoMYSQL.ConexãoBancoMYSQL;  //deixou a classe static para poder importá-la para ca, dispensando instanciamento, melhor isso ou herança?
import Interfaces.InterfaceAluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Frank 2.0 Ultimate
 */
public class AlunoDAO extends ConexãoBancoMYSQL implements InterfaceAluno {

    @Override
    public void createAluno(Aluno a) throws SQLException, Exception {
        String sql = "INSERT INTO Aluno ( Nome, Matricula, Telefone , Login, Senha , RG , CPF , Tipo )"
                + "  VALUES (?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement create = super.conect().prepareStatement(sql);
            create.setString(1, a.getNome());
            create.setString(2, a.getMatricula());
            create.setString(3, a.getTelefone());
            create.setString(4, a.getLogin());
            create.setString(5, a.getSenha());
            create.setString(6, a.getRG());
            create.setString(7, a.getCPF());
            create.setString(8, a.getTipo());
            create.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public void deletAluno(Aluno a) throws SQLException, Exception {

        String sql = "DELETE FROM Aluno WHERE Matricula = ? ";
        try {
            PreparedStatement prepareStatement = super.conect().prepareStatement(sql);
            prepareStatement.setString(1, a.getMatricula());
            prepareStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado pela DAO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt DAO");
        } finally {
            super.desconect();
        }
    }

    @Override
    public void updateAluno(Aluno a) throws SQLException, Exception {

        String sql = "UPDATE Aluno SET Nome = ? , Telefone = ? , Login = ? , Senha = ? , RG = ? , CPF = ? , Tipo = ? WHERE Matricula = ?";
        try {
            PreparedStatement update = super.conect().prepareStatement(sql);
            update.setString(1, a.getNome());
            update.setString(2, a.getTelefone());
            update.setString(3, a.getLogin());
            update.setString(4, a.getSenha());
            update.setString(5, a.getRG());
            update.setString(6, a.getCPF());
            update.setString(7, a.getTipo());
            update.setString(8, a.getMatricula());
            update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update pela DAO ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public ArrayList<Aluno> select() throws Exception, SQLException {

        ArrayList<Aluno> retorno = new ArrayList<>();
        String sql = "SELECT a.Nome , a.Matricula , a.Telefone , a.Login , a.Senha , a.RG , a.CPF , a.Tipo "
                + " FROM aluno as a ";
        try {
            PreparedStatement select = super.conect().prepareStatement(sql);
            ResultSet reader = select.executeQuery();
            while (reader.next()) {

                Aluno a = new Aluno();
                a.setNome(reader.getString("Nome"));
                a.setMatricula(reader.getString("Matricula"));
                a.setTelefone(reader.getString("Telefone"));
                a.setLogin(reader.getString("Login"));
                a.setSenha(reader.getString("Senha"));
                a.setRG(reader.getString("RG"));
                a.setCPF(reader.getString("CPF"));
                a.setTipo(reader.getString("Tipo"));
                retorno.add(a);
                JOptionPane.showMessageDialog(null, "Listado com sucesso no DAO");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao completar o stmt");
        } finally {
            super.desconect();
        }
        return retorno;
    }
}
