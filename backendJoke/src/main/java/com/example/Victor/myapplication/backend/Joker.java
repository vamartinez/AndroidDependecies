package com.example.Victor.myapplication.backend;

import com.example.JokerJavaGenerator;

/**
 * Created by Victor on 12/5/16.
 */
public class Joker {

    public String getJoke() {
        JokerJavaGenerator myJoker = new JokerJavaGenerator();
        return myJoker.getJoke();
    }
}
