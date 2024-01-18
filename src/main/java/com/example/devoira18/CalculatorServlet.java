package com.example.devoira18;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CalculatorServlet", value = "/InterestRateCalculator")
public class CalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String Principal = request.getParameter("principal");
        String Interest = request.getParameter("interest");
        String Years = request.getParameter("years");
        String Compounding = request.getParameter("compounding");

        String error;

        if (Principal == null || Interest == null || Years == null || Compounding == null){
            error = "Un des champs est vide. Remplisser tout les champs.";
            request.setAttribute("error",error);
        }else{

        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }

    public void destroy() {
    }
}