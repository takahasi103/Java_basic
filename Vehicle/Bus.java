class Bus extends Car {
    private int passengers;

    Bus(String name, String color, int passengers) {
        super(name, color);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void printData() {
        super.printData();
        System.out.println("乗車人数：" + this.passengers + "人");
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

}
