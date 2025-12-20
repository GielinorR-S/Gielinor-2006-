// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class16.java


public class Class16
{

	public Class33_Sub6 method144(int arg0, long arg1)
	{
		try
		{
			if(arg0 != 0)
				method152(-102, -12, 69, -43, -89, 15, 34, -103, -73);
			anInt326++;
			Class33_Sub6 class33_sub6 = (Class33_Sub6)aClass82_329.method1220(arg0 ^ 0xc, arg1);
			if(class33_sub6 != null)
				aClass39_333.method881(true, class33_sub6);
			return class33_sub6;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method145(long arg0, byte arg1, Class33_Sub6 arg2)
	{
		try
		{
			if(anInt330 == 0)
			{
				Class33_Sub6 class33_sub6 = aClass39_333.method883((byte)98);
				class33_sub6.method266(-81);
				class33_sub6.method289(-117);
				if(class33_sub6 == aClass33_Sub6_322)
				{
					Class33_Sub6 class33_sub6_1 = aClass39_333.method883((byte)78);
					class33_sub6_1.method266(-78);
					class33_sub6_1.method289(-114);
				}
			} else
			{
				anInt330--;
			}
			anInt309++;
			aClass82_329.method1218(arg2, (byte)61, arg0);
			aClass39_333.method881(true, arg2);
			if(arg1 >= -100)
			{
				method145(-105L, (byte)108, null);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.F(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method146(byte arg0)
	{
		for(int i = 0; ~Class33_Sub6_Sub13.anInt2992 < ~i; i++)
		{
			int j = Class27.anIntArray559[i];
			Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[j];
			int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			if(~(k & 2) != -1)
				k += Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123) << 0x2d61d288;
			Class33_Sub11.method671(j, class33_sub6_sub4_sub5_sub1, (byte)47, k);
		}

		anInt308++;
		if(arg0 > -73)
			aClass58_324 = null;
	}

	public void method147(byte arg0)
	{
		try
		{
			if(arg0 != -54)
				return;
			do
			{
				Class33_Sub6 class33_sub6 = aClass39_333.method883((byte)94);
				if(class33_sub6 != null)
				{
					class33_sub6.method266(-69);
					class33_sub6.method289(-124);
				} else
				{
					anInt330 = anInt331;
					anInt320++;
					return;
				}
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.D(" + arg0 + ')');
		}
	}

	public static void method148(int arg0, Class30 arg1)
	{
		try
		{
			if(arg0 != 1792)
				aClass58_323 = null;
			Class51.aClass30_1093 = arg1;
			anInt316++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.H(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method149(int arg0)
	{
		try
		{
			aClass6_311 = null;
			aClass58_324 = null;
			aClass30_314 = null;
			aClass58_312 = null;
			anIntArray315 = null;
			aClass58_325 = null;
			if(arg0 != -4)
				method146((byte)-128);
			anIntArray310 = null;
			anIntArray328 = null;
			aClass30_Sub1_321 = null;
			aClass58_323 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.B(" + arg0 + ')');
		}
	}

	public void method150(boolean arg0, long arg1)
	{
		try
		{
			if(arg0)
				return;
			Class33_Sub6 class33_sub6 = (Class33_Sub6)aClass82_329.method1220(20, arg1);
			anInt327++;
			if(class33_sub6 != null)
			{
				class33_sub6.method266(-18);
				class33_sub6.method289(-117);
				anInt330++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.J(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method151(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt318++;
			int i = 21 / ((-40 - arg2) / 41);
			if(~arg0 <= -3)
			{
				int j = method151(arg0 >> 0x4ade72e1, arg1 * arg1, 95);
				if((arg0 & 1) != 0)
					j *= arg1;
				return j;
			}
			if(~arg0 == -2)
				return arg1;
			else
				return 1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.E(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8)
	{
		anInt332++;
		if(!Class33_Sub6_Sub2.method305(arg1, 0x12bcb130))
			return;
		Class81.method1210(arg4, arg6, arg5, arg0, Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg1], arg2, arg8, 0, 0, -1, arg3, (byte)1);
		if(arg7 != -29013)
			anIntArray328 = null;
	}

	public static boolean method153(Class33_Sub15 arg0, int arg1)
	{
		try
		{
			anInt317++;
			if(arg0.anIntArray2368 == null)
				return false;
			for(int i = arg1; i < arg0.anIntArray2368.length; i++)
			{
				int j = Applet_Sub1.method27(0, i, arg0);
				int k = arg0.anIntArray2385[i];
				if(arg0.anIntArray2368[i] != 2)
				{
					if(~arg0.anIntArray2368[i] == -4)
					{
						if(k >= j)
							return false;
					} else
					if(~arg0.anIntArray2368[i] == -5)
					{
						if(~j == ~k)
							return false;
					} else
					if(~j != ~k)
						return false;
				} else
				if(~k >= ~j)
					return false;
			}

			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class16(int arg0)
	{
		aClass33_Sub6_322 = new Class33_Sub6();
		aClass39_333 = new Class39();
		try
		{
			anInt330 = arg0;
			int i;
			for(i = 1; i - -i < arg0; i += i);
			anInt331 = arg0;
			aClass82_329 = new Class82(i);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "eb.<init>(" + arg0 + ')');
		}
	}

	public static int anInt308;
	public static int anInt309;
	public static int anIntArray310[] = {
		768, 1024, 1280, 512, 1536, 256, 0, 1792
	};
	public static Class6 aClass6_311;
	public static Class58 aClass58_312;
	public static int anInt313;
	public static Class30 aClass30_314;
	public static int anIntArray315[] = new int[200];
	public static int anInt316;
	public static int anInt317;
	public static int anInt318;
	public static int anInt319 = 0;
	public static int anInt320;
	public static Class30_Sub1 aClass30_Sub1_321;
	public Class33_Sub6 aClass33_Sub6_322;
	public static Class58 aClass58_323 = Class33_Sub6_Sub11.method535(109, "k");
	public static Class58 aClass58_324;
	public static Class58 aClass58_325 = Class33_Sub6_Sub11.method535(104, "Cabbage");
	public static int anInt326;
	public static int anInt327;
	public static int anIntArray328[];
	public Class82 aClass82_329;
	public int anInt330;
	public int anInt331;
	public static int anInt332;
	public Class39 aClass39_333;

	static 
	{
		aClass58_324 = Class33_Sub6_Sub11.method535(106, "Password: ");
		aClass58_312 = aClass58_324;
	}
}
