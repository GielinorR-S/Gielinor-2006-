// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub15.java


public class Class33_Sub15 extends Class33
{

	public void method786(int arg0, Class33_Sub11 arg1)
	{
		aBoolean2412 = false;
		anInt2389++;
		anInt2452 = arg1.method639((byte)123);
		anInt2404 = arg1.method639((byte)123);
		anInt2446 = arg1.method666(arg0 + 21716);
		anInt2345 = anInt2443 = arg1.method672(67);
		anInt2429 = anInt2356 = arg1.method672(71);
		anInt2462 = arg1.method666(78);
		anInt2405 = arg1.method666(74);
		if(arg0 != -21637)
			anInt2341 = 13;
		anInt2439 = arg1.method639((byte)123);
		anInt2464 = arg1.method666(92);
		if(~anInt2464 != 0xffff0000)
			anInt2464 = (anInt2435 & 0xffff0000) - -anInt2464;
		else
			anInt2464 = -1;
		anInt2434 = arg1.method666(92);
		if(anInt2434 == 65535)
			anInt2434 = -1;
		int i = arg1.method639((byte)123);
		if(~i < -1)
		{
			anIntArray2385 = new int[i];
			anIntArray2368 = new int[i];
			for(int j = 0; ~i < ~j; j++)
			{
				anIntArray2368[j] = arg1.method639((byte)123);
				anIntArray2385[j] = arg1.method666(45);
			}

		}
		int k = arg1.method639((byte)123);
		if(k > 0)
		{
			anIntArrayArray2411 = new int[k][];
			for(int l = 0; k > l; l++)
			{
				int l1 = arg1.method666(55);
				anIntArrayArray2411[l] = new int[l1];
				for(int k2 = 0; ~k2 > ~l1; k2++)
				{
					anIntArrayArray2411[l][k2] = arg1.method666(98);
					if(~anIntArrayArray2411[l][k2] == 0xffff0000)
						anIntArrayArray2411[l][k2] = -1;
				}

			}

		}
		if(anInt2452 == 0)
		{
			anInt2433 = arg1.method666(94);
			aBoolean2430 = arg1.method639((byte)123) == 1;
		}
		if(~anInt2452 == -2)
		{
			arg1.method666(56);
			arg1.method639((byte)123);
		}
		if(~anInt2452 == -3)
		{
			anIntArray2471 = new int[anInt2405 * anInt2462];
			anIntArray2398 = new int[anInt2405 * anInt2462];
			int i1 = arg1.method639((byte)123);
			if(~i1 == -2)
				anInt2416 |= 0x10000000;
			int i2 = arg1.method639((byte)123);
			if(~i2 == -2)
				anInt2416 |= 0x40000000;
			int l2 = arg1.method639((byte)123);
			if(~l2 == -2)
				anInt2416 |= 0x80000000;
			int i3 = arg1.method639((byte)123);
			if(~i3 == -2)
				anInt2416 |= 0x20000000;
			anInt2390 = arg1.method639((byte)123);
			anInt2399 = arg1.method639((byte)123);
			anIntArray2351 = new int[20];
			anIntArray2414 = new int[20];
			anIntArray2408 = new int[20];
			for(int j3 = 0; j3 < 20; j3++)
			{
				int k3 = arg1.method639((byte)123);
				if(~k3 == -2)
				{
					anIntArray2351[j3] = arg1.method672(98);
					anIntArray2414[j3] = arg1.method672(126);
					anIntArray2408[j3] = arg1.method623((byte)-101);
				} else
				{
					anIntArray2408[j3] = -1;
				}
			}

			aClass58Array2336 = new Class58[5];
			for(int l3 = 0; l3 < 5; l3++)
			{
				Class58 class58_1 = arg1.method646(-117);
				if(class58_1.method1035(27) > 0)
				{
					aClass58Array2336[l3] = class58_1;
					anInt2416 |= 1 << l3 + 23;
				}
			}

		}
		if(~anInt2452 == -4)
			aBoolean2338 = arg1.method639((byte)123) == 1;
		if(~anInt2452 == -5 || ~anInt2452 == -2)
		{
			anInt2359 = arg1.method639((byte)123);
			anInt2371 = arg1.method639((byte)123);
			anInt2343 = arg1.method639((byte)123);
			anInt2454 = arg1.method666(arg0 ^ 0xffffab48);
			if(anInt2454 == 65535)
				anInt2454 = -1;
			aBoolean2419 = ~arg1.method639((byte)123) == -2;
		}
		if(anInt2452 == 4)
		{
			aClass58_2428 = arg1.method646(-111);
			aClass58_2376 = arg1.method646(arg0 ^ 0x54eb);
		}
		if(anInt2452 == 1 || anInt2452 == 3 || anInt2452 == 4)
			anInt2410 = arg1.method623((byte)46);
		if(anInt2452 == 3 || ~anInt2452 == -5)
		{
			anInt2397 = arg1.method623((byte)-112);
			anInt2463 = arg1.method623((byte)118);
			anInt2348 = arg1.method623((byte)69);
		}
		if(anInt2452 == 5)
		{
			anInt2456 = arg1.method623((byte)-102);
			anInt2383 = arg1.method623((byte)-125);
		}
		if(anInt2452 == 6)
		{
			anInt2401 = 1;
			anInt2423 = arg1.method666(arg0 ^ 0xffffab44);
			if(~anInt2423 == 0xffff0000)
				anInt2423 = -1;
			anInt2364 = 1;
			anInt2426 = arg1.method666(arg0 + 21728);
			if(anInt2426 == 65535)
				anInt2426 = -1;
			anInt2374 = arg1.method666(34);
			if(~anInt2374 == 0xffff0000)
				anInt2374 = -1;
			anInt2367 = arg1.method666(119);
			if(anInt2367 == 65535)
				anInt2367 = -1;
			anInt2457 = arg1.method666(43);
			anInt2388 = arg1.method666(125);
			anInt2460 = arg1.method666(124);
		}
		if(~anInt2452 == -8)
		{
			anIntArray2398 = new int[anInt2462 * anInt2405];
			anIntArray2471 = new int[anInt2462 * anInt2405];
			anInt2359 = arg1.method639((byte)123);
			anInt2454 = arg1.method666(88);
			if(anInt2454 == 65535)
				anInt2454 = -1;
			aBoolean2419 = ~arg1.method639((byte)123) == -2;
			anInt2410 = arg1.method623((byte)57);
			anInt2390 = arg1.method672(97);
			anInt2399 = arg1.method672(100);
			int j1 = arg1.method639((byte)123);
			aClass58Array2336 = new Class58[5];
			if(j1 == 1)
				anInt2416 |= 0x40000000;
			for(int j2 = 0; ~j2 > -6; j2++)
			{
				Class58 class58 = arg1.method646(-110);
				if(~class58.method1035(27) < -1)
				{
					aClass58Array2336[j2] = class58;
					anInt2416 |= 1 << 23 + j2;
				}
			}

		}
		if(~anInt2452 == -9)
			aClass58_2428 = arg1.method646(arg0 ^ 0x54f5);
		if(~anInt2404 == -3 || ~anInt2452 == -3)
		{
			aClass58_2378 = arg1.method646(arg0 ^ 0x54f7);
			aClass58_2431 = arg1.method646(-116);
			int k1 = 0x3f & arg1.method666(arg0 + 21727);
			anInt2416 |= k1 << 0x552e0b2b;
		}
		if(~anInt2404 == -2 || ~anInt2404 == -5 || anInt2404 == 5 || anInt2404 == 6)
		{
			aClass58_2458 = arg1.method646(-121);
			if(aClass58_2458.method1035(27) == 0)
			{
				if(anInt2404 == 1)
					aClass58_2458 = Class27.aClass58_566;
				if(anInt2404 == 4)
					aClass58_2458 = Class33_Sub6_Sub3.aClass58_2713;
				if(anInt2404 == 5)
					aClass58_2458 = Class33_Sub6_Sub3.aClass58_2713;
				if(anInt2404 == 6)
					aClass58_2458 = Class33_Sub2.aClass58_2021;
			}
		}
		if(~anInt2404 == -2 || ~anInt2404 == -5 || ~anInt2404 == -6)
			anInt2416 |= 0x400000;
		if(anInt2404 == 6)
			anInt2416 |= 1;
	}

	public int[] method787(int arg0, Class33_Sub11 arg1)
	{
		try
		{
			anInt2420++;
			int i = arg1.method639((byte)123);
			if(i == 0)
				return null;
			if(arg0 != 6)
				anInt2371 = 77;
			int ai[] = new int[i];
			for(int j = 0; ~i < ~j; j++)
				ai[j] = arg1.method623((byte)126);

			return ai;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public Class33_Sub6_Sub7_Sub3 method788(int arg0, byte arg1)
	{
		try
		{
			Class33_Sub6_Sub9.aBoolean2850 = false;
			anInt2417++;
			if(~arg0 > -1 || anIntArray2408.length <= arg0)
				return null;
			int i = anIntArray2408[arg0];
			if(~i == 0)
				return null;
			int j = 44 % ((arg1 - -17) / 45);
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = (Class33_Sub6_Sub7_Sub3)Class48.aClass16_1048.method144(0, i);
			if(class33_sub6_sub7_sub3 != null)
				return class33_sub6_sub7_sub3;
			class33_sub6_sub7_sub3 = RuntimeException_Sub1.method1227(i, 0, 9, Class37.aClass30_833);
			if(class33_sub6_sub7_sub3 != null)
				Class48.aClass16_1048.method145(i, (byte)-121, class33_sub6_sub7_sub3);
			else
				Class33_Sub6_Sub9.aBoolean2850 = true;
			return class33_sub6_sub7_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub7_Sub2 method789(int arg0)
	{
		try
		{
			Class33_Sub6_Sub9.aBoolean2850 = false;
			anInt2340++;
			if(anInt2454 == -1)
				return null;
			Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = (Class33_Sub6_Sub7_Sub2)Class9.aClass16_165.method144(0, anInt2454);
			if(class33_sub6_sub7_sub2 != null)
				return class33_sub6_sub7_sub2;
			class33_sub6_sub7_sub2 = Class33_Sub13_Sub4.method749(Class37.aClass30_833, anInt2454, arg0, (byte)-97);
			if(class33_sub6_sub7_sub2 == null)
				Class33_Sub6_Sub9.aBoolean2850 = true;
			else
				Class9.aClass16_165.method145(anInt2454, (byte)-104, class33_sub6_sub7_sub2);
			return class33_sub6_sub7_sub2;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.A(" + arg0 + ')');
		}
	}

	public Object[] method790(Class33_Sub11 arg0, boolean arg1)
	{
		try
		{
			int i = arg0.method639((byte)123);
			if(arg1)
				method794(true, null, -70, 80, null);
			anInt2403++;
			if(~i == -1)
				return null;
			Object aobj[] = new Object[i];
			for(int j = 0; j < i; j++)
			{
				int k = arg0.method639((byte)123);
				if(~k == -1)
					aobj[j] = new Integer(arg0.method623((byte)99));
				else
				if(~k == -2)
					aobj[j] = arg0.method646(-123);
			}

			aBoolean2372 = true;
			return aobj;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public void method791(int arg0, int arg1, int arg2)
	{
		try
		{
			int i = anIntArray2471[arg2];
			anIntArray2471[arg2] = anIntArray2471[arg1];
			anIntArray2471[arg1] = i;
			i = anIntArray2398[arg2];
			if(arg0 != 0)
			{
				return;
			} else
			{
				anInt2442++;
				anIntArray2398[arg2] = anIntArray2398[arg1];
				anIntArray2398[arg1] = i;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.L(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method792(Class70 arg0, int arg1, int arg2, int arg3, int arg4, Class56 arg5, int arg6, int arg7, 
			int arg8, int arg9)
	{
		try
		{
			anInt2373++;
			int i = Class30.anIntArrayArrayArray645[arg6][arg3][arg7];
			int j = Class30.anIntArrayArrayArray645[arg6][arg3 + 1][arg7];
			int k = Class30.anIntArrayArrayArray645[arg6][arg3 + 1][1 + arg7];
			int l = Class30.anIntArrayArrayArray645[arg6][arg3][1 + arg7];
			int i1 = l + (j + (i + k)) >> 0xb3bb2422;
			if(arg2 != 30383)
				aClass58_2466 = null;
			Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-54, arg9);
			int k1 = arg8 + (arg4 << 0x28083f66);
			int j1 = (arg7 << 0xb5b92047) + (arg3 + ((arg9 << 0x766d9c8e) - 0xc0000000));
			if(~class33_sub6_sub17.anInt3134 == -2)
				k1 += 256;
			if(~class33_sub6_sub17.anInt3143 == -1)
				j1 += 0x80000000;
			if(arg8 == 22)
			{
				Object obj;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj = new Class33_Sub6_Sub4_Sub2(arg9, 22, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj = class33_sub6_sub17.method596((byte)117, k, arg4, i, l, 22, j);
				arg5.method1009(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj)), j1, k1);
				if(~class33_sub6_sub17.anInt3159 == -2)
					arg0.method1121(arg3, arg2 ^ 0x476af, arg7);
				return;
			}
			if(arg8 == 10 || arg8 == 11)
			{
				Object obj1;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj1 = new Class33_Sub6_Sub4_Sub2(arg9, 10, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj1 = class33_sub6_sub17.method596((byte)121, k, arg4, i, l, 10, j);
				if(obj1 != null)
				{
					int l3 = 0;
					int i3;
					int k3;
					if(arg4 != 1 && arg4 != 3)
					{
						k3 = class33_sub6_sub17.anInt3165;
						i3 = class33_sub6_sub17.anInt3181;
					} else
					{
						k3 = class33_sub6_sub17.anInt3181;
						i3 = class33_sub6_sub17.anInt3165;
					}
					if(arg8 == 11)
						l3 += 256;
					arg5.method981(arg1, arg3, arg7, i1, i3, k3, ((Class33_Sub6_Sub4) (obj1)), l3, j1, k1);
				}
				if(class33_sub6_sub17.anInt3159 != 0)
					arg0.method1120(class33_sub6_sub17.anInt3181, (byte)123, class33_sub6_sub17.aBoolean3184, arg7, arg3, class33_sub6_sub17.anInt3165, arg4);
				return;
			}
			if(~arg8 <= -13)
			{
				Object obj2;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj2 = new Class33_Sub6_Sub4_Sub2(arg9, arg8, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj2 = class33_sub6_sub17.method596((byte)-39, k, arg4, i, l, arg8, j);
				arg5.method981(arg1, arg3, arg7, i1, 1, 1, ((Class33_Sub6_Sub4) (obj2)), 0, j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1120(class33_sub6_sub17.anInt3181, (byte)99, class33_sub6_sub17.aBoolean3184, arg7, arg3, class33_sub6_sub17.anInt3165, arg4);
				return;
			}
			if(arg8 == 0)
			{
				Object obj3;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
					obj3 = new Class33_Sub6_Sub4_Sub2(arg9, 0, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj3 = class33_sub6_sub17.method596((byte)-58, k, arg4, i, l, 0, j);
				arg5.method1014(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj3)), null, Class11.anIntArray195[arg4], 0, j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg4, arg7, arg8);
				return;
			}
			if(arg8 == 1)
			{
				Object obj4;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
					obj4 = new Class33_Sub6_Sub4_Sub2(arg9, 1, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj4 = class33_sub6_sub17.method596((byte)-88, k, arg4, i, l, 1, j);
				arg5.method1014(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj4)), null, Class33_Sub10.anIntArray2201[arg4], 0, j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg4, arg7, arg8);
				return;
			}
			if(arg8 == 2)
			{
				int l1 = 3 & 1 + arg4;
				Object obj11;
				Object obj12;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
				{
					obj11 = new Class33_Sub6_Sub4_Sub2(arg9, 2, 4 - -arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
					obj12 = new Class33_Sub6_Sub4_Sub2(arg9, 2, l1, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				} else
				{
					obj11 = class33_sub6_sub17.method596((byte)127, k, 4 + arg4, i, l, 2, j);
					obj12 = class33_sub6_sub17.method596((byte)118, k, l1, i, l, 2, j);
				}
				arg5.method1014(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj11)), ((Class33_Sub6_Sub4) (obj12)), Class11.anIntArray195[arg4], Class11.anIntArray195[l1], j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg4, arg7, arg8);
				return;
			}
			if(arg8 == 3)
			{
				Object obj5;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj5 = new Class33_Sub6_Sub4_Sub2(arg9, 3, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj5 = class33_sub6_sub17.method596((byte)123, k, arg4, i, l, 3, j);
				arg5.method1014(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj5)), null, Class33_Sub10.anIntArray2201[arg4], 0, j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg4, arg7, arg8);
				return;
			}
			if(~arg8 == -10)
			{
				Object obj6;
				if(~class33_sub6_sub17.anInt3160 == 0 && class33_sub6_sub17.anIntArray3169 == null)
					obj6 = class33_sub6_sub17.method596((byte)-13, k, arg4, i, l, arg8, j);
				else
					obj6 = new Class33_Sub6_Sub4_Sub2(arg9, arg8, arg4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg5.method981(arg1, arg3, arg7, i1, 1, 1, ((Class33_Sub6_Sub4) (obj6)), 0, j1, k1);
				if(~class33_sub6_sub17.anInt3159 != -1)
					arg0.method1120(class33_sub6_sub17.anInt3181, (byte)-7, class33_sub6_sub17.aBoolean3184, arg7, arg3, class33_sub6_sub17.anInt3165, arg4);
				return;
			}
			if(class33_sub6_sub17.aBoolean3186)
				if(arg4 == 1)
				{
					int i2 = l;
					l = k;
					k = j;
					j = i;
					i = i2;
				} else
				if(arg4 != 2)
				{
					if(arg4 == 3)
					{
						int j2 = l;
						l = i;
						i = j;
						j = k;
						k = j2;
					}
				} else
				{
					int k2 = l;
					l = j;
					j = k2;
					k2 = k;
					k = i;
					i = k2;
				}
			if(arg8 == 4)
			{
				Object obj7;
				if(class33_sub6_sub17.anInt3160 == -1 && class33_sub6_sub17.anIntArray3169 == null)
					obj7 = class33_sub6_sub17.method596((byte)127, k, 0, i, l, 4, j);
				else
					obj7 = new Class33_Sub6_Sub4_Sub2(arg9, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg5.method996(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj7)), Class11.anIntArray195[arg4], arg4 * 512, 0, 0, j1, k1);
				return;
			}
			if(~arg8 == -6)
			{
				int l2 = 16;
				int j3 = arg5.method978(arg1, arg3, arg7);
				if(j3 != 0)
					l2 = Class33_Sub5.method285((byte)-85, (j3 & 0x1fffd080) >> 0x333ccfae).anInt3174;
				Object obj13;
				if(class33_sub6_sub17.anInt3160 == -1 && class33_sub6_sub17.anIntArray3169 == null)
					obj13 = class33_sub6_sub17.method596((byte)-54, k, 0, i, l, 4, j);
				else
					obj13 = new Class33_Sub6_Sub4_Sub2(arg9, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg5.method996(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj13)), Class11.anIntArray195[arg4], 512 * arg4, l2 * Class33_Sub6_Sub2.anIntArray2689[arg4], Class48.anIntArray1063[arg4] * l2, j1, k1);
				return;
			}
			if(arg8 == 6)
			{
				Object obj8;
				if(class33_sub6_sub17.anInt3160 == -1 && class33_sub6_sub17.anIntArray3169 == null)
					obj8 = class33_sub6_sub17.method596((byte)117, k, 0, i, l, 4, j);
				else
					obj8 = new Class33_Sub6_Sub4_Sub2(arg9, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg5.method996(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj8)), 256, arg4, 0, 0, j1, k1);
				return;
			}
			if(~arg8 == -8)
			{
				Object obj9;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj9 = new Class33_Sub6_Sub4_Sub2(arg9, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj9 = class33_sub6_sub17.method596((byte)-5, k, 0, i, l, 4, j);
				arg5.method996(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj9)), 512, arg4, 0, 0, j1, k1);
				return;
			}
			if(arg8 == 8)
			{
				Object obj10;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
					obj10 = new Class33_Sub6_Sub4_Sub2(arg9, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj10 = class33_sub6_sub17.method596((byte)126, k, 0, i, l, 4, j);
				arg5.method996(arg1, arg3, arg7, i1, ((Class33_Sub6_Sub4) (obj10)), 768, arg4, 0, 0, j1, k1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.K(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
		}
	}

	public void method793(Class33_Sub11 arg0, int arg1)
	{
		arg0.method639((byte)123);
		aBoolean2412 = true;
		anInt2452 = arg0.method639((byte)123);
		anInt2446 = arg0.method666(85);
		anInt2436++;
		anInt2345 = anInt2443 = arg0.method672(71);
		anInt2429 = anInt2356 = arg0.method672(112);
		anInt2462 = arg0.method666(33);
		if(anInt2452 != 9)
			anInt2405 = arg0.method666(41);
		else
			anInt2405 = arg0.method672(106);
		anInt2464 = arg0.method666(87);
		if(~anInt2464 != 0xffff0000)
			anInt2464 = (0xffff0000 & anInt2435) - -anInt2464;
		else
			anInt2464 = -1;
		aBoolean2430 = arg0.method639((byte)123) == 1;
		if(~anInt2452 == -1)
		{
			anInt2455 = arg0.method666(82);
			anInt2433 = arg0.method666(127);
		}
		if(anInt2452 == 5)
		{
			anInt2456 = arg0.method623((byte)72);
			anInt2354 = arg0.method666(60);
			aBoolean2424 = ~arg0.method639((byte)123) == -2;
			anInt2439 = arg0.method639((byte)123);
			anInt2425 = arg0.method639((byte)123);
			anInt2441 = arg0.method623((byte)63);
			aBoolean2392 = arg0.method639((byte)123) == 1;
			aBoolean2369 = arg0.method639((byte)123) == 1;
		}
		if(~anInt2452 == -7)
		{
			anInt2401 = 1;
			anInt2423 = arg0.method666(103);
			if(~anInt2423 == 0xffff0000)
				anInt2423 = -1;
			anInt2381 = arg0.method672(105);
			anInt2459 = arg0.method672(94);
			anInt2388 = arg0.method666(51);
			anInt2460 = arg0.method666(38);
			anInt2448 = arg0.method666(76);
			anInt2457 = arg0.method666(121);
			anInt2374 = arg0.method666(78);
			if(~anInt2374 == 0xffff0000)
				anInt2374 = -1;
			aBoolean2352 = arg0.method639((byte)123) == 1;
		}
		if(anInt2452 == 4)
		{
			anInt2454 = arg0.method666(75);
			if(~anInt2454 == 0xffff0000)
				anInt2454 = -1;
			aClass58_2428 = arg0.method646(-108);
			anInt2343 = arg0.method639((byte)123);
			anInt2359 = arg0.method639((byte)123);
			anInt2371 = arg0.method639((byte)123);
			aBoolean2419 = ~arg0.method639((byte)123) == -2;
			anInt2410 = arg0.method623((byte)-97);
		}
		if(anInt2452 == 3)
		{
			anInt2410 = arg0.method623((byte)95);
			aBoolean2338 = arg0.method639((byte)123) == 1;
			anInt2439 = arg0.method639((byte)123);
		}
		if(anInt2452 == 9)
		{
			anInt2395 = arg0.method639((byte)123);
			anInt2410 = arg0.method623((byte)-111);
		}
		anInt2416 = arg0.method626((byte)-114);
		aClass58_2415 = arg0.method646(-110);
		int i = arg0.method639((byte)123);
		if(i > 0)
		{
			aClass58Array2467 = new Class58[i];
			for(int j = 0; i > j; j++)
				aClass58Array2467[j] = arg0.method646(-114);

		}
		anInt2391 = arg0.method639((byte)123);
		anInt2447 = arg0.method639((byte)123);
		aBoolean2344 = arg0.method639((byte)123) == 1;
		aClass58_2378 = arg0.method646(-119);
		anObjectArray2440 = method790(arg0, false);
		anObjectArray2363 = method790(arg0, false);
		anObjectArray2365 = method790(arg0, false);
		anObjectArray2346 = method790(arg0, false);
		anObjectArray2444 = method790(arg0, false);
		anObjectArray2382 = method790(arg0, false);
		anObjectArray2469 = method790(arg0, false);
		anObjectArray2438 = method790(arg0, false);
		anObjectArray2451 = method790(arg0, false);
		anObjectArray2418 = method790(arg0, false);
		anObjectArray2361 = method790(arg0, false);
		anObjectArray2453 = method790(arg0, false);
		anObjectArray2400 = method790(arg0, false);
		anObjectArray2339 = method790(arg0, false);
		anObjectArray2406 = method790(arg0, false);
		anObjectArray2362 = method790(arg0, false);
		anObjectArray2396 = method790(arg0, false);
		anObjectArray2427 = method790(arg0, false);
		anIntArray2409 = method787(6, arg0);
		anIntArray2342 = method787(6, arg0);
		anIntArray2449 = method787(6, arg0);
		if(arg1 > -1)
			anInt2416 = 105;
	}

	public Class33_Sub6_Sub4_Sub3 method794(boolean arg0, Class33_Sub6_Sub14 arg1, int arg2, int arg3, Class46 arg4)
	{
		try
		{
			int j = 81 / ((48 - arg3) / 49);
			anInt2384++;
			int i;
			int k;
			if(!arg0)
			{
				k = anInt2423;
				i = anInt2401;
			} else
			{
				i = anInt2364;
				k = anInt2426;
			}
			Class33_Sub6_Sub9.aBoolean2850 = false;
			if(i == 0)
				return null;
			if(i == 1 && ~k == 0)
				return null;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class33_Sub9.aClass16_2196.method144(0, k + (i << 0x9710d730));
			if(class33_sub6_sub4_sub3 == null)
			{
				if(i == 1)
				{
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub12.aClass30_2327, k, 0);
					if(class33_sub6_sub4_sub7 == null)
					{
						Class33_Sub6_Sub9.aBoolean2850 = true;
						return null;
					}
					class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(64, 768, -50, -10, -50);
				}
				if(i == 2)
				{
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = Class46.method922(9, k).method582((byte)-78);
					if(class33_sub6_sub4_sub7_1 == null)
					{
						Class33_Sub6_Sub9.aBoolean2850 = true;
						return null;
					}
					class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7_1.method385(64, 768, -50, -10, -50);
				}
				if(i == 3)
				{
					if(arg4 == null)
						return null;
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = arg4.method924((byte)117);
					if(class33_sub6_sub4_sub7_2 == null)
					{
						Class33_Sub6_Sub9.aBoolean2850 = true;
						return null;
					}
					class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7_2.method385(64, 768, -50, -10, -50);
				}
				if(i == 4)
				{
					Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(k, (byte)90);
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_3 = class33_sub6_sub11.method529(-1, 10);
					if(class33_sub6_sub4_sub7_3 == null)
					{
						Class33_Sub6_Sub9.aBoolean2850 = true;
						return null;
					}
					class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7_3.method385(class33_sub6_sub11.anInt2937 + 64, 768 + class33_sub6_sub11.anInt2888, -50, -10, -50);
				}
				Class33_Sub9.aClass16_2196.method145(k + (i << 0x9ac18630), (byte)-116, class33_sub6_sub4_sub3);
			}
			if(arg1 != null)
				class33_sub6_sub4_sub3 = arg1.method573(-25963, arg2, class33_sub6_sub4_sub3);
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public Class33_Sub6_Sub7_Sub3 method795(boolean arg0, int arg1)
	{
		try
		{
			Class33_Sub6_Sub9.aBoolean2850 = false;
			int i;
			if(arg0)
				i = anInt2383;
			else
				i = anInt2456;
			anInt2407++;
			if(i == -1)
				return null;
			long l = (((long)anInt2441 << 0xef6b11a8) + ((aBoolean2369 ? 1L : 0L) << 0x4acc4aa7) + ((aBoolean2392 ? 1L : 0L) << 0xb4034226) + (long)i) - -((long)anInt2425 << 0xd404e624);
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = (Class33_Sub6_Sub7_Sub3)Class48.aClass16_1048.method144(0, l);
			if(class33_sub6_sub7_sub3 != null)
				return class33_sub6_sub7_sub3;
			class33_sub6_sub7_sub3 = RuntimeException_Sub1.method1227(i, 0, arg1 ^ 0xffffe68d, Class37.aClass30_833);
			if(class33_sub6_sub7_sub3 == null)
			{
				Class33_Sub6_Sub9.aBoolean2850 = true;
				return null;
			}
			if(aBoolean2392)
				class33_sub6_sub7_sub3.method476();
			if(aBoolean2369)
				class33_sub6_sub7_sub3.method472();
			if(~anInt2425 < -1)
				class33_sub6_sub7_sub3.method489(anInt2425);
			if(~anInt2425 <= -2)
				class33_sub6_sub7_sub3.method493(1);
			if(arg1 != -6524)
				method794(false, null, -28, 19, null);
			if(anInt2425 >= 2)
				class33_sub6_sub7_sub3.method493(0xffffff);
			if(anInt2441 != 0)
				class33_sub6_sub7_sub3.method480(anInt2441);
			Class48.aClass16_1048.method145(l, (byte)-115, class33_sub6_sub7_sub3);
			return class33_sub6_sub7_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.I(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method796(int arg0, Class58 arg1, boolean arg2)
	{
		try
		{
			anInt2337++;
			if(!arg2)
				return;
			if(aClass58Array2467 == null || ~aClass58Array2467.length >= ~arg0)
			{
				Class58 aclass58[] = new Class58[arg0 - -1];
				if(aClass58Array2467 != null)
				{
					for(int i = 0; ~i > ~aClass58Array2467.length; i++)
						aclass58[i] = aClass58Array2467[i];

				}
				aClass58Array2467 = aclass58;
			}
			aClass58Array2467[arg0] = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.M(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public static int method797(boolean arg0)
	{
		try
		{
			if(!arg0)
				method792(null, 126, 127, 39, 126, null, -66, -33, -71, -56);
			anInt2461++;
			return 6;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.J(" + arg0 + ')');
		}
	}

	public static void method798(int arg0)
	{
		try
		{
			aClass58_2466 = null;
			aClass58_2377 = null;
			aClass33_Sub6_Sub7_Sub4_2355 = null;
			aClass58_2350 = null;
			aClass58_2465 = null;
			aClass58_2450 = null;
			aClass58_2347 = null;
			if(arg0 > -127)
				aBoolean2470 = true;
			aClass58_2468 = null;
			aClass58_2437 = null;
			aClass58_2370 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "mf.H(" + arg0 + ')');
		}
	}

	public Class33_Sub15()
	{
		aBoolean2349 = false;
		anInt2354 = 0;
		anInt2341 = -1;
		anInt2356 = 0;
		anInt2359 = 0;
		anInt2383 = -1;
		anInt2390 = 0;
		aBoolean2344 = false;
		aClass58_2378 = Class15.aClass58_293;
		anInt2380 = -1;
		aBoolean2338 = false;
		aClass58_2376 = Class15.aClass58_293;
		aBoolean2372 = false;
		aClass58_2415 = Class15.aClass58_293;
		anInt2360 = 0;
		anInt2416 = 0;
		aBoolean2419 = false;
		anInt2421 = 0;
		anInt2364 = 1;
		anInt2391 = 0;
		aBoolean2430 = false;
		anInt2381 = 0;
		anInt2343 = 0;
		anInt2348 = 0;
		anInt2429 = 0;
		anInt2401 = 1;
		anInt2374 = -1;
		anInt2413 = 0;
		anInt2371 = 0;
		aBoolean2412 = false;
		anInt2388 = 0;
		anInt2404 = 0;
		anInt2367 = -1;
		anInt2345 = 0;
		anInt2435 = -1;
		anInt2434 = -1;
		anInt2410 = 0;
		aBoolean2352 = false;
		anInt2432 = -1;
		aBoolean2386 = false;
		anInt2397 = 0;
		anInt2423 = -1;
		anInt2439 = 0;
		aClass58_2428 = Class15.aClass58_293;
		anInt2426 = -1;
		anInt2447 = 0;
		anInt2441 = 0;
		anInt2433 = 0;
		anInt2454 = -1;
		aBoolean2424 = false;
		anInt2405 = 0;
		anInt2446 = 0;
		anInt2455 = 0;
		anInt2459 = 0;
		anInt2462 = 0;
		anInt2387 = 0;
		anInt2456 = -1;
		aClass58_2431 = Class15.aClass58_293;
		anInt2399 = 0;
		anInt2457 = 100;
		anInt2463 = 0;
		aClass33_Sub15_2366 = null;
		anInt2379 = 0;
		anInt2443 = 0;
		anInt2460 = 0;
		anInt2393 = 0;
		aClass58_2458 = Class27.aClass58_566;
		anInt2464 = -1;
		anInt2422 = 0;
		anInt2395 = 1;
		anInt2472 = 0;
		anInt2448 = 0;
		anInt2353 = 0;
		anInt2425 = 0;
	}

	public Class58 aClass58Array2336[];
	public static int anInt2337;
	public boolean aBoolean2338;
	public Object anObjectArray2339[];
	public static int anInt2340;
	public int anInt2341;
	public int anIntArray2342[];
	public int anInt2343;
	public boolean aBoolean2344;
	public int anInt2345;
	public Object anObjectArray2346[];
	public static Class58 aClass58_2347;
	public int anInt2348;
	public boolean aBoolean2349;
	public static Class58 aClass58_2350 = Class33_Sub6_Sub11.method535(110, "Bitte versuchen Sie es in ");
	public int anIntArray2351[];
	public boolean aBoolean2352;
	public int anInt2353;
	public int anInt2354;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_2355;
	public int anInt2356;
	public static int anInt2357;
	public static int anInt2358;
	public int anInt2359;
	public int anInt2360;
	public Object anObjectArray2361[];
	public Object anObjectArray2362[];
	public Object anObjectArray2363[];
	public int anInt2364;
	public Object anObjectArray2365[];
	public Class33_Sub15 aClass33_Sub15_2366;
	public int anInt2367;
	public int anIntArray2368[];
	public boolean aBoolean2369;
	public static Class58 aClass58_2370 = Class33_Sub6_Sub11.method535(113, "_");
	public int anInt2371;
	public boolean aBoolean2372;
	public static int anInt2373;
	public int anInt2374;
	public static boolean aBoolean2375 = false;
	public Class58 aClass58_2376;
	public static Class58 aClass58_2377;
	public Class58 aClass58_2378;
	public int anInt2379;
	public int anInt2380;
	public int anInt2381;
	public Object anObjectArray2382[];
	public int anInt2383;
	public static int anInt2384;
	public int anIntArray2385[];
	public boolean aBoolean2386;
	public int anInt2387;
	public int anInt2388;
	public static int anInt2389;
	public int anInt2390;
	public int anInt2391;
	public boolean aBoolean2392;
	public int anInt2393;
	public Class33_Sub15 aClass33_Sub15Array2394[];
	public int anInt2395;
	public Object anObjectArray2396[];
	public int anInt2397;
	public int anIntArray2398[];
	public int anInt2399;
	public Object anObjectArray2400[];
	public int anInt2401;
	public Object anObjectArray2402[];
	public static int anInt2403;
	public int anInt2404;
	public int anInt2405;
	public Object anObjectArray2406[];
	public static int anInt2407;
	public int anIntArray2408[];
	public int anIntArray2409[];
	public int anInt2410;
	public int anIntArrayArray2411[][];
	public boolean aBoolean2412;
	public int anInt2413;
	public int anIntArray2414[];
	public Class58 aClass58_2415;
	public int anInt2416;
	public static int anInt2417;
	public Object anObjectArray2418[];
	public boolean aBoolean2419;
	public static int anInt2420;
	public int anInt2421;
	public int anInt2422;
	public int anInt2423;
	public boolean aBoolean2424;
	public int anInt2425;
	public int anInt2426;
	public Object anObjectArray2427[];
	public Class58 aClass58_2428;
	public int anInt2429;
	public boolean aBoolean2430;
	public Class58 aClass58_2431;
	public int anInt2432;
	public int anInt2433;
	public int anInt2434;
	public int anInt2435;
	public static int anInt2436;
	public static Class58 aClass58_2437;
	public Object anObjectArray2438[];
	public int anInt2439;
	public Object anObjectArray2440[];
	public int anInt2441;
	public static int anInt2442;
	public int anInt2443;
	public Object anObjectArray2444[];
	public static int anInt2445 = 0;
	public int anInt2446;
	public int anInt2447;
	public int anInt2448;
	public int anIntArray2449[];
	public static Class58 aClass58_2450 = Class33_Sub6_Sub11.method535(111, " weitere Optionen");
	public Object anObjectArray2451[];
	public int anInt2452;
	public Object anObjectArray2453[];
	public int anInt2454;
	public int anInt2455;
	public int anInt2456;
	public int anInt2457;
	public Class58 aClass58_2458;
	public int anInt2459;
	public int anInt2460;
	public static int anInt2461;
	public int anInt2462;
	public int anInt2463;
	public int anInt2464;
	public static Class58 aClass58_2465 = Class33_Sub6_Sub11.method535(124, "Angreifen");
	public static Class58 aClass58_2466;
	public Class58 aClass58Array2467[];
	public static Class58 aClass58_2468 = Class33_Sub6_Sub11.method535(109, "<col=ffff00>");
	public Object anObjectArray2469[];
	public static boolean aBoolean2470 = false;
	public int anIntArray2471[];
	public int anInt2472;

	static 
	{
		aClass58_2466 = Class33_Sub6_Sub11.method535(117, " has logged out)3");
		aClass58_2377 = aClass58_2466;
		aClass58_2437 = Class33_Sub6_Sub11.method535(125, "To create a new account you need to");
		aClass58_2347 = aClass58_2437;
	}
}
