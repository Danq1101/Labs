package PZ3.Animal;

class Main{
    public static void main(String[] args) {
//        Cat cat1 = new Cat(2, 18, "Pog", 6);
//        Cat cat = new Cat(cat1);
//        Cat cat2 = new Cat(2, 18, "pis9", 6);
//        System.out.println(animal.getAge() + " " + animal.getWeight() + " " + animal.getName());
//        System.out.println(cat.getAge() + " " + cat.getWeight() + " " + cat.getName() + " " + cat.getNumberOfRats());
//        cat.show();
//        cat.voice();

        boolean hui = false;

        Fish animal = new Fish(2, 1.8, "Boboka", hui);
        try{
            if (animal.isCheckVoice()) {
                animal.voice();
            } else {
                throw new Exception("Fish cant make a voice");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

