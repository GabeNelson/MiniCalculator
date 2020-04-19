public class MiniCalculator extends Calculator {
    @Override
    public int calculate(){
        return total;
    }
    public MiniCalculator(){
        super();
    }
    public MiniCalculator(int x){
        super(x);
    }
}
