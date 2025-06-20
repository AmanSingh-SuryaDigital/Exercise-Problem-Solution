package org.example;

public class Problem7 {

    public static String mergeFrontAndBackHalves(String firstInput, String secondInput) {

        if(firstInput.length()<2  && secondInput.length()<2){
            return "Input length is not valid ,Length should be more than equals to 2";
        }

        int firstInputMidIndex = firstInput.length() / 2;
        int secondInputMidIndex = secondInput.length() / 2;

        if (firstInput.length() % 2 == 1) {
            firstInputMidIndex += 1;
        }

        if (secondInput.length() % 2 == 1) {
            secondInputMidIndex += 1;
        }

        String firstOutputFrontHalf = firstInput.substring(0, firstInputMidIndex);
        String secondOutputFrontHalf = secondInput.substring(0, secondInputMidIndex);
        String firstOutputBackHalf = firstInput.substring(firstInputMidIndex);
        String secondOutputBackHalf = secondInput.substring(secondInputMidIndex);

        return firstOutputFrontHalf + secondOutputFrontHalf + firstOutputBackHalf + secondOutputBackHalf;
    }

    public static void main(String[] args) {

        System.out.println(mergeFrontAndBackHalves("abcd","xy"));
        System.out.println(mergeFrontAndBackHalves("abcdefg","xyz"));
    }

}
