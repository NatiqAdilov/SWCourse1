package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileLoc="src/main/java/org.example/form.html";
        List<String> strings= Files.readAllLines(Path.of(fileLoc));
        try(   PrintWriter w = resp.getWriter()){
            strings.forEach(w::println);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);
        Integer c = x1 + y1;
        String headerData=req.getHeader("headerData");
        try (PrintWriter w = resp.getWriter()) {
            w.println(c);
            w.println(headerData);
        }
    }
}