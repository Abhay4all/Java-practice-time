package interface_onward.composition;

public class park {
    private String locality;
    private String year;
    private String dimension;
    public park(String locality,String year,String dimension){
        this.dimension=dimension;
        this.year=year;
        this.locality=locality;
    }
    public String getlocality(){
        return locality;
    }
    public String getdimension(){
        return dimension;
    }
    public String getyear(){
        return dimension;
    }
}
