
            //::::GETTER AND SETTER:::::
            //::::CLASS AND TEST CLASS::::
            //::::::(x.equals):::::::::
package interface_onward.classpractice;

public class car {

    private String model;
    private String country;
    private String owner;

public void setmodel(String model){

    if(model.equals("baleno") || model.equals("ciaz")) {
            this.model = model;
        }
        else this.model="unknown";
    }
    public String getmodel(){
        return this.model;
    }
}
