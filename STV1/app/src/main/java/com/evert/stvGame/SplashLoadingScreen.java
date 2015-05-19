package com.evert.stvGame;

import com.evert.framework.Game;
import com.evert.framework.Graphics;
import com.evert.framework.Screen;
import com.evert.framework.Graphics.ImageFormat;

/**
 * Created by evert on 15.05.15.
 */
public class SplashLoadingScreen extends Screen {
    public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.splash= g.newImage("splash.jpg", ImageFormat.RGB565);


        game.setScreen(new LoadingScreen(game));

    }

    @Override
    public void paint(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }
}