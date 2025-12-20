// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class38.java


public class Class38
{

	public static void method870(Class33_Sub6_Sub4_Sub5 arg0, int arg1)
	{
		try
		{
			anInt840++;
			int i = -Class33_Sub6_Sub6.anInt2785 + arg0.anInt3563;
			if(arg0.anInt3571 == 0)
				arg0.anInt3519 = 1024;
			int k = 64 * arg0.anInt3559 + arg0.anInt3550 * 128;
			arg0.anInt3514 = 0;
			arg0.anInt3510 += (k + -arg0.anInt3510) / i;
			if(arg1 >= -118)
				method873((byte)15);
			int j = arg0.anInt3559 * 64 + arg0.anInt3553 * 128;
			if(arg0.anInt3571 == 1)
				arg0.anInt3519 = 1536;
			if(~arg0.anInt3571 == -3)
				arg0.anInt3519 = 0;
			if(~arg0.anInt3571 == -4)
				arg0.anInt3519 = 512;
			arg0.anInt3548 += (j + -arg0.anInt3548) / i;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ld.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static int method871(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			anInt847++;
			int j = arg2 >> 0x6e2dc887;
			int i = arg0 >> 0x615d6067;
			if(i < 0 || ~j > -1 || ~i < -104 || ~j < -104)
				return 0;
			int k = 23 % ((arg3 - -90) / 34);
			int l = arg1;
			if(l < 3 && (Class35.aByteArrayArrayArray761[1][i][j] & 2) == 2)
				l++;
			int i1 = 0x7f & arg0;
			int j1 = arg2 & 0x7f;
			int k1 = Class30.anIntArrayArrayArray645[l][i][j] * (128 + -i1) + Class30.anIntArrayArrayArray645[l][1 + i][j] * i1 >> 0x9bf6a607;
			int l1 = Class30.anIntArrayArrayArray645[l][1 + i][1 + j] * i1 + Class30.anIntArrayArrayArray645[l][i][1 + j] * (128 + -i1) >> 0xbd6b2107;
			return l1 * j1 + k1 * (-j1 + 128) >> 0x209df8a7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ld.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static int method872(int arg0, boolean arg1)
	{
		try
		{
			arg0--;
			anInt849++;
			arg0 |= arg0 >>> 0xbe396a81;
			arg0 |= arg0 >>> 0x350ea222;
			if(arg1)
				method871(-37, 104, -65, 30);
			arg0 |= arg0 >>> 0x2e0da0c4;
			arg0 |= arg0 >>> 0x92e733a8;
			arg0 |= arg0 >>> 0x15d478b0;
			return 1 + arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ld.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method873(byte arg0)
	{
		try
		{
			aClass58_853 = null;
			aClass58_855 = null;
			aClass58_846 = null;
			aClass30_852 = null;
			aClass58_854 = null;
			aShortArrayArray843 = null;
			aClass58_845 = null;
			if(arg0 <= 55)
			{
				return;
			} else
			{
				aClass58_850 = null;
				anIntArray837 = null;
				anIntArray851 = null;
				aClass58_841 = null;
				aClass30_Sub1_848 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ld.A(" + arg0 + ')');
		}
	}

	public static int[] method874(boolean arg0, Class33_Sub15 arg1)
	{
		try
		{
			int i = arg1.anInt2435 >> 0xec45dad0;
			anInt844++;
			if(!Class33_Sub6_Sub2.method305(i, 0x12bcb130))
				return null;
			if(!arg0)
				return null;
			int k = arg1.anInt2356;
			int j = arg1.anInt2443;
			for(int l = arg1.anInt2464; l != -1;)
			{
				Class33_Sub15 class33_sub15 = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[i][0xffff & l];
				j += class33_sub15.anInt2443 + -class33_sub15.anInt2413;
				l = class33_sub15.anInt2464;
				k += -class33_sub15.anInt2353 + class33_sub15.anInt2356;
			}

			int ai[] = new int[2];
			ai[0] = j;
			ai[1] = k;
			return ai;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ld.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anIntArray837[];
	public static int anInt838;
	public static int anInt839;
	public static int anInt840;
	public static Class58 aClass58_841;
	public static int anInt842;
	public static short aShortArrayArray843[][] = {
		{
			6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 
			2983, -11343
		}, {
			8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, 
			-8915, 4783, 1341, 16578, -30533, 25239
		}, {
			25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 
			10153, -8915, 4783, 1341, 16578, -30533
		}, {
			4626, 11146, 6439, 12, 4758, 10270
		}, {
			4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
		}
	};
	public static int anInt844;
	public static Class58 aClass58_845 = Class33_Sub6_Sub11.method535(110, "<col=ff0000>");
	public static Class58 aClass58_846 = Class33_Sub6_Sub11.method535(127, "backvmid1");
	public static int anInt847;
	public static Class30_Sub1 aClass30_Sub1_848;
	public static int anInt849;
	public static Class58 aClass58_850 = Class33_Sub6_Sub11.method535(99, "welle2:");
	public static int anIntArray851[] = new int[4000];
	public static Class30 aClass30_852;
	public static Class58 aClass58_853;
	public static Class58 aClass58_854 = Class33_Sub6_Sub11.method535(115, "Freie Welt");
	public static Class58 aClass58_855 = Class33_Sub6_Sub11.method535(120, "blaugr-Un:");

	static 
	{
		aClass58_853 = Class33_Sub6_Sub11.method535(120, "Loading friend list");
		aClass58_841 = aClass58_853;
	}
}
