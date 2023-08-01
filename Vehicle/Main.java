import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("【あなたの情報を入力】");
      System.out.println("名前");
      System.out.print("姓:");
      String firstName = scanner.next();
      System.out.print("名:");
      String lastName = scanner.next();
      System.out.print("年齢:");
      int age = scanner.nextInt();
      System.out.print("身長(m):");
      double height = scanner.nextDouble();
      System.out.print("体重(kg):");
      double weight = scanner.nextDouble();
      Person person1 = new Person(firstName, lastName, age, height, weight);

      System.out.println("乗り物を選んで下さい");
      System.out.print("1:自動車, 2:自転車, 3:バス 数字を教えて:");
      int myVehicle = scanner.nextInt();

      System.out.println("");
      
      // if (1 == myVehicle) {
      //   System.out.println("【車の情報を入力して下さい】");
      //   System.out.print("車種:");
      //   String name = scanner.next();
      //   System.out.print("車の色:");
      //   String color = scanner.next();
      //   Car car = new Car(name, color);
      //   person1.buy(car);

      //   System.out.println("【車の情報】");
      //   car.printData();
      //   System.out.println("-----------------");
      //   System.out.println("【車の所有者の情報】");
      //   car.getOwner().printData();
      //   System.out.println("-----------------");
      //   System.out.print("走る距離を入力してください：");
      //   int carDistance = scanner.nextInt();
      //   car.run(carDistance);
      //   System.out.println("-----------------");
      //   System.out.print("給油する量を入力してください：");
      //   int litre = scanner.nextInt();
      //   car.charge(litre);
      // } else if (2 == myVehicle) {
      //   System.out.println("【自転車の情報を入力して下さい】");
      //   System.out.print("車種:");
      //   String name = scanner.next();
      //   System.out.print("自転車の色:");
      //   String color = scanner.next();
      //   Bicycle bicycle = new Bicycle(name, color);
      //   person1.buy(bicycle);

      //   System.out.println("=================");
      //   System.out.println("【自転車の情報】");
      //   bicycle.printData();
      //   System.out.println("-----------------");
      //   System.out.println("【自転車の所有者の情報】");
      //   bicycle.getOwner().printData();
      //   System.out.println("-----------------");
      //   System.out.print("走る距離を入力してください：");
      //   int bicycleDistance = scanner.nextInt();
      //   bicycle.run(bicycleDistance);
      // } else {
      //   System.out.println("乗り物がありません");
      // }

      switch (myVehicle) {
        case 1:
          System.out.println("【車の情報を入力して下さい】");
          System.out.print("車種:");
          String carName = scanner.next();
          System.out.print("車の色:");
          String carColor = scanner.next();
          Car car = new Car(carName, carColor);
          person1.buy(car);
          System.out.println("【車の情報】");
          car.printData();
          System.out.println("-----------------");
          System.out.println("【車の所有者の情報】");
          car.getOwner().printData();
          System.out.println("-----------------");
          System.out.print("走る距離を入力してください：");
          int carDistance = scanner.nextInt();
          car.run(carDistance);
          System.out.println("-----------------");
          System.out.print("給油する量を入力してください：");
          int litre = scanner.nextInt();
          car.charge(litre);
          break;
        case 2:
          System.out.println("【自転車の情報を入力して下さい】");
          System.out.print("車種:");
          String bicycleName = scanner.next();
          System.out.print("自転車の色:");
          String bicycleColor = scanner.next();
          Bicycle bicycle = new Bicycle(bicycleName, bicycleColor);
          person1.buy(bicycle);
          System.out.println("=================");
          System.out.println("【自転車の情報】");
          bicycle.printData();
          System.out.println("-----------------");
          System.out.println("【自転車の所有者の情報】");
          bicycle.getOwner().printData();
          System.out.println("-----------------");
          System.out.print("走る距離を入力してください：");
          int bicycleDistance = scanner.nextInt();
          bicycle.run(bicycleDistance);
          break;
        case 3:
          System.out.println("【バスの情報を入力して下さい");
          System.out.print("目的地:");
          String destinationName = scanner.next();
          System.out.print("バスの色:");
          String busColor = scanner.next();
          System.out.print("乗客人数:");
          int passengers = scanner.nextInt();
          Bus bus = new Bus(destinationName, busColor, passengers);
          person1.buy(bus);
          System.out.println("=================");
          System.out.println("【バスの情報】");
          bus.printData();
          System.out.println("-----------------");
          System.out.println("【バスの運転手の情報】");
          bus.getOwner().printData();
          System.out.println("-----------------");
          System.out.print("走る距離を入力してください：");
          int busDistance = scanner.nextInt();
          bus.run(busDistance);
          System.out.println("-----------------");
          System.out.print("給油する量を入力してください：");
          int busLitre = scanner.nextInt();
          bus.charge(busLitre);
          break;
        default:
          System.out.println("乗り物がありません");
          break;
      }
    }
  }
}