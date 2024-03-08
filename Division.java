public class Division implements MathOperation {
    @Override
    public double calculate(double left, double right) {
        if (right != 0) {
            return left / right;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
    }
}