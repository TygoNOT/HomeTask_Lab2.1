public class Lego_Bricks_Calculator {
    //Task 3 : HOW MANY CONTAINERS FOR BLOCKSNEED?
    public static void main(String[] args) {

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

    }
}
