// INTEGRANTES: JUAN MANUEL GUERRERO ARTEAGA - JUAN DAVID LOPEZ LOMBANA
package com.mycompany.arraylistaleatorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuanMa
 */
@WebServlet("/Aleatorios")
public class Aleatorios extends HttpServlet{
    public int[] arreglo;
    int suma;
    
    @Override
    public void init(){
        arreglo = new int[10];
        for(int i=0;i<10;i++){
        arreglo[i] = new Random().nextInt(1000);
        }
    }
    
    //Peticion=request, response=respuesta
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        PrintWriter salida = response.getWriter();
        for(int i = 0; i < 10; i++) {
            suma += arreglo[i];           
        }
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang=\"es\">");
        salida.println("<head>");
        salida.println("<title>NUMEROS ALEATORIOS</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<center>");
        salida.println("<h1>SUS NUMEROS ALEATORIOS SON</h1>");
        for(int i=0;i<arreglo.length;i++){
	salida.print(String.valueOf(arreglo[i])+" ");
	}
        salida.println("</center>");
        salida.println("<h4>La suma del arreglo aleatorio es de : " + suma +"</h4>");
        salida.println("</body>");
        salida.println("</html>");
    }
}

