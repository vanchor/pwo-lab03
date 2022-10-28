package pwo;

import java.math.BigDecimal;

public class FibonacciGenerator 
{
    protected int lastIndex = 0;
    protected BigDecimal current = new BigDecimal(0);
    protected BigDecimal startValue = new BigDecimal(0);

    protected BigDecimal
        f_1 = new BigDecimal(1),
        f_2 = new BigDecimal(0);
    
    public FibonacciGenerator(){}
    
    protected FibonacciGenerator(BigDecimal f_1, BigDecimal f_2){
        this.f_1 = f_1;
        this.f_2 = f_2;
        
        this.current = f_2;
        this.startValue = f_2;
    }

    public void reset() 
    {
        lastIndex = 0;
        current = startValue;
        f_1 = new BigDecimal(1);
        f_2 = startValue;
    }

    public BigDecimal nextTerm() 
    {
        if(lastIndex>1) 
        {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        }
        else if(lastIndex==1) current = new BigDecimal(1);
        else current = startValue;

        lastIndex++;

        return current;
    }

    public BigDecimal getTerm(int i) 
    {
        if(i<0) throw new IllegalArgumentException();
        if(i < lastIndex) reset();
        while (lastIndex <= i) nextTerm();
        return current;
    }
}