package com.company;

public class PetShop {

    public static void main(String[] args) {
	// write your code here
        Dog kova = new Dog();
        Dog boom = new Dog();
        Cat boots = new Cat();
        Cat salem = new Cat();

        kova.setAge(2);
        kova.setColor("white");
        kova.setName("Kova");

        boom.setAge(11);
        boom.setColor("yellow");
        boom.setName("Boom");

        boots.setAge(4);
        boots.setColor("black and white");
        boots.setName("Boots");

        salem.setAge (7);
        salem.setColor("black");
        salem.setName("Salem");

        System.out.println("We have the following animals available: \n" +salem.getName()+ ": Age- "
        +salem.getAge()+ " Color- " +salem.getColor() +"\n" +boots.getName()+ ": Age- "
                +boots.getAge()+ " Color- " +boots.getColor()+ "\n" +kova.getName()+ ": Age- "
                +kova.getAge()+ " Color- " +kova.getColor()+ "\n" +boom.getName()+ ": Age- "
                +boom.getAge()+ " Color- " +boom.getColor());
    }
}
