package pwo;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator
{
    public LucasGenerator(){
        super(BigDecimal.valueOf(1), BigDecimal.valueOf(2));
    }
}