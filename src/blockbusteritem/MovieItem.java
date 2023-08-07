package blockbusteritem;

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
                ", Precio de renta del Item: " + precioRenta + "}";
    }
    
    
    
}
