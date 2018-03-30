package com.guicetutorial.module;

import com.google.inject.servlet.ServletModule;
import com.guicetutorial.GuiceServletDemo;

/**
 * Created by anki on 3/30/2018.
 */
public class GuiceWebModule extends ServletModule {

    @Override
    protected void configureServlets() {
        serve("/demo").with(GuiceServletDemo.class);
    }
}
