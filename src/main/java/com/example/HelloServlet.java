
package com.example;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
            "<html><head><title>AWS CI/CD Project</title></head>" +
            "<body style='font-family:Arial;text-align:center;margin-top:80px;'>" +
            "<h1>Hello from our AWS CI/CD Pipeline!</h1>" +
            "<p>Built with Jenkins and Maven, ready for Tomcat deployment.</p>" +
            "</body></html>"
        );
    }
}
