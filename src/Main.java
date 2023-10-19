
public class Main {
    public static void main(String[] args) {
        //Task1: HOW MUCH DO YOU WEIGHT ON MARS?
        /*

        float earthweight;
        float marsweight;
        double marsweightInDouble;
        int marsweightInt;
        earthweight = 83;
        marsweight  = (earthweight*0.38f);
        System.out.println(earthweight + " kg on Earth is " + marsweight + " kg on Mars");
        marsweightInDouble = marsweight;
        System.out.println("Kilograms on Mars after converting to double "+marsweightInDouble);
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsweightInDouble);
        marsweightInt = (int)marsweightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsweightInt);
        char c = (char)marsweightInt;
        System.out.println("The ASCII table equivalent of masrWeigtInInt is: " + c);
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);

        */

        //Task2: EVEN OR NOT EVEN?
        /*

        int RandomNumber = (int) (Math.random() * (100 - 1));
        if(RandomNumber%2 == 0){
            System.out.println(RandomNumber + " is an even number");
        } else {
            System.out.println(RandomNumber + " is an odd number");
        }
         */

        //Task 3 : HOW MANY CONTAINERS FOR BLOCKSNEED?
        /*
        int AmountOfBricks = 91;
        int ContainerCapacity = 2;
        int Containers = AmountOfBricks/ContainerCapacity;
        System.out.println("We have: " + Containers + " full containers");
        int Remainder = AmountOfBricks % ContainerCapacity;
        if (Remainder != 0 ){
            Containers++;
            ContainerCapacity = Remainder;
        }
        System.out.println("Total number of containers: " + Containers);
        System.out.println("Number of blocks in an incomplete container: " + ContainerCapacity);
         */


    }
    }
