package org.example;

public class Problem7 {

    public static String frontBack(String stringValue1, String stringValue2){

        int stringValue3 = stringValue1.length()/2;
        int stringValue4= stringValue2.length()/2;

        if(stringValue1.length()%2==1){
            stringValue3=stringValue3+1;
        }
        if(stringValue2.length()%2==1){
            stringValue4=stringValue4+1;
        }
        String output1= stringValue1.substring(0,stringValue3);
        String output2= stringValue2.substring(0,stringValue4);
        String output3=stringValue1.substring(stringValue3);
        String output4=stringValue2.substring(stringValue4);

        return output1+output2+output3+output4;
    }
    public static void main(String[] args) {

        System.out.println(frontBack("abcd","xy"));
        System.out.println(frontBack("abcdefg","xyz"));
    }

}
