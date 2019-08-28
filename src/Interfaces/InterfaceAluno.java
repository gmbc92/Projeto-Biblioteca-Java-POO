package Interfaces;

import BancoDeDados.Aluno;
import ConexãoBancoMYSQL.ConexãoBancoMYSQL;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Frank 2.0 Ultimate
 */
public interface InterfaceAluno {
    
   

    void createAluno(Aluno a) throws SQLException, Exception;

    void deletAluno(Aluno a) throws SQLException, Exception;

    void updateAluno(Aluno a) throws SQLException, Exception;

    ArrayList<Aluno> select() throws Exception;

    

}
