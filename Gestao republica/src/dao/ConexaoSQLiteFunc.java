package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Douglas
 */
public class ConexaoSQLiteFunc implements Conexao {

    private Connection connection = null;
    private static ConexaoSQLiteFunc instance;
    private Statement stmt = null;
    private String url = "jdbc:sqlite:src/data/republica.db";

//    private String sqlFuncionario = "CREATE TABLE IF NOT EXISTS funcionario(\n"
//            + "idFuncionario integer PRIMARY KEY NOT NULL,\n"
//            + "nome text NOT NULL,\n"
//            + "cargo text NOT NULL,\n"
//            + "salarioBase double NOT NULL,\n"
//            + "faltas integer NOT NULL,\n"
//            + "distancia integer NOT NULL,\n"
//            + "bonusTotal double NOT NULL,\n"
//            + "salarioTotal double NOT NULL \n"
//            + ");";

//    private String sqlBonus = "CREATE TABLE IF NOT EXISTS bonus(\n"
//            + "idBonus integer PRIMARY KEY AUTOINCREMENT ,\n"
//            + "idFuncionario integer NOT NULL,\n"
//            + "tipo text NOT NULL,\n"
//            + "data String NOT NULL,\n"
//            + "valor double NOT NULL \n"
//            + ");";

    private ConexaoSQLiteFunc() throws SQLException {
        try {

            this.connection = DriverManager.getConnection(this.url);
            this.stmt = this.connection.createStatement();
     //       this.stmt.execute(this.sqlFuncionario);
     //       this.stmt.execute(this.sqlBonus);

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    public static ConexaoSQLiteFunc getInstance() throws Exception {
        if (instance == null) {
            instance = new ConexaoSQLiteFunc();
        }
        return instance;
    }

    public Connection connect() throws SQLException {
        return this.connection;
    }

    public void desconect() throws SQLException {
        connection.close();
    }

    public void desconect(Connection connetion, Statement statement) throws SQLException {
        connetion.close();
        statement.close();
    }

    public Statement getStatment() {
        return this.stmt;
    }

    public Connection getConexao() {
        return this.connection;
    }

}
