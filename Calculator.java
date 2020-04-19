public abstract class Calculator implements Multiplier,Divider{
    protected int total;

    public Calculator(){
        total = 1;
    }
    public Calculator(int x){
        total = x;
    }
    @Override
    public void multiply(int y){
        total = total * y;
    }

    @Override
    public void divide(int y){
        total = total / y;
    }

    abstract int calculate();
}
