// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub11.java


public class Class33_Sub6_Sub11 extends Class33_Sub6
{

	public void method527(Class33_Sub6_Sub11 arg0, Class33_Sub6_Sub11 arg1, int arg2)
	{
		try
		{
			anInt2932 = arg0.anInt2932;
			aBoolean2935 = arg1.aBoolean2935;
			anInt2896 = arg0.anInt2896;
			anInt2943 = arg0.anInt2943;
			anInt2895++;
			if(arg2 >= -58)
				anIntArray2907 = null;
			anInt2944 = 1;
			aShortArray2909 = arg0.aShortArray2909;
			aShortArray2911 = arg0.aShortArray2911;
			anInt2922 = arg1.anInt2922;
			anInt2933 = arg0.anInt2933;
			aClass58_2898 = arg1.aClass58_2898;
			anInt2924 = arg0.anInt2924;
			anInt2916 = arg0.anInt2916;
			anInt2910 = arg0.anInt2910;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.I(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method528(boolean arg0, int arg1)
	{
		try
		{
			anInt2940++;
			int i = anInt2903;
			int j = anInt2902;
			if(arg0)
			{
				i = anInt2912;
				j = anInt2890;
			}
			if(i == -1)
				return null;
			int k = 32 / ((56 - arg1) / 54);
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, i, 0);
			if(j != -1)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, j, 0);
				Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = {
					class33_sub6_sub4_sub7, class33_sub6_sub4_sub7_1
				};
				class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, 2);
			}
			if(aShortArray2909 != null)
			{
				for(int l = 0; l < aShortArray2909.length; l++)
					class33_sub6_sub4_sub7.method389(aShortArray2909[l], aShortArray2911[l]);

			}
			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method529(int arg0, int arg1)
	{
		try
		{
			anInt2919++;
			if(anIntArray2928 != null && arg1 > 1)
			{
				int i = -1;
				for(int j = 0; ~j > -11; j++)
					if(arg1 >= anIntArray2894[j] && ~anIntArray2894[j] != -1)
						i = anIntArray2928[j];

				if(i != -1)
					return Class14.method127(i, (byte)90).method529(-1, 1);
			}
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, anInt2916, 0);
			if(class33_sub6_sub4_sub7 == null)
				return null;
			if(arg0 != -1)
				anInt2889 = -11;
			if(anInt2897 != 128 || anInt2886 != 128 || anInt2908 != 128)
				class33_sub6_sub4_sub7.method384(anInt2897, anInt2886, anInt2908);
			if(aShortArray2909 != null)
			{
				for(int k = 0; ~k > ~aShortArray2909.length; k++)
					class33_sub6_sub4_sub7.method389(aShortArray2909[k], aShortArray2911[k]);

			}
			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method530(byte arg0, Class33_Sub11 arg1)
	{
		anInt2918++;
		do
		{
			int i = arg1.method639((byte)123);
			if(~i == -1)
				break;
			method542(i, arg1, false);
		} while(true);
		if(arg0 != -76)
			method532(false, 112, 83, -26);
	}

	public Class33_Sub6_Sub4_Sub3 method531(int arg0, int arg1)
	{
		try
		{
			anInt2899++;
			if(anIntArray2928 != null && arg1 > 1)
			{
				int i = -1;
				for(int j = 0; j < 10; j++)
					if(anIntArray2894[j] <= arg1 && anIntArray2894[j] != 0)
						i = anIntArray2928[j];

				if(~i != 0)
					return Class14.method127(i, (byte)90).method531(-9570, 1);
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class50.aClass16_1086.method144(0, anInt2900);
			if(class33_sub6_sub4_sub3 != null)
				return class33_sub6_sub4_sub3;
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, anInt2916, 0);
			if(class33_sub6_sub4_sub7 == null)
				return null;
			if(~anInt2897 != -129 || anInt2886 != 128 || anInt2908 != 128)
				class33_sub6_sub4_sub7.method384(anInt2897, anInt2886, anInt2908);
			if(arg0 != -9570)
				return null;
			if(aShortArray2909 != null)
			{
				for(int k = 0; ~aShortArray2909.length < ~k; k++)
					class33_sub6_sub4_sub7.method389(aShortArray2909[k], aShortArray2911[k]);

			}
			class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(anInt2937 + 64, anInt2888 + 768, -50, -10, -50);
			class33_sub6_sub4_sub3.aBoolean3404 = true;
			Class50.aClass16_1086.method145(anInt2900, (byte)-102, class33_sub6_sub4_sub3);
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method532(boolean arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			anInt2934++;
			Class33_Sub15 class33_sub15 = Class39.method879(arg3, (byte)117, arg2);
			if(class33_sub15 != null && class33_sub15.anObjectArray2444 != null)
				Class13.method118(class33_sub15.anObjectArray2444, class33_sub15, 0, 0, null, 18859, 0);
			Class12.anInt209 = arg1;
			Class26.anInt533 = arg3;
			Class33_Sub20.anInt2576 = arg2;
			Class33_Sub15.aBoolean2470 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.P(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public Class33_Sub6_Sub11 method533(int arg0, int arg1)
	{
		try
		{
			anInt2921++;
			if(arg1 != -1)
				return null;
			if(anIntArray2928 != null && arg0 > 1)
			{
				int i = -1;
				for(int j = 0; ~j > -11; j++)
					if(arg0 >= anIntArray2894[j] && ~anIntArray2894[j] != -1)
						i = anIntArray2928[j];

				if(i != -1)
					return Class14.method127(i, (byte)90);
			}
			return this;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.O(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method534(boolean arg0, boolean arg1)
	{
		try
		{
			anInt2893++;
			int i = anInt2948;
			int j = anInt2889;
			int k = anInt2926;
			if(arg1)
			{
				j = anInt2929;
				i = anInt2936;
				k = anInt2930;
			}
			if(i == -1)
				return true;
			if(arg0)
				aClass58_2927 = null;
			boolean flag = true;
			if(!Class33_Sub6_Sub8.aClass30_2809.method225(i, -88, 0))
				flag = false;
			if(j != -1 && !Class33_Sub6_Sub8.aClass30_2809.method225(j, -122, 0))
				flag = false;
			if(k != -1 && !Class33_Sub6_Sub8.aClass30_2809.method225(k, -119, 0))
				flag = false;
			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.L(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class58 method535(int arg0, String arg1)
	{
		try
		{
			byte abyte0[] = arg1.getBytes();
			anInt2915++;
			int i = abyte0.length;
			if(arg0 <= 97)
				aClass33_Sub6_Sub4_Sub5_Sub2Array2887 = null;
			Class58 class58 = new Class58();
			int j = 0;
			class58.aByteArray1894 = new byte[i];
			while(j < i) 
			{
				int k = 0xff & abyte0[j++];
				if(~k >= -46 && ~k <= -41)
				{
					if(~j <= ~i)
						break;
					int l = 0xff & abyte0[j++];
					class58.aByteArray1894[class58.anInt1893++] = (byte)(43 * (k + -40) + (l - 48));
				} else
				if(k != 0)
					class58.aByteArray1894[class58.anInt1893++] = (byte)k;
			}
			class58.method1048(57);
			return class58.method1057(4096);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.N(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int method536(int arg0)
	{
		try
		{
			anInt2892++;
			int i = Class38.method871(Class33_Sub6_Sub4_Sub5.anInt3509, Class77_Sub2.anInt2645, Class58.anInt1907, -124);
			if(~(i + -Class71.anInt1516) > -801 && ~(Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][Class33_Sub6_Sub4_Sub5.anInt3509 >> 0x18b86947][Class58.anInt1907 >> 0xb281f367] & 4) != -1)
				return Class77_Sub2.anInt2645;
			if(arg0 != 20055)
				anIntArray2907 = null;
			return 3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.B(" + arg0 + ')');
		}
	}

	public static int method537(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt2925++;
			int i = arg0 >>> 0x6dd66b7f;
			if(arg2 != 4346)
				method535(43, null);
			return -i + (arg0 - -i) / arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.H(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public boolean method538(boolean arg0, int arg1)
	{
		try
		{
			anInt2914++;
			int i = anInt2903;
			int j = anInt2902;
			if(arg0)
			{
				j = anInt2890;
				i = anInt2912;
			}
			if(arg1 == i)
				return true;
			boolean flag = true;
			if(!Class33_Sub6_Sub8.aClass30_2809.method225(i, -74, 0))
				flag = false;
			if(~j != 0 && !Class33_Sub6_Sub8.aClass30_2809.method225(j, -115, 0))
				flag = false;
			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.J(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method539(byte arg0)
	{
		try
		{
			if(arg0 != -57)
				method537(30, 37, 68);
			anInt2891++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.A(" + arg0 + ')');
		}
	}

	public static void method540(int arg0)
	{
		try
		{
			Class66.aClass58_1430 = Class66.aClass58_1427;
			Class12.aClass58_207 = Class33_Sub6.aClass58_2133;
			Class23.aClass58_437 = Class14.aClass58_286;
			Class33_Sub6_Sub5.aClass58_2761 = Class45.aClass58_982;
			Class33_Sub18.aClass58_2531 = Class33_Sub6_Sub17.aClass58_3178;
			Class33_Sub7.aClass58_2151 = Canvas_Sub1.aClass58_55;
			Class33_Sub6_Sub8.aClass58_2804 = Class17.aClass58_340;
			Class33_Sub6.aClass58_2130 = Class15.aClass58_292;
			Class23.aClass58_433 = Class33_Sub6.aClass58_2135;
			Class23.aClass58_436 = client.aClass58_1941;
			Class46.aClass58_1018 = Class15.aClass58_298;
			Class36.aClass58_779 = Class33_Sub6_Sub2.aClass58_2702;
			Class81.aClass58_1766 = Class66.aClass58_1414;
			Class33_Sub6_Sub4_Sub4.aClass58_3482 = Class33_Sub4.aClass58_2067;
			Class33_Sub6_Sub3.aClass58_2713 = Class33_Sub6_Sub12.aClass58_2975;
			Class33_Sub9.aClass58_2199 = Class30_Sub1.aClass58_2010;
			Class73.aClass58_1558 = Class15.aClass58_302;
			Class39.aClass58_873 = Class33_Sub12.aClass58_2320;
			Class62.aClass58_1327 = Class33_Sub6_Sub15.aClass58_3061;
			Class82.aClass58_1787 = Class33_Sub6_Sub4_Sub5.aClass58_3566;
			Class33_Sub6_Sub4_Sub1.aClass58_3365 = Class33_Sub11.aClass58_2290;
			Class33_Sub10.aClass58_2220 = Class15_Sub2.aClass58_1970;
			Class23.aClass58_470 = Class15.aClass58_294;
			client.aClass58_1946 = Class33.aClass58_732;
			Class33_Sub4.aClass58_2081 = Class33_Sub6_Sub10.aClass58_2873;
			Class33_Sub9.aClass58_2197 = Class33_Sub5.aClass58_2117;
			Class63.aClass58_1329 = Class63.aClass58_1354;
			Class33_Sub6_Sub14.aClass58_3033 = Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3791;
			Class23.aClass58_448 = Class79.aClass58_1712;
			Class70.aClass58_1511 = Class74.aClass58_1588;
			Class59.aClass58_1274 = Class33_Sub12.aClass58_2318;
			Class44.aClass58_957 = Class47.aClass58_1028;
			Class74.aClass58_1571 = Class62.aClass58_1328;
			Class33_Sub10.aClass58_2228 = client.aClass58_1949;
			Class33_Sub10.aClass58_2214 = Class29.aClass58_598;
			Class30_Sub1.aClass58_2006 = Class12.aClass58_216;
			Class21.aClass58_397 = Class27.aClass58_554;
			Class54.aClass58_1151 = Class33_Sub10.aClass58_2229;
			Class43.aClass58_938 = Class42.aClass58_917;
			Class33_Sub15.aClass58_2377 = Class50.aClass58_1088;
			Class80.aClass58_1739 = Class46.aClass58_1002;
			Class33_Sub5.aClass58_2108 = Class33.aClass58_748;
			Class51.aClass58_1097 = Class9.aClass58_168;
			Class33_Sub5.aClass58_2102 = Class33_Sub6_Sub4.aClass58_2743;
			Class33_Sub6_Sub1.aClass58_2679 = Class55.aClass58_1163;
			Class33_Sub15.aClass58_2347 = Class33.aClass58_730;
			Class15.aClass58_304 = Class19.aClass58_376;
			Class23.aClass58_474 = Class79.aClass58_1682;
			Class23.aClass58_457 = Class79.aClass58_1682;
			Class33_Sub3.aClass58_2041 = Class31.aClass58_692;
			Class60.aClass58_1291 = Class33_Sub20.aClass58_2568;
			anInt2906++;
			Class33_Sub6_Sub4_Sub1.aClass58_3349 = Class33_Sub6_Sub16.aClass58_3072;
			Class33_Sub6_Sub4_Sub6.aClass58_3577 = Class81.aClass58_1748;
			Class47.aClass58_1039 = Class32.aClass58_705;
			Class70.aClass58_1514 = Class33_Sub6_Sub2.aClass58_2690;
			Class23.aClass58_458 = Class79.aClass58_1682;
			Class33_Sub18.aClass58_2529 = Class15.aClass58_290;
			Class33_Sub6_Sub4_Sub1.aClass58_3350 = Class22.aClass58_418;
			Class58.aClass58_1914 = Class33_Sub5.aClass58_2114;
			Class23.aClass58_482 = Class79.aClass58_1682;
			Class63.aClass58_1338 = Class29.aClass58_599;
			Class33_Sub6_Sub13.aClass58_3001 = Class33_Sub6_Sub17.aClass58_3173;
			Class33_Sub5.aClass58_2111 = Class33.aClass58_741;
			Class36.aClass58_792 = Class33_Sub6_Sub17.aClass58_3151;
			Class23.aClass58_475 = Class79.aClass58_1682;
			aClass58_2927 = RuntimeException_Sub1.aClass58_1814;
			Class16.aClass58_312 = Class22.aClass58_414;
			Class36.aClass58_794 = Class30.aClass58_650;
			Class33_Sub16.aClass58_2489 = Class50.aClass58_1083;
			Class66.aClass58_1407 = Applet_Sub1.aClass58_43;
			Class33_Sub12.aClass58_2323 = Class4.aClass58_137;
			Class33_Sub6_Sub12.aClass58_2955 = Class66.aClass58_1426;
			Class23.aClass58_464 = Class79.aClass58_1682;
			Class62.aClass58_1323 = Class33_Sub6_Sub15.aClass58_3066;
			Class34.aClass58_1823 = Class30.aClass58_648;
			Class33_Sub6_Sub4_Sub1.aClass58_3347 = Class33_Sub4.aClass58_2086;
			Class58.aClass58_1918 = Class73.aClass58_1549;
			Class44.aClass58_963 = Class33_Sub6_Sub4_Sub4.aClass58_3480;
			Class13.aClass58_251 = Class82.aClass58_1796;
			Class57.aClass58_1237 = Class82.aClass58_1801;
			Class23.aClass58_471 = Class79.aClass58_1682;
			Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3768 = Class33_Sub11.aClass58_2301;
			Canvas_Sub1.aClass58_50 = Class33_Sub3.aClass58_2057;
			Class60.aClass58_1292 = Class33_Sub13_Sub3.aClass58_3241;
			Class58.aClass58_1908 = Class33_Sub6_Sub2.aClass58_2696;
			Class33_Sub6_Sub4_Sub2.aClass58_3390 = Class66.aClass58_1423;
			Class81.aClass58_1771 = Class49.aClass58_1075;
			Class33_Sub6_Sub13.aClass58_2990 = Class33_Sub6_Sub17.aClass58_3173;
			Class30.aClass58_642 = Class33_Sub6_Sub16.aClass58_3087;
			Class74.aClass58_1564 = Class73.aClass58_1547;
			Class29.aClass58_590 = Class33_Sub12.aClass58_2312;
			Class23.aClass58_443 = Class79.aClass58_1682;
			if(arg0 >= -92)
			{
				return;
			} else
			{
				Class33_Sub2.aClass58_2026 = Class12.aClass58_208;
				Class71.aClass58_1518 = Class13.aClass58_268;
				Class30.aClass58_660 = Class33_Sub15.aClass58_2350;
				Class33_Sub11.aClass58_2260 = Class19.aClass58_367;
				Class15_Sub2.aClass58_1976 = Class23.aClass58_486;
				Class23.aClass58_481 = Class79.aClass58_1682;
				Class23.aClass58_466 = Class13.aClass58_248;
				Class23.aClass58_456 = Class79.aClass58_1682;
				Class9.aClass58_171 = Class33_Sub6_Sub17.aClass58_3189;
				Class33_Sub6_Sub10.aClass58_2865 = Class79.aClass58_1683;
				Class23.aClass58_440 = Class79.aClass58_1682;
				Class60.aClass58_1293 = Class63.aClass58_1331;
				Class33_Sub6_Sub3.aClass58_2721 = Class38.aClass58_855;
				Class29.aClass58_594 = Class33_Sub10.aClass58_2225;
				Class33_Sub6_Sub4.aClass58_2744 = Class13.aClass58_256;
				Class9.aClass58_169 = Class33_Sub6_Sub4_Sub1.aClass58_3354;
				Class13.aClass58_249 = Class77.aClass58_1643;
				Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3787 = Class33_Sub6_Sub4_Sub5.aClass58_3497;
				Class23.aClass58_455 = Class24.aClass58_497;
				Class33_Sub12.aClass58_2311 = Class4.aClass58_137;
				Class36.aClass58_799 = Class15_Sub2.aClass58_1961;
				Class23.aClass58_442 = Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3798;
				Class49.aClass58_1067 = Class30.aClass58_631;
				Class33_Sub6_Sub4_Sub5.aClass58_3568 = Class34.aClass58_1853;
				Class15_Sub2.aClass58_1978 = Class23.aClass58_486;
				Class80.aClass58_1733 = Class33_Sub6_Sub8.aClass58_2818;
				Class33_Sub9.aClass58_2187 = Class33_Sub11_Sub1.aClass58_3200;
				Class33_Sub18.aClass58_2527 = Class33_Sub6_Sub13.aClass58_2997;
				Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3784 = Class38.aClass58_850;
				Class31.aClass58_704 = Class66.aClass58_1402;
				Class33_Sub7.aClass58_2167 = Class75.aClass58_1622;
				Class33_Sub6_Sub4_Sub1.aClass58_3362 = Class34.aClass58_1852;
				Class40.aClass58_883 = Class47.aClass58_1046;
				Class68.aClass58_1454 = Class33_Sub6_Sub5.aClass58_2771;
				Class23.aClass58_467 = Class12.aClass58_243;
				Class23.aClass58_449 = Class79.aClass58_1682;
				Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3759 = Class48.aClass58_1058;
				Class79.aClass58_1720 = Class71.aClass58_1517;
				Class12.aClass58_234 = Class33_Sub16.aClass58_2490;
				Class24.aClass58_506 = Class36.aClass58_800;
				Class33_Sub6_Sub4_Sub4.aClass58_3474 = Class82.aClass58_1803;
				Class49.aClass58_1071 = Class26.aClass58_536;
				Class33_Sub6_Sub4_Sub5.aClass58_3573 = Class34.aClass58_1854;
				Class33_Sub3.aClass58_2040 = Class74.aClass58_1580;
				Class68.aClass58_1451 = Class3.aClass58_119;
				Class57.aClass58_1250 = Class78.aClass58_1671;
				Class12.aClass58_211 = Class81.aClass58_1761;
				Class23.aClass58_484 = Class79.aClass58_1682;
				Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3789 = Class79.aClass58_1688;
				Class77.aClass58_1644 = Class33_Sub6_Sub4_Sub5.aClass58_3508;
				Class24.aClass58_515 = Class33_Sub6_Sub4.aClass58_2746;
				Class15_Sub2.aClass58_1974 = Class57.aClass58_1247;
				Class47.aClass58_1045 = Class33_Sub6_Sub13.aClass58_3002;
				Class23.aClass58_468 = Class79.aClass58_1682;
				Class23.aClass58_451 = Class12.aClass58_243;
				Class33_Sub20.aClass58_2573 = Class33_Sub6_Sub8.aClass58_2816;
				Class33_Sub6_Sub10.aClass58_2883 = Class47.aClass58_1033;
				Class23.aClass58_431 = Class79.aClass58_1682;
				Class33_Sub6_Sub1.aClass58_2676 = Class75.aClass58_1610;
				Class33_Sub6_Sub4_Sub1.aClass58_3341 = Class78.aClass58_1675;
				Class23.aClass58_478 = Class79.aClass58_1682;
				Class33_Sub6_Sub5.aClass58_2760 = Class33_Sub6_Sub17.aClass58_3166;
				Class33_Sub7.aClass58_2170 = Class73.aClass58_1552;
				Class33_Sub2.aClass58_2021 = Class14.aClass58_273;
				Class33_Sub6_Sub16.aClass58_3115 = Class50.aClass58_1091;
				Class19.aClass58_370 = Class33_Sub18.aClass58_2509;
				Class23.aClass58_479 = Class79.aClass58_1682;
				Class23.aClass58_463 = Class79.aClass58_1682;
				Class33_Sub4.aClass58_2065 = Class33_Sub6_Sub10.aClass58_2873;
				Class23.aClass58_490 = Class33_Sub15.aClass58_2450;
				Class63.aClass58_1333 = Class33_Sub18.aClass58_2522;
				Class26.aClass58_539 = Class58.aClass58_1909;
				Class45.aClass58_975 = Class33_Sub6_Sub4.aClass58_2738;
				Class23.aClass58_453 = Class79.aClass58_1682;
				Class33_Sub6_Sub4_Sub6.aClass58_3588 = Class45.aClass58_985;
				Class33_Sub6_Sub4_Sub1.aClass58_3359 = Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3750;
				Class3.aClass58_114 = Class58.aClass58_1917;
				Class33_Sub6_Sub4.aClass58_2750 = Class41.aClass58_908;
				Class23.aClass58_491 = Class22.aClass58_418;
				Class33_Sub6_Sub4_Sub1.aClass58_3337 = Class78.aClass58_1675;
				Class47.aClass58_1044 = Canvas_Sub1.aClass58_69;
				Class33_Sub6_Sub8.aClass58_2803 = Class33_Sub15.aClass58_2465;
				Class77.aClass58_1648 = Class33_Sub6_Sub9.aClass58_2829;
				Class33_Sub7.aClass58_2147 = Class75.aClass58_1622;
				Class58.aClass58_1921 = Class26.aClass58_547;
				Class23.aClass58_434 = Class79.aClass58_1682;
				Class59.aClass58_1265 = Class33_Sub16.aClass58_2492;
				Class33_Sub4.aClass58_2089 = Class33_Sub6_Sub15.aClass58_3056;
				Class17.aClass58_348 = Class74.aClass58_1588;
				Class60.aClass58_1279 = Class35.aClass58_757;
				Class33_Sub6_Sub1.aClass58_2653 = Class68.aClass58_1450;
				Class34.aClass58_1828 = Class81.aClass58_1751;
				Class33_Sub6_Sub4_Sub1.aClass58_3351 = Class22.aClass58_418;
				Class45.aClass58_979 = Class9.aClass58_172;
				Class29.aClass58_606 = Class33_Sub11_Sub1.aClass58_3204;
				Class33_Sub6_Sub6.aClass58_2789 = Class75.aClass58_1595;
				Class30.aClass58_653 = Class33_Sub6_Sub2.aClass58_2682;
				Class23.aClass58_435 = Class33_Sub6_Sub14.aClass58_3041;
				Class33_Sub6_Sub9.aClass58_2824 = Class33_Sub6_Sub4_Sub4.aClass58_3477;
				Class33_Sub3.aClass58_2043 = Class38.aClass58_854;
				Class41.aClass58_913 = Class24.aClass58_493;
				Class46.aClass58_1011 = Class33_Sub6_Sub4_Sub2.aClass58_3382;
				Class80.aClass58_1740 = Class30.aClass58_627;
				Class46.aClass58_1014 = Class33_Sub3.aClass58_2048;
				Class23.aClass58_447 = Class15.aClass58_294;
				Class33_Sub9.aClass58_2178 = Class33_Sub4.aClass58_2091;
				Class27.aClass58_566 = Class41.aClass58_909;
				Class33_Sub6_Sub9.aClass58_2838 = Class42.aClass58_923;
				Class38.aClass58_841 = Class33_Sub6_Sub5.aClass58_2757;
				Class23.aClass58_461 = Class82.aClass58_1804;
				Class78.aClass58_1663 = RuntimeException_Sub1.aClass58_1815;
				Class55.aClass58_1164 = Class33_Sub6_Sub10.aClass58_2860;
				Class65.aClass58_1397 = Class39.aClass58_880;
				Class23.aClass58_439 = Class79.aClass58_1682;
				Class58.aClass58_1903 = Class33_Sub6_Sub2.aClass58_2696;
				Class39.aClass58_865 = Class24.aClass58_494;
				Class30.aClass58_675 = Class51.aClass58_1095;
				Class33_Sub6_Sub17.aClass58_3132 = Class32.aClass58_715;
				Class51.aClass58_1094 = Class32.aClass58_713;
				Class33_Sub6_Sub2.aClass58_2698 = client.aClass58_1945;
				Class33_Sub16.aClass58_2495 = Class33_Sub6_Sub13.aClass58_3003;
				Class33_Sub6_Sub4_Sub1.aClass58_3355 = Class12.aClass58_244;
				Class33_Sub6_Sub4_Sub1.aClass58_3343 = Class22.aClass58_418;
				Class33_Sub6_Sub4_Sub1.aClass58_3340 = Class33_Sub6_Sub13.aClass58_2989;
				Class49.aClass58_1079 = Class82.aClass58_1799;
				Class35.aClass58_764 = Class33_Sub3.aClass58_2054;
				Class78.aClass58_1662 = Class19.aClass58_366;
				Class33_Sub21.aClass58_2583 = Class74.aClass58_1586;
				Class23.aClass58_480 = Class81.aClass58_1767;
				Class23.aClass58_489 = aClass58_2904;
				Class47.aClass58_1027 = Class33_Sub6_Sub17.aClass58_3137;
				Class33_Sub18.aClass58_2533 = Class79.aClass58_1682;
				Class12.aClass58_223 = Class33_Sub12.aClass58_2328;
				Class23.aClass58_445 = Class33_Sub11.aClass58_2290;
				Class33_Sub6_Sub5.aClass58_2780 = Class77_Sub2.aClass58_2625;
				Class48.aClass58_1057 = Class44.aClass58_956;
				Class33_Sub10.aClass58_2226 = Class59.aClass58_1260;
				Class21.aClass58_405 = Class11.aClass58_199;
				Class47.aClass58_1034 = Class33_Sub6_Sub12.aClass58_2982;
				Class13.aClass58_250 = Class33_Sub6_Sub4_Sub2.aClass58_3393;
				Class33_Sub12.aClass58_2309 = Class33_Sub6_Sub13.aClass58_2998;
				Class33_Sub6_Sub4_Sub4.aClass58_3485 = Class33_Sub6_Sub3.aClass58_2719;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.K(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method541(boolean arg0, boolean arg1)
	{
		try
		{
			anInt2923++;
			int i = anInt2948;
			int k = anInt2926;
			int j = anInt2889;
			if(arg0)
			{
				k = anInt2930;
				i = anInt2936;
				j = anInt2929;
			}
			if(~i == 0)
				return null;
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, i, 0);
			if(~j != 0)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, j, 0);
				if(~k == 0)
				{
					Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = {
						class33_sub6_sub4_sub7, class33_sub6_sub4_sub7_1
					};
					class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, 2);
				} else
				{
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub6_Sub8.aClass30_2809, k, 0);
					Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7_1[] = {
						class33_sub6_sub4_sub7, class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_2
					};
					class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7_1, 3);
				}
			}
			if(!arg1)
				anInt2933 = 40;
			if(!arg0 && ~anInt2942 != -1)
				class33_sub6_sub4_sub7.method393(0, anInt2942, 0);
			if(arg0 && anInt2931 != 0)
				class33_sub6_sub4_sub7.method393(0, anInt2931, 0);
			if(aShortArray2909 != null)
			{
				for(int l = 0; ~l > ~aShortArray2909.length; l++)
					class33_sub6_sub4_sub7.method389(aShortArray2909[l], aShortArray2911[l]);

			}
			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.M(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method542(int arg0, Class33_Sub11 arg1, boolean arg2)
	{
		try
		{
			anInt2938++;
			if(arg2)
				method543((byte)50);
			if(~arg0 == -2)
			{
				anInt2916 = arg1.method666(53);
				return;
			}
			if(~arg0 == -3)
			{
				aClass58_2898 = arg1.method646(-117);
				return;
			}
			if(~arg0 != -5)
			{
				if(~arg0 != -6)
				{
					if(~arg0 != -7)
					{
						if(arg0 == 7)
						{
							anInt2933 = arg1.method666(36);
							if(~anInt2933 < -32768)
							{
								anInt2933 -= 0x10000;
								return;
							}
						} else
						if(arg0 == 8)
						{
							anInt2943 = arg1.method666(67);
							if(~anInt2943 < -32768)
							{
								anInt2943 -= 0x10000;
								return;
							}
						} else
						{
							if(~arg0 != -12)
							{
								if(~arg0 == -13)
								{
									anInt2922 = arg1.method623((byte)-96);
									return;
								}
								if(arg0 != 16)
								{
									if(~arg0 != -24)
									{
										if(~arg0 != -25)
										{
											if(arg0 == 25)
											{
												anInt2936 = arg1.method666(50);
												anInt2931 = arg1.method639((byte)123);
												return;
											}
											if(~arg0 != -27)
											{
												if(arg0 < 30 || arg0 >= 35)
												{
													if(~arg0 <= -36 && arg0 < 40)
													{
														aClass58Array2947[-35 + arg0] = arg1.method646(-122);
														return;
													}
													if(~arg0 != -41)
														if(arg0 != 78)
														{
															if(arg0 == 79)
															{
																anInt2930 = arg1.method666(58);
																return;
															}
															if(arg0 == 90)
															{
																anInt2903 = arg1.method666(122);
																return;
															}
															if(arg0 != 91)
															{
																if(~arg0 == -93)
																{
																	anInt2902 = arg1.method666(63);
																	return;
																}
																if(arg0 != 93)
																{
																	if(arg0 != 95)
																	{
																		if(arg0 == 97)
																		{
																			anInt2901 = arg1.method666(68);
																			return;
																		}
																		if(arg0 != 98)
																		{
																			if(arg0 < 100 || ~arg0 <= -111)
																			{
																				if(arg0 == 110)
																				{
																					anInt2897 = arg1.method666(56);
																					return;
																				}
																				if(~arg0 != -112)
																				{
																					if(arg0 == 112)
																					{
																						anInt2908 = arg1.method666(104);
																						return;
																					}
																					if(~arg0 != -114)
																					{
																						if(~arg0 != -115)
																						{
																							if(~arg0 == -116)
																							{
																								anInt2913 = arg1.method639((byte)123);
																								return;
																							}
																						} else
																						{
																							anInt2888 = 5 * arg1.method661((byte)-109);
																						}
																						return;
																					} else
																					{
																						anInt2937 = arg1.method661((byte)-107);
																						return;
																					}
																				} else
																				{
																					anInt2886 = arg1.method666(113);
																					return;
																				}
																			}
																			if(anIntArray2928 == null)
																			{
																				anIntArray2928 = new int[10];
																				anIntArray2894 = new int[10];
																			}
																			anIntArray2928[-100 + arg0] = arg1.method666(44);
																			anIntArray2894[-100 + arg0] = arg1.method666(45);
																			return;
																		} else
																		{
																			anInt2905 = arg1.method666(82);
																			return;
																		}
																	} else
																	{
																		anInt2896 = arg1.method666(57);
																		return;
																	}
																} else
																{
																	anInt2890 = arg1.method666(36);
																	return;
																}
															} else
															{
																anInt2912 = arg1.method666(125);
																return;
															}
														} else
														{
															anInt2926 = arg1.method666(102);
															return;
														}
													int i = arg1.method639((byte)123);
													aShortArray2909 = new short[i];
													aShortArray2911 = new short[i];
													for(int j = 0; ~j > ~i; j++)
													{
														aShortArray2909[j] = (short)arg1.method666(56);
														aShortArray2911[j] = (short)arg1.method666(62);
													}

													return;
												}
												aClass58Array2917[arg0 - 30] = arg1.method646(-108);
												if(aClass58Array2917[arg0 - 30].method1059(-1, Class17.aClass58_348))
												{
													aClass58Array2917[arg0 - 30] = null;
													return;
												}
											} else
											{
												anInt2929 = arg1.method666(121);
											}
											return;
										} else
										{
											anInt2889 = arg1.method666(116);
											return;
										}
									} else
									{
										anInt2948 = arg1.method666(62);
										anInt2942 = arg1.method639((byte)123);
										return;
									}
								} else
								{
									aBoolean2935 = true;
									return;
								}
							}
							anInt2944 = 1;
						}
						return;
					} else
					{
						anInt2932 = arg1.method666(118);
						return;
					}
				} else
				{
					anInt2924 = arg1.method666(108);
					return;
				}
			} else
			{
				anInt2910 = arg1.method666(115);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.Q(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public static void method543(byte arg0)
	{
		try
		{
			aClass58_2920 = null;
			anIntArray2907 = null;
			aClass58_2927 = null;
			aClass58_2945 = null;
			aClass58_2904 = null;
			aClass30_2941 = null;
			if(arg0 != 20)
			{
				return;
			} else
			{
				aClass33_Sub6_Sub4_Sub5_Sub2Array2887 = null;
				aClass58_2946 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kc.D(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub11()
	{
		aClass58_2898 = Class59.aClass58_1259;
		anInt2897 = 128;
		anInt2901 = -1;
		anInt2902 = -1;
		anInt2886 = 128;
		anInt2890 = -1;
		anInt2888 = 0;
		anInt2905 = -1;
		anInt2910 = 2000;
		anInt2903 = -1;
		anInt2913 = 0;
		anInt2889 = -1;
		anInt2908 = 128;
		anInt2926 = -1;
		anInt2922 = 1;
		anInt2912 = -1;
		anInt2936 = -1;
		anInt2937 = 0;
		aClass58Array2917 = (new Class58[] {
			null, null, Class12.aClass58_234, null, null
		});
		anInt2929 = -1;
		anInt2933 = 0;
		anInt2932 = 0;
		anInt2930 = -1;
		anInt2896 = 0;
		anInt2931 = 0;
		anInt2924 = 0;
		anInt2943 = 0;
		anInt2944 = 0;
		anInt2942 = 0;
		aBoolean2935 = false;
		aClass58Array2947 = (new Class58[] {
			null, null, null, null, Class46.aClass58_1011
		});
		anInt2948 = -1;
	}

	public int anInt2886;
	public static Class33_Sub6_Sub4_Sub5_Sub2 aClass33_Sub6_Sub4_Sub5_Sub2Array2887[] = new Class33_Sub6_Sub4_Sub5_Sub2[32768];
	public int anInt2888;
	public int anInt2889;
	public int anInt2890;
	public static int anInt2891;
	public static int anInt2892;
	public static int anInt2893;
	public int anIntArray2894[];
	public static int anInt2895;
	public int anInt2896;
	public int anInt2897;
	public Class58 aClass58_2898;
	public static int anInt2899;
	public int anInt2900;
	public int anInt2901;
	public int anInt2902;
	public int anInt2903;
	public static Class58 aClass58_2904 = method535(123, "auf der Hautpseite)3");
	public int anInt2905;
	public static int anInt2906;
	public static int anIntArray2907[] = new int[5];
	public int anInt2908;
	public short aShortArray2909[];
	public int anInt2910;
	public short aShortArray2911[];
	public int anInt2912;
	public int anInt2913;
	public static int anInt2914;
	public static int anInt2915;
	public int anInt2916;
	public Class58 aClass58Array2917[];
	public static int anInt2918;
	public static int anInt2919;
	public static Class58 aClass58_2920;
	public static int anInt2921;
	public int anInt2922;
	public static int anInt2923;
	public int anInt2924;
	public static int anInt2925;
	public int anInt2926;
	public static Class58 aClass58_2927;
	public int anIntArray2928[];
	public int anInt2929;
	public int anInt2930;
	public int anInt2931;
	public int anInt2932;
	public int anInt2933;
	public static int anInt2934;
	public boolean aBoolean2935;
	public int anInt2936;
	public int anInt2937;
	public static int anInt2938;
	public static int anInt2939 = -1;
	public static int anInt2940;
	public static Class30 aClass30_2941;
	public int anInt2942;
	public int anInt2943;
	public int anInt2944;
	public static Class58 aClass58_2945 = method535(99, "compass");
	public static Class58 aClass58_2946 = method535(104, "Side panel redrawn");
	public Class58 aClass58Array2947[];
	public int anInt2948;

	static 
	{
		aClass58_2920 = method535(99, "Existing User");
		aClass58_2927 = aClass58_2920;
	}
}
