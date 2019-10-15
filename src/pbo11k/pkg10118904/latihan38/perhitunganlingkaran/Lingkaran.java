/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan38.perhitunganlingkaran;

/**
 *
 * @author Firman Alfinas
 */
public class Lingkaran {
    private final float PHI = (float) 3.1416;
    private float diameter;
    private float jariJari;
    
    private void getJariJari(float varDiameter) {
        jariJari = (float) (varDiameter / 2);
    }
    private float getLuas(float varJariJari) {
        return (float) PHI * varJariJari * varJariJari;
    }
    private float getKeliling(float varDiameter) {
        return (float) ((float) PHI * varDiameter);
    }
    
    private String getString(float varFloat) {
        return Float.toString(varFloat);
    }
    
    public void hasilHitung(float varDiameter) {
        diameter = varDiameter;
        getJariJari(diameter);
        System.out.println("");
        System.out.println("====== Hasil perhitungan lingkaran ======");
        System.out.println("Jari-jari lingkaran = "+jariJari+" cm");
        System.out.println("Luas lingkaran = "+getString((float) getLuas(jariJari))+" cm");
        System.out.println("Keliling lingkaran = "+getString((float) getKeliling(diameter))+" cm");
        
    }
}
