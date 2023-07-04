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
      Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

      Car car = new Car("フェラーリ", "赤");
      Bicycle bicycle = new Bicycle("ビアンキ", "緑");
      
      person1.buy(car);
      
      person2.buy(bicycle);

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
    }
  }
}