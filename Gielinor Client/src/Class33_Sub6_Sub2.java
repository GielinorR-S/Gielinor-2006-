// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub2.java

import java.util.zip.CRC32;

public class Class33_Sub6_Sub2 extends Class33_Sub6
{

	public static void method304(int arg0, int arg1, byte arg2[], int arg3, Class70 arg4[], int arg5, int arg6)
	{
		try
		{
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 64; j++)
				{
					for(int k = 0; ~k > -65; k++)
						if(~(j + arg0) < -1 && ~(arg0 - -j) > -104 && ~(arg3 + k) < -1 && ~(arg3 - -k) > -104)
							arg4[i].anIntArrayArray1499[arg0 - -j][k + arg3] = Class12.method110(arg4[i].anIntArrayArray1499[arg0 - -j][k + arg3], 0xfeffffff);

				}

			}

			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg2);
			anInt2692++;
			for(int l = 0; ~l > -5; l++)
			{
				for(int i1 = 0; i1 < 64; i1++)
				{
					for(int j1 = 0; j1 < 64; j1++)
						Class44.method906(0, (byte)125, arg5, class33_sub11, l, arg3 + j1, arg0 + i1, arg6);

				}

			}

			if(arg1 != 22335)
			{
				method305(43, 99);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dd.A(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static boolean method305(int arg0, int arg1)
	{
		try
		{
			anInt2681++;
			if(Class33_Sub6_Sub1.aBooleanArray2671[arg0])
				return true;
			if(arg1 != 0x12bcb130)
				method306(null, (byte)-86, true, null, null);
			if(!Class33_Sub11.aClass30_2257.method226(arg0, arg1 ^ 0x12bcb114))
				return false;
			int i = Class33_Sub11.aClass30_2257.method218(arg0, false);
			if(~i == -1)
			{
				Class33_Sub6_Sub1.aBooleanArray2671[arg0] = true;
				return true;
			}
			if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0] == null)
				Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0] = new Class33_Sub15[i];
			for(int j = 0; ~i < ~j; j++)
				if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][j] == null)
				{
					byte abyte0[] = Class33_Sub11.aClass30_2257.method238(false, j, arg0);
					if(abyte0 != null)
					{
						Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][j] = new Class33_Sub15();
						Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][j].anInt2435 = j + (arg0 << 0x12bcb130);
						if(abyte0[0] == -1)
							Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][j].method793(new Class33_Sub11(abyte0), -76);
						else
							Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][j].method786(-21637, new Class33_Sub11(abyte0));
					}
				}

			Class33_Sub6_Sub1.aBooleanArray2671[arg0] = true;
			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dd.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method306(Class33_Sub6_Sub7_Sub2 arg0, byte arg1, boolean arg2, Class30 arg3, Class30 arg4)
	{
		try
		{
			anInt2686++;
			Class33_Sub6_Sub8.aClass30_2809 = arg3;
			Class22.aClass30_413 = arg4;
			Class35.aBoolean759 = arg2;
			Class23.anInt432 = Class22.aClass30_413.method218(10, false);
			Class33_Sub6_Sub15.aClass33_Sub6_Sub7_Sub2_3057 = arg0;
			int i = -13 % (arg1 / 44);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dd.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method307(int arg0)
	{
		try
		{
			aClass58_2682 = null;
			aClass58_2696 = null;
			anIntArray2689 = null;
			aClass58_2693 = null;
			aClass58_2687 = null;
			if(arg0 != 10)
				aClass58_2698 = null;
			aClass58_2690 = null;
			aClass78_2701 = null;
			aClass58_2700 = null;
			aCRC32_2691 = null;
			aClass58Array2699 = null;
			aClass58_2702 = null;
			aClass58_2698 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dd.B(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub2()
	{
	}

	public static int anInt2681;
	public static Class58 aClass58_2682 = Class33_Sub6_Sub11.method535(108, "gleiten:");
	public static boolean aBoolean2683 = false;
	public int anInt2684;
	public byte aByte2685;
	public static int anInt2686;
	public static Class58 aClass58_2687 = Class33_Sub6_Sub11.method535(102, "backbase1");
	public Class30_Sub1 aClass30_Sub1_2688;
	public static int anIntArray2689[] = {
		1, 0, -1, 0
	};
	public static Class58 aClass58_2690 = Class33_Sub6_Sub11.method535(109, "Handel akzeptieren");
	public static CRC32 aCRC32_2691 = new CRC32();
	public static int anInt2692;
	public static Class58 aClass58_2693;
	public static int anInt2694 = 0;
	public static int anInt2695 = 0x766654;
	public static Class58 aClass58_2696 = Class33_Sub6_Sub11.method535(105, "M");
	public static int anInt2697 = 0;
	public static Class58 aClass58_2698;
	public static Class58 aClass58Array2699[];
	public static Class58 aClass58_2700 = Class33_Sub6_Sub11.method535(116, "cross");
	public static Class78 aClass78_2701;
	public static Class58 aClass58_2702 = Class33_Sub6_Sub11.method535(123, "Ladevorgang )2 bitte warten Sie)3");

	static 
	{
		aClass58_2693 = Class33_Sub6_Sub11.method535(115, "On");
		aClass58_2698 = aClass58_2693;
	}
}
