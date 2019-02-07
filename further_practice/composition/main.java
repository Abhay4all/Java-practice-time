
//:::(1):::COMPOSITION::
// ::::ONE CLASS CANOT EXTEND MORE THAN ONE CLASS::
//:::THEREFORE THIS IS A A WAY IN WHICH WE CAN :
// :::CALL DIFFERENT CLASS
//::(2)::IT ALSO RELEAVE ___HAS__A__  RELATIONSHIP::
// :::WITH OTHER CLASS


package interface_onward.composition;

public class main {
    public static void main(String arg[]){
     house thehouse=new house("2","2","3","5");
     park thepark =new park("jain nagar","2017","30x30");
     roads theroad=new roads(5,9);
     district dist=new district(thehouse,thepark,theroad,"karala" );
     System.out.println("from house "+dist.getHouse().getBalcony());
        System.out.println("from house "+dist.getHouse().getKitchen());
        System.out.println("from house "+dist.getHouse().getFloor());
        System.out.println("from house "+dist.getHouse().getRooms());
     System.out.println("from park "+dist.getPark().getdimension());
        System.out.println("from park "+dist.getPark().getlocality());
        System.out.println("from park "+dist.getPark().getyear());
     System.out.println("from district "+dist.getDistrictname());
     System.out.println("from road "+dist.getRoads().getDustbin_on_road()+dist.getRoads().getNo_of_road());
    }
}
