package com.guicetutorial;

import com.google.inject.Singleton;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by anki on 3/30/2018.
 */
@Singleton
public class GuiceServletDemo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try(PrintWriter writer = response.getWriter()){
            writer.write("Hello doGet");
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try(PrintWriter writer = response.getWriter()){
            writer.write("Hello post");
        }
    }
}
