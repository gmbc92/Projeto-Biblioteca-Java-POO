package ConexãoBancoMYSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * @author Frank 2.0 Ultimate
 */
public class ConexãoBancoMYSQL {

    private Connection conn;
    private final String Driver_Mysql = "com.mysql.jdbc.Driver"; //onde esta localizada a pasta do driver que é alocada ate o projeto local
    private final String Local_Servidor = "localhost";
    private final String Banco_de_Dados = "Biblioteca";
    private final String Porta_Do_Banco = "3306";
    private final String Usuario = "root";
    private final String Senha = "";

    public Connection conectMysql() throws Exception {
        Class.forName(Driver_Mysql).newInstance();
        String url = "jdbc:mysql://" + Local_Servidor + ":" + Porta_Do_Banco + "/" + Banco_de_Dados;
        conn = DriverManager.getConnection(url, Usuario, Senha);
        return conn;
    }

    public void desconect() throws SQLException {
        conn.close();
        JOptionPane.showMessageDialog(null, "Banco Desconectado");
    }

    public Connection conect() throws Exception {
        JOptionPane.showMessageDialog(null, "Banco Conectado");
        return this.conectMysql();
    }

}
