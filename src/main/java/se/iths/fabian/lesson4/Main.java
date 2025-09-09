package se.iths.fabian.lesson4;

public class Main {
    public static void main(String[] args) {
        //Person
        Person anna = new Person("Anna", 25, "Stockholm");
        anna.setAge(80);
        anna.introduce();
        System.out.println(anna.getAge());

        //Rectangle
        Rectangle rectangle = new Rectangle(10, 25);
        System.out.println(rectangle.area());

        //Student
        Student fabian = new Student("Fabian", 12345);
        fabian.setGrade("A");
        fabian.printInfo();

        //Bankaccount
        BankAccount bankAccount = new BankAccount(123);
        bankAccount.deposit(10000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(5000);
        bankAccount.withdraw(3000);
        bankAccount.getBalance();

        //Email
        Email newEmail = new Email();
        newEmail.setTo("kalle@gmail.com");
        newEmail.setFrom("erik@gmail.com");
        newEmail.setSubject("Hej");
        newEmail.setMessage("Hej det här är ett test!");
        newEmail.setCc("ylwa@gmail.com");

        Email newEmail2 = new Email();
        newEmail2.setTo("kalle@gmail.com");
        newEmail2.setFrom("erik@gmail.com");
        newEmail2.setSubject("Hej");
        newEmail2.setMessage("Hej det här är ett test!");

        newEmail.send();
        newEmail2.send();

        //Car
        Car newCar = new Car();
        newCar.start();
        newCar.accelerate(10);
        newCar.accelerate(20);
        System.out.println(newCar.getSpeed());
        newCar.stop();
        System.out.println(newCar.getSpeed());
        newCar.stop();
    }
}
