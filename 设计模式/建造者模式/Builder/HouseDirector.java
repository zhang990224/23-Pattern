package Builder;

public class HouseDirector {
    public void makeHouse(HouseBuilder houseBuilder){
        houseBuilder.makeWall();
        houseBuilder.makeFloor();
        houseBuilder.makeHouseTop();
    }
}
