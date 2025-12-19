// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub14.java


public class Class33_Sub6_Sub14 extends Class33_Sub6
{

	public Class33_Sub6_Sub4_Sub3 method563(boolean arg0, int arg1, Class33_Sub6_Sub4_Sub3 arg2)
	{
		try
		{
			anInt3032++;
			if(!arg0)
				anInt3040 = 44;
			arg1 = anIntArray3009[arg1];
			Class33_Sub6_Sub6 class33_sub6_sub6 = Class23.method186(16, arg1 >> 0x419b23f0);
			arg1 &= 0xffff;
			if(class33_sub6_sub6 == null)
			{
				return arg2.method335(true);
			} else
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg2.method335(!class33_sub6_sub6.method412(4, arg1));
				class33_sub6_sub4_sub3.method342(class33_sub6_sub6, arg1);
				return class33_sub6_sub4_sub3;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.D(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method564(byte arg0, Class30 arg1, Class30 arg2)
	{
		try
		{
			Class33_Sub4.aClass30_2069 = arg2;
			if(arg0 != -108)
				aClass58_3033 = null;
			Class24.aClass30_503 = arg1;
			anInt3019++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public void method565(byte arg0)
	{
		if(~anInt3012 == 0)
			if(anIntArray3017 == null)
				anInt3012 = 0;
			else
				anInt3012 = 2;
		anInt3018++;
		int i = 27 / ((7 - arg0) / 41);
		if(anInt3026 == -1)
		{
			if(anIntArray3017 != null)
			{
				anInt3026 = 2;
				return;
			}
			anInt3026 = 0;
		}
	}

	public static void method566(byte arg0)
	{
		try
		{
			aClass16_3025 = null;
			aClass33_Sub11_Sub1_3035 = null;
			aClass58_3033 = null;
			aClass58_3034 = null;
			aClass58_3041 = null;
			if(arg0 != -96)
			{
				return;
			} else
			{
				aClass58_3038 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.C(" + arg0 + ')');
		}
	}

	public static void method567(Class30 arg0, int arg1, boolean arg2, Class58 arg3, Class58 arg4, int arg5, boolean arg6)
	{
		try
		{
			anInt3023++;
			if(arg6)
				method564((byte)49, null, null);
			int i = arg0.method227((byte)58, arg3);
			int j = arg0.method229(!arg6, i, arg4);
			Class43.method899(arg2, arg0, 1368, j, arg1, arg5, i);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.I(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method568(boolean arg0, int arg1, Class33_Sub6_Sub4_Sub3 arg2, int arg3)
	{
		try
		{
			anInt3029++;
			arg1 = anIntArray3009[arg1];
			Class33_Sub6_Sub6 class33_sub6_sub6 = Class23.method186(16, arg1 >> 0xee839b90);
			arg1 &= 0xffff;
			if(class33_sub6_sub6 == null)
				return arg2.method333(true);
			arg3 &= 3;
			if(arg0)
				return null;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg2.method333(!class33_sub6_sub6.method412(4, arg1));
			if(~arg3 != -2)
			{
				if(arg3 == 2)
					class33_sub6_sub4_sub3.method343();
				else
				if(arg3 == 3)
					class33_sub6_sub4_sub3.method339();
			} else
			{
				class33_sub6_sub4_sub3.method340();
			}
			class33_sub6_sub4_sub3.method342(class33_sub6_sub6, arg1);
			if(arg3 == 1)
				class33_sub6_sub4_sub3.method339();
			else
			if(arg3 != 2)
			{
				if(arg3 == 3)
					class33_sub6_sub4_sub3.method340();
			} else
			{
				class33_sub6_sub4_sub3.method343();
			}
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.M(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method569(Class33_Sub6_Sub4_Sub3 arg0, int arg1, byte arg2)
	{
		try
		{
			arg1 = anIntArray3009[arg1];
			anInt3024++;
			Class33_Sub6_Sub6 class33_sub6_sub6 = Class23.method186(16, arg1 >> 0x55d21530);
			arg1 &= 0xffff;
			if(class33_sub6_sub6 == null)
				return arg0.method333(true);
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg0.method333(!class33_sub6_sub6.method412(4, arg1));
			if(arg2 != -17)
				method566((byte)26);
			class33_sub6_sub4_sub3.method342(class33_sub6_sub6, arg1);
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.H(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method570(Class33_Sub11 arg0, int arg1, byte arg2)
	{
		try
		{
			if(~arg1 == -2)
			{
				int i = arg0.method666(36);
				anIntArray3031 = new int[i];
				for(int i1 = 0; ~i < ~i1; i1++)
					anIntArray3031[i1] = arg0.method666(45);

				anIntArray3009 = new int[i];
				for(int i2 = 0; i > i2; i2++)
					anIntArray3009[i2] = arg0.method666(97);

				for(int k2 = 0; i > k2; k2++)
					anIntArray3009[k2] = (arg0.method666(111) << 0xd86acbb0) + anIntArray3009[k2];

			} else
			if(~arg1 != -3)
			{
				if(arg1 != 3)
				{
					if(~arg1 == -5)
						aBoolean3011 = true;
					else
					if(arg1 == 5)
						anInt3039 = arg0.method639((byte)123);
					else
					if(arg1 == 6)
						anInt3037 = arg0.method666(76);
					else
					if(~arg1 == -8)
						anInt3030 = arg0.method666(123);
					else
					if(~arg1 != -9)
					{
						if(arg1 != 9)
						{
							if(~arg1 == -11)
								anInt3012 = arg0.method639((byte)123);
							else
							if(arg1 != 11)
							{
								if(~arg1 != -13)
								{
									if(arg1 == 13)
									{
										int j = arg0.method639((byte)123);
										anIntArray3021 = new int[j];
										for(int j1 = 0; ~j < ~j1; j1++)
											anIntArray3021[j1] = arg0.method626((byte)-114);

									}
								} else
								{
									int k = arg0.method639((byte)123);
									anIntArray3014 = new int[k];
									for(int k1 = 0; ~k < ~k1; k1++)
										anIntArray3014[k1] = arg0.method666(84);

									for(int j2 = 0; j2 < k; j2++)
										anIntArray3014[j2] = (arg0.method666(60) << 0x87dfc690) - -anIntArray3014[j2];

								}
							} else
							{
								anInt3016 = arg0.method639((byte)123);
							}
						} else
						{
							anInt3026 = arg0.method639((byte)123);
						}
					} else
					{
						anInt3036 = arg0.method639((byte)123);
					}
				} else
				{
					int l = arg0.method639((byte)123);
					anIntArray3017 = new int[1 + l];
					for(int l1 = 0; l1 < l; l1++)
						anIntArray3017[l1] = arg0.method639((byte)123);

					anIntArray3017[l] = 0x98967f;
				}
			} else
			{
				anInt3028 = arg0.method666(76);
			}
			if(arg2 > -22)
			{
				return;
			} else
			{
				anInt3027++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method571(boolean arg0, Class33_Sub11 arg1)
	{
		try
		{
			if(!arg0)
				anInt3039 = -12;
			anInt3022++;
			do
			{
				int i = arg1.method639((byte)123);
				if(i != 0)
					method570(arg1, i, (byte)-69);
				else
					return;
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.J(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method572(int arg0)
	{
		anInt3010++;
		if(arg0 > -23)
			aClass58_3033 = null;
		for(int i = 0; Class34.anInt1839 > i; i++)
		{
			Class45.anIntArray966[i]--;
			if(~Class45.anIntArray966[i] > 9)
			{
				Class34.anInt1839--;
				for(int j = i; ~Class34.anInt1839 < ~j; j++)
				{
					Class21.anIntArray399[j] = Class21.anIntArray399[j - -1];
					Class33_Sub18.aClass61Array2515[j] = Class33_Sub18.aClass61Array2515[j - -1];
					Class80.anIntArray1725[j] = Class80.anIntArray1725[j - -1];
					Class45.anIntArray966[j] = Class45.anIntArray966[j + 1];
					Class33_Sub20.anIntArray2566[j] = Class33_Sub20.anIntArray2566[1 + j];
				}

				i--;
				continue;
			}
			Class61 class61 = Class33_Sub18.aClass61Array2515[i];
			if(class61 == null)
			{
				class61 = Class61.method1077(Class16.aClass30_Sub1_321, Class21.anIntArray399[i], 0);
				if(class61 == null)
					continue;
				Class45.anIntArray966[i] += class61.method1076();
				Class33_Sub18.aClass61Array2515[i] = class61;
			}
			if(Class45.anIntArray966[i] >= 0)
				continue;
			int k;
			if(Class33_Sub20.anIntArray2566[i] != 0)
			{
				int i1 = 0xff & Class33_Sub20.anIntArray2566[i] >> 0x1424fbf0;
				int l = 128 * (Class33_Sub20.anIntArray2566[i] & 0xff);
				int j1 = -((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 + (128 * i1 - -64);
				if(~j1 > -1)
					j1 = -j1;
				int k1 = (Class33_Sub20.anIntArray2566[i] & 0xff8a) >> 0xa9bdd828;
				int l1 = -((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 + 128 * k1 + 64;
				if(l1 < 0)
					l1 = -l1;
				int i2 = j1 - (-l1 - -128);
				if(l < i2)
				{
					Class45.anIntArray966[i] = -100;
					continue;
				}
				if(i2 < 0)
					i2 = 0;
				k = ((l - i2) * Class14.anInt272) / l;
			} else
			{
				k = Class34.anInt1850;
			}
			if(k > 0)
			{
				Class33_Sub8_Sub1 class33_sub8_sub1 = class61.method1075().method607(Class33_Sub11_Sub1.aClass54_3215);
				Class33_Sub13_Sub1 class33_sub13_sub1 = Class33_Sub13_Sub1.method703(class33_sub8_sub1, 100, k);
				class33_sub13_sub1.method696(-1 + Class80.anIntArray1725[i]);
				Class78.aClass33_Sub13_Sub2_1670.method742(class33_sub13_sub1);
			}
			Class45.anIntArray966[i] = -100;
		}

		if(Class20.aBoolean381 && !Class46.method920(8))
		{
			if(Class33_Sub6_Sub6.anInt2790 != 0 && Class33_Sub6_Sub10.anInt2877 != -1)
				Class33_Sub13_Sub4.method757(Class30_Sub1.aClass30_Sub1_1990, -111, 0, false, Class33_Sub6_Sub6.anInt2790, Class33_Sub6_Sub10.anInt2877);
			Class20.aBoolean381 = false;
		}
	}

	public Class33_Sub6_Sub4_Sub3 method573(int arg0, int arg1, Class33_Sub6_Sub4_Sub3 arg2)
	{
		try
		{
			int i = anIntArray3009[arg1];
			anInt3008++;
			Class33_Sub6_Sub6 class33_sub6_sub6 = Class23.method186(16, i >> 0x9958e530);
			i &= 0xffff;
			if(class33_sub6_sub6 == null)
				return arg2.method333(true);
			if(arg0 != -25963)
				method569(null, 83, (byte)-66);
			Class33_Sub6_Sub6 class33_sub6_sub6_1 = null;
			int j = 0;
			if(anIntArray3014 != null && ~anIntArray3014.length < ~arg1)
			{
				j = anIntArray3014[arg1];
				class33_sub6_sub6_1 = Class23.method186(16, j >> 0x1ae1f4d0);
				j &= 0xffff;
			}
			if(class33_sub6_sub6_1 == null || ~j == 0xffff0000)
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg2.method333(!class33_sub6_sub6.method412(arg0 + 25967, i));
				class33_sub6_sub4_sub3.method342(class33_sub6_sub6, i);
				return class33_sub6_sub4_sub3;
			} else
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1 = arg2.method333((!class33_sub6_sub6.method412(4, i)) & (!class33_sub6_sub6_1.method412(4, j)));
				class33_sub6_sub4_sub3_1.method342(class33_sub6_sub6, i);
				class33_sub6_sub4_sub3_1.method342(class33_sub6_sub6_1, j);
				return class33_sub6_sub4_sub3_1;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.L(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub3 method574(Class58 arg0, Class30 arg1, Class58 arg2, byte arg3)
	{
		try
		{
			if(arg3 != 123)
				method572(-20);
			int i = arg1.method227((byte)53, arg0);
			anInt3015++;
			int j = arg1.method229(true, i, arg2);
			return RuntimeException_Sub1.method1227(i, j, 9, arg1);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.K(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method575(Class33_Sub6_Sub14 arg0, int arg1, Class33_Sub6_Sub4_Sub3 arg2, int arg3, int arg4)
	{
		try
		{
			anInt3020++;
			arg4 = anIntArray3009[arg4];
			Class33_Sub6_Sub6 class33_sub6_sub6 = Class23.method186(16, arg4 >> 0x8aaa4190);
			arg4 &= 0xffff;
			if(class33_sub6_sub6 == null)
				return arg0.method569(arg2, arg1, (byte)-17);
			if(arg3 != 23214)
				anInt3012 = -55;
			arg1 = arg0.anIntArray3009[arg1];
			Class33_Sub6_Sub6 class33_sub6_sub6_1 = Class23.method186(16, arg1 >> 0x20991d0);
			arg1 &= 0xffff;
			if(class33_sub6_sub6_1 == null)
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg2.method333(!class33_sub6_sub6.method412(4, arg4));
				class33_sub6_sub4_sub3.method342(class33_sub6_sub6, arg4);
				return class33_sub6_sub4_sub3;
			} else
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1 = arg2.method333((!class33_sub6_sub6.method412(4, arg4)) & (!class33_sub6_sub6_1.method412(4, arg1)));
				class33_sub6_sub4_sub3_1.method331(class33_sub6_sub6, arg4, class33_sub6_sub6_1, arg1, anIntArray3017);
				return class33_sub6_sub4_sub3_1;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.G(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static int method576(int arg0, int arg1)
	{
		try
		{
			return arg0 | arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nf.N(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub14()
	{
		aBoolean3011 = false;
		anInt3012 = -1;
		anInt3028 = -1;
		anInt3030 = -1;
		anInt3036 = 99;
		anInt3026 = -1;
		anInt3037 = -1;
		anInt3016 = 2;
		anInt3039 = 5;
	}

	public static int anInt3007;
	public static int anInt3008;
	public int anIntArray3009[];
	public static int anInt3010;
	public boolean aBoolean3011;
	public int anInt3012;
	public static int anInt3013 = -1;
	public int anIntArray3014[];
	public static int anInt3015;
	public int anInt3016;
	public int anIntArray3017[];
	public static int anInt3018;
	public static int anInt3019;
	public static int anInt3020;
	public int anIntArray3021[];
	public static int anInt3022;
	public static int anInt3023;
	public static int anInt3024;
	public static Class16 aClass16_3025 = new Class16(64);
	public int anInt3026;
	public static int anInt3027;
	public int anInt3028;
	public static int anInt3029;
	public int anInt3030;
	public int anIntArray3031[];
	public static int anInt3032;
	public static Class58 aClass58_3033;
	public static Class58 aClass58_3034;
	public static Class33_Sub11_Sub1 aClass33_Sub11_Sub1_3035 = new Class33_Sub11_Sub1(5000);
	public int anInt3036;
	public int anInt3037;
	public static Class58 aClass58_3038 = Class33_Sub6_Sub11.method535(101, "<)4col>");
	public int anInt3039;
	public static int anInt3040 = 0;
	public static Class58 aClass58_3041 = Class33_Sub6_Sub11.method535(124, "Geben Sie Ihren Benutzernamen");

	static 
	{
		aClass58_3034 = Class33_Sub6_Sub11.method535(112, "Loaded config");
		aClass58_3033 = aClass58_3034;
	}
}
