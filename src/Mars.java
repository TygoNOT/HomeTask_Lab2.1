public class Mars {
    //Task1: HOW MUCH DO YOU WEIGHT ON MARS?
    public static void main(String[] args) {
        float earthweight;
        float marsweight;
        double marsweightInDouble;
        int marsweightInt;
        earthweight = 83;
        marsweight = (earthweight * 0.38f);
        System.out.println(earthweight + " kg on Earth is " + marsweight + " kg on Mars");
        marsweightInDouble = marsweight;
        System.out.println("Kilograms on Mars after converting to double " + marsweightInDouble);
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsweightInDouble);
        marsweightInt = (int) marsweightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsweightInt);
        char c = (char) marsweightInt;
        System.out.println("The ASCII table equivalent of masrWeigtInInt is: " + c);
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operation on the char type: " + exampleOfMathOnChar);

    }
}