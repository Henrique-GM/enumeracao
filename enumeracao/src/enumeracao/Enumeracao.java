/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracao;

import entidades.Entidades;
import entidadesEnum.OrdemStatus;
import java.util.Date;

/**
 *
 * @author Henrique
 */
public class Enumeracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entidades ordem = new Entidades(1800, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
        
        System.out.println(ordem.toString());
        
        OrdemStatus os1 = OrdemStatus.ENTREGUE; 
        
        OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
        
        System.out.println(os1);
        System.out.println(os2);
    }   
}
