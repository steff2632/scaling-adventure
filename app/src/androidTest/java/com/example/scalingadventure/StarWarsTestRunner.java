package com.example.scalingadventure;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

/**
 * Created by stefanmay on 18/11/2016.
 */

public class StarWarsTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        String testApplicationClassName = TestStarWarsApplication.class.getCanonicalName();
        return super.newApplication(cl, testApplicationClassName, context);
    }
}
