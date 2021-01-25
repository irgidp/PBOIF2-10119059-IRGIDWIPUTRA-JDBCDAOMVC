/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.irgidp.latihanjdbcdaomvc.event;

import pboif2.irgidp.latihanjdbcdaomvc.entity.Pelanggan;
import pboif2.irgidp.latihanjdbcdaomvc.model.PelangganModel;

/**
 *
 * @author Corazon
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);

  
}
