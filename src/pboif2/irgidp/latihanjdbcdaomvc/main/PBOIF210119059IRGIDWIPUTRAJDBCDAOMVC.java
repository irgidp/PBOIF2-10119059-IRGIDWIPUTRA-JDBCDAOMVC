/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.irgidp.latihanjdbcdaomvc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import pboif2.irgidp.latihanjdbcdaomvc.database.KingBarbershopDatabase;
import pboif2.irgidp.latihanjdbcdaomvc.entity.Pelanggan;
import pboif2.irgidp.latihanjdbcdaomvc.error.PelangganException;
import pboif2.irgidp.latihanjdbcdaomvc.service.PelangganDao;
import pboif2.irgidp.latihanjdbcdaomvc.view.MainViewPelanggan;

/**
 *
 * @author Corazon
 */
public class PBOIF210119059IRGIDWIPUTRAJDBCDAOMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(PBOIF210119059IRGIDWIPUTRAJDBCDAOMVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
}
