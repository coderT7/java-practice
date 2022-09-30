public class GravityCalculator {
    public static void main(String[] arguments){
        double gravity =9.81; // 重力速度，单位 m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = 0.5*Math.pow(gravity,2)+initialVelocity+initialPosition;
        System.out.println("The object's position after " + fallingTime +" seconds is " + finalPosition + " m.");
    }
}
