
package blockbusteritem;

import java.util.Calendar;

public abstract class BlockBusterItem {
    private int codigo;
    private String nombre;
    private double precioRenta;
    private Calendar fecha;

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
