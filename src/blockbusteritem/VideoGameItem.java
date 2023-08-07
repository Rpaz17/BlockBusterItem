package blockbusteritem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class VideoGameItem extends BlockBusterItem{
    private String tipoConsola;

    public VideoGameItem(int codigo, String nombre,double precioRenta,String tipoConsola) {
        super(codigo,nombre,precioRenta);
        this.tipoConsola = tipoConsola;
        precioRenta=30;
    }

    @Override
    public double pagoRenta(int dias) {
        return 0.0;
    }
    
    
}
/*
Además, tiene un atributo extra de tipo String para guardar el nombre de la consola. 
Tiene las siguientes funciones:
1.	Se tiene 3 atributos estáticos finales de tipo String que guarda cada uno los nombres de las consolas válidas: 
PLAYSTATION, XBOX y WII.
2.	Redefine toString para adicionarle a lo que ya retorna el padre la consola más la palabra “Game”.
3.	Redefine pagoRenta(int días) que retorna el precio de renta por cada día que se recibe.

*/
