package com.example.projetosessao;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SairSessao", value = "/SairSessao")
public class SairSessao extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao= request.getSession(false);
        try(PrintWriter out=response.getWriter()) {
            if (sessao != null) {
                Usuario u=(Usuario) sessao.getAttribute("logado");
                String nome=u.getLogin();
                sessao.invalidate();
                out.print("Saiu da sessão "+nome);
            }
            else
                out.print("Você nem estava logado.");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
