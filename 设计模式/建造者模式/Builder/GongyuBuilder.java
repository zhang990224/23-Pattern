package Builder;

public class GongyuBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓-->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓-->墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("公寓-->天花板");
    }

    @Override
    public House getHouser() {
        return house;
    }
}
