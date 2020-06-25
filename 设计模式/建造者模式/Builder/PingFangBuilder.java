package Builder;

/**
 * 平房工程队
 */
public class PingFangBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房-->墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("平房-->天花板");
    }

    @Override
    public House getHouser() {
        return house;
    }
}
