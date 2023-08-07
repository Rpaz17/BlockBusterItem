/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusteritem;
import java.util.ArrayList;


public class BlockBuster {
    private ArrayList<BlockBusterItem> guardar;

    public BlockBuster() {
        guardar=new ArrayList();
    }
    
    public boolean buscarItem(int codigo, String tipo){
        if(guardar.isEmpty()){
            return false;
        }   
        for(BlockBusterItem busca: guardar){
             if (busca.codigo == codigo) {
                return true;
            }if (tipo.equals("GAME") && busca instanceof VideoGameItem) {
                return true;
            }else if(busca instanceof MovieItem)
        }
    }
   
            
            if (tipo.equals("IPHONE") && plan instanceof PlanIPhone) {
                PlanIPhone planIPhone = (PlanIPhone) plan;
                if (planIPhone.getEmail().equals(datoExtra)) {
                    return true;
                }
            } else if (tipo.equals("SAMSUNG") && plan instanceof PlanSamsung) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                if (planSamsung.getPin().equals(datoExtra)) {
                    return true;
                }
            }
        }
        return false;
 
}
/*

2.	Función buscarItem(int codigo, String tipo) busca en el arreglo un ítem con un código 
y un tipo dado “MOVIE” o “GAME” dado. Si lo encuentra se retorna dicho objeto, si no, se retorna nulo.
Se manda el tipo porque se permite una movie con código 1 al igual que un game con código 1.
3.	Función agregarItem(int codigo, String nombre, String tipoItem).
Se agrega un nuevo ítem a la colección según el tipoItem que puede ser “MOVIE” o “GAME” 
solo si no existe ya un ítem con ese código y ese tipo. Cualquier otro dato extra se ingresa del teclado.
4.	Rentar(int codigo, String tipoItem, int dias). 
Si este ítem existe, se imprime todos los valores del objeto y se imprime su monto a pagar. 
Si no existe se imprime “Item No Existe”.
5.	auditarMovieEstados(). 
Recorre toda la colección de ítems de manera recursiva y si el ítem es de movie, 
se manda a llamar su función de evaluar el estado.



*/