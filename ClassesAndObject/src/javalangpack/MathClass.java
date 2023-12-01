package javalangpack;

import java.net.Inet4Address;

public class MathClass {
    public static void main(String[] args) {
       /* //absolute means positive values if we give negative it will give positive
        System.out.println("Absolute :"+Math.abs(-123));

        //if we want to get precise values only for example if we are working in float we want to get precise value then we can use StrictMath method
        System.out.println("Absolute :"+StrictMath.abs(-123));

        //Cube Root
        System.out.println("Cube Root :"+Math.cbrt(3));
        //it will  prevent  number to get underflow
        System.out.println("Exact Decrement Value :"+Math.decrementExact(12));
//        System.out.println("Exact Decrement Value :"+Math.decrementExact(Integer.MIN_VALUE));//min 1 it will give overflow error
       *//* int i=Integer.MIN_VALUE;
        --i;
        System.out.println(i);//give some random number in (-)
        //mantisa Exponent
        //if our project depends on lots of computition values then we can use it
        System.out.println("Exponent values in Floating point Representation :"+Math.getExponent(112.33));

        //it will remove the decimal part give round values
        System.out.println("Round Division :"+Math.floorDiv(50,9));

        //Exponent ^power
        System.out.println("e Power x :"+Math.exp(1));
        //perfecxt exponent
        System.out.println("e Power x :"+StrictMath.exp(1));
        System.out.println("Log base 10:"+Math.log10(100));
        System.out.println("Maximum :"+Math.max(100,50));
        System.out.println("Tan :"+Math.tan(45*Math.PI/180));
        System.out.println("Convert into Radians :"+Math.toRadians(90));
        System.out.println("Convert into Degree :"+Math.toDegrees(Math.tanh(1)));
        System.out.println("Convert into Degree :"+StrictMath.toDegrees(Math.tanh(1)));

         */
        //Math.random() this is random number it gives number between 0 to 9
        System.out.println("Random Number :"+Math.random());
        System.out.println("Power :"+Math.pow(2,3));
        System.out.println("Multiply Exact :"+Math.multiplyExact(100,2));
        System.out.println("Next Float Value :"+Math.nextAfter(12.2,13));


    }

}
