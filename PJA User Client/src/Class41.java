// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class41.java


public class Class41
	implements Runnable
{

	public static void method889(int arg0, boolean arg1)
	{
		try
		{
			anInt902++;
			if(Class44.anInt964 == ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0xbf0f2707 && ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0x8f145027 == Class20.anInt387)
				Class44.anInt964 = 0;
			int i = Class31.anInt697;
			if(arg0 != 0x55f8f96e)
				return;
			if(arg1)
				i = 1;
			for(int j = 0; ~i < ~j; j++)
			{
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1;
				int k;
				if(!arg1)
				{
					k = Class33_Sub3.anIntArray2050[j] << 0x55f8f96e;
					class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[j]];
				} else
				{
					k = 0x1ffc000;
					class33_sub6_sub4_sub5_sub1 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305;
				}
				if(class33_sub6_sub4_sub5_sub1 == null || !class33_sub6_sub4_sub5_sub1.method366(true))
					continue;
				class33_sub6_sub4_sub5_sub1.aBoolean3762 = false;
				int l = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548 >> 0x3f67fc27;
				if((Class33_Sub3.aBoolean2058 && ~Class31.anInt697 < -51 || Class31.anInt697 > 200) && !arg1 && ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3499 == ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3569)
					class33_sub6_sub4_sub5_sub1.aBoolean3762 = true;
				int i1 = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 >> 0x6f7f2427;
				if(l < 0 || ~l <= -105 || ~i1 > -1 || i1 >= 104)
					continue;
				if(class33_sub6_sub4_sub5_sub1.aClass33_Sub6_Sub4_Sub3_3756 == null || class33_sub6_sub4_sub5_sub1.anInt3740 > Class33_Sub6_Sub6.anInt2785 || class33_sub6_sub4_sub5_sub1.anInt3742 <= Class33_Sub6_Sub6.anInt2785)
				{
					if((((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548 & 0x7f) == 64 && (((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 & 0x7f) == 64)
					{
						if(~Class82.anInt1789 == ~Class47.anIntArrayArray1037[l][i1])
							continue;
						Class47.anIntArrayArray1037[l][i1] = Class82.anInt1789;
					}
					class33_sub6_sub4_sub5_sub1.anInt3757 = Class38.method871(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548, Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510, -124);
					Class33_Sub2.aClass56_2035.method1000(Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510, class33_sub6_sub4_sub5_sub1.anInt3757, 60, class33_sub6_sub4_sub5_sub1, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3549, k, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).aBoolean3518);
				} else
				{
					class33_sub6_sub4_sub5_sub1.aBoolean3762 = false;
					class33_sub6_sub4_sub5_sub1.anInt3757 = Class38.method871(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548, Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510, -37);
					Class33_Sub2.aClass56_2035.method976(Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510, class33_sub6_sub4_sub5_sub1.anInt3757, 60, class33_sub6_sub4_sub5_sub1, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3549, k, class33_sub6_sub4_sub5_sub1.anInt3748, class33_sub6_sub4_sub5_sub1.anInt3772, class33_sub6_sub4_sub5_sub1.anInt3765, class33_sub6_sub4_sub5_sub1.anInt3737);
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mb.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method890(int arg0)
	{
		aLongArray907 = null;
		aClass58_913 = null;
		aClass58_909 = null;
		aClass58_908 = null;
		aClass58_904 = null;
		aClass30_905 = null;
		aClass15_899 = null;
		anIntArray914 = null;
		if(arg0 != 0)
			aClass58_913 = null;
	}

	public static int method891(int arg0)
	{
		try
		{
			if(arg0 != 20131)
				method889(-108, true);
			anInt903++;
			return Class33_Sub18.anInt2513++;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mb.D(" + arg0 + ')');
		}
	}

	public Class41()
	{
	}

	public void run()
	{
		try
		{
			anInt910++;
			try
			{
				do
				{
					Class33_Sub20 class33_sub20;
					synchronized(Class33_Sub6_Sub4.aClass4_2739)
					{
						class33_sub20 = (Class33_Sub20)Class33_Sub6_Sub4.aClass4_2739.method68(18823);
					}
					if(class33_sub20 == null)
					{
						Class33_Sub6_Sub17.method593(0, 100L);
						synchronized(Class33_Sub6_Sub10.anObject2864)
						{
							if(Class33_Sub19.anInt2542 <= 1)
							{
								Class33_Sub19.anInt2542 = 0;
								Class33_Sub6_Sub10.anObject2864.notifyAll();
								return;
							}
							Class33_Sub19.anInt2542--;
						}
					} else
					{
						if(~class33_sub20.anInt2572 == -1)
						{
							class33_sub20.aClass12_2557.method115(class33_sub20.aByteArray2570, (byte)114, class33_sub20.aByteArray2570.length, (int)((Class33) (class33_sub20)).aLong747);
							synchronized(Class33_Sub6_Sub4.aClass4_2739)
							{
								class33_sub20.method266(-59);
							}
						} else
						if(class33_sub20.anInt2572 == 1)
						{
							class33_sub20.aByteArray2570 = class33_sub20.aClass12_2557.method109((byte)-101, (int)((Class33) (class33_sub20)).aLong747);
							synchronized(Class33_Sub6_Sub4.aClass4_2739)
							{
								client.aClass4_1933.method63(class33_sub20, (byte)24);
							}
						}
						synchronized(Class33_Sub6_Sub10.anObject2864)
						{
							if(~Class33_Sub19.anInt2542 >= -2)
							{
								Class33_Sub19.anInt2542 = 0;
								Class33_Sub6_Sub10.anObject2864.notifyAll();
								return;
							}
							Class33_Sub19.anInt2542 = 600;
						}
					}
				} while(true);
			}
			catch(Exception exception)
			{
				Class50.method938((byte)-91, exception, null);
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mb.run(" + ')');
		}
	}

	public static void method892(Class30 arg0, int arg1)
	{
		try
		{
			Class33_Sub13_Sub3.aClass30_3240 = arg0;
			if(arg1 != 0xbf0f2707)
				aClass58_904 = null;
			anInt911++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mb.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static Class15 aClass15_899;
	public static int anInt900;
	public static int anInt901 = -1;
	public static int anInt902;
	public static int anInt903;
	public static Class58 aClass58_904;
	public static Class30 aClass30_905;
	public static int anInt906;
	public static long aLongArray907[] = new long[32];
	public static Class58 aClass58_908 = Class33_Sub6_Sub11.method535(108, "blinken3:");
	public static Class58 aClass58_909 = Class33_Sub6_Sub11.method535(113, "Okay");
	public static int anInt910;
	public static int anInt911;
	public static int anInt912;
	public static Class58 aClass58_913;
	public static int anIntArray914[] = new int[2000];
	public static int anInt915;
	public static int anInt916 = 0;

	static 
	{
		aClass58_904 = Class33_Sub6_Sub11.method535(106, "Your ignore list is full)3 Max of 100 hit");
		aClass58_913 = aClass58_904;
	}
}
