// INTEGRANTES: JUAN MANUEL GUERRERO ARTEAGA - JUAN DAVID LOPEZ LOMBANA

package com.mycompany.alcubo;

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
@WebServlet("/Principal")
public class Principal extends HttpServlet{
    //Peticion=request, response=respuesta
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        PrintWriter salida = response.getWriter();
        //Se realiza la multiplicacion al cubo
        salida.println("<p>" + "El resultado de la operación al cubo es:\n " 
                + Integer.valueOf(request.getParameter("numero")) * Integer.valueOf(request.getParameter("numero")) * Integer.valueOf(request.getParameter("numero")) );
    }
}
