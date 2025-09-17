package FishSurvivalScreen;

import FishSurvivalGame.CharacterType;
import FishSurvivalGame.Pipe;
import FishSurvivalGame.Score;
import java.awt.*;
import java.util.*;

public class GameScreen extends Screen{
    private CharacterType Player;
    private ArrayList<Pipe> pipes;
    private Score score;
    private boolean paused;
    private Button puaseButton;
    private Button resumeButton;
    private Button menuButton;

    public Pipe spawnPipe(){
            return null;

    }
    public void render(Graphics g){

    }
    public void pausegame(){

    }
    public void resumeGame(){

    }
    public boolean GameOver(){
            return paused;

    }
    @Override
    public void update(){

    }

}
