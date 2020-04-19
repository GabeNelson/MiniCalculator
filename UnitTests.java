public class UnitTests {
    public static void main(String[] args){
        multiplyTest();
        divideTest();
        calculateTest();
    }
    public static void multiplyTest(){
        MiniCalculator test1 = new MiniCalculator(5);
        test1.multiply(6);
        if(test1.total != 30){
            System.out.println("Failed multiply");
        }
        else{
            System.out.println("Successful multiply");
        }
        MiniCalculator test2 = new MiniCalculator(5);
        test2.multiply(-6);
        if(test2.total != -30){
            System.out.println("Failed to multiply negative");
        }
        else{
            System.out.println("Successful multiply negative");
        }
        MiniCalculator test3 = new MiniCalculator(5);
        test3.multiply(0);
        if(test3.total != 0){
            System.out.println("Failed to multiply by 0");
        }
        else{
            System.out.println("Successfully multiplied by 0");
        }
    }
    public static void divideTest(){
        MiniCalculator test1 = new MiniCalculator(10);
        test1.divide(2);
        if(test1.total != 5){
            System.out.println("Failed to divide by an integer");
        }
        else{
            System.out.println("Successfully divided by integer");
        }
        MiniCalculator test2 = new MiniCalculator(10);
        test2.divide(-2);
        if(test2.total != -5){
            System.out.println("Failed to divide by a negative int");
        }
        else{
            System.out.println("Successfully divided by a negative int");
        }
    }
    public static void calculateTest(){
        MiniCalculator test1 = new MiniCalculator(10);
        test1.calculate();
        if(test1.total != 10){
            System.out.println("Failed to return total");
        }
        else{
            System.out.println("Successfully returned total");
        }
    }
}
