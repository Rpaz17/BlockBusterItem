package blockbusteritem;

import java.util.Calendar;

public class MovieItem extends BlockBusterItem {
    public String estado;
    
    public MovieItem(String estado, int codigo, String nombre, double precioRenta) {
        super(codigo, nombre, precioRenta);
        this.estado = "ESTRENO";
    }
    
    @Override
    public String toString(){
          return  "Codigo: " + codigo +
                ", Nombre: " + nombre + 
                ", Precio de renta del Item: " + precioRenta +
                  "Estado: "+ estado + 
                  " - Movie";
    }
    
    @Override
    public double pagoRenta(int dias){
        if(estado == "ESTRENO" && dias>2){
            return precioRenta+(50*dias);
        }else if (estado == "NORMAL" && dias>5){
            return precioRenta+(30*(dias-5));
        }else{
            return precioRenta;
        }
    }
    
    public Calendar evaluarEstado(){
//        Calendar fechaActual = Calendar.getInstance();
//        if(fechaActual>)
        return null;

    }
    
    
}
