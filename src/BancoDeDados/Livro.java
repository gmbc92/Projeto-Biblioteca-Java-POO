package BancoDeDados;

/**
 * @author Frank 2.0 Ultimate
 */
public class Livro {

    private String Cod_livro;
    private String Titulo;
    private String Genero;
    private String Autor;
    private String Editora;
    private int Quantidade;

    public String getCod_livro() {
        return Cod_livro;
    }

    public void setCod_livro(String Cod_livro) {
        this.Cod_livro = Cod_livro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

}
