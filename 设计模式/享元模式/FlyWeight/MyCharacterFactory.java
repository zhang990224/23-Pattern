package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
    private Map<Character,MyCharacter> pool;

    public MyCharacterFactory() {
        this.pool = new HashMap<Character, MyCharacter>();
    }

    public MyCharacter getMyCharacter(Character character){
        MyCharacter myCharacter = pool.get(character);
        if (myCharacter==null){
            myCharacter = new MyCharacter(character);
            pool.put(character,myCharacter);
        }
        return myCharacter;
    }
}
