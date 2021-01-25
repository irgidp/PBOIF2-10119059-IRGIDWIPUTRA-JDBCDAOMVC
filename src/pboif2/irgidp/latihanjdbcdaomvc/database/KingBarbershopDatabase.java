/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.irgidp.latihanjdbcdaomvc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import pboif2.irgidp.latihanjdbcdaomvc.impl.PelangganDaoImpl;
import pboif2.irgidp.latihanjdbcdaomvc.service.PelangganDao;

/**
 *
 * @author Corazon
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
    
        
        return connection;
    }
    
    public static PelangganDao getPelanganDao() throws SQLException{
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
 
        return pelangganDao;    
    }
}
