package com.guicetutorial.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.guicetutorial.module.GuiceWebModule;

public class GuiceWebConfigListener extends GuiceServletContextListener{

    protected Injector getInjector() {
        return Guice.createInjector(new GuiceWebModule());
    }
}