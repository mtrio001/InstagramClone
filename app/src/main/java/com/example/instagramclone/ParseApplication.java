package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hh0tF3s0Nml0Z2RZgqkUQBfVtOfxqODV54djYr29")
                .clientKey("6Mhjr8YXAU2dmXIRbkXDqXsJBikxfp19blFdqIlZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
