// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class77_Sub1.java


public class Class77_Sub1 extends Class77
{

    public int method1172(int arg0, int arg1, int arg2) {
    	int i;
    	try {
    	    long l = (long) arg2 * 1000000L;
    	    long l_0_ = aLong2620 - System.nanoTime();
    	    if (l_0_ < l)
    		l_0_ = l;
    	    if (arg0 != 1772870664)
    		method1168(119);
    	    Class33_Sub6_Sub17.method593(0, l_0_ / 1000000L);
    	    long l_1_ = System.nanoTime();
    	    int i_2_;
    	    for (i_2_ = 0;
    		 ((i_2_ ^ 0xffffffff) > -11
    		  && (-2 < (i_2_ ^ 0xffffffff)
    		      || ((aLong2620 ^ 0xffffffffffffffffL)
    			  > (l_1_ ^ 0xffffffffffffffffL))));
    		 aLong2620 += 1000000L * (long) arg1)
    		i_2_++;
    	    if ((l_1_ ^ 0xffffffffffffffffL)
    		< (aLong2620 ^ 0xffffffffffffffffL))
    		aLong2620 = l_1_;
    	    i = i_2_;
    	} catch (RuntimeException runtimeexception) {
    	    throw runtimeexception;
    	}
    	return i;
        }

	public void method1168(int arg0)
	{
		aLong2620 = System.nanoTime();
		if(arg0 >= -64)
			aLong2620 = 94L;
	}

	public Class77_Sub1()
	{
		method1168(-105);
	}

	public void method1170(byte arg0)
	{
		if(arg0 > -39)
			aLong2620 = -78L;
		method1168(-83);
	}

	public long aLong2620;
}
