public class Caper {
public static void main(String[]args){

    String str1 = "This is Exercise 1";
    String str2 = "This is Exercise 2";


    System.out.println( "String1:"  + str1);
    System.out.println( "String1:"  + str2);


    //compare the two strings

    int result = str1.compareTo( str2);

     //Display the result of the comparison

    System.out.println( "Number:" + result);

       if(result < 0) {
           //  if(result < )
           System.out.println( "" + str1 + "is less than" + str2 );
       }

       if(result == 0){
        System.out.println( ""+ str1 + "is equal to" + str2);
    }

       if(result > 0){
        System.out.println( "" + str1 + "is less than"+ str2);
    }





}

}












