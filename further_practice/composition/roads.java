package interface_onward.composition;

public class roads {
    private int dustbin_on_road;
    private int no_of_road;

    public roads(int dustbin_on_road,int no_of_road){
     this.dustbin_on_road=dustbin_on_road;
     this.no_of_road=no_of_road;
    }

    public int getDustbin_on_road() {
        return dustbin_on_road;
    }

    public int getNo_of_road() {
        return no_of_road;
    }
}
