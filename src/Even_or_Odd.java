public class Even_or_Odd {
    //Task2: EVEN OR NOT EVEN?
    public static void main(String[] args) {

        int RandomNumber = (int) (Math.random() * (100 - 1));
        if(RandomNumber%2 == 0){
            System.out.println(RandomNumber + " is an even number");}
        else {
            System.out.println(RandomNumber + " is an odd number");}
    }
}
