/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan43gajipegawai;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class If110119024Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setUangTunjangan(250000);
        int uangTunjangan = gajiPegawai.getUangTunjangan();
        
        gajiPegawai.setUangTransport(300000);
        int uangTransport = gajiPegawai.getUangTransport();
        
        gajiPegawai.setGajiPokok(4500000);
        int gajiPokok = gajiPegawai.getGajiPokok();
        
        int jml = gajiPegawai.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        gajiPegawai.setTotalGaji(jml);
        int totalGaji = gajiPegawai.getTotalGaji();
        
        gajiPegawai.tampilData("Kusnandi Pirmansyah", "Jalan Semar dlm 4 no 77/66", uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
    
}
