/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jdura
 */
@Entity
@Table(name = "TipoPersona", catalog = "generationhibernate")
public class TipoPersona {
    @Id
    @GeneratedValue
    @Column(name = "idTipoPersona")
    private int idTipoPersona;
    
     @Column(name = "TipoPersona")
    private String TipoPersona;
    
    
    public TipoPersona(){
        
    }

    /**
     * @return the idTipoPersona
     */
    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    /**
     * @param idTipoPersona the idTipoPersona to set
     */
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    /**
     * @return the TipoPersona
     */
    public String getTipoPersona() {
        return TipoPersona;
    }

    /**
     * @param TipoPersona the TipoPersona to set
     */
    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
    
}
