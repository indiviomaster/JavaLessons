package Lesson7;

public class HungryCat {
    private String name;
    private int hunger;

    public boolean isFullness() {
        return fullness;
    }

    private boolean fullness;
    public HungryCat(String name, int hunger){
        this.fullness = false;
        this.name = name;
        this.hunger = hunger;
    }
    public void Feed(PlateOfFood plate){
        if (hunger< plate.getFood()){
            plate.decreaseFood(hunger);
            //System.out.println("Кот "+this.name+" наелся.");
            this.fullness = true;
            return;
        }
        //System.out.println("Для кота "+this.name+" еды в тарелке не достаточно.");
        return;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }
}
