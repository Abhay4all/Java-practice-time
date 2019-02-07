package interface_onward.composition;

public class district {
    private house House;
    private park Park;
    private roads Roads;
    private String districtname;

    public district(house House,park Park,roads Roads,String districtname){
    this.districtname=districtname;
    this.House=House;
    this.Park=Park;
    this.Roads=Roads;
    }

    public house getHouse() {
        return House;
    }

    public park getPark() {
        return Park;
    }

    public roads getRoads() {
        return Roads;
    }

    public String getDistrictname() {
        return districtname;
    }
}
