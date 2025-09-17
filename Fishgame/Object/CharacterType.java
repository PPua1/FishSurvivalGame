package FishSurvivalGame;

import java.awt.*;
public enum CharacterType {
    LUCY("Lucy", "โหลดรูปมาใส่"),
    GUK("Guk Guk", "โหลดรูปมาใส่"),
    PACHA("Pa Cha Nga Som", "โหลดรูปมาใส่"),
    YOUNG("Young Prad", "โหลดรูปมาใส่"),
    HAN("Han Bee Tao Sing", "โหลดรูปมาใส่");

    private String displayName(){
        return null;
    }
    private  String imagePath(){
        return null;
    }
    private Image picture(){
        return null;
    }
    CharacterType(String displayName, String imagePath){
    
    }
    public void getSprite(){

    }
}
