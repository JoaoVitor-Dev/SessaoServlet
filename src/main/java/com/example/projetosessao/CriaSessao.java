package com.example.projetosessao;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Objects;

@WebServlet(name = "CriaSessao", value = "/CriaSessao")
public class CriaSessao extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out=response.getWriter())
        {
            HttpSession sessao=request.getSession();
            if(sessao!=null)
            {
                Usuario u=new Usuario();
                String login = u.setLogin(request.getParameter("login"));
                u.setSenha(request.getParameter("senha"));

                switch (login){
                    case "Jose":
                        sessao.setAttribute("logado",u);
                        break;
                    case "jose":
                        sessao.setAttribute("logado",u);
                        break;
                    case "Maria":
                        sessao.setAttribute("logado", u);
                        break;
                    case "maria":
                        sessao.setAttribute("logado",u);
                        break;
                    default:
                        out.println("Login inválido");
                        return;
                }
                //sessao.setAttribute("logado",u);
            }
            response.setContentType("text/html");
            out.print("Logado com sucesso.<br>");
            out.print(sessao.getId());
            out.print("<br><a href=\"SairSessao\">Sair</a>");
        }
    }
}
