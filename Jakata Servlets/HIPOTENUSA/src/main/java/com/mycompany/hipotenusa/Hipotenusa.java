// INTEGRANTES: JUAN MANUEL GUERRERO ARTEAGA - JUAN DAVID LOPEZ LOMBANA
package com.mycompany.hipotenusa;

/**
 *
 * @author JuanMa
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuanMa
 */

@WebServlet("/Hipotenusa")
public class Hipotenusa extends HttpServlet{
    
    //Peticion=request, response=respuesta
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        Double hypo = (Double.valueOf(request.getParameter("hipotenusa1")) * Double.valueOf(request.getParameter("hipotenusa1")) + Double.valueOf(request.getParameter("hipotenusa2")) * Double.valueOf(request.getParameter("hipotenusa2")));
        Double raizCuadrada = Math.sqrt(hypo);
        PrintWriter salida = response.getWriter();
        
        
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang=\"es\">");
        salida.println("<head>");
        salida.println("<title>Sesion Taller</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<center>");
        salida.println("<h1>RESULTADO DE LA HIPOTENUSA!</h1>");
        salida.println("</center>");
        salida.println("<p>El resultado de la hipotenusa es: " + raizCuadrada);
        salida.println("</body>");
        salida.println("</html>");
        
    }
}

