package Tp4.exercice1;

public interface ICar {

    String getColor();
    void setColor(String newColor);
    int getWheelCount();
    void setWheelCount(int newWheelCount);
    int getCurrentGear();
    void setCurrentGear(int newGear);
    int getCurrentSpeed();
    void speedUp(int newSpeed);
    void speedDown(int newSpeed);

}
