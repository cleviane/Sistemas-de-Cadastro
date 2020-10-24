/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.cad;
import java.sql.*;
/**
 *
 * @author Elton
 */
public class ModuloConexao {
    
    public static Connection conector(){//método conector
        
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbsistema";
        String user = "root";
        String password = "";
        
        try {
             Class.forName(driver);//execução do driver JDBC
             conexao = DriverManager.getConnection(url,user,password);
             //Gerenciamneto dele, chama a variável conexão
             //Gerenciamento do Driver (url, user e password)
             return conexao;//Mostra a conexão
             //se estiver tudo pk, irá aparecer uma mensagem
            } catch (Exception e) {//Execeção de erro
              //se a conexão com o banco de dados não funcionar irá retornar nulo
                return null;
            }
    }
}