// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub7_Sub2.java

import java.util.Random;

public class Class33_Sub6_Sub7_Sub2 extends Class33_Sub6_Sub7
{

	public void method447(int arg0, int arg1)
	{
		anInt3691 = -1;
		anInt3703 = -1;
		anInt3690 = anInt3708 = arg1;
		anInt3687 = anInt3709 = arg0;
		anInt3717 = 256;
		anInt3701 = 0;
		anInt3699 = 0;
	}

	public void method448(Class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg0 == null)
			return;
		method447(arg3, arg4);
		int ai[] = new int[arg0.anInt1893];
		int ai1[] = new int[arg0.anInt1893];
		for(int i = 0; i < arg0.anInt1893; i++)
		{
			ai[i] = (int)(Math.sin((double)i / 5D + (double)arg5 / 5D) * 5D);
			ai1[i] = (int)(Math.sin((double)i / 3D + (double)arg5 / 5D) * 5D);
		}

		method463(arg0, arg1 - method465(arg0) / 2, arg2, ai, ai1);
	}

	public void method449(Class58 arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg0 == null)
		{
			return;
		} else
		{
			method447(arg3, arg4);
			method469(arg0, arg1 - method465(arg0), arg2);
			return;
		}
	}

	public int method450(Class58 arg0, int arg1)
	{
		return method456(arg0, new int[] {
			arg1
		}, aClass58Array3721);
	}

	public static Class58 method451(Class58 arg0)
	{
		int i = arg0.method1035(27);
		int j = 0;
		for(int k = 0; k < i; k++)
		{
			byte byte0 = arg0.aByteArray1894[k];
			if(byte0 == 60 || byte0 == 62)
				j += 3;
		}

		Class58 class58 = new Class58();
		class58.anInt1893 = i + j;
		class58.aByteArray1894 = new byte[class58.anInt1893];
		int l = 0;
		for(int i1 = 0; i1 < i; i1++)
		{
			byte byte1 = arg0.aByteArray1894[i1];
			if(byte1 == 60)
			{
				class58.aByteArray1894[l++] = 60;
				class58.aByteArray1894[l++] = 108;
				class58.aByteArray1894[l++] = 116;
				class58.aByteArray1894[l++] = 62;
			} else
			if(byte1 == 62)
			{
				class58.aByteArray1894[l++] = 60;
				class58.aByteArray1894[l++] = 103;
				class58.aByteArray1894[l++] = 116;
				class58.aByteArray1894[l++] = 62;
			} else
			{
				class58.aByteArray1894[l++] = byte1;
			}
		}

		return class58;
	}

	public void method452(Class58 arg0, int arg1)
	{
		int i = 0;
		boolean flag = false;
		for(int j = 0; j < arg0.method1035(27); j++)
		{
			int k = arg0.method1031(false, j);
			if(k == 60)
				flag = true;
			else
			if(k == 62)
				flag = false;
			else
			if(!flag && k == 32)
				i++;
		}

		if(i > 0)
			anInt3701 = (arg1 - method465(arg0) << 8) / i;
	}

	public void method453(Class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8, int arg9)
	{
		if(arg0 == null)
			return;
		method447(arg5, arg6);
		if(arg9 == 0)
			arg9 = anInt3719;
		int ai[] = {
			arg3
		};
		if(arg4 < anInt3715 + anInt3685 + arg9 && arg4 < arg9 + arg9)
			ai = null;
		int i = method456(arg0, ai, aClass58Array3721);
		if(arg8 == 3 && i == 1)
			arg8 = 1;
		int j;
		if(arg8 == 0)
			j = arg2 + anInt3715;
		else
		if(arg8 == 1)
			j = arg2 + anInt3715 + (arg4 - anInt3715 - anInt3685 - (i - 1) * arg9) / 2;
		else
		if(arg8 == 2)
		{
			j = (arg2 + arg4) - anInt3685 - (i - 1) * arg9;
		} else
		{
			int k = (arg4 - anInt3715 - anInt3685 - (i - 1) * arg9) / (i + 1);
			if(k < 0)
				k = 0;
			j = arg2 + anInt3715 + k;
			arg9 += k;
		}
		for(int l = 0; l < i; l++)
		{
			if(arg7 == 0)
				method469(aClass58Array3721[l], arg1, j);
			else
			if(arg7 == 1)
				method469(aClass58Array3721[l], arg1 + (arg3 - method465(aClass58Array3721[l])) / 2, j);
			else
			if(arg7 == 2)
				method469(aClass58Array3721[l], (arg1 + arg3) - method465(aClass58Array3721[l]), j);
			else
			if(l == i - 1)
			{
				method469(aClass58Array3721[l], arg1, j);
			} else
			{
				method452(aClass58Array3721[l], arg3);
				method469(aClass58Array3721[l], arg1, j);
				anInt3701 = 0;
			}
			j += arg9;
		}

	}

	public static void method454(byte arg0[], int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		int i = arg1 + arg2 * Class33_Sub6_Sub7.anInt2797;
		int j = Class33_Sub6_Sub7.anInt2797 - arg3;
		int k = 0;
		int l = 0;
		if(arg2 < Class33_Sub6_Sub7.anInt2794)
		{
			int i1 = Class33_Sub6_Sub7.anInt2794 - arg2;
			arg4 -= i1;
			arg2 = Class33_Sub6_Sub7.anInt2794;
			l += i1 * arg3;
			i += i1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg2 + arg4 > Class33_Sub6_Sub7.anInt2793)
			arg4 -= (arg2 + arg4) - Class33_Sub6_Sub7.anInt2793;
		if(arg1 < Class33_Sub6_Sub7.anInt2798)
		{
			int j1 = Class33_Sub6_Sub7.anInt2798 - arg1;
			arg3 -= j1;
			arg1 = Class33_Sub6_Sub7.anInt2798;
			l += j1;
			i += j1;
			k += j1;
			j += j1;
		}
		if(arg1 + arg3 > Class33_Sub6_Sub7.anInt2799)
		{
			int k1 = (arg1 + arg3) - Class33_Sub6_Sub7.anInt2799;
			arg3 -= k1;
			k += k1;
			j += k1;
		}
		if(arg3 <= 0 || arg4 <= 0)
		{
			return;
		} else
		{
			method470(Class33_Sub6_Sub7.anIntArray2796, arg0, arg5, l, i, arg3, arg4, j, k, arg6);
			return;
		}
	}

	public void method455(Class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg0 == null)
			return;
		method447(arg3, arg4);
		aRandom3700.setSeed(arg5);
		anInt3717 = 192 + (aRandom3700.nextInt() & 0x1f);
		int ai[] = new int[arg0.anInt1893];
		int i = 0;
		for(int j = 0; j < arg0.anInt1893; j++)
		{
			ai[j] = i;
			if((aRandom3700.nextInt() & 3) == 0)
				i++;
		}

		method463(arg0, arg1, arg2, ai, null);
	}

	public int method456(Class58 arg0, int arg1[], Class58 arg2[])
	{
		if(arg0 == null)
			return 0;
		int i = 0;
		int j = 0;
		Class58 class58 = Class33_Sub16.method801(100, (byte)123);
		int k = -1;
		int l = 0;
		int i1 = 0;
		int j1 = -1;
		int k1 = 0;
		int l1 = arg0.method1035(27);
		for(int i2 = 0; i2 < l1; i2++)
		{
			int j2 = arg0.method1031(false, i2);
			if(j2 == 60)
			{
				j1 = i2;
			} else
			{
				if(j2 == 62 && j1 != -1)
				{
					Class58 class58_1 = arg0.method1063(j1 + 1, (byte)123, i2);
					j1 = -1;
					class58.method1027((byte)-32, 60);
					class58.method1029(class58_1, -12860);
					class58.method1027((byte)-32, 62);
					if(class58_1.method1038(aClass58_3720, -116))
					{
						arg2[k1++] = class58.method1063(j, (byte)121, class58.method1035(27));
						j = class58.method1035(27);
						i = 0;
						k = -1;
					} else
					if(class58_1.method1038(aClass58_3716, -83))
						i += method467(60);
					else
					if(class58_1.method1038(aClass58_3704, 109))
						i += method467(62);
					else
					if(class58_1.method1052(aClass58_3694, -94))
						try
						{
							int k2 = class58_1.method1028(4, (byte)120).method1032(127);
							i += aClass33_Sub6_Sub7_Sub4Array3711[k2].anInt3734;
						}
						catch(Exception _ex) { }
					j2 = -1;
				}
				if(j1 == -1)
				{
					if(j2 != -1)
					{
						class58.method1027((byte)-32, j2);
						i += method467(j2);
					}
					if(j2 == 32)
					{
						k = class58.method1035(27);
						l = i;
						i1 = 1;
					}
					if(arg1 != null && i > arg1[k1 >= arg1.length ? arg1.length - 1 : k1] && k >= 0)
					{
						arg2[k1++] = class58.method1063(j, (byte)124, k - i1);
						j = k;
						k = -1;
						i -= l;
					}
					if(j2 == 45)
					{
						k = class58.method1035(27);
						l = i;
						i1 = 0;
					}
				}
			}
		}

		if(class58.method1035(27) > j)
			arg2[k1++] = class58.method1063(j, (byte)123, class58.method1035(27));
		return k1;
	}

	public static void method457(int arg0[], byte arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8)
	{
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 3);
		for(int j = -arg6; j < 0; j++)
		{
			for(int k = i; k < 0; k++)
			{
				if(arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if(arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if(arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if(arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			for(int l = arg5; l < 0; l++)
				if(arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method458(Class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg0 == null)
			return;
		method447(arg3, arg4);
		int ai[] = new int[arg0.anInt1893];
		for(int i = 0; i < arg0.anInt1893; i++)
			ai[i] = (int)(Math.sin((double)i / 2D + (double)arg5 / 5D) * 5D);

		method463(arg0, arg1 - method465(arg0) / 2, arg2, null, ai);
	}

	public void method459(Class58 arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg0 == null)
		{
			return;
		} else
		{
			method447(arg3, arg4);
			method469(arg0, arg1 - method465(arg0) / 2, arg2);
			return;
		}
	}

	public static void method460()
	{
		aClass58_3716 = null;
		aClass58_3704 = null;
		aClass58_3694 = null;
		aClass58_3720 = null;
		aClass58_3705 = null;
		aClass58_3714 = null;
		aClass58_3686 = null;
		aClass58_3696 = null;
		aClass58_3697 = null;
		aClass58_3712 = null;
		aClass58_3713 = null;
		aClass58_3693 = null;
		aClass58_3684 = null;
		aClass58_3689 = null;
		aClass58_3698 = null;
		aClass58_3692 = null;
		aClass58_3695 = null;
		aClass58_3718 = null;
		aClass58_3688 = null;
		aClass33_Sub6_Sub7_Sub4Array3711 = null;
		aRandom3700 = null;
		aClass58Array3721 = null;
	}

	public void method461(Class58 arg0)
	{
		try
		{
			if(arg0.method1052(aClass58_3705, -112))
			{
				anInt3687 = arg0.method1028(4, (byte)120).method1044(16, (byte)-99);
				return;
			}
			if(arg0.method1038(aClass58_3714, 126))
			{
				anInt3687 = anInt3709;
				return;
			}
			if(arg0.method1052(aClass58_3695, -121))
			{
				anInt3691 = arg0.method1028(4, (byte)120).method1044(16, (byte)-99);
				return;
			}
			if(arg0.method1038(aClass58_3718, -71))
			{
				anInt3691 = 0x800000;
				return;
			}
			if(arg0.method1038(aClass58_3688, 42))
			{
				anInt3691 = -1;
				return;
			}
			if(!arg0.method1038(aClass58_3686, -81) && !arg0.method1038(aClass58_3696, -79) && !arg0.method1038(aClass58_3697, -101) && !arg0.method1038(aClass58_3712, 100))
			{
				if(arg0.method1052(aClass58_3713, -116))
				{
					anInt3703 = arg0.method1028(2, (byte)120).method1044(16, (byte)-99);
					return;
				}
				if(arg0.method1038(aClass58_3693, -80))
				{
					anInt3703 = 0;
					return;
				}
				if(arg0.method1038(aClass58_3684, 92))
				{
					anInt3703 = -1;
					return;
				}
				if(arg0.method1052(aClass58_3689, -114))
				{
					anInt3690 = arg0.method1028(5, (byte)120).method1044(16, (byte)-99);
					return;
				}
				if(arg0.method1038(aClass58_3698, -89))
				{
					anInt3690 = 0;
					return;
				}
				if(arg0.method1038(aClass58_3692, -111))
				{
					anInt3690 = anInt3708;
					return;
				}
				if(arg0.method1038(aClass58_3720, -101))
				{
					method447(anInt3709, anInt3708);
					return;
				}
			}
		}
		catch(Exception _ex) { }
	}

	public int method462(Class58 arg0, int arg1)
	{
		int i = method456(arg0, new int[] {
			arg1
		}, aClass58Array3721);
		int j = 0;
		for(int k = 0; k < i; k++)
		{
			int l = method465(aClass58Array3721[k]);
			if(l > j)
				j = l;
		}

		return j;
	}

	public void method463(Class58 arg0, int arg1, int arg2, int arg3[], int arg4[])
	{
		arg2 -= anInt3719;
		int i = -1;
		int j = 0;
		for(int k = 0; k < arg0.anInt1893; k++)
		{
			int l = arg0.aByteArray1894[k] & 0xff;
			if(l == 60)
			{
				i = k;
				continue;
			}
			if(l == 62 && i != -1)
			{
				Class58 class58 = arg0.method1063(i + 1, (byte)126, k);
				i = -1;
				if(class58.method1038(aClass58_3716, 87))
					l = 60;
				else
				if(class58.method1038(aClass58_3704, -64))
				{
					l = 62;
				} else
				{
					if(class58.method1052(aClass58_3694, -91))
						try
						{
							int j1;
							if(arg3 != null)
								j1 = arg3[j];
							else
								j1 = 0;
							int l1;
							if(arg4 != null)
								l1 = arg4[j];
							else
								l1 = 0;
							j++;
							int j2 = class58.method1028(4, (byte)120).method1032(120);
							Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = aClass33_Sub6_Sub7_Sub4Array3711[j2];
							class33_sub6_sub7_sub4.method502(arg1 + j1, ((arg2 + anInt3719) - class33_sub6_sub7_sub4.anInt3731) + l1);
							arg1 += class33_sub6_sub7_sub4.anInt3734;
						}
						catch(Exception _ex) { }
					else
						method461(class58);
					continue;
				}
			}
			if(i == -1)
			{
				int i1 = anIntArray3710[l];
				int k1 = anIntArray3707[l];
				int i2;
				if(arg3 != null)
					i2 = arg3[j];
				else
					i2 = 0;
				int k2;
				if(arg4 != null)
					k2 = arg4[j];
				else
					k2 = 0;
				j++;
				if(l != 32)
				{
					if(anInt3717 == 256)
					{
						if(anInt3690 != -1)
							method468(aByteArrayArray3702[l], arg1 + 1 + i2, arg2 + anIntArray3706[l] + 1 + k2, i1, k1, anInt3690);
						method468(aByteArrayArray3702[l], arg1 + i2, arg2 + anIntArray3706[l] + k2, i1, k1, anInt3687);
					} else
					{
						if(anInt3690 != -1)
							method454(aByteArrayArray3702[l], arg1 + 1 + i2, arg2 + anIntArray3706[l] + 1 + k2, i1, k1, anInt3690, anInt3717);
						method454(aByteArrayArray3702[l], arg1 + i2, arg2 + anIntArray3706[l] + k2, i1, k1, anInt3687, anInt3717);
					}
				} else
				if(anInt3701 > 0)
				{
					anInt3699 += anInt3701;
					arg1 += anInt3699 >> 8;
					anInt3699 &= 0xff;
				}
				if(anInt3691 != -1)
					Class33_Sub6_Sub7.method416(arg1, arg2 + (int)((double)anInt3719 * 0.69999999999999996D), i1, anInt3691);
				if(anInt3703 != -1)
					Class33_Sub6_Sub7.method416(arg1, arg2 + anInt3719, i1, anInt3703);
				arg1 += i1;
			}
		}

	}

	public void method464(Class58 arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg0 == null)
		{
			return;
		} else
		{
			method447(arg3, arg4);
			method469(arg0, arg1, arg2);
			return;
		}
	}

	public int method465(Class58 arg0)
	{
		if(arg0 == null)
			return 0;
		int i = -1;
		int j = 0;
		for(int k = 0; k < arg0.anInt1893; k++)
		{
			int l = arg0.aByteArray1894[k] & 0xff;
			if(l == 60)
				i = k;
			else
			if(l == 62 && i != -1)
			{
				Class58 class58 = arg0.method1063(i + 1, (byte)120, k);
				i = -1;
				if(class58.method1038(aClass58_3716, 73))
					j += anIntArray3710[60];
				else
				if(class58.method1038(aClass58_3704, -114))
					j += anIntArray3710[62];
				else
				if(class58.method1052(aClass58_3694, -105))
					try
					{
						int i1 = class58.method1028(4, (byte)120).method1032(110);
						j += aClass33_Sub6_Sub7_Sub4Array3711[i1].anInt3734;
					}
					catch(Exception _ex) { }
			} else
			if(i == -1)
				j += anIntArray3710[l];
		}

		return j;
	}

	public void method466(Class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		if(arg0 == null)
			return;
		method447(arg3, arg4);
		double d = 7D - (double)arg6 / 8D;
		if(d < 0.0D)
			d = 0.0D;
		int ai[] = new int[arg0.anInt1893];
		for(int i = 0; i < arg0.anInt1893; i++)
			ai[i] = (int)(Math.sin((double)i / 1.5D + (double)arg5) * d);

		method463(arg0, arg1 - method465(arg0) / 2, arg2, null, ai);
	}

	public int method467(int arg0)
	{
		return anIntArray3710[arg0 & 0xff];
	}

	public static void method468(byte arg0[], int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		int i = arg1 + arg2 * Class33_Sub6_Sub7.anInt2797;
		int j = Class33_Sub6_Sub7.anInt2797 - arg3;
		int k = 0;
		int l = 0;
		if(arg2 < Class33_Sub6_Sub7.anInt2794)
		{
			int i1 = Class33_Sub6_Sub7.anInt2794 - arg2;
			arg4 -= i1;
			arg2 = Class33_Sub6_Sub7.anInt2794;
			l += i1 * arg3;
			i += i1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg2 + arg4 > Class33_Sub6_Sub7.anInt2793)
			arg4 -= (arg2 + arg4) - Class33_Sub6_Sub7.anInt2793;
		if(arg1 < Class33_Sub6_Sub7.anInt2798)
		{
			int j1 = Class33_Sub6_Sub7.anInt2798 - arg1;
			arg3 -= j1;
			arg1 = Class33_Sub6_Sub7.anInt2798;
			l += j1;
			i += j1;
			k += j1;
			j += j1;
		}
		if(arg1 + arg3 > Class33_Sub6_Sub7.anInt2799)
		{
			int k1 = (arg1 + arg3) - Class33_Sub6_Sub7.anInt2799;
			arg3 -= k1;
			k += k1;
			j += k1;
		}
		if(arg3 <= 0 || arg4 <= 0)
		{
			return;
		} else
		{
			method457(Class33_Sub6_Sub7.anIntArray2796, arg0, arg5, l, i, arg3, arg4, j, k);
			return;
		}
	}

	public void method469(Class58 arg0, int arg1, int arg2)
	{
		arg2 -= anInt3719;
		int i = -1;
		for(int j = 0; j < arg0.anInt1893; j++)
		{
			int k = arg0.aByteArray1894[j] & 0xff;
			if(k == 60)
			{
				i = j;
				continue;
			}
			if(k == 62 && i != -1)
			{
				Class58 class58 = arg0.method1063(i + 1, (byte)122, j);
				i = -1;
				if(class58.method1038(aClass58_3716, 107))
					k = 60;
				else
				if(class58.method1038(aClass58_3704, -86))
				{
					k = 62;
				} else
				{
					if(class58.method1052(aClass58_3694, -119))
						try
						{
							int i1 = class58.method1028(4, (byte)120).method1032(112);
							Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = aClass33_Sub6_Sub7_Sub4Array3711[i1];
							class33_sub6_sub7_sub4.method502(arg1, (arg2 + anInt3719) - class33_sub6_sub7_sub4.anInt3731);
							arg1 += class33_sub6_sub7_sub4.anInt3734;
						}
						catch(Exception _ex) { }
					else
						method461(class58);
					continue;
				}
			}
			if(i == -1)
			{
				int l = anIntArray3710[k];
				int j1 = anIntArray3707[k];
				if(k != 32)
				{
					if(anInt3717 == 256)
					{
						if(anInt3690 != -1)
							method468(aByteArrayArray3702[k], arg1 + 1, arg2 + anIntArray3706[k] + 1, l, j1, anInt3690);
						method468(aByteArrayArray3702[k], arg1, arg2 + anIntArray3706[k], l, j1, anInt3687);
					} else
					{
						if(anInt3690 != -1)
							method454(aByteArrayArray3702[k], arg1 + 1, arg2 + anIntArray3706[k] + 1, l, j1, anInt3690, anInt3717);
						method454(aByteArrayArray3702[k], arg1, arg2 + anIntArray3706[k], l, j1, anInt3687, anInt3717);
					}
				} else
				if(anInt3701 > 0)
				{
					anInt3699 += anInt3701;
					arg1 += anInt3699 >> 8;
					anInt3699 &= 0xff;
				}
				if(anInt3691 != -1)
					Class33_Sub6_Sub7.method416(arg1, arg2 + (int)((double)anInt3719 * 0.69999999999999996D), l, anInt3691);
				if(anInt3703 != -1)
					Class33_Sub6_Sub7.method416(arg1, arg2 + anInt3719 + 1, l, anInt3703);
				arg1 += l;
			}
		}

	}

	public static void method470(int arg0[], byte arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9)
	{
		arg2 = ((arg2 & 0xff00ff) * arg9 & 0xff00ff00) + ((arg2 & 0xff00) * arg9 & 0xff0000) >> 8;
		arg9 = 256 - arg9;
		for(int i = -arg6; i < 0; i++)
		{
			for(int j = -arg5; j < 0; j++)
				if(arg1[arg3++] != 0)
				{
					int k = arg0[arg4];
					arg0[arg4++] = (((k & 0xff00ff) * arg9 & 0xff00ff00) + ((k & 0xff00) * arg9 & 0xff0000) >> 8) + arg2;
				} else
				{
					arg4++;
				}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public Class33_Sub6_Sub7_Sub2(int arg0[], int arg1[], int arg2[], int arg3[], byte arg4[][])
	{
		aByteArrayArray3702 = new byte[256][];
		anInt3719 = 0;
		anIntArray3706 = arg0;
		anIntArray3710 = arg1;
		anIntArray3707 = arg2;
		byte byte0 = 0;
		for(int i = 1; i < arg3.length; i++)
			if(arg3[i] == 1)
				byte0 = (byte)i;

		aByteArrayArray3702 = arg4;
		int j = 0x7fffffff;
		int k = 0x80000000;
		for(int l = 0; l < 256; l++)
		{
			if(anIntArray3706[l] < j && anIntArray3707[l] != 0)
				j = anIntArray3706[l];
			if(anIntArray3706[l] + anIntArray3707[l] > k)
				k = anIntArray3706[l] + anIntArray3707[l];
			byte abyte0[] = aByteArrayArray3702[l];
			int i1 = abyte0.length;
			for(int j1 = 0; j1 < i1; j1++)
				abyte0[j1] = ((byte)(abyte0[j1] != byte0 ? 1 : 0));

		}

		anInt3719 = anIntArray3706[32] + anIntArray3707[32];
		anInt3715 = anInt3719 - j;
		anInt3685 = k - anInt3719;
	}

	public Class33_Sub6_Sub7_Sub2(byte arg0[])
	{
		aByteArrayArray3702 = new byte[256][];
		anInt3719 = 0;
		anIntArray3710 = new int[arg0.length];
		for(int i = 0; i < anIntArray3710.length; i++)
			anIntArray3710[i] = arg0[i] & 0xff;

	}

	public static Class58 aClass58_3684 = Class33_Sub6_Sub11.method535(126, ")4u");
	public int anInt3685;
	public static Class58 aClass58_3686 = Class33_Sub6_Sub11.method535(105, "b");
	public static int anInt3687 = 0;
	public static Class58 aClass58_3688 = Class33_Sub6_Sub11.method535(99, ")4str");
	public static Class58 aClass58_3689 = Class33_Sub6_Sub11.method535(124, "shad=");
	public static int anInt3690 = -1;
	public static int anInt3691 = -1;
	public static Class58 aClass58_3692 = Class33_Sub6_Sub11.method535(116, ")4shad");
	public static Class58 aClass58_3693 = Class33_Sub6_Sub11.method535(117, "u");
	public static Class58 aClass58_3694 = Class33_Sub6_Sub11.method535(113, "img=");
	public static Class58 aClass58_3695 = Class33_Sub6_Sub11.method535(125, "str=");
	public static Class58 aClass58_3696 = Class33_Sub6_Sub11.method535(115, ")4b");
	public static Class58 aClass58_3697 = Class33_Sub6_Sub11.method535(127, "i");
	public static Class58 aClass58_3698 = Class33_Sub6_Sub11.method535(119, "shad");
	public static int anInt3699 = 0;
	public static Random aRandom3700 = new Random();
	public static int anInt3701 = 0;
	public byte aByteArrayArray3702[][];
	public static int anInt3703 = -1;
	public static Class58 aClass58_3704 = Class33_Sub6_Sub11.method535(103, "gt");
	public static Class58 aClass58_3705 = Class33_Sub6_Sub11.method535(102, "col=");
	public int anIntArray3706[];
	public int anIntArray3707[];
	public static int anInt3708 = -1;
	public static int anInt3709 = 0;
	public int anIntArray3710[];
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array3711[];
	public static Class58 aClass58_3712 = Class33_Sub6_Sub11.method535(109, ")4i");
	public static Class58 aClass58_3713 = Class33_Sub6_Sub11.method535(106, "u=");
	public static Class58 aClass58_3714 = Class33_Sub6_Sub11.method535(108, ")4col");
	public int anInt3715;
	public static Class58 aClass58_3716 = Class33_Sub6_Sub11.method535(113, "lt");
	public static int anInt3717 = 256;
	public static Class58 aClass58_3718 = Class33_Sub6_Sub11.method535(120, "str");
	public int anInt3719;
	public static Class58 aClass58_3720 = Class33_Sub6_Sub11.method535(110, "br");
	public static Class58 aClass58Array3721[] = new Class58[100];

}
