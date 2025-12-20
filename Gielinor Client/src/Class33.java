// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33.java


public class Class33
{

	public boolean method261(int arg0)
	{
		try
		{
			if(arg0 < 20)
				method261(22);
			anInt721++;
			return aClass33_739 != null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.BB(" + arg0 + ')');
		}
	}

	public static void method262(int arg0)
	{
		try
		{
			anInt731++;
			int i = 15 % ((arg0 - -30) / 45);
			for(Class33_Sub4 class33_sub4 = (Class33_Sub4)Class31.aClass4_684.method68(18823); class33_sub4 != null; class33_sub4 = (Class33_Sub4)Class31.aClass4_684.method66((byte)-126))
			{
				if(class33_sub4.aClass33_Sub13_Sub1_2074 != null)
				{
					Class78.aClass33_Sub13_Sub2_1670.method738(class33_sub4.aClass33_Sub13_Sub1_2074);
					class33_sub4.aClass33_Sub13_Sub1_2074 = null;
				}
				if(class33_sub4.aClass33_Sub13_Sub1_2064 != null)
				{
					Class78.aClass33_Sub13_Sub2_1670.method738(class33_sub4.aClass33_Sub13_Sub1_2064);
					class33_sub4.aClass33_Sub13_Sub1_2064 = null;
				}
			}

			Class31.aClass4_684.method67(125);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.SA(" + arg0 + ')');
		}
	}

	public static RuntimeException_Sub1 method263(Throwable arg0, String arg1)
	{
		try
		{
			anInt726++;
			RuntimeException_Sub1 runtimeexception_sub1;
			if(arg0 instanceof RuntimeException_Sub1)
			{
				runtimeexception_sub1 = (RuntimeException_Sub1)arg0;
				runtimeexception_sub1.aString1817 += ' ' + arg1;
			} else
			{
				runtimeexception_sub1 = new RuntimeException_Sub1(arg0, arg1);
			}
			return runtimeexception_sub1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public static Class33_Sub6_Sub12 method264(int arg0, int arg1)
	{
		try
		{
			anInt736++;
			Class33_Sub6_Sub12 class33_sub6_sub12 = (Class33_Sub6_Sub12)Class33_Sub6_Sub12.aClass16_2957.method144(0, arg0);
			if(class33_sub6_sub12 != null)
				return class33_sub6_sub12;
			byte abyte0[] = Class33_Sub13_Sub3.aClass30_3240.method238(false, arg0, 4);
			class33_sub6_sub12 = new Class33_Sub6_Sub12();
			if(abyte0 != null)
				class33_sub6_sub12.method548(new Class33_Sub11(abyte0), arg0, arg1 ^ 0xffffd2b1);
			class33_sub6_sub12.method544(arg1);
			Class33_Sub6_Sub12.aClass16_2957.method145(arg0, (byte)-113, class33_sub6_sub12);
			return class33_sub6_sub12;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.EB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method265(boolean arg0)
	{
		int i = 64 + Class16.anInt313 * 128;
		anInt729++;
		int j = 64 + Class57.anInt1242 * 128;
		int k = Class38.method871(i, Class77_Sub2.anInt2645, j, -126) - Class33_Sub6_Sub8.anInt2800;
		if(~Class58.anInt1907 > ~j)
		{
			Class58.anInt1907 += Class31.anInt702 + (Class70.anInt1510 * (-Class58.anInt1907 + j)) / 1000;
			if(~Class58.anInt1907 < ~j)
				Class58.anInt1907 = j;
		}
		if(~k < ~Class71.anInt1516)
		{
			Class71.anInt1516 += Class31.anInt702 - -(((-Class71.anInt1516 + k) * Class70.anInt1510) / 1000);
			if(~Class71.anInt1516 < ~k)
				Class71.anInt1516 = k;
		}
		if(!arg0)
			aClass15_744 = null;
		if(~k > ~Class71.anInt1516)
		{
			Class71.anInt1516 -= Class31.anInt702 - -(((Class71.anInt1516 - k) * Class70.anInt1510) / 1000);
			if(~k < ~Class71.anInt1516)
				Class71.anInt1516 = k;
		}
		if(~Class33_Sub6_Sub4_Sub5.anInt3509 > ~i)
		{
			Class33_Sub6_Sub4_Sub5.anInt3509 += (Class70.anInt1510 * (i - Class33_Sub6_Sub4_Sub5.anInt3509)) / 1000 + Class31.anInt702;
			if(Class33_Sub6_Sub4_Sub5.anInt3509 > i)
				Class33_Sub6_Sub4_Sub5.anInt3509 = i;
		}
		if(~i > ~Class33_Sub6_Sub4_Sub5.anInt3509)
		{
			Class33_Sub6_Sub4_Sub5.anInt3509 -= (Class70.anInt1510 * (Class33_Sub6_Sub4_Sub5.anInt3509 + -i)) / 1000 + Class31.anInt702;
			if(Class33_Sub6_Sub4_Sub5.anInt3509 < i)
				Class33_Sub6_Sub4_Sub5.anInt3509 = i;
		}
		if(~j > ~Class58.anInt1907)
		{
			Class58.anInt1907 -= Class31.anInt702 - -(((-j + Class58.anInt1907) * Class70.anInt1510) / 1000);
			if(Class58.anInt1907 < j)
				Class58.anInt1907 = j;
		}
		i = 64 + 128 * Class31.anInt689;
		j = Class69.anInt1474 * 128 - -64;
		k = Class38.method871(i, Class77_Sub2.anInt2645, j, 97) + -Class19.anInt374;
		int j1 = -Class58.anInt1907 + j;
		int l = i + -Class33_Sub6_Sub4_Sub5.anInt3509;
		int i1 = k + -Class71.anInt1516;
		int k1 = (int)Math.sqrt(l * l - -(j1 * j1));
		int l1 = (int)(Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
		int i2 = 0x7ff & (int)(-325.94900000000001D * Math.atan2(l, j1));
		if(~l1 > -129)
			l1 = 128;
		int j2 = -Class14.anInt275 + i2;
		if(l1 > 383)
			l1 = 383;
		if(j2 > 1024)
			j2 -= 2048;
		if(j2 < -1024)
			j2 += 2048;
		if(j2 > 0)
		{
			Class14.anInt275 += Class33_Sub12.anInt2315 + (j2 * Class14.anInt281) / 1000;
			Class14.anInt275 &= 0x7ff;
		}
		if(~j2 > -1)
		{
			Class14.anInt275 -= Class33_Sub12.anInt2315 - -((-j2 * Class14.anInt281) / 1000);
			Class14.anInt275 &= 0x7ff;
		}
		int k2 = -Class14.anInt275 + i2;
		if(k2 > 1024)
			k2 -= 2048;
		if(~l1 < ~Class33_Sub11.anInt2270)
		{
			Class33_Sub11.anInt2270 += (Class14.anInt281 * (l1 - Class33_Sub11.anInt2270)) / 1000 + Class33_Sub12.anInt2315;
			if(Class33_Sub11.anInt2270 > l1)
				Class33_Sub11.anInt2270 = l1;
		}
		if(k2 < -1024)
			k2 += 2048;
		if(k2 < 0 && ~j2 < -1 || k2 > 0 && ~j2 > -1)
			Class14.anInt275 = i2;
		if(~l1 > ~Class33_Sub11.anInt2270)
		{
			Class33_Sub11.anInt2270 -= Class33_Sub12.anInt2315 - -(((Class33_Sub11.anInt2270 - l1) * Class14.anInt281) / 1000);
			if(~l1 < ~Class33_Sub11.anInt2270)
				Class33_Sub11.anInt2270 = l1;
		}
	}

	public void method266(int arg0)
	{
		try
		{
			anInt728++;
			if(arg0 >= -12)
				return;
			if(aClass33_739 == null)
			{
				return;
			} else
			{
				aClass33_739.aClass33_735 = aClass33_735;
				aClass33_735.aClass33_739 = aClass33_739;
				aClass33_735 = null;
				aClass33_739 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.VA(" + arg0 + ')');
		}
	}

	public static void method267(byte arg0)
	{
		try
		{
			if(arg0 != 84)
				return;
			int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-61, 8);
			anInt722++;
			if(Class31.anInt697 > i)
			{
				for(int j = i; Class31.anInt697 > j; j++)
					Class33_Sub6_Sub13.anIntArray2988[Class74.anInt1587++] = Class33_Sub3.anIntArray2050[j];

			}
			if(~i < ~Class31.anInt697)
				throw new RuntimeException("gppov1");
			Class31.anInt697 = 0;
			for(int k = 0; ~i < ~k; k++)
			{
				int l = Class33_Sub3.anIntArray2050[k];
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
				int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-85, 1);
				if(i1 == 0)
				{
					Class33_Sub3.anIntArray2050[Class31.anInt697++] = l;
					class33_sub6_sub4_sub5_sub1.anInt3558 = Class33_Sub6_Sub6.anInt2785;
				} else
				{
					int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(arg0 ^ -5, 2);
					if(~j1 == -1)
					{
						Class33_Sub3.anIntArray2050[Class31.anInt697++] = l;
						class33_sub6_sub4_sub5_sub1.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(~j1 == -2)
					{
						Class33_Sub3.anIntArray2050[Class31.anInt697++] = l;
						class33_sub6_sub4_sub5_sub1.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-107, 3);
						class33_sub6_sub4_sub5_sub1.method359((byte)-32, false, k1);
						int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-68, 1);
						if(i2 == 1)
							Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(~j1 == -3)
					{
						Class33_Sub3.anIntArray2050[Class31.anInt697++] = l;
						class33_sub6_sub4_sub5_sub1.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-57, 3);
						class33_sub6_sub4_sub5_sub1.method359((byte)-107, true, l1);
						int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-68, 3);
						class33_sub6_sub4_sub5_sub1.method359((byte)78, true, j2);
						int k2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-91, 1);
						if(~k2 == -2)
							Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(~j1 == -4)
						Class33_Sub6_Sub13.anIntArray2988[Class74.anInt1587++] = l;
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.DB(" + arg0 + ')');
		}
	}

	public static int method268(byte arg0, int arg1)
	{
		try
		{
			anInt723++;
			if(arg0 != 111)
				method263(null, null);
			return 0x3f & arg1 >> 0x28c4978b;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.TA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method269(int arg0, int arg1, byte arg2, int arg3)
	{
		try
		{
			anInt725++;
			arg0 &= 3;
			if(~arg0 == -1)
				return arg3;
			if(arg0 == 1)
				return arg1;
			int i = -117 % ((-31 - arg2) / 40);
			if(arg0 == 2)
				return 7 + -arg3;
			else
				return -arg1 + 7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.UA(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method270(int arg0)
	{
		try
		{
			if(arg0 != 1000)
				method267((byte)-4);
			anInt746++;
			do
			{
				Class33_Sub20 class33_sub20;
				synchronized(Class33_Sub6_Sub4.aClass4_2739)
				{
					class33_sub20 = (Class33_Sub20)client.aClass4_1933.method54(true);
				}
				if(class33_sub20 == null)
					return;
				class33_sub20.aClass30_Sub1_2561.method241(class33_sub20.aClass12_2557, true, false, class33_sub20.aByteArray2570, (int)((Class33) (class33_sub20)).aLong747);
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.AB(" + arg0 + ')');
		}
	}

	public static void method271(int arg0)
	{
		try
		{
			aClass58_748 = null;
			aClass58_730 = null;
			aClass58_732 = null;
			anIntArrayArray720 = null;
			if(arg0 != 17484)
				aClass58_748 = null;
			aClass58_743 = null;
			aBooleanArray745 = null;
			aByteArray740 = null;
			anIntArray738 = null;
			aClass37_742 = null;
			aClass15_744 = null;
			aClass58_741 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw method263(runtimeexception, "ka.WA(" + arg0 + ')');
		}
	}

	public Class33()
	{
	}

	public static int anIntArrayArray720[][] = new int[5][5000];
	public static int anInt721;
	public static int anInt722;
	public static int anInt723;
	public static int anInt724;
	public static int anInt725;
	public static int anInt726;
	public static int anInt727 = 0;
	public static int anInt728;
	public static int anInt729;
	public static Class58 aClass58_730 = Class33_Sub6_Sub11.method535(111, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");
	public static int anInt731;
	public static Class58 aClass58_732 = Class33_Sub6_Sub11.method535(123, "Bitte wenden Sie sich an den Kundendienst)3");
	public static int anInt733;
	public static int anInt734 = -1;
	public Class33 aClass33_735;
	public static int anInt736;
	public static volatile int anInt737 = 0;
	public static int anIntArray738[] = new int[100];
	public Class33 aClass33_739;
	public static byte aByteArray740[] = {
		95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 
		106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 
		116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 
		51, 52, 53, 54, 55, 56, 57
	};
	public static Class58 aClass58_741 = Class33_Sub6_Sub11.method535(106, "Freunde");
	public static Class37 aClass37_742;
	public static Class58 aClass58_743 = Class33_Sub6_Sub11.method535(103, "<col=ffffff>");
	public static Class15 aClass15_744;
	public static boolean aBooleanArray745[] = new boolean[5];
	public static int anInt746;
	public long aLong747;
	public static Class58 aClass58_748 = Class33_Sub6_Sub11.method535(121, "Verbindung mit Update)2Server)3)3)3");
	public static int anInt749;

}
