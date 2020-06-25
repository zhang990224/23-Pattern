package Builder;

public interface HouseBuilder {
    //修地板
    public void makeFloor();
    //修墙
    public void makeWall();
    //修天花板
    public void makeHouseTop();

    public House getHouser();
}
