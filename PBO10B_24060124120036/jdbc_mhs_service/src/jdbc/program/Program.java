/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

/**
 *
 * @author chell
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService(); 

    public static void main(String[] args) { 
        
        // 1. SIMULASI INSERT [cite: 150]
        System.out.println("=== insert ===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo"); 
        service.add(mhsAdd); 
        System.out.println("berhasil insert: " + mhsAdd); 
        displayAll();
        
        // 2. SIMULASI UPDATE [cite: 158]
        System.out.println("=== update ==="); 
        Mahasiswa mhsUpdate = service.getById(5); 
        System.out.println("Akan diupdate data lama: " + mhsUpdate); 
        
        mhsUpdate.setNama("Dinaya"); 
        System.out.println("dengan data baru: " + mhsUpdate); 
        service.update(mhsUpdate); 
        displayAll(); 

        // 3. SIMULASI DELETE [cite: 167]
        System.out.println("=== delete ==="); 
        System.out.println("akan di delete: " + service.getById(5)); 
        service.delete(5); 
        displayAll(); 
    }

    public static void displayAll() {
        System.out.println("--- displayAll ---");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}
