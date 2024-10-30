public class Cash extends Asset {
    public Cash(String name, double value) {
        super(name, value);
    }
    
    @Override
    public double getValue() {
        return super.value;
    }
} 