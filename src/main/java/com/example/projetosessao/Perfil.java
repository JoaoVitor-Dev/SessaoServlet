package com.example.projetosessao;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Perfil", value = "/Perfil")
public class Perfil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao=request.getSession(false);
        Usuario logado=(Usuario) sessao.getAttribute("logado");
        try(PrintWriter out=response.getWriter())
        {
            out.println("O usúario logado é "+logado.getLogin());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
