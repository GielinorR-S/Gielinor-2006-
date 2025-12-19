// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub13_Sub1.java


public class Class33_Sub13_Sub1 extends Class33_Sub13
{

	public synchronized void method696(int arg0)
	{
		anInt3225 = arg0;
	}

	public static int method697(int arg0, byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, Class33_Sub13_Sub1 arg12)
	{
		arg3 >>= 8;
		arg11 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		arg7 <<= 2;
		arg8 <<= 2;
		if((arg9 = (arg4 + arg3) - (arg11 - 1)) > arg10)
			arg9 = arg10;
		arg12.anInt3223 += arg12.anInt3227 * (arg9 - arg4);
		arg4 <<= 1;
		arg9 <<= 1;
		for(arg9 -= 6; arg4 < arg9;)
		{
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}

		for(arg9 += 6; arg4 < arg9;)
		{
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}

		arg12.anInt3222 = arg5 >> 2;
		arg12.anInt3218 = arg6 >> 2;
		arg12.anInt3221 = arg3 << 8;
		return arg4 >> 1;
	}

	public synchronized void method698(boolean arg0)
	{
		anInt3228 = (anInt3228 ^ anInt3228 >> 31) + (anInt3228 >>> 31);
		if(arg0)
			anInt3228 = -anInt3228;
	}

	public static int method699(byte arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			Class33_Sub13_Sub1 arg8)
	{
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 2;
		if((arg5 = (arg3 + arg2) - (arg7 - 1)) > arg6)
			arg5 = arg6;
		for(arg5 -= 3; arg3 < arg5;)
		{
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
		}

		for(arg5 += 3; arg3 < arg5;)
			arg1[arg3++] += arg0[arg2--] * arg4;

		arg8.anInt3221 = arg2 << 8;
		return arg3;
	}

	public synchronized int method700()
	{
		if(anInt3226 < 0)
			return -1;
		else
			return anInt3226;
	}

	public boolean method701()
	{
		return anInt3221 < 0 || anInt3221 >= ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194.length << 8;
	}

	public static int method702(int arg0, byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, Class33_Sub13_Sub1 arg12)
	{
		arg3 >>= 8;
		arg11 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		arg7 <<= 2;
		arg8 <<= 2;
		if((arg9 = (arg4 + arg11) - arg3) > arg10)
			arg9 = arg10;
		arg12.anInt3223 += arg12.anInt3227 * (arg9 - arg4);
		arg4 <<= 1;
		arg9 <<= 1;
		for(arg9 -= 6; arg4 < arg9;)
		{
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}

		for(arg9 += 6; arg4 < arg9;)
		{
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}

		arg12.anInt3222 = arg5 >> 2;
		arg12.anInt3218 = arg6 >> 2;
		arg12.anInt3221 = arg3 << 8;
		return arg4 >> 1;
	}

	public int method695()
	{
		return anInt3230 != 0 || anInt3219 != 0 ? 1 : 0;
	}

	public static Class33_Sub13_Sub1 method703(Class33_Sub8_Sub1 arg0, int arg1, int arg2)
	{
		if(arg0.aByteArray3194 == null || arg0.aByteArray3194.length == 0)
			return null;
		else
			return new Class33_Sub13_Sub1(arg0, (int)(((long)arg0.anInt3195 * 256L * (long)arg1) / (long)(100 * Class39.anInt863)), arg2 << 6);
	}

	public void method704()
	{
		if(anInt3219 != 0)
		{
			if(anInt3230 == 0x80000000)
				anInt3230 = 0;
			anInt3219 = 0;
			method724();
		}
	}

	public synchronized void method705(int arg0)
	{
		method722(arg0 << 6, method700());
	}

	public static int method706(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, int arg12, Class33_Sub13_Sub1 arg13, int arg14, 
			int arg15)
	{
		arg13.anInt3223 -= arg13.anInt3227 * arg5;
		if(arg14 == 0 || (arg10 = arg5 + (((arg12 + 256) - arg4) + arg14) / arg14) > arg11)
			arg10 = arg11;
		arg5 <<= 1;
		for(arg10 <<= 1; arg5 < arg10;)
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}

		if(arg14 == 0 || (arg10 = (arg5 >> 1) + ((arg12 - arg4) + arg14) / arg14) > arg11)
			arg10 = arg11;
		arg10 <<= 1;
		arg1 = arg15;
		while(arg5 < arg10) 
		{
			arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		arg5 >>= 1;
		arg13.anInt3223 += arg13.anInt3227 * arg5;
		arg13.anInt3222 = arg6;
		arg13.anInt3218 = arg7;
		arg13.anInt3221 = arg4;
		return arg5;
	}

	public static int method707(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, Class33_Sub13_Sub1 arg11, int arg12, int arg13)
	{
		if(arg12 == 0 || (arg8 = arg5 + (((arg10 + 256) - arg4) + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg5 <<= 1;
		for(arg8 <<= 1; arg5 < arg8;)
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}

		if(arg12 == 0 || (arg8 = (arg5 >> 1) + ((arg10 - arg4) + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg8 <<= 1;
		arg1 = arg13;
		while(arg5 < arg8) 
		{
			arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt3221 = arg4;
		return arg5 >> 1;
	}

	public static int method708(byte arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, Class33_Sub13_Sub1 arg9)
	{
		arg2 >>= 8;
		arg8 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		if((arg6 = (arg3 + arg2) - (arg8 - 1)) > arg7)
			arg6 = arg7;
		arg9.anInt3222 += arg9.anInt3231 * (arg6 - arg3);
		arg9.anInt3218 += arg9.anInt3224 * (arg6 - arg3);
		for(arg6 -= 3; arg3 < arg6;)
		{
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
		}

		for(arg6 += 3; arg3 < arg6;)
		{
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
		}

		arg9.anInt3223 = arg4 >> 2;
		arg9.anInt3221 = arg2 << 8;
		return arg3;
	}

	public synchronized void method709(int arg0)
	{
		if(arg0 == 0)
		{
			method729(0);
			method266(-58);
			return;
		}
		if(anInt3222 == 0 && anInt3218 == 0)
		{
			anInt3219 = 0;
			anInt3230 = 0;
			anInt3223 = 0;
			method266(-127);
			return;
		}
		int i = -anInt3223;
		if(anInt3223 > i)
			i = anInt3223;
		if(-anInt3222 > i)
			i = -anInt3222;
		if(anInt3222 > i)
			i = anInt3222;
		if(-anInt3218 > i)
			i = -anInt3218;
		if(anInt3218 > i)
			i = anInt3218;
		if(arg0 > i)
			arg0 = i;
		anInt3219 = arg0;
		anInt3230 = 0x80000000;
		anInt3227 = -anInt3223 / arg0;
		anInt3231 = -anInt3222 / arg0;
		anInt3224 = -anInt3218 / arg0;
	}

	public boolean method710()
	{
		int i = anInt3230;
		int j;
		int k;
		if(i == 0x80000000)
		{
			i = j = k = 0;
		} else
		{
			j = method733(i, anInt3226);
			k = method731(i, anInt3226);
		}
		if(anInt3223 != i || anInt3222 != j || anInt3218 != k)
		{
			if(anInt3223 < i)
			{
				anInt3227 = 1;
				anInt3219 = i - anInt3223;
			} else
			if(anInt3223 > i)
			{
				anInt3227 = -1;
				anInt3219 = anInt3223 - i;
			} else
			{
				anInt3227 = 0;
			}
			if(anInt3222 < j)
			{
				anInt3231 = 1;
				if(anInt3219 == 0 || anInt3219 > j - anInt3222)
					anInt3219 = j - anInt3222;
			} else
			if(anInt3222 > j)
			{
				anInt3231 = -1;
				if(anInt3219 == 0 || anInt3219 > anInt3222 - j)
					anInt3219 = anInt3222 - j;
			} else
			{
				anInt3231 = 0;
			}
			if(anInt3218 < k)
			{
				anInt3224 = 1;
				if(anInt3219 == 0 || anInt3219 > k - anInt3218)
					anInt3219 = k - anInt3218;
			} else
			if(anInt3218 > k)
			{
				anInt3224 = -1;
				if(anInt3219 == 0 || anInt3219 > anInt3218 - k)
					anInt3219 = anInt3218 - k;
			} else
			{
				anInt3224 = 0;
			}
			return false;
		}
		if(anInt3230 == 0x80000000)
		{
			anInt3230 = 0;
			anInt3223 = anInt3222 = anInt3218 = 0;
			method266(-117);
			return true;
		} else
		{
			method724();
			return false;
		}
	}

	public static int method711(int arg0, byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, Class33_Sub13_Sub1 arg10)
	{
		arg3 >>= 8;
		arg9 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		if((arg7 = (arg4 + arg3) - (arg9 - 1)) > arg8)
			arg7 = arg8;
		arg4 <<= 1;
		arg7 <<= 1;
		for(arg7 -= 6; arg4 < arg7;)
		{
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}

		for(arg7 += 6; arg4 < arg7;)
		{
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}

		arg10.anInt3221 = arg3 << 8;
		return arg4 >> 1;
	}

	public int method712(int arg0[], int arg1, int arg2, int arg3, int arg4)
	{
		while(anInt3219 > 0) 
		{
			int i = arg1 + anInt3219;
			if(i > arg3)
				i = arg3;
			anInt3219 += arg1;
			if(anInt3228 == -256 && (anInt3221 & 0xff) == 0)
			{
				if(Class39.aBoolean857)
					arg1 = method697(0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, anInt3231, anInt3224, 0, i, arg2, this);
				else
					arg1 = method708(((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, anInt3227, 0, i, arg2, this);
			} else
			if(Class39.aBoolean857)
				arg1 = method706(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, anInt3231, anInt3224, 0, i, arg2, this, anInt3228, arg4);
			else
				arg1 = method727(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, anInt3227, 0, i, arg2, this, anInt3228, arg4);
			anInt3219 -= arg1;
			if(anInt3219 != 0)
				return arg1;
			if(method710())
				return arg3;
		}
		if(anInt3228 == -256 && (anInt3221 & 0xff) == 0)
			if(Class39.aBoolean857)
				return method711(0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, 0, arg3, arg2, this);
			else
				return method699(((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, 0, arg3, arg2, this);
		if(Class39.aBoolean857)
			return method707(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, 0, arg3, arg2, this, anInt3228, arg4);
		else
			return method723(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, 0, arg3, arg2, this, anInt3228, arg4);
	}

	public static int method713(byte arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			Class33_Sub13_Sub1 arg8)
	{
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 2;
		if((arg5 = (arg3 + arg7) - arg2) > arg6)
			arg5 = arg6;
		for(arg5 -= 3; arg3 < arg5;)
		{
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
		}

		for(arg5 += 3; arg3 < arg5;)
			arg1[arg3++] += arg0[arg2++] * arg4;

		arg8.anInt3221 = arg2 << 8;
		return arg3;
	}

	public boolean method714()
	{
		return anInt3219 != 0;
	}

	public synchronized void method715(int arg0)
	{
		if(anInt3228 < 0)
		{
			anInt3228 = -arg0;
			return;
		} else
		{
			anInt3228 = arg0;
			return;
		}
	}

	public static int method716(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, Class33_Sub13_Sub1 arg11, int arg12, int arg13)
	{
		arg11.anInt3222 -= arg11.anInt3231 * arg5;
		arg11.anInt3218 -= arg11.anInt3224 * arg5;
		if(arg12 == 0 || (arg8 = arg5 + (((arg10 - arg4) + arg12) - 257) / arg12) > arg9)
			arg8 = arg9;
		while(arg5 < arg8) 
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		if(arg12 == 0 || (arg8 = arg5 + (((arg10 - arg4) + arg12) - 1) / arg12) > arg9)
			arg8 = arg9;
		arg1 = arg13;
		while(arg5 < arg8) 
		{
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		arg11.anInt3222 += arg11.anInt3231 * arg5;
		arg11.anInt3218 += arg11.anInt3224 * arg5;
		arg11.anInt3223 = arg6;
		arg11.anInt3221 = arg4;
		return arg5;
	}

	public synchronized void method694(int arg0)
	{
		int k;
label0:
		{
			if(anInt3219 > 0)
				if(arg0 >= anInt3219)
				{
					if(anInt3230 == 0x80000000)
					{
						anInt3230 = 0;
						anInt3223 = anInt3222 = anInt3218 = 0;
						method266(-69);
						arg0 = anInt3219;
					}
					anInt3219 = 0;
					method724();
				} else
				{
					anInt3223 += anInt3227 * arg0;
					anInt3222 += anInt3231 * arg0;
					anInt3218 += anInt3224 * arg0;
					anInt3219 -= arg0;
				}
			Class33_Sub8_Sub1 class33_sub8_sub1 = (Class33_Sub8_Sub1)super.aClass33_Sub8_2333;
			int i = anInt3229 << 8;
			int j = anInt3220 << 8;
			k = class33_sub8_sub1.aByteArray3194.length << 8;
			int l = j - i;
			if(l <= 0)
				anInt3225 = 0;
			if(anInt3221 < 0)
				if(anInt3228 > 0)
				{
					anInt3221 = 0;
				} else
				{
					method704();
					method266(-92);
					return;
				}
			if(anInt3221 >= k)
				if(anInt3228 < 0)
				{
					anInt3221 = k - 1;
				} else
				{
					method704();
					method266(-122);
					return;
				}
			anInt3221 += anInt3228 * arg0;
			if(anInt3225 < 0)
			{
				if(aBoolean3217)
				{
					if(anInt3228 < 0)
					{
						if(anInt3221 >= i)
							return;
						anInt3221 = (i + i) - 1 - anInt3221;
						anInt3228 = -anInt3228;
					}
					do
					{
						if(anInt3221 < j)
							return;
						anInt3221 = (j + j) - 1 - anInt3221;
						anInt3228 = -anInt3228;
						if(anInt3221 >= i)
							return;
						anInt3221 = (i + i) - 1 - anInt3221;
						anInt3228 = -anInt3228;
					} while(true);
				}
				if(anInt3228 < 0)
					if(anInt3221 >= i)
					{
						return;
					} else
					{
						anInt3221 = j - 1 - (j - 1 - anInt3221) % l;
						return;
					}
				if(anInt3221 < j)
				{
					return;
				} else
				{
					anInt3221 = i + (anInt3221 - i) % l;
					return;
				}
			}
			if(anInt3225 <= 0)
				break label0;
			if(aBoolean3217)
			{
				if(anInt3228 < 0)
				{
					if(anInt3221 >= i)
						return;
					anInt3221 = (i + i) - 1 - anInt3221;
					anInt3228 = -anInt3228;
					if(--anInt3225 == 0)
						break label0;
				}
				do
				{
					if(anInt3221 < j)
						return;
					anInt3221 = (j + j) - 1 - anInt3221;
					anInt3228 = -anInt3228;
					if(--anInt3225 == 0)
						break;
					if(anInt3221 >= i)
						return;
					anInt3221 = (i + i) - 1 - anInt3221;
					anInt3228 = -anInt3228;
				} while(--anInt3225 != 0);
			} else
			if(anInt3228 < 0)
			{
				if(anInt3221 >= i)
					return;
				int i1 = (j - 1 - anInt3221) / l;
				if(i1 >= anInt3225)
				{
					anInt3221 += l * anInt3225;
					anInt3225 = 0;
				} else
				{
					anInt3221 += l * i1;
					anInt3225 -= i1;
					return;
				}
			} else
			{
				if(anInt3221 < j)
					return;
				int j1 = (anInt3221 - i) / l;
				if(j1 >= anInt3225)
				{
					anInt3221 -= l * anInt3225;
					anInt3225 = 0;
				} else
				{
					anInt3221 -= l * j1;
					anInt3225 -= j1;
					return;
				}
			}
		}
		if(anInt3228 < 0)
		{
			if(anInt3221 < 0)
			{
				anInt3221 = -1;
				method704();
				method266(-49);
				return;
			}
		} else
		if(anInt3221 >= k)
		{
			anInt3221 = k;
			method704();
			method266(-100);
		}
	}

	public synchronized int method717()
	{
		if(anInt3228 < 0)
			return -anInt3228;
		else
			return anInt3228;
	}

	public static Class33_Sub13_Sub1 method718(Class33_Sub8_Sub1 arg0, int arg1, int arg2, int arg3)
	{
		if(arg0.aByteArray3194 == null || arg0.aByteArray3194.length == 0)
			return null;
		else
			return new Class33_Sub13_Sub1(arg0, arg1, arg2, arg3);
	}

	public static int method719(byte arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, Class33_Sub13_Sub1 arg9)
	{
		arg2 >>= 8;
		arg8 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		if((arg6 = (arg3 + arg8) - arg2) > arg7)
			arg6 = arg7;
		arg9.anInt3222 += arg9.anInt3231 * (arg6 - arg3);
		arg9.anInt3218 += arg9.anInt3224 * (arg6 - arg3);
		for(arg6 -= 3; arg3 < arg6;)
		{
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
		}

		for(arg6 += 3; arg3 < arg6;)
		{
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
		}

		arg9.anInt3223 = arg4 >> 2;
		arg9.anInt3221 = arg2 << 8;
		return arg3;
	}

	public static int method720(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, int arg12, Class33_Sub13_Sub1 arg13, int arg14, 
			int arg15)
	{
		arg13.anInt3223 -= arg13.anInt3227 * arg5;
		if(arg14 == 0 || (arg10 = arg5 + (((arg12 - arg4) + arg14) - 257) / arg14) > arg11)
			arg10 = arg11;
		arg5 <<= 1;
		for(arg10 <<= 1; arg5 < arg10;)
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}

		if(arg14 == 0 || (arg10 = (arg5 >> 1) + (((arg12 - arg4) + arg14) - 1) / arg14) > arg11)
			arg10 = arg11;
		arg10 <<= 1;
		arg1 = arg15;
		while(arg5 < arg10) 
		{
			arg0 = arg2[arg4 >> 8];
			arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		arg5 >>= 1;
		arg13.anInt3223 += arg13.anInt3227 * arg5;
		arg13.anInt3222 = arg6;
		arg13.anInt3218 = arg7;
		arg13.anInt3221 = arg4;
		return arg5;
	}

	public static int method721(int arg0, byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, Class33_Sub13_Sub1 arg10)
	{
		arg3 >>= 8;
		arg9 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		if((arg7 = (arg4 + arg9) - arg3) > arg8)
			arg7 = arg8;
		arg4 <<= 1;
		arg7 <<= 1;
		for(arg7 -= 6; arg4 < arg7;)
		{
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}

		for(arg7 += 6; arg4 < arg7;)
		{
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}

		arg10.anInt3221 = arg3 << 8;
		return arg4 >> 1;
	}

	public Class33_Sub13 method691()
	{
		return null;
	}

	public synchronized void method722(int arg0, int arg1)
	{
		anInt3230 = arg0;
		anInt3226 = arg1;
		anInt3219 = 0;
		method724();
	}

	public static int method723(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, Class33_Sub13_Sub1 arg10, int arg11, int arg12)
	{
		if(arg11 == 0 || (arg7 = arg5 + (((arg9 + 256) - arg4) + arg11) / arg11) > arg8)
			arg7 = arg8;
		while(arg5 < arg7) 
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg4 += arg11;
		}
		if(arg11 == 0 || (arg7 = arg5 + ((arg9 - arg4) + arg11) / arg11) > arg8)
			arg7 = arg8;
		arg0 = arg12;
		arg1 = arg11;
		while(arg5 < arg7) 
		{
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg4 += arg1;
		}
		arg10.anInt3221 = arg4;
		return arg5;
	}

	public void method724()
	{
		anInt3223 = anInt3230;
		anInt3222 = method733(anInt3230, anInt3226);
		anInt3218 = method731(anInt3230, anInt3226);
	}

	public static int method725(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, Class33_Sub13_Sub1 arg11, int arg12, int arg13)
	{
		if(arg12 == 0 || (arg8 = arg5 + (((arg10 - arg4) + arg12) - 257) / arg12) > arg9)
			arg8 = arg9;
		arg5 <<= 1;
		for(arg8 <<= 1; arg5 < arg8;)
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}

		if(arg12 == 0 || (arg8 = (arg5 >> 1) + (((arg10 - arg4) + arg12) - 1) / arg12) > arg9)
			arg8 = arg9;
		arg8 <<= 1;
		arg1 = arg13;
		while(arg5 < arg8) 
		{
			arg0 = arg2[arg4 >> 8];
			arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt3221 = arg4;
		return arg5 >> 1;
	}

	public synchronized int method726()
	{
		if(anInt3230 == 0x80000000)
			return 0;
		else
			return anInt3230;
	}

	public static int method727(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, Class33_Sub13_Sub1 arg11, int arg12, int arg13)
	{
		arg11.anInt3222 -= arg11.anInt3231 * arg5;
		arg11.anInt3218 -= arg11.anInt3224 * arg5;
		if(arg12 == 0 || (arg8 = arg5 + (((arg10 + 256) - arg4) + arg12) / arg12) > arg9)
			arg8 = arg9;
		while(arg5 < arg8) 
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		if(arg12 == 0 || (arg8 = arg5 + ((arg10 - arg4) + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg0 = arg13;
		arg1 = arg12;
		while(arg5 < arg8) 
		{
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg1;
		}
		arg11.anInt3222 += arg11.anInt3231 * arg5;
		arg11.anInt3218 += arg11.anInt3224 * arg5;
		arg11.anInt3223 = arg6;
		arg11.anInt3221 = arg4;
		return arg5;
	}

	public synchronized void method728(int arg0, int arg1)
	{
		method734(arg0, arg1, method700());
	}

	public synchronized void method729(int arg0)
	{
		method722(arg0, method700());
	}

	public static int method730(int arg0, int arg1, byte arg2[], int arg3[], int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, Class33_Sub13_Sub1 arg10, int arg11, int arg12)
	{
		if(arg11 == 0 || (arg7 = arg5 + (((arg9 - arg4) + arg11) - 257) / arg11) > arg8)
			arg7 = arg8;
		while(arg5 < arg7) 
		{
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg4 += arg11;
		}
		if(arg11 == 0 || (arg7 = arg5 + (((arg9 - arg4) + arg11) - 1) / arg11) > arg8)
			arg7 = arg8;
		arg1 = arg12;
		while(arg5 < arg7) 
		{
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
			arg4 += arg11;
		}
		arg10.anInt3221 = arg4;
		return arg5;
	}

	public int method690()
	{
		int i = anInt3223 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if(anInt3225 == 0)
			i -= (i * anInt3221) / (((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194.length << 8);
		else
		if(anInt3225 >= 0)
			i -= (i * anInt3229) / ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194.length;
		if(i > 255)
			return 255;
		else
			return i;
	}

	public synchronized void method689(int arg0[], int arg1, int arg2)
	{
		int k;
		int i1;
label0:
		{
			if(anInt3230 == 0 && anInt3219 == 0)
			{
				method694(arg2);
				return;
			}
			Class33_Sub8_Sub1 class33_sub8_sub1 = (Class33_Sub8_Sub1)super.aClass33_Sub8_2333;
			int i = anInt3229 << 8;
			int j = anInt3220 << 8;
			k = class33_sub8_sub1.aByteArray3194.length << 8;
			int l = j - i;
			if(l <= 0)
				anInt3225 = 0;
			i1 = arg1;
			arg2 += arg1;
			if(anInt3221 < 0)
				if(anInt3228 > 0)
				{
					anInt3221 = 0;
				} else
				{
					method704();
					method266(-70);
					return;
				}
			if(anInt3221 >= k)
				if(anInt3228 < 0)
				{
					anInt3221 = k - 1;
				} else
				{
					method704();
					method266(-68);
					return;
				}
			if(anInt3225 < 0)
			{
				if(aBoolean3217)
				{
					if(anInt3228 < 0)
					{
						i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
						if(anInt3221 >= i)
							return;
						anInt3221 = (i + i) - 1 - anInt3221;
						anInt3228 = -anInt3228;
					}
					do
					{
						i1 = method735(arg0, i1, j, arg2, class33_sub8_sub1.aByteArray3194[anInt3220 - 1]);
						if(anInt3221 < j)
							return;
						anInt3221 = (j + j) - 1 - anInt3221;
						anInt3228 = -anInt3228;
						i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
						if(anInt3221 >= i)
							return;
						anInt3221 = (i + i) - 1 - anInt3221;
						anInt3228 = -anInt3228;
					} while(true);
				}
				if(anInt3228 < 0)
					do
					{
						i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3220 - 1]);
						if(anInt3221 >= i)
							return;
						anInt3221 = j - 1 - (j - 1 - anInt3221) % l;
					} while(true);
				do
				{
					i1 = method735(arg0, i1, j, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
					if(anInt3221 < j)
						return;
					anInt3221 = i + (anInt3221 - i) % l;
				} while(true);
			}
			if(anInt3225 <= 0)
				break label0;
			if(aBoolean3217)
			{
				if(anInt3228 < 0)
				{
					i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
					if(anInt3221 >= i)
						return;
					anInt3221 = (i + i) - 1 - anInt3221;
					anInt3228 = -anInt3228;
					if(--anInt3225 == 0)
						break label0;
				}
				do
				{
					i1 = method735(arg0, i1, j, arg2, class33_sub8_sub1.aByteArray3194[anInt3220 - 1]);
					if(anInt3221 < j)
						return;
					anInt3221 = (j + j) - 1 - anInt3221;
					anInt3228 = -anInt3228;
					if(--anInt3225 == 0)
						break;
					i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
					if(anInt3221 >= i)
						return;
					anInt3221 = (i + i) - 1 - anInt3221;
					anInt3228 = -anInt3228;
				} while(--anInt3225 != 0);
			} else
			if(anInt3228 < 0)
				do
				{
					i1 = method712(arg0, i1, i, arg2, class33_sub8_sub1.aByteArray3194[anInt3220 - 1]);
					if(anInt3221 >= i)
						return;
					int j1 = (j - 1 - anInt3221) / l;
					if(j1 >= anInt3225)
					{
						anInt3221 += l * anInt3225;
						anInt3225 = 0;
						break;
					}
					anInt3221 += l * j1;
					anInt3225 -= j1;
				} while(true);
			else
				do
				{
					i1 = method735(arg0, i1, j, arg2, class33_sub8_sub1.aByteArray3194[anInt3229]);
					if(anInt3221 < j)
						return;
					int k1 = (anInt3221 - i) / l;
					if(k1 >= anInt3225)
					{
						anInt3221 -= l * anInt3225;
						anInt3225 = 0;
						break;
					}
					anInt3221 -= l * k1;
					anInt3225 -= k1;
				} while(true);
		}
		if(anInt3228 < 0)
		{
			method712(arg0, i1, 0, arg2, 0);
			if(anInt3221 < 0)
			{
				anInt3221 = -1;
				method704();
				method266(-58);
				return;
			}
		} else
		{
			method735(arg0, i1, k, arg2, 0);
			if(anInt3221 >= k)
			{
				anInt3221 = k;
				method704();
				method266(-94);
			}
		}
	}

	public static int method731(int arg0, int arg1)
	{
		if(arg1 < 0)
			return -arg0;
		else
			return (int)((double)arg0 * Math.sqrt((double)arg1 * 0.0001220703125D) + 0.5D);
	}

	public synchronized void method732(int arg0)
	{
		int i = ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194.length << 8;
		if(arg0 < -1)
			arg0 = -1;
		if(arg0 > i)
			arg0 = i;
		anInt3221 = arg0;
	}

	public static int method733(int arg0, int arg1)
	{
		if(arg1 < 0)
			return arg0;
		else
			return (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 0.0001220703125D) + 0.5D);
	}

	public synchronized void method734(int arg0, int arg1, int arg2)
	{
		if(arg0 == 0)
		{
			method722(arg1, arg2);
			return;
		}
		int i = method733(arg1, arg2);
		int j = method731(arg1, arg2);
		if(anInt3222 == i && anInt3218 == j)
		{
			anInt3219 = 0;
			return;
		}
		int k = arg1 - anInt3223;
		if(anInt3223 - arg1 > k)
			k = anInt3223 - arg1;
		if(i - anInt3222 > k)
			k = i - anInt3222;
		if(anInt3222 - i > k)
			k = anInt3222 - i;
		if(j - anInt3218 > k)
			k = j - anInt3218;
		if(anInt3218 - j > k)
			k = anInt3218 - j;
		if(arg0 > k)
			arg0 = k;
		anInt3219 = arg0;
		anInt3230 = arg1;
		anInt3226 = arg2;
		anInt3227 = (arg1 - anInt3223) / arg0;
		anInt3231 = (i - anInt3222) / arg0;
		anInt3224 = (j - anInt3218) / arg0;
	}

	public Class33_Sub13 method692()
	{
		return null;
	}

	public int method735(int arg0[], int arg1, int arg2, int arg3, int arg4)
	{
		while(anInt3219 > 0) 
		{
			int i = arg1 + anInt3219;
			if(i > arg3)
				i = arg3;
			anInt3219 += arg1;
			if(anInt3228 == 256 && (anInt3221 & 0xff) == 0)
			{
				if(Class39.aBoolean857)
					arg1 = method702(0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, anInt3231, anInt3224, 0, i, arg2, this);
				else
					arg1 = method719(((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, anInt3227, 0, i, arg2, this);
			} else
			if(Class39.aBoolean857)
				arg1 = method720(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, anInt3231, anInt3224, 0, i, arg2, this, anInt3228, arg4);
			else
				arg1 = method716(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, anInt3227, 0, i, arg2, this, anInt3228, arg4);
			anInt3219 -= arg1;
			if(anInt3219 != 0)
				return arg1;
			if(method710())
				return arg3;
		}
		if(anInt3228 == 256 && (anInt3221 & 0xff) == 0)
			if(Class39.aBoolean857)
				return method721(0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, 0, arg3, arg2, this);
			else
				return method713(((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, 0, arg3, arg2, this);
		if(Class39.aBoolean857)
			return method725(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3222, anInt3218, 0, arg3, arg2, this, anInt3228, arg4);
		else
			return method730(0, 0, ((Class33_Sub8_Sub1)super.aClass33_Sub8_2333).aByteArray3194, arg0, anInt3221, arg1, anInt3223, 0, arg3, arg2, this, anInt3228, arg4);
	}

	public Class33_Sub13_Sub1(Class33_Sub8_Sub1 arg0, int arg1, int arg2)
	{
		super.aClass33_Sub8_2333 = arg0;
		anInt3229 = arg0.anInt3196;
		anInt3220 = arg0.anInt3193;
		aBoolean3217 = arg0.aBoolean3192;
		anInt3228 = arg1;
		anInt3230 = arg2;
		anInt3226 = 8192;
		anInt3221 = 0;
		method724();
	}

	public Class33_Sub13_Sub1(Class33_Sub8_Sub1 arg0, int arg1, int arg2, int arg3)
	{
		super.aClass33_Sub8_2333 = arg0;
		anInt3229 = arg0.anInt3196;
		anInt3220 = arg0.anInt3193;
		aBoolean3217 = arg0.aBoolean3192;
		anInt3228 = arg1;
		anInt3230 = arg2;
		anInt3226 = arg3;
		anInt3221 = 0;
		method724();
	}

	public boolean aBoolean3217;
	public int anInt3218;
	public int anInt3219;
	public int anInt3220;
	public int anInt3221;
	public int anInt3222;
	public int anInt3223;
	public int anInt3224;
	public int anInt3225;
	public int anInt3226;
	public int anInt3227;
	public int anInt3228;
	public int anInt3229;
	public int anInt3230;
	public int anInt3231;
}
