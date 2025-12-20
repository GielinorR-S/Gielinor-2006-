// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class71.java

import java.io.IOException;
import java.net.Socket;

public class Class71
{

	public static void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, 
			int arg8, Class33_Sub15 arg9[], int arg10)
	{
		try
		{
			for(int i = 0; arg9.length > i; i++)
			{
				Class33_Sub15 class33_sub15 = arg9[i];
				if(class33_sub15 != null && (class33_sub15.anInt2452 == 0 || class33_sub15.aBoolean2372) && class33_sub15 != null && arg2 == class33_sub15.anInt2464 && !method1139((byte)67, class33_sub15))
				{
					int j = arg0 + class33_sub15.anInt2443 + -arg10;
					int k = arg4 + (class33_sub15.anInt2356 - arg1);
					int l = class33_sub15.anInt2462 + j;
					int i1 = k - -class33_sub15.anInt2405;
					int j1 = j > arg0 ? j : arg0;
					int k1 = ~arg4 > ~k ? k : arg4;
					int l1 = arg5 > l ? l : arg5;
					int i2 = ~i1 <= ~arg3 ? arg3 : i1;
					if(class33_sub15.anInt2452 == 0)
					{
						method1134(j1, class33_sub15.anInt2353 + -k + k1, class33_sub15.anInt2435, i2, k1, l1, (byte)-62, arg7, arg8, arg9, class33_sub15.anInt2413 + (-j + j1));
						if(class33_sub15.aClass33_Sub15Array2394 != null)
							method1134(j1, (-k + k1) - -class33_sub15.anInt2353, class33_sub15.anInt2435, i2, k1, l1, (byte)-62, arg7, arg8, class33_sub15.aClass33_Sub15Array2394, class33_sub15.anInt2413 + -j + j1);
					}
					if(class33_sub15.aBoolean2372)
					{
						boolean flag;
						if(Applet_Sub1.anInt41 < j1 || Class13.anInt254 < k1 || l1 <= Applet_Sub1.anInt41 || Class13.anInt254 >= i2)
							flag = false;
						else
							flag = true;
						boolean flag1 = false;
						if(Class81.anInt1758 == 1 && flag)
							flag1 = true;
						boolean flag2 = false;
						if(~Class69.anInt1464 == -2 && Class82.anInt1794 >= j1 && k1 <= Class48.anInt1055 && ~l1 < ~Class82.anInt1794 && ~Class48.anInt1055 > ~i2)
							flag2 = true;
						if(flag2 && Class59.anInt1276 == -1 && (arg8 & 0x200) != 0 && !Class33_Sub6_Sub4_Sub4.aBoolean3486 && Class49.method931(class33_sub15, 118) != null)
						{
							Class32.anInt710 = -j1 + Class82.anInt1794;
							Class31.anInt695 = Class48.anInt1055 + -k1;
							Class14.aBoolean285 = false;
							Class33_Sub6_Sub3.anInt2729 = class33_sub15.anInt2432;
							Class19.anInt375 = arg7;
							Class59.anInt1276 = class33_sub15.anInt2435;
							Class47.anInt1040 = 0;
						}
						if(~Class59.anInt1276 != 0 || Class33_Sub6_Sub4_Sub4.aBoolean3486)
						{
							flag = false;
							flag2 = false;
							flag1 = false;
						}
						if(!class33_sub15.aBoolean2349 && flag2 && (1 & arg8) != 0)
						{
							class33_sub15.aBoolean2349 = true;
							if(class33_sub15.anObjectArray2453 != null)
								Class13.method118(class33_sub15.anObjectArray2453, class33_sub15, Class48.anInt1055 - k, -j + Class82.anInt1794, null, 18859, 0);
						}
						if(class33_sub15.aBoolean2349 && flag1 && ~(arg8 & 4) != -1 && class33_sub15.anObjectArray2400 != null)
							Class13.method118(class33_sub15.anObjectArray2400, class33_sub15, -k + Class13.anInt254, Applet_Sub1.anInt41 - j, null, arg6 ^ 0xffffb669, 0);
						if(class33_sub15.aBoolean2349 && !flag1 && (arg8 & 2) != 0)
						{
							class33_sub15.aBoolean2349 = false;
							if(class33_sub15.anObjectArray2339 != null)
								Class13.method118(class33_sub15.anObjectArray2339, class33_sub15, Class13.anInt254 + -k, Applet_Sub1.anInt41 + -j, null, 18859, 0);
						}
						if(flag1 && (arg8 & 8) != 0 && class33_sub15.anObjectArray2406 != null)
							Class13.method118(class33_sub15.anObjectArray2406, class33_sub15, -k + Class13.anInt254, -j + Applet_Sub1.anInt41, null, arg6 + 18921, 0);
						if(!class33_sub15.aBoolean2386 && flag && (0x10 & arg8) != 0)
						{
							class33_sub15.aBoolean2386 = true;
							if(class33_sub15.anObjectArray2363 != null)
								Class13.method118(class33_sub15.anObjectArray2363, class33_sub15, Class13.anInt254 + -k, -j + Applet_Sub1.anInt41, null, 18859, 0);
						}
						if(class33_sub15.aBoolean2386 && flag && (0x40 & arg8) != 0 && class33_sub15.anObjectArray2361 != null)
							Class13.method118(class33_sub15.anObjectArray2361, class33_sub15, Class13.anInt254 + -k, -j + Applet_Sub1.anInt41, null, 18859, 0);
						if(class33_sub15.aBoolean2386 && !flag && ~(arg8 & 0x20) != -1)
						{
							class33_sub15.aBoolean2386 = false;
							if(class33_sub15.anObjectArray2365 != null)
								Class13.method118(class33_sub15.anObjectArray2365, class33_sub15, Class13.anInt254 - k, -j + Applet_Sub1.anInt41, null, arg6 ^ 0xffffb669, 0);
						}
						if(class33_sub15.anObjectArray2451 != null && ~(0x80 & arg8) != -1)
							Class13.method118(class33_sub15.anObjectArray2451, class33_sub15, 0, 0, null, 18859, 0);
						if(flag && ~Class63.anInt1348 != -1 && class33_sub15.anObjectArray2427 != null && (0x400 & arg8) != 0)
							Class13.method118(class33_sub15.anObjectArray2427, class33_sub15, Class63.anInt1348, 0, null, 18859, 0);
						if((0x100 & arg8) != 0)
						{
							if(class33_sub15.anObjectArray2382 != null && class33_sub15.anInt2387 < Class33_Sub6_Sub15.anInt3059)
							{
								if(class33_sub15.anIntArray2409 != null && Class33_Sub6_Sub15.anInt3059 + -class33_sub15.anInt2387 <= 32)
								{
label0:
									for(int j2 = class33_sub15.anInt2387; j2 < Class33_Sub6_Sub15.anInt3059; j2++)
									{
										int i3 = Class20.anIntArray382[j2 & 0x1f];
										for(int l3 = 0; ~class33_sub15.anIntArray2409.length < ~l3; l3++)
										{
											if(~i3 != ~class33_sub15.anIntArray2409[l3])
												continue;
											Class13.method118(class33_sub15.anObjectArray2382, class33_sub15, 0, 0, null, arg6 ^ 0xffffb669, 0);
											break label0;
										}

									}

								} else
								{
									Class13.method118(class33_sub15.anObjectArray2382, class33_sub15, 0, 0, null, arg6 ^ 0xffffb669, 0);
								}
								class33_sub15.anInt2387 = Class33_Sub6_Sub15.anInt3059;
							}
							if(class33_sub15.anObjectArray2469 != null && ~Class42.anInt918 < ~class33_sub15.anInt2422)
							{
								if(class33_sub15.anIntArray2342 != null && -class33_sub15.anInt2422 + Class42.anInt918 <= 32)
								{
label1:
									for(int k2 = class33_sub15.anInt2422; Class42.anInt918 > k2; k2++)
									{
										int j3 = Class11.anIntArray198[0x1f & k2];
										for(int i4 = 0; i4 < class33_sub15.anIntArray2342.length; i4++)
										{
											if(class33_sub15.anIntArray2342[i4] != j3)
												continue;
											Class13.method118(class33_sub15.anObjectArray2469, class33_sub15, 0, 0, null, arg6 + 18921, 0);
											break label1;
										}

									}

								} else
								{
									Class13.method118(class33_sub15.anObjectArray2469, class33_sub15, 0, 0, null, 18859, 0);
								}
								class33_sub15.anInt2422 = Class42.anInt918;
							}
							if(class33_sub15.anObjectArray2438 != null && ~class33_sub15.anInt2360 > ~Class33_Sub6_Sub16.anInt3089)
							{
								if(class33_sub15.anIntArray2449 == null || ~(Class33_Sub6_Sub16.anInt3089 - class33_sub15.anInt2360) < -33)
								{
									Class13.method118(class33_sub15.anObjectArray2438, class33_sub15, 0, 0, null, arg6 + 18921, 0);
								} else
								{
label2:
									for(int l2 = class33_sub15.anInt2360; l2 < Class33_Sub6_Sub16.anInt3089; l2++)
									{
										int k3 = Class15_Sub2.anIntArray1983[0x1f & l2];
										for(int j4 = 0; ~class33_sub15.anIntArray2449.length < ~j4; j4++)
										{
											if(~class33_sub15.anIntArray2449[j4] != ~k3)
												continue;
											Class13.method118(class33_sub15.anObjectArray2438, class33_sub15, 0, 0, null, arg6 + 18921, 0);
											break label2;
										}

									}

								}
								class33_sub15.anInt2360 = Class33_Sub6_Sub16.anInt3089;
							}
							if(class33_sub15.anObjectArray2402 != null && Class45.anInt971 > class33_sub15.anInt2341)
								Class13.method118(class33_sub15.anObjectArray2402, class33_sub15, 0, 0, null, 18859, 0);
							class33_sub15.anInt2341 = Class33_Sub6_Sub6.anInt2785;
						}
					}
				}
			}

			if(arg6 != -62)
				method1138(76, -49);
			anInt1523++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "te.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? "null" : "{...}") + ',' + arg10 + ')');
		}
	}

	public static void method1135(int arg0)
	{
		anInt1519++;
		try
		{
			if(~Class33_Sub7.anInt2160 == -1)
			{
				if(Class62.aClass43_1316 != null)
				{
					Class62.aClass43_1316.method903(1);
					Class62.aClass43_1316 = null;
				}
				Class77_Sub2.anInt2640 = 0;
				Class36.aBoolean802 = false;
				Class33_Sub7.anInt2160 = 1;
				Class31.aClass6_703 = null;
			}
			if(~Class33_Sub7.anInt2160 == -2)
			{
				if(Class31.aClass6_703 == null)
					Class31.aClass6_703 = Class22.aClass72_416.method1146(Class60.aString1289, Class41.anInt915, (byte)-69);
				if(Class31.aClass6_703.anInt151 == 2)
					throw new IOException();
				if(Class31.aClass6_703.anInt151 == 1)
				{
					Class62.aClass43_1316 = new Class43((Socket)Class31.aClass6_703.anObject149, Class22.aClass72_416);
					Class33_Sub7.anInt2160 = 2;
					Class31.aClass6_703 = null;
				}
			}
			if(Class33_Sub7.anInt2160 == 2)
			{
				long l = Class39.aLong862 = Class63.aClass58_1350.method1062((byte)11);
				int j1 = (int)(l >> 0x61328a50 & 31L);
				Class46.aClass33_Sub11_Sub1_989.anInt2239 = 0;
				Class46.aClass33_Sub11_Sub1_989.method640(14, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(j1, -11124);
				Class62.aClass43_1316.method901((byte)42, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).aByteArray2296, 2, 0);
				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
				Class33_Sub7.anInt2160 = 3;
			}
			if(~Class33_Sub7.anInt2160 == -4)
			{
				if(Class33_Sub11_Sub1.aClass79_3212 != null)
					Class33_Sub11_Sub1.aClass79_3212.method1189(256);
				if(Class33_Sub6_Sub4_Sub6.aClass79_3581 != null)
					Class33_Sub6_Sub4_Sub6.aClass79_3581.method1189(256);
				int i = Class62.aClass43_1316.method897(27426);
				if(Class33_Sub11_Sub1.aClass79_3212 != null)
					Class33_Sub11_Sub1.aClass79_3212.method1189(256);
				if(Class33_Sub6_Sub4_Sub6.aClass79_3581 != null)
					Class33_Sub6_Sub4_Sub6.aClass79_3581.method1189(256);
				if(~i != -1)
				{
					Class78.method1183(i, (byte)93);
					return;
				}
				Class33_Sub7.anInt2160 = 4;
				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
			}
			if(Class33_Sub7.anInt2160 == 4)
			{
				if(~((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 > -9)
				{
					int j = Class62.aClass43_1316.method896(0);
					if(~(-((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 + 8) > ~j)
						j = -((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 + 8;
					if(~j < -1)
					{
						Class62.aClass43_1316.method894(j, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239, (byte)126, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
						Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 += j;
					}
				}
				if(~((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 == -9)
				{
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
					Class63.aLong1344 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					Class33_Sub7.anInt2160 = 5;
				}
			}
			if(arg0 != 3794)
				anInt1516 = 102;
			if(Class33_Sub7.anInt2160 == 5)
			{
				Class46.aClass33_Sub11_Sub1_989.anInt2239 = 0;
				int ai[] = new int[4];
				ai[3] = (int)Class63.aLong1344;
				ai[1] = (int)(Math.random() * 99999999D);
				ai[2] = (int)(Class63.aLong1344 >> 0x911c5e20);
				ai[0] = (int)(Math.random() * 99999999D);
				Class46.aClass33_Sub11_Sub1_989.method640(10, -11124);
				Class46.aClass33_Sub11_Sub1_989.method669(ai[0], -30515);
				Class46.aClass33_Sub11_Sub1_989.method669(ai[1], arg0 + -34309);
				Class46.aClass33_Sub11_Sub1_989.method669(ai[2], -30515);
				Class46.aClass33_Sub11_Sub1_989.method669(ai[3], arg0 ^ 0xffff861f);
				Class46.aClass33_Sub11_Sub1_989.method669(Class22.aClass72_416.anInt1539, -30515);
				Class46.aClass33_Sub11_Sub1_989.method675(Class63.aClass58_1350.method1062((byte)11), (byte)118);
				Class46.aClass33_Sub11_Sub1_989.method632((byte)-73, Class63.aClass58_1341);
				Class46.aClass33_Sub11_Sub1_989.method660(arg0 ^ 0xed2, Class62.aBigInteger1325, Class17.aBigInteger334);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.anInt2239 = 0;
				if(~Class23.anInt485 == -41)
					RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method640(18, -11124);
				else
					RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method640(16, -11124);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method640(69 - -((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239, arg0 + -14918);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(459, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method640(Class33_Sub3.aBoolean2058 ? 1 : 0, -11124);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class39.aClass30_Sub1_871)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class33_Sub16.aClass30_Sub1_2478)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class59.aClass30_Sub1_1266)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class30.aClass30_Sub1_674)).anInt661, arg0 ^ 0xffff861f);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class16.aClass30_Sub1_321)).anInt661, arg0 ^ 0xffff861f);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class69.aClass30_Sub1_1469)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class30_Sub1.aClass30_Sub1_1990)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Canvas_Sub1.aClass30_Sub1_54)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class33_Sub6_Sub16.aClass30_Sub1_3092)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class33_Sub6_Sub3.aClass30_Sub1_2715)).anInt661, arg0 + -34309);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class33_Sub12.aClass30_Sub1_2322)).anInt661, arg0 + -34309);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (client.aClass30_Sub1_1940)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class73.aClass30_Sub1_1554)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class59.aClass30_Sub1_1271)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class38.aClass30_Sub1_848)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method669(((Class30) (Class58.aClass30_Sub1_1911)).anInt661, -30515);
				RuntimeException_Sub1.aClass33_Sub11_Sub1_1809.method668(((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).aByteArray2296, false, 0, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239);
				Class62.aClass43_1316.method901((byte)42, ((Class33_Sub11) (RuntimeException_Sub1.aClass33_Sub11_Sub1_1809)).aByteArray2296, ((Class33_Sub11) (RuntimeException_Sub1.aClass33_Sub11_Sub1_1809)).anInt2239, 0);
				Class46.aClass33_Sub11_Sub1_989.method681(ai, arg0 + -23980);
				for(int i1 = 0; i1 < 4; i1++)
					ai[i1] += 50;

				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method681(ai, arg0 ^ 0xffffbff4);
				Class33_Sub7.anInt2160 = 6;
			}
			if(~Class33_Sub7.anInt2160 == -7 && Class62.aClass43_1316.method896(arg0 + -3794) > 0)
			{
				int k = Class62.aClass43_1316.method897(arg0 + 23632);
				if(~k != -22 || Class23.anInt485 != 20)
				{
					if(k == 2)
					{
						Class33_Sub7.anInt2160 = 9;
					} else
					{
						if(k == 15 && Class23.anInt485 == 40)
						{
							Class35.method849(arg0 + -3876);
							return;
						}
						if(k != 23 || Class33_Sub6_Sub6.anInt2784 >= 1)
						{
							Class78.method1183(k, (byte)107);
							return;
						}
						Class33_Sub7.anInt2160 = 0;
						Class33_Sub6_Sub6.anInt2784++;
					}
				} else
				{
					Class33_Sub7.anInt2160 = 7;
				}
			}
			if(~Class33_Sub7.anInt2160 == -8 && Class62.aClass43_1316.method896(0) > 0)
			{
				Class46.anInt1025 = 180 + 60 * Class62.aClass43_1316.method897(27426);
				Class33_Sub7.anInt2160 = 8;
			}
			if(~Class33_Sub7.anInt2160 == -9)
			{
				Class77_Sub2.anInt2640 = 0;
				Class19.method166(Class33_Sub6_Sub5.aClass58_2760, false, Class35.method846((byte)-83, new Class58[] {
					Class37.method859(15591, Class46.anInt1025 / 60), Class58.aClass58_1918
				}), Class33_Sub6_Sub1.aClass58_2653);
				if(--Class46.anInt1025 <= 0)
					Class33_Sub7.anInt2160 = 0;
				return;
			}
			if(Class33_Sub7.anInt2160 == 9 && ~Class62.aClass43_1316.method896(arg0 + -3794) <= -9)
			{
				Class33_Sub19.anInt2547 = Class62.aClass43_1316.method897(arg0 + 23632);
				Class33_Sub6_Sub12.aBoolean2951 = ~Class62.aClass43_1316.method897(27426) == -2;
				Class33_Sub6_Sub6.anInt2786 = Class62.aClass43_1316.method897(27426);
				Class33_Sub6_Sub6.anInt2786 <<= 8;
				Class33_Sub6_Sub6.anInt2786 += Class62.aClass43_1316.method897(27426);
				Class12.anInt218 = Class62.aClass43_1316.method897(arg0 + 23632);
				Class62.aClass43_1316.method894(1, 0, (byte)123, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
				Class33_Sub6_Sub2.anInt2694 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method684(8);
				Class62.aClass43_1316.method894(2, 0, (byte)127, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
				Class34.anInt1826 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(arg0 + -3699);
				Class33_Sub7.anInt2160 = 10;
			}
			if(~Class33_Sub7.anInt2160 == -11)
			{
				if(~Class62.aClass43_1316.method896(0) <= ~Class34.anInt1826)
				{
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
					Class62.aClass43_1316.method894(Class34.anInt1826, 0, (byte)125, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
					Class35.method844(126);
					Class33_Sub6_Sub4_Sub1.anInt3338 = -1;
					Class62.method1079(false, (byte)16);
					Class33_Sub6_Sub2.anInt2694 = -1;
				}
				return;
			}
			Class77_Sub2.anInt2640++;
			if(Class77_Sub2.anInt2640 > 2000)
				if(Class33_Sub6_Sub6.anInt2784 < 1)
				{
					if(Class41.anInt915 != Class62.anInt1302)
						Class41.anInt915 = Class62.anInt1302;
					else
						Class41.anInt915 = Class12.anInt229;
					Class33_Sub7.anInt2160 = 0;
					Class33_Sub6_Sub6.anInt2784++;
					return;
				} else
				{
					Class78.method1183(-3, (byte)96);
					return;
				}
		}
		catch(IOException _ex)
		{
			if(Class33_Sub6_Sub6.anInt2784 < 1)
			{
				Class33_Sub6_Sub6.anInt2784++;
				if(~Class62.anInt1302 == ~Class41.anInt915)
					Class41.anInt915 = Class12.anInt229;
				else
					Class41.anInt915 = Class62.anInt1302;
				Class33_Sub7.anInt2160 = 0;
				return;
			}
			Class78.method1183(-2, (byte)102);
		}
	}

	public static int method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			arg4 &= 3;
			if((1 & arg6) == 1)
			{
				int i = arg0;
				arg0 = arg2;
				arg2 = i;
			}
			anInt1515++;
			if(~arg4 == -1)
				return arg1;
			if(~arg4 == -2)
				return arg3;
			if(~arg4 == -3)
				return 1 - (arg0 - (7 + -arg1));
			if(arg5 > -29)
				return -117;
			else
				return -arg2 - (-1 - -arg3 - 7);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "te.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static void method1137(int arg0)
	{
		try
		{
			anIntArray1524 = null;
			aClass58_1517 = null;
			aClass58_1518 = null;
			aClass58_1520 = null;
			int i = -45 % ((-42 - arg0) / 61);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "te.A(" + arg0 + ')');
		}
	}

	public static boolean method1138(int arg0, int arg1)
	{
		try
		{
			anInt1521++;
			if(arg1 != 19138)
				return true;
			return (arg0 >> 0xb140cf1d & 1) != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "te.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static boolean method1139(byte arg0, Class33_Sub15 arg1)
	{
		try
		{
			int i = 106 % ((24 - arg0) / 41);
			anInt1522++;
			if(Class74.aBoolean1583)
			{
				if(Class33_Sub6_Sub5.method403(arg1, -5447) != 0)
					return false;
				if(arg1.anInt2452 == 0)
					return false;
			}
			return arg1.aBoolean2430;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "te.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt1515;
	public static int anInt1516;
	public static Class58 aClass58_1517 = Class33_Sub6_Sub11.method535(98, "Fehler beim Laden Ihres Spielcharakters)3");
	public static Class58 aClass58_1518;
	public static int anInt1519;
	public static Class58 aClass58_1520;
	public static int anInt1521;
	public static int anInt1522;
	public static int anInt1523;
	public static int anIntArray1524[] = new int[500];
	public static int anInt1525 = 0;
	public static int anInt1526 = 0;

	static 
	{
		aClass58_1520 = Class33_Sub6_Sub11.method535(122, "To play on this world move to a free area first");
		aClass58_1518 = aClass58_1520;
	}
}
