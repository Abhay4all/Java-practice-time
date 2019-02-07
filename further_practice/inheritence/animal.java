package interface_onward.inheritence;

public class animal {
 private String name;
 private String size;
 private String brain;
 private String weight;

 public animal(String name,String size,String brain,String weight){
  this.name=name;
  this.size=size;
  this.weight=weight;
  this.brain=brain;
 }


 public void eat(){
 System.out.println("Animal eat method");
 }
 public void move(int speed){
  System.out.println("animal speed is "+speed);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
