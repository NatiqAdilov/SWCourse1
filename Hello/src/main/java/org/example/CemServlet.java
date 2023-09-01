package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
String x=rq.getParameter("x");
String y=rq.getParameter("y");
int x1=Integer.parseInt(x);
int y1=Integer.parseInt(y);
Integer c=x1+y1;
try(PrintWriter w=rs.getWriter()) {
w.println(c);
        }
    }
}