package com.at.myapplication.main.model;

/**
 * Created by adamthompson on 9/3/16.
 */
public class GameData {
    private static GameData ourInstance = new GameData();

    public static GameData getInstance() {
        return ourInstance;
    }


    private boolean started;


    private GameData() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
