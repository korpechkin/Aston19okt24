public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        Dog tuzik = new Dog("Tuzik");
        Cat barsik1 = new Cat("Barsik");
        Dog tuzik1 = new Dog("Tuzik");
        barsik.run(150);
        barsik.run(201);
        barsik1.run(170);
        barsik.swim(1);
        barsik.swim(10);

        tuzik.run(500);
        tuzik.run(501);
        tuzik1.run(400);
        tuzik.swim(10);
        tuzik.swim(11);


        System.out.println("Total animals: " +Animal.getCountAnimal());
        System.out.println("Total cats: "+Cat.getCountCat());
        System.out.println("Total dogs: "+Dog.getCountDod());



    }
}