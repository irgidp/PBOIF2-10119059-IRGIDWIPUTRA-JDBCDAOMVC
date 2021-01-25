/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.irgidp.latihanjdbcdaomvc.model;

import java.sql.SQLException;
import pboif2.irgidp.latihanjdbcdaomvc.database.KingBarbershopDatabase;
import pboif2.irgidp.latihanjdbcdaomvc.entity.Pelanggan;
import pboif2.irgidp.latihanjdbcdaomvc.error.PelangganException;
import pboif2.irgidp.latihanjdbcdaomvc.event.PelangganListener;
import pboif2.irgidp.latihanjdbcdaomvc.service.PelangganDao;

/**
 *
 * @author Corazon
 */
public class PelangganModel {
    
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (listener != null) {
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Pelanggan pelanggan){
        if (listener != null) {
            listener.onInsert(pelanggan);
        }
    }
    
    protected void fireOnUpdate(Pelanggan pelanggan){
        if (listener != null) {
            listener.onUpdate(pelanggan);
        }
    }
    
    protected void fireOnDelete(){
        if (listener != null) {
            listener.onDelete();
        }
    }
    
    public void insertPelanggan() throws SQLException, PelangganException {
    
        PelangganDao dao = KingBarbershopDatabase.getPelanganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
       
        dao.insertPelaggan(pelanggan);
        fireOnInsert(pelanggan);
    }
    
    public void updatePelanggan() throws SQLException, PelangganException {
    
        PelangganDao dao = KingBarbershopDatabase.getPelanganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        pelanggan.setId(id);
       
        dao.updatePelaggan(pelanggan);
        fireOnUpdate(pelanggan);
    }
    
    public void deletePelanggan() throws SQLException, PelangganException {
    
        PelangganDao dao = KingBarbershopDatabase.getPelanganDao();
        dao.deletePelaggan(id);
        fireOnDelete();
    }
    
    public void resetPelanggan() {
        setId(0);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
    }
    
    
}
