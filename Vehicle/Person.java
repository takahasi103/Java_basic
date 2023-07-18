import java.util.Scanner;
class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }
  
  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("身長は" + this.height + "mです");
    System.out.println("体重は" + this.weight + "kgです");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  public void buy(Vehicle vehicle) {
    vehicle.setOwner(this);
  }

  public static Person dataSet() {
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
      return new Person(firstName, lastName, age, height, weight);
    }
  }

}