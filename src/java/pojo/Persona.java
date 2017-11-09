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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jdura
 */
@Entity
@Table(name="Persona", catalog="generationhibernate")
public class Persona {
    @Id @GeneratedValue
    @Column (name="idPersona")
    private int idPersona;
    
    @Column (name="Nombre", nullable=false)
    private String Nombre;
    
    @Column (name="Paterno", nullable=false)
    private String Paterno;
    
    @Column (name="Materno", nullable=false)
    private String Materno;
    
    @Column (name="Telefono", nullable=false)
    private String Telefono;
    
    @ManyToOne
    @JoinColumn (name="idTipoPersona")
    private TipoPersona tipopersona;

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Paterno
     */
    public String getPaterno() {
        return Paterno;
    }

    /**
     * @param Paterno the Paterno to set
     */
    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    /**
     * @return the Materno
     */
    public String getMaterno() {
        return Materno;
    }

    /**
     * @param Materno the Materno to set
     */
    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the tipopersona
     */
    public TipoPersona getTipopersona() {
        return tipopersona;
    }

    /**
     * @param tipopersona the tipopersona to set
     */
    public void setTipopersona(TipoPersona tipopersona) {
        this.tipopersona = tipopersona;
    }
    
}
