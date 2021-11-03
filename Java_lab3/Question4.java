class Number
{
    private double db1;
    private long lg;
    public Number ( )
    {
        db1 = 108.0d;
        lg = 249;
    }
    public Number(double d, long l)
    {
        db1 = d;
        lg = 1;
    }
    public boolean isZero ( )
    {
        if (db1 == 0.0)
            return true;
        else
            return false;
    }
    public boolean isPositive ( )
    {
        if(db1 > 0.0)
            return true;
        else
            return false;
    }
    public boolean isNegative ( )
    {
        if (db1 < 0.0)
            return true ;
        else
            return false;
    }
    public boolean isodd( )
    {
        if (db1 % 2 != 0.0)
            return true;
        else return false;
    }
    public boolean isEven ( )
    {
        if (db1 % 2 == 0.0)
            return true ;
        else return false;
    }
    public boolean isPrime ( )
    {
        int i, lastn;
        double a;
        boolean flag;
        a = Math.sqrt(lg);
        lastn = (int)a;
        flag = true;
        for (i=2; i<lastn; i++)
        {
            if (lg != i)
            {
                if( lg % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            return true;
        else return false;
    }
    public boolean isAmstrong ( )
    {
        if (db1 == 0.0)
            return true;
        else return false;
    }
    public double getFactorial ( )
    {
        double d=1;
        for(int i = 1;i <lg; i++)
            d *=i;
        return d;
    }
    public double getSqrt ( )
    {
        double d;
        d = (double) lg;
        d= Math.sqrt(d);
        return d;
    }
    public double getSqr ( )
    {
        double d;
        d = (double) lg;
        d = d * d;
        return d;
    }
    public double sumDigits( )
    {
        double d=0;
        while( lg>9)
        {
            d += lg % 10;
            lg = lg/10;
        }
        d +=lg;
        return d;
    }
    public double getReverse ( )
    {
        double d =0;
        double temp;
        while (lg>9)
        {
            temp = lg%10;
            d = d * 10 + temp;
            lg = lg/10;
            System.out.println ("\n"+ temp + "\t" + d +" \t "+lg);
        }
        d = d * 10 +lg;
        System.out.println ("Inside class" + d);
        return d;
    }
    public void dispBinary ( )
    {
        System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
    }
    public static void main (String args [ ])
    {
        Number obj = new Number( );
        System.out.println(" The given numbers are 103.7 and 223");
        System.out.println ("isZero " + obj.isZero() );
        System.out.println ("isPositive " + obj. isPositive());
        System.out.println ("isNegative " + obj.isNegative() );
        System.out.println ("isOdd " + obj.isodd());
        System.out.println ("isEven " + obj.isEven());
        System.out.println (" isPrime " +obj.isPrime());
        System.out.println ("getFactorial " + obj.getFactorial());
        System.out.println ("getSqrt " + obj. getSqrt( ));
        System.out.println ("getSqr " + obj.getSqr( ) );
        System.out.println ("sumDigits " + obj.sumDigits( ));
        System.out.println ("getReverse " + obj.getReverse( ));
        obj.dispBinary();
        System.out.println (" isPrime " +obj.isPrime());
    }
}