/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class tabung extends lingkaran{
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumeTabung (){
        return luaslingkaran()*Tinggi;
    }
    
}
