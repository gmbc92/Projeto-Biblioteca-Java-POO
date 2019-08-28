/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BancoDeDados.Emprestimo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frank 2.0 Ultimate
 */
public interface InterfaceEmprestimo {
    
    
    public void createEmprestimo(Emprestimo a) throws Exception, SQLException;
    
    public void deleteEmprestimo(Emprestimo a) throws Exception, SQLException;
    
    public void updateEmprestimo(Emprestimo a) throws Exception, SQLException;
    
    public ArrayList<Emprestimo> select() throws Exception , SQLException;
    
   

}
