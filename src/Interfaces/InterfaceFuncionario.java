/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BancoDeDados.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frank 2.0 Ultimate
 */
public interface InterfaceFuncionario {

    public void createFuncionario(Funcionario a) throws SQLException, Exception;

    public void deleteFuncionário(Funcionario a) throws SQLException, Exception;

    public void updateFuncionário(Funcionario a) throws SQLException, Exception;
    
    public ArrayList<Funcionario> select() throws SQLException, Exception;
    
    
    
}
