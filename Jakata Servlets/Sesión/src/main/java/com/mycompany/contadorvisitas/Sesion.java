// INTEGRANTES: JUAN MANUEL GUERRERO ARTEAGA - JUAN DAVID LOPEZ LOMBANA
package com.mycompany.contadorvisitas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JuanMa
 */

@WebServlet("/Sesion")
public class Sesion extends HttpServlet{
    
    //Peticion=request, response=respuesta
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        Integer variableDeSesion = 0;
        PrintWriter salida = response.getWriter();
        HttpSession miSesion = request.getSession();
        
        variableDeSesion = (Integer)miSesion.getAttribute("numSesion");
        if(variableDeSesion == null){
            variableDeSesion = 0;
        }
        
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang=\"es\">");
        salida.println("<head>");
        salida.println("<title>Sesion Taller</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<center>");
        salida.println("<h1>Contador de Visitas en un servlet!</h1>");
        salida.println("</center>");
        salida.println("<h4>La variable de esta sesión es: " + variableDeSesion + "</h4>");
        salida.println("</body>");
        salida.println("</html>");
        
        variableDeSesion++;
        
        miSesion.setAttribute("numSesion", variableDeSesion );
    }
}
