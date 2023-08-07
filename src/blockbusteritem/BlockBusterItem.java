
package blockbusteritem;

import java.util.Calendar;

public abstract class BlockBusterItem {
    protected int codigo;
    protected String nombre;
    protected double precioRenta;
    protected Calendar fecha;
        int mes = fecha.get(Calendar.MONTH);
    public BlockBusterItem(int codigo, String nombre, double precioRenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioRenta = precioRenta;
        this.fecha = Calendar.getInstance();
      }

    public String toString() {
        return "BlockBusterItem{" + "Codigo: " + codigo +
                ", Nombre: " + nombre + 
                ", Precio de renta del Item: " + precioRenta + "}";
    }
    
    public abstract double pagoRenta(int dias);
        
    }
