/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbu.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Persona;
import pojo.TipoPersona;

/**
 *
 * @author jdura
 */
public class PersonaDAO {
    Session session;
    
    public PersonaDAO(){
        session = HibernateUtil.getLocalSession();
    }
    
    public Persona getPersonaById (int id){
        return (Persona) session.load (Persona.class,id);
    }
    public List<Persona> getPersonaByName (String nombre){
        List<Persona> listaPersonas = (List<Persona>) session.createCriteria(Persona.class).add(Restrictions.eq("Nombre", nombre));
        return listaPersonas;
    }
    
    public boolean updateById (int id, Persona persona){
        Persona personaModificar = getPersonaById (id);
        try {
            Transaction transaccion =session.beginTransaction();
            personaModificar.setNombre(persona.getNombre());
            session.update(personaModificar);
            transaccion.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean savePersona (String nombre, String materno, String paterno, String telefono, int idTipoPersona){
     Persona nuevaPersona = new Persona();
     TipoPersona tipoPersona = (TipoPersona) session.load(TipoPersona.class, idTipoPersona);
     nuevaPersona.setNombre(nombre);
     nuevaPersona.setPaterno(paterno);
     nuevaPersona.setMaterno(materno);
     nuevaPersona.setTelefono(telefono);
     nuevaPersona.setTipopersona(tipoPersona);
        try {
            Transaction transaccion = session.beginTransaction();
            session.save(nuevaPersona);
            transaccion.commit();
            return true;
        } catch (Exception e) {
           
        } finally{
            
        }   
        return true;
    }
    
}
