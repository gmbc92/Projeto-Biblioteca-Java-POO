package BancoDeDados;

import ConexãoBancoMYSQL.ConexãoBancoMYSQL;
import Interfaces.InterfaceLivro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Frank 2.0 Ultimate
 */
public class LivroDAO extends ConexãoBancoMYSQL implements InterfaceLivro {

    @Override
    public void createLivro(Livro a) throws Exception, SQLException {
        String sql = "INSERT INTO livro ( Cod_Livro , Titulo , Genero , Autor , Editora , Quantidade)"
                + "  VALUES  (?,?,?,?,?,?) ";
        try {
            PreparedStatement create = super.conect().prepareStatement(sql);
            create.setString(1, a.getCod_livro());
            create.setString(2, a.getTitulo());
            create.setString(3, a.getGenero());
            create.setString(4, a.getAutor());
            create.setString(5, a.getEditora());
            create.setInt(6, a.getQuantidade());
            create.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public void deleteLivro(Livro a) throws Exception, SQLException {
        String sql = " DELETE FROM livro WHERE Cod_livro = ? ";
        try {
            PreparedStatement delete = super.conect().prepareStatement(sql);
            delete.setString(1, a.getCod_livro());
            delete.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public void updateLivro(Livro a) throws Exception, SQLException {
        String sql = " UPDATE livro SET Titulo = ? , Genero = ? , Autor = ? , Editora = ? , Quantidade = ? WHERE Cod_Livro = ? ";
        try {
            PreparedStatement update = super.conect().prepareStatement(sql);
            update.setString(1, a.getTitulo());
            update.setString(2, a.getGenero());
            update.setString(3, a.getAutor());
            update.setString(4, a.getEditora());
            update.setInt(5, a.getQuantidade());
            update.setString(6, a.getCod_livro());
            update.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco ao declarar o stmt");
        } finally {
            super.desconect();
        }
    }

    @Override
    public ArrayList<Livro> select() throws Exception {

        ArrayList<Livro> retorno = new ArrayList<>();
        String sql = "SELECT L.Cod_Livro , L.Titulo , L.Genero , L.Autor , L.Editora , L.Quantidade "
                + " FROM livro as L ";

        try {

            PreparedStatement select = super.conect().prepareStatement(sql);
            ResultSet reader = select.executeQuery();
            while (reader.next()) {

                Livro l = new Livro();
                l.setCod_livro(reader.getString("Cod_livro"));
                l.setTitulo(reader.getString("Titulo"));
                l.setGenero(reader.getString("Genero"));
                l.setAutor(reader.getString("Autor"));
                l.setEditora(reader.getString("Editora"));
                l.setQuantidade(reader.getInt("Quantidade"));
                retorno.add(l);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao completar o stmt");
        } finally {
            super.desconect();
        }
        return retorno;
    }
}
