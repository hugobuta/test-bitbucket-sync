public class Division implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        if (right != 0) {
            return left / right;
        } else {
            throw new IllegalArgumentException("This is very wrong, dividing by zero");
        }
    }
}