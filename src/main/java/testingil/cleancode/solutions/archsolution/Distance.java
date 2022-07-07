package testingil.cleancode.solutions.archsolution;

public class Distance {
    int value = 0;

    public Distance(int value){
        this.value = value;
    }
    public Distance inKm() {
        return new Distance((int) (value*1.6));
    }

}
