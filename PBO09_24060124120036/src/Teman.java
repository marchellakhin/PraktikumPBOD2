/* nama File    : Anabul.java
 * Deskripsi    : Berisi Class Teman
 * Pembuat      : Marchella Arkhina Ratunesia
 * Tanggal      : Selasa, 05 Mei 2026
*/

import java.util.ArrayList;

public class Teman<T> {
    private int nbelm;
    private ArrayList<T> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getnama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setnama(int indeks, T nama) {
        Lnama.set(indeks, nama);
    }

    public void addnama(T nama) {
        setnama(nbelm, nama);
        nbelm++;
    }

    public void delnama(T nama) {
        if(nbelm != 0) {
            for(int i = 0; i < nbelm-1; i++) {
                if(getnama(i) == nama) {
                    for(int j = i; j < nbelm-2; j++) {
                        setnama(j, getnama(j+1));
                    }
                }
            }
            nbelm--;
        }
    }

    public boolean isMember(T nama) {
        boolean member;
        member = false;
        if(nbelm != 0) {
            for(int i = 0; i <nbelm-1; i++) {
                if(getnama(i) == nama) {
                    return member = true;
                }
            }
        }
        else {
            return member = false;
        }
        return member;
    }

    public void gantinama(T nama, T namabaru) {
        if(isMember(nama)) {
            for(int i = 0; i < nbelm; i++) {
                if(getnama(i) == nama) {
                    setnama(i, namabaru);
                }
            }
        }
    }

    // public int countnama(T nama) {

    // }

    public void showTeman() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println(getnama(i));
        }

    }



}
