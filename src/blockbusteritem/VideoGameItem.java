package blockbusteritem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class VideoGameItem extends BlockBusterItem{
    private String nameConsola;

    public VideoGameItem(String nameConsola) {
        super();
        this.nameConsola = nameConsola;
        renta=30;
    }
    
    
}
/*
Crear una clase llamada VideoGameItem que hereda de la clase BlockBusterItem. 
Además, tiene un atributo extra de tipo String para guardar el nombre de la consola. 
En el constructor se pide de parámetro el tipo de consola, el precio de renta es fijo y es de Lps. 30.
Tiene las siguientes funciones:
1.	Se tiene 3 atributos estáticos finales de tipo String que guarda cada uno los nombres de las consolas válidas: 
PLAYSTATION, XBOX y WII.
2.	Redefine toString para adicionarle a lo que ya retorna el padre la consola más la palabra “Game”.
3.	Redefine pagoRenta(int días) que retorna el precio de renta por cada día que se recibe.

*/
