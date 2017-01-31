/**
 * Created by eugenevendensky on 1/31/17.
 */
public abstract class Pet {

    String petName;
    public void speak(){}
    public void setPetName(String name){
        this.petName = name;
    }
    public String getName(){
        return this.petName;
    }
}
