package com.evert.stvGame;

/**
 * Created by evert on 15.05.15.
 */

import com.evert.framework.Image;
import com.evert.framework.Music;
import com.evert.framework.Sound;

public class Assets {

    public static Image menu, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
    public static Image button;
    public static Sound click;
    public static Music theme;

    public static void load(SampleGame sampleGame) {
        theme = sampleGame.getAudio().createMusic("menutheme.mp3");
        theme.setLooping(true);
        theme.setVolume(0.85f);
        theme.play();
    }

}