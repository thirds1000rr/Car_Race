package com.raceofroad.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;

public class BaseScene extends ScreenAdapter {
    protected RaceOfRoadGame raceOfRoadGame;
    private boolean keyHandled;

    public BaseScene(RaceOfRoadGame raceOfRoadGame) {
        this.raceOfRoadGame = raceOfRoadGame;
        this.keyHandled = false;
        Gdx.input.setCatchBackKey(true);
        Gdx.input.setCatchMenuKey(true);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (Gdx.input.isKeyPressed(Input.Keys.BACK)) {
            if (keyHandled) {
                return;
            }
            handleBackPress();
            keyHandled = true;
        } else {
            keyHandled = false;
        }
    }

    protected void handleBackPress() {
        System.out.println("Back");
    }
}
