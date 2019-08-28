package Negocio;

import BancoDeDados.Livro;
import BancoDeDados.LivroDAO;
import Interfaces.InterfaceLivro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public class NegocioLivro implements InterfaceLivro {

    private LivroDAO dao = new LivroDAO();
    
    public void ValidarLivro(Livro a) throws Exception, SQLException {

        if (a.getAutor() == null) {
            throw new Exception("Informar Autor");
        }
        if (a.getAutor().length() > 30) {
            throw new Exception("Informar nome do Autor com menos que 30 caracteres");
        }
        if (a.getAutor().trim().equals("") == true) {
            throw new Exception("Informar Autor");
        }

        if (a.getCod_livro() == null) {
            throw new Exception("Informar Codigo do Livro");
        }
        if (a.getCod_livro().length() > 30) {
            throw new Exception("Informar Codigo do Livro com menos que 30 caracteres");
        }
        if (a.getCod_livro().trim().equals("") == true) {
            throw new Exception("Informar Codigo do Livro");
        }

        if (a.getEditora() == null) {
            throw new Exception("Informar Editora");
        }
        if (a.getEditora().length() > 30) {
            throw new Exception("Informar nome da Editora com menos que 30 caracteres");
        }
        if (a.getEditora().trim().equals("") == true) {
            throw new Exception("Informar Editora");
        }

        if (a.getGenero() == null) {
            throw new Exception("Informar Genero");
        }
        if (a.getGenero().length() > 30) {
            throw new Exception("Informar Genero com menos que 30 caracteres");
        }
        if (a.getGenero().trim().equals("") == true) {
            throw new Exception("Informar Genero");
        }

        if (a.getTitulo() == null) {
            throw new Exception("Informar Titulo");
        }
        if (a.getTitulo().length() > 30) {
            throw new Exception("Informar nome do Titulo com menos que 30 caracteres");
        }
        if (a.getAutor().trim().equals("") == true) {
            throw new Exception("Informar Titulo");
        }

        if (a.getQuantidade() == 0) {
            throw new Exception("Informar Quantidade maior que 0");
        }
        if (a.getQuantidade() > 200) {
            throw new Exception("Informar Quantidade em até 200 unidades");
        }
    }
    
    public void ValidarCodigoLivro (Livro b) throws Exception, SQLException {
        
        if (b.getCod_livro() == null) {
            throw new Exception("Informar Codigo do Livro");
        }
        if (b.getCod_livro().length() > 30) {
            throw new Exception("Informar Codigo do Livro com menos que 30 caracteres");
        }
        if (b.getCod_livro().trim().equals("") == true) {
            throw new Exception("Informar Codigo do Livro");
        }
        
    }

    @Override
    public void createLivro(Livro a) throws Exception, SQLException {
        
        ValidarLivro(a);
        dao.createLivro(a);
        
    }

    @Override
    public void deleteLivro(Livro a) throws Exception, SQLException {
        
        ValidarCodigoLivro(a);
        dao.deleteLivro(a);
        
    }

    @Override
    public void updateLivro(Livro a) throws Exception, SQLException {
        
        ValidarCodigoLivro(a);
        dao.updateLivro(a);
        
    }

    @Override
    public ArrayList<Livro> select() throws Exception {
        ArrayList<Livro> livro = new ArrayList<>();
        livro = dao.select();
        return livro ;
    }
}
