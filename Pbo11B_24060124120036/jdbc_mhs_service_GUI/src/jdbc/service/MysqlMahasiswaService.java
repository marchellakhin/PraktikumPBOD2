/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chell
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() { 
        koneksi = MysqlUtility.getConnection();
    }
    
    // Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    // CREATE (Insert) [cite: 134]
    public void add(Mahasiswa mhs) { 
        String query = "insert into mahasiswa values(?,?)";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException ex) {
            System.out.println("Gagal insert: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    // UPDATE [cite: 135]
    public void update(Mahasiswa mhs) { 
        String query = "update mahasiswa set nama=? where id=?";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException ex) {
            System.out.println("Gagal update: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    // DELETE [cite: 136]
    public void delete(int id) { 
        String query = "delete from mahasiswa where id=?";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException ex) {
            System.out.println("Gagal delete: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    // READ BY ID [cite: 137]
    public Mahasiswa getById(int id) { 
        String query = "select * from mahasiswa where id=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Mahasiswa mhs = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException ex) {
            System.out.println("Gagal getById: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return mhs;
    }

    // READ ALL [cite: 138]
    public List<Mahasiswa> getAll() { 
        String query = "select * from mahasiswa";
        Statement st = null;
        ResultSet rs = null;
        List<Mahasiswa> list = new ArrayList<>();
        try {
            st = koneksi.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException ex) {
            System.out.println("Gagal getAll: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;
    }
}
