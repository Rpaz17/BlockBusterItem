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
         
        for(BlockBusterItem busca: guardar){
             if (busca.codigo == codigo) {
                return true;
            }if (tipo.equals("GAME") && busca instanceof VideoGameItem) {
                VideoGameItem vg=(VideoGameItem) busca;
                if (vg.codigo==codigo)
                return true;
            }else if(tipo.equals("MOVIE")&& busca instanceof MovieItem){
                MovieItem mi=(MovieItem) busca;
                if (mi.codigo==codigo)
                return true;
        }
    }
    return false;
}
      public String Rentar(int codigo, String tipoItem, int dias){
        if(buscarItem(codigo, tipoItem) == false){
            return "Item No Existe";
        }else{
            return "Codigo: "+codigo+
                    "Tipo de Item: "+tipoItem+
                    "Dias: "+dias;
        }
    }
}
/*
4.	Rentar(int codigo, String tipoItem, int dias). 
Si este ítem existe, se imprime todos los valores del objeto y se imprime su monto a pagar. 
Si no existe se imprime “Item No Existe”.
5.	auditarMovieEstados(). 
Recorre toda la colección de ítems de manera recursiva y si el ítem es de movie, 
se manda a llamar su función de evaluar el estado.



*/