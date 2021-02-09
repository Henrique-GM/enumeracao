/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidadesEnum.OrdemStatus;
import java.util.Date;

/**
 *
 * @author Henrique
 */
public class Entidades {
    
    private Integer id;
    private Date momentoPedido;
    private OrdemStatus status;

    public Entidades(Integer id, Date momentoPedido, OrdemStatus status) {
        this.id = id;
        this.momentoPedido = momentoPedido;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Entidades{" + "id=" + id + ", momentoPedido=" + momentoPedido + ", status=" + status + '}';
    }
    
    
}
