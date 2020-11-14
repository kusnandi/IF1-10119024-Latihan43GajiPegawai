/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan43gajipegawai;

/**
 *
 * @author acer
 */
public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int getUangTransport() {
        return this.uangTransport;
    }
    
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan() {
        return this.uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok() {
        return this.gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji() {
        return this.totalGaji;
    }
    
    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Karyawan PT. KAKATUA ###");
        System.out.println("---------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Uang Transport: Rp. " + uangTransport);
        System.out.println("Uang Tunjangan: Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI : Rp. " + totalGaji);
    }
}