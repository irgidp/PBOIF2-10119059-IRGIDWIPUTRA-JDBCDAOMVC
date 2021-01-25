/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.irgidp.latihanjdbcdaomvc.service;

import java.util.List;
import pboif2.irgidp.latihanjdbcdaomvc.entity.Pelanggan;
import pboif2.irgidp.latihanjdbcdaomvc.error.PelangganException;

/**
 *
 * @author Corazon
 */
public interface PelangganDao {
    
    public void insertPelaggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelaggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelaggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(String email) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
