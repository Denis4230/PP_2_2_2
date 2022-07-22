package Car;

public class CarModel {
    private int number;
    private String model;
    private String carOwner;

    public CarModel(){}

    public CarModel(int number, String model){
        this.number = number;
        this.model = model;
    }
    public CarModel(int number, String model, String carOwner){
        this.number = number;
        this.model = model;
        this.carOwner =carOwner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        return "<<<<<< CarModel : number - " + number + "; model - " + model +
                "; car owner - " + carOwner + " >>>>>>>";
    }
}
