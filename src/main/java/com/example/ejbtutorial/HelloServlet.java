package com.example.ejbtutorial;

import com.example.ejb.CalculatorBean;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @EJB
    private CalculatorBean calculatorBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = calculatorBean.add(10, 5);
        int result_sub=calculatorBean.subtract(10, 5);
        int result_mul=calculatorBean.multiply(10, 5);
        int result_div=calculatorBean.divide(10, 5);
        response.getWriter().println("10 + 5 = " + result);
        response.getWriter().println("10 + 5 = " + result_sub);
        response.getWriter().println("10 - 5 = " + result_mul);
        response.getWriter().println("10 - 5 = " + result_div);


    }
}
