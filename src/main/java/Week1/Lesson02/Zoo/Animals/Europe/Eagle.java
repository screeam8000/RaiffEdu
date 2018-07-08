package Week1.Lesson02.Zoo.Animals.Europe;

import Week1.Lesson02.Zoo.Animals.Birds;

public class Eagle extends Birds {
    private int eyeStrength;

    public int getEyeStrength() {
        return eyeStrength;
    }

    public void setEyeStrength(int eyeStrength) {
        this.eyeStrength = eyeStrength;
    }

    public Eagle(String name, String colorDescription, short wingSize, int eyeStrength;){
        super(name, colorDescription, wingSize);
        this.eyeStrength = eyeStrength;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "eyeStrenght=" + eyeStrength +
                ", name='" + name + '\'' +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
