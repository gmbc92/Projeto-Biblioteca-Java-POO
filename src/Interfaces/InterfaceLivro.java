/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BancoDeDados.Livro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frank 2.0 Ultimate
 */
public interface InterfaceLivro {

    public void createLivro(Livro a) throws Exception, SQLException;

    public void deleteLivro(Livro a) throws Exception, SQLException;

    public void updateLivro(Livro a) throws Exception, SQLException;
    
    public ArrayList<Livro> select() throws Exception;
    
    

}
