package blockbusteritem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class VideoGameItem extends BlockBusterItem{
    private String tipoConsola;
    private final static String tipe1="PLAYSTATION";
    private final static String tipe2="XBOX";
    private final static String tipe3="WII";


    public VideoGameItem(int codigo, String nombre,double precioRenta,String tipoConsola) {
        super(codigo,nombre,precioRenta);
        this.tipoConsola = tipoConsola.toUpperCase();
        precioRenta=30;
    }
    @Override
    public String toString() {
        return ", Tipo Consola: GAME";
    }
    @Override
    public double pagoRenta(int dias) {
        return precioRenta*dias;
    }
    public String tipoValido(String tipoConsola){
        if (tipoConsola.equals(tipe1)||tipoConsola.equals(tipe2)||tipoConsola.equals(tipe3))
            return tipoConsola;
        return null;
    }
        
}
