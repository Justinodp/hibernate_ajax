/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author jdura
 */
@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre=request.getParameter("nombre");
        String paterno=request.getParameter("paterno");
        String materno=request.getParameter("materno");
        String telefono=request.getParameter("telefono");
        int idTipoPersona = Integer.parseInt(request.getParameter("idTipoPersona"));

        
        System.out.println("Nombre = " +nombre);
        System.out.println("Paterno = " +paterno);
        System.out.println("Materno = " +materno);
        System.out.println("Telefono = " +telefono );
        System.out.println("idTipoPersona = " +idTipoPersona);
        
        

        
        PersonaDAO pdao=new PersonaDAO();{
         pdao.savePersona(nombre, materno, paterno, telefono, idTipoPersona);
            }
        
        JSONObject json=new JSONObject();
        json.put("resultado",true);
        response.setContentType("application/json utf-8");
        PrintWriter out=response.getWriter();
        out.print(json.toString());
        destroy();
        
    }


}
