package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

public class FinalServlet extends HttpServlet {
    public static Optional<String> getCkValue(HttpServletRequest req , String ckName){
        Cookie[] cookies=req.getCookies();
        String cName=null;
        if(cookies !=null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equalsIgnoreCase(ckName))
                    cName = ck.getValue();
            }

        }
        return Optional.of(cName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x=req.getParameter("x");
        String y= req.getParameter("y");
        Optional<String> id=getCkValue(req,"ID");
        try(PrintWriter w=resp.getWriter()) {
            w.println(y);
            w.println(id.get());
        }
    }

}
