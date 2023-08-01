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
        System.out.println("目的地:" + this.getName());
        System.out.println("バスの色:" + this.getColor());
        System.out.println("乗車人数：" + this.passengers + "人");
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void run(int distance) {
        super.run(distance);
        if (distance >= 50) {
            System.out.println(this.getName() + "に到着しました。");
        }
    }

}
