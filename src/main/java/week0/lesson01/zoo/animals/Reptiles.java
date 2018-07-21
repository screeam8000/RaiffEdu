package week0.lesson01.zoo.animals;

public abstract class Reptiles extends Animal{
    private short tailLength;

    public short getTailLength() {
        return tailLength;
    }

    public Reptiles(String name, String colorDescription, short tailLength) {
        super(name, colorDescription);
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Reptiles{" +
                "tailLenght=" + tailLength +
                ", name='" + name + '\'' +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
