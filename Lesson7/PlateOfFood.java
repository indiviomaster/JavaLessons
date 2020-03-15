package Lesson7;

public class PlateOfFood {
    private int food;
    public PlateOfFood(int food){
        this.food = food;
    }
    public void decreaseFood(int dFood){
        if (dFood<=this.food){
            this.food -= dFood;
        }
        else {
            this.food = 0;
        }
    }
    public void addFood(int aFood){
        if(aFood>0){
            this.food += aFood;
            System.out.println("Еда добалена в тарелку");
        }
    }
    public int getFood(){
        return this.food;
    }
    @Override
    public String toString() {
        return "В тарелке еды = " + food ;
    }
}
