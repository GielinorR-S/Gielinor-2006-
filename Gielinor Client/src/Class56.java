// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class56.java


public class Class56
{

	public void method965(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
		{
			return;
		} else
		{
			class33_sub21.aClass66_2608 = null;
			return;
		}
	}

	public boolean method966(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt1203; i++)
		{
			Class29 class29 = aClass29Array1199[i];
			if(class29.anInt608 == 1)
			{
				int j = class29.anInt581 - arg0;
				if(j > 0)
				{
					int k1 = class29.anInt609 + (class29.anInt591 * j >> 8);
					int l2 = class29.anInt583 + (class29.anInt602 * j >> 8);
					int i4 = class29.anInt605 + (class29.anInt610 * j >> 8);
					int j5 = class29.anInt586 + (class29.anInt593 * j >> 8);
					if(arg2 >= k1 && arg2 <= l2 && arg1 >= i4 && arg1 <= j5)
						return true;
				}
			} else
			if(class29.anInt608 == 2)
			{
				int k = arg0 - class29.anInt581;
				if(k > 0)
				{
					int l1 = class29.anInt609 + (class29.anInt591 * k >> 8);
					int i3 = class29.anInt583 + (class29.anInt602 * k >> 8);
					int j4 = class29.anInt605 + (class29.anInt610 * k >> 8);
					int k5 = class29.anInt586 + (class29.anInt593 * k >> 8);
					if(arg2 >= l1 && arg2 <= i3 && arg1 >= j4 && arg1 <= k5)
						return true;
				}
			} else
			if(class29.anInt608 == 3)
			{
				int l = class29.anInt609 - arg2;
				if(l > 0)
				{
					int i2 = class29.anInt581 + (class29.anInt596 * l >> 8);
					int j3 = class29.anInt604 + (class29.anInt600 * l >> 8);
					int k4 = class29.anInt605 + (class29.anInt610 * l >> 8);
					int l5 = class29.anInt586 + (class29.anInt593 * l >> 8);
					if(arg0 >= i2 && arg0 <= j3 && arg1 >= k4 && arg1 <= l5)
						return true;
				}
			} else
			if(class29.anInt608 == 4)
			{
				int i1 = arg2 - class29.anInt609;
				if(i1 > 0)
				{
					int j2 = class29.anInt581 + (class29.anInt596 * i1 >> 8);
					int k3 = class29.anInt604 + (class29.anInt600 * i1 >> 8);
					int l4 = class29.anInt605 + (class29.anInt610 * i1 >> 8);
					int i6 = class29.anInt586 + (class29.anInt593 * i1 >> 8);
					if(arg0 >= j2 && arg0 <= k3 && arg1 >= l4 && arg1 <= i6)
						return true;
				}
			} else
			if(class29.anInt608 == 5)
			{
				int j1 = arg1 - class29.anInt605;
				if(j1 > 0)
				{
					int k2 = class29.anInt581 + (class29.anInt596 * j1 >> 8);
					int l3 = class29.anInt604 + (class29.anInt600 * j1 >> 8);
					int i5 = class29.anInt609 + (class29.anInt591 * j1 >> 8);
					int j6 = class29.anInt583 + (class29.anInt602 * j1 >> 8);
					if(arg0 >= k2 && arg0 <= l3 && arg2 >= i5 && arg2 <= j6)
						return true;
				}
			}
		}

		return false;
	}

	public boolean method967(int arg0, int arg1, int arg2, int arg3)
	{
		if(!method1005(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int j = arg2 << 7;
		return method966(i + 1, anIntArrayArrayArray1202[arg0][arg1][arg2] - arg3, j + 1) && method966((i + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg2] - arg3, j + 1) && method966((i + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg2 + 1] - arg3, (j + 128) - 1) && method966(i + 1, anIntArrayArrayArray1202[arg0][arg1][arg2 + 1] - arg3, (j + 128) - 1);
	}

	public boolean method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, Class33_Sub6_Sub4 arg8, int arg9, boolean arg10, int arg11, int arg12)
	{
		for(int i = arg1; i < arg1 + arg3; i++)
		{
			for(int j = arg2; j < arg2 + arg4; j++)
			{
				if(i < 0 || j < 0 || i >= anInt1182 || j >= anInt1189)
					return false;
				Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][i][j];
				if(class33_sub21 != null && class33_sub21.anInt2610 >= 5)
					return false;
			}

		}

		Class62 class62 = new Class62();
		class62.anInt1318 = arg11;
		class62.anInt1310 = arg12;
		class62.anInt1303 = arg0;
		class62.anInt1297 = arg5;
		class62.anInt1319 = arg6;
		class62.anInt1304 = arg7;
		class62.aClass33_Sub6_Sub4_1300 = arg8;
		class62.anInt1315 = arg9;
		class62.anInt1301 = arg1;
		class62.anInt1314 = arg2;
		class62.anInt1298 = (arg1 + arg3) - 1;
		class62.anInt1309 = (arg2 + arg4) - 1;
		for(int k = arg1; k < arg1 + arg3; k++)
		{
			for(int l = arg2; l < arg2 + arg4; l++)
			{
				int i1 = 0;
				if(k > arg1)
					i1++;
				if(k < (arg1 + arg3) - 1)
					i1 += 4;
				if(l > arg2)
					i1 += 8;
				if(l < (arg2 + arg4) - 1)
					i1 += 2;
				for(int j1 = arg0; j1 >= 0; j1--)
					if(aClass33_Sub21ArrayArrayArray1198[j1][k][l] == null)
						aClass33_Sub21ArrayArrayArray1198[j1][k][l] = new Class33_Sub21(j1, k, l);

				Class33_Sub21 class33_sub21_1 = aClass33_Sub21ArrayArrayArray1198[arg0][k][l];
				class33_sub21_1.aClass62Array2604[class33_sub21_1.anInt2610] = class62;
				class33_sub21_1.anIntArray2591[class33_sub21_1.anInt2610] = i1;
				class33_sub21_1.anInt2600 |= i1;
				class33_sub21_1.anInt2610++;
			}

		}

		if(arg10)
			aClass62Array1213[anInt1177++] = class62;
		return true;
	}

	public void method969(int arg0, int arg1, int arg2, int arg3)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
		{
			return;
		} else
		{
			aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].anInt2614 = arg3;
			return;
		}
	}

	public void method970(Class33_Sub6_Sub4_Sub7 arg0, int arg1, int arg2, int arg3)
	{
		if(arg2 < anInt1182)
		{
			Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg1][arg2 + 1][arg3];
			if(class33_sub21 != null && class33_sub21.aClass48_2590 != null && (class33_sub21.aClass48_2590.aClass33_Sub6_Sub4_1050 instanceof Class33_Sub6_Sub4_Sub7))
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = (Class33_Sub6_Sub4_Sub7)class33_sub21.aClass48_2590.aClass33_Sub6_Sub4_1050;
				Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7, 128, 0, 0, true);
			}
		}
		if(arg3 < anInt1182)
		{
			Class33_Sub21 class33_sub21_1 = aClass33_Sub21ArrayArrayArray1198[arg1][arg2][arg3 + 1];
			if(class33_sub21_1 != null && class33_sub21_1.aClass48_2590 != null && (class33_sub21_1.aClass48_2590.aClass33_Sub6_Sub4_1050 instanceof Class33_Sub6_Sub4_Sub7))
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = (Class33_Sub6_Sub4_Sub7)class33_sub21_1.aClass48_2590.aClass33_Sub6_Sub4_1050;
				Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7_1, 0, 0, 128, true);
			}
		}
		if(arg2 < anInt1182 && arg3 < anInt1189)
		{
			Class33_Sub21 class33_sub21_2 = aClass33_Sub21ArrayArrayArray1198[arg1][arg2 + 1][arg3 + 1];
			if(class33_sub21_2 != null && class33_sub21_2.aClass48_2590 != null && (class33_sub21_2.aClass48_2590.aClass33_Sub6_Sub4_1050 instanceof Class33_Sub6_Sub4_Sub7))
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = (Class33_Sub6_Sub4_Sub7)class33_sub21_2.aClass48_2590.aClass33_Sub6_Sub4_1050;
				Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7_2, 128, 0, 128, true);
			}
		}
		if(arg2 < anInt1182 && arg3 > 0)
		{
			Class33_Sub21 class33_sub21_3 = aClass33_Sub21ArrayArrayArray1198[arg1][arg2 + 1][arg3 - 1];
			if(class33_sub21_3 != null && class33_sub21_3.aClass48_2590 != null && (class33_sub21_3.aClass48_2590.aClass33_Sub6_Sub4_1050 instanceof Class33_Sub6_Sub4_Sub7))
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_3 = (Class33_Sub6_Sub4_Sub7)class33_sub21_3.aClass48_2590.aClass33_Sub6_Sub4_1050;
				Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7_3, 128, 0, -128, true);
			}
		}
	}

	public int method971(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null || class33_sub21.aClass48_2590 == null)
			return 0;
		else
			return class33_sub21.aClass48_2590.anInt1051;
	}

	public void method972()
	{
		int i = anIntArray1218[anInt1205];
		Class29 aclass29[] = aClass29ArrayArray1216[anInt1205];
		anInt1203 = 0;
		for(int j = 0; j < i; j++)
		{
			Class29 class29 = aclass29[j];
			if(class29.anInt582 == 1)
			{
				int k = (class29.anInt592 - anInt1211) + 25;
				if(k < 0 || k > 50)
					continue;
				int j1 = (class29.anInt579 - anInt1215) + 25;
				if(j1 < 0)
					j1 = 0;
				int i2 = (class29.anInt584 - anInt1215) + 25;
				if(i2 > 50)
					i2 = 50;
				boolean flag = false;
				while(j1 <= i2) 
					if(aBooleanArrayArray1230[k][j1++])
					{
						flag = true;
						break;
					}
				if(!flag)
					continue;
				int i3 = anInt1186 - class29.anInt581;
				if(i3 > 32)
				{
					class29.anInt608 = 1;
				} else
				{
					if(i3 >= -32)
						continue;
					class29.anInt608 = 2;
					i3 = -i3;
				}
				class29.anInt591 = (class29.anInt609 - anInt1210 << 8) / i3;
				class29.anInt602 = (class29.anInt583 - anInt1210 << 8) / i3;
				class29.anInt610 = (class29.anInt605 - anInt1201 << 8) / i3;
				class29.anInt593 = (class29.anInt586 - anInt1201 << 8) / i3;
				aClass29Array1199[anInt1203++] = class29;
				continue;
			}
			if(class29.anInt582 == 2)
			{
				int l = (class29.anInt579 - anInt1215) + 25;
				if(l < 0 || l > 50)
					continue;
				int k1 = (class29.anInt592 - anInt1211) + 25;
				if(k1 < 0)
					k1 = 0;
				int j2 = (class29.anInt589 - anInt1211) + 25;
				if(j2 > 50)
					j2 = 50;
				boolean flag1 = false;
				while(k1 <= j2) 
					if(aBooleanArrayArray1230[k1++][l])
					{
						flag1 = true;
						break;
					}
				if(!flag1)
					continue;
				int j3 = anInt1210 - class29.anInt609;
				if(j3 > 32)
				{
					class29.anInt608 = 3;
				} else
				{
					if(j3 >= -32)
						continue;
					class29.anInt608 = 4;
					j3 = -j3;
				}
				class29.anInt596 = (class29.anInt581 - anInt1186 << 8) / j3;
				class29.anInt600 = (class29.anInt604 - anInt1186 << 8) / j3;
				class29.anInt610 = (class29.anInt605 - anInt1201 << 8) / j3;
				class29.anInt593 = (class29.anInt586 - anInt1201 << 8) / j3;
				aClass29Array1199[anInt1203++] = class29;
			} else
			if(class29.anInt582 == 4)
			{
				int i1 = class29.anInt605 - anInt1201;
				if(i1 > 128)
				{
					int l1 = (class29.anInt579 - anInt1215) + 25;
					if(l1 < 0)
						l1 = 0;
					int k2 = (class29.anInt584 - anInt1215) + 25;
					if(k2 > 50)
						k2 = 50;
					if(l1 <= k2)
					{
						int l2 = (class29.anInt592 - anInt1211) + 25;
						if(l2 < 0)
							l2 = 0;
						int k3 = (class29.anInt589 - anInt1211) + 25;
						if(k3 > 50)
							k3 = 50;
						boolean flag2 = false;
label0:
						for(int l3 = l2; l3 <= k3; l3++)
						{
							for(int i4 = l1; i4 <= k2; i4++)
							{
								if(!aBooleanArrayArray1230[l3][i4])
									continue;
								flag2 = true;
								break label0;
							}

						}

						if(flag2)
						{
							class29.anInt608 = 5;
							class29.anInt596 = (class29.anInt581 - anInt1186 << 8) / i1;
							class29.anInt600 = (class29.anInt604 - anInt1186 << 8) / i1;
							class29.anInt591 = (class29.anInt609 - anInt1210 << 8) / i1;
							class29.anInt602 = (class29.anInt583 - anInt1210 << 8) / i1;
							aClass29Array1199[anInt1203++] = class29;
						}
					}
				}
			}
		}

	}

	public void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg0 < 0)
			arg0 = 0;
		else
		if(arg0 >= anInt1182 * 128)
			arg0 = anInt1182 * 128 - 1;
		if(arg2 < 0)
			arg2 = 0;
		else
		if(arg2 >= anInt1189 * 128)
			arg2 = anInt1189 * 128 - 1;
		anInt1190++;
		anInt1185 = Class33_Sub6_Sub7_Sub1.anIntArray3681[arg3];
		anInt1179 = Class33_Sub6_Sub7_Sub1.anIntArray3678[arg3];
		anInt1195 = Class33_Sub6_Sub7_Sub1.anIntArray3681[arg4];
		anInt1187 = Class33_Sub6_Sub7_Sub1.anIntArray3678[arg4];
		aBooleanArrayArray1230 = aBooleanArrayArrayArrayArray1224[(arg3 - 128) / 32][arg4 / 64];
		anInt1186 = arg0;
		anInt1201 = arg1;
		anInt1210 = arg2;
		anInt1211 = arg0 / 128;
		anInt1215 = arg2 / 128;
		anInt1205 = arg5;
		anInt1200 = anInt1211 - 25;
		if(anInt1200 < 0)
			anInt1200 = 0;
		anInt1181 = anInt1215 - 25;
		if(anInt1181 < 0)
			anInt1181 = 0;
		anInt1184 = anInt1211 + 25;
		if(anInt1184 > anInt1182)
			anInt1184 = anInt1182;
		anInt1212 = anInt1215 + 25;
		if(anInt1212 > anInt1189)
			anInt1212 = anInt1189;
		method972();
		anInt1197 = 0;
		for(int i = anInt1196; i < anInt1180; i++)
		{
			Class33_Sub21 aclass33_sub21[][] = aClass33_Sub21ArrayArrayArray1198[i];
			for(int k = anInt1200; k < anInt1184; k++)
			{
				for(int i1 = anInt1181; i1 < anInt1212; i1++)
				{
					Class33_Sub21 class33_sub21 = aclass33_sub21[k][i1];
					if(class33_sub21 != null)
						if(class33_sub21.anInt2614 > arg5 || !aBooleanArrayArray1230[(k - anInt1211) + 25][(i1 - anInt1215) + 25] && anIntArrayArrayArray1202[i][k][i1] - arg1 < 2000)
						{
							class33_sub21.aBoolean2606 = false;
							class33_sub21.aBoolean2612 = false;
							class33_sub21.anInt2616 = 0;
						} else
						{
							class33_sub21.aBoolean2606 = true;
							class33_sub21.aBoolean2612 = true;
							if(class33_sub21.anInt2610 > 0)
								class33_sub21.aBoolean2609 = true;
							else
								class33_sub21.aBoolean2609 = false;
							anInt1197++;
						}
				}

			}

		}

		for(int j = anInt1196; j < anInt1180; j++)
		{
			Class33_Sub21 aclass33_sub21_1[][] = aClass33_Sub21ArrayArrayArray1198[j];
			for(int j1 = -25; j1 <= 0; j1++)
			{
				int k1 = anInt1211 + j1;
				int i2 = anInt1211 - j1;
				if(k1 >= anInt1200 || i2 < anInt1184)
				{
					for(int k2 = -25; k2 <= 0; k2++)
					{
						int i3 = anInt1215 + k2;
						int k3 = anInt1215 - k2;
						if(k1 >= anInt1200)
						{
							if(i3 >= anInt1181)
							{
								Class33_Sub21 class33_sub21_1 = aclass33_sub21_1[k1][i3];
								if(class33_sub21_1 != null && class33_sub21_1.aBoolean2606)
									method999(class33_sub21_1, true);
							}
							if(k3 < anInt1212)
							{
								Class33_Sub21 class33_sub21_2 = aclass33_sub21_1[k1][k3];
								if(class33_sub21_2 != null && class33_sub21_2.aBoolean2606)
									method999(class33_sub21_2, true);
							}
						}
						if(i2 < anInt1184)
						{
							if(i3 >= anInt1181)
							{
								Class33_Sub21 class33_sub21_3 = aclass33_sub21_1[i2][i3];
								if(class33_sub21_3 != null && class33_sub21_3.aBoolean2606)
									method999(class33_sub21_3, true);
							}
							if(k3 < anInt1212)
							{
								Class33_Sub21 class33_sub21_4 = aclass33_sub21_1[i2][k3];
								if(class33_sub21_4 != null && class33_sub21_4.aBoolean2606)
									method999(class33_sub21_4, true);
							}
						}
						if(anInt1197 == 0)
						{
							aBoolean1191 = false;
							return;
						}
					}

				}
			}

		}

		for(int l = anInt1196; l < anInt1180; l++)
		{
			Class33_Sub21 aclass33_sub21_2[][] = aClass33_Sub21ArrayArrayArray1198[l];
			for(int l1 = -25; l1 <= 0; l1++)
			{
				int j2 = anInt1211 + l1;
				int l2 = anInt1211 - l1;
				if(j2 >= anInt1200 || l2 < anInt1184)
				{
					for(int j3 = -25; j3 <= 0; j3++)
					{
						int l3 = anInt1215 + j3;
						int i4 = anInt1215 - j3;
						if(j2 >= anInt1200)
						{
							if(l3 >= anInt1181)
							{
								Class33_Sub21 class33_sub21_5 = aclass33_sub21_2[j2][l3];
								if(class33_sub21_5 != null && class33_sub21_5.aBoolean2606)
									method999(class33_sub21_5, false);
							}
							if(i4 < anInt1212)
							{
								Class33_Sub21 class33_sub21_6 = aclass33_sub21_2[j2][i4];
								if(class33_sub21_6 != null && class33_sub21_6.aBoolean2606)
									method999(class33_sub21_6, false);
							}
						}
						if(l2 < anInt1184)
						{
							if(l3 >= anInt1181)
							{
								Class33_Sub21 class33_sub21_7 = aclass33_sub21_2[l2][l3];
								if(class33_sub21_7 != null && class33_sub21_7.aBoolean2606)
									method999(class33_sub21_7, false);
							}
							if(i4 < anInt1212)
							{
								Class33_Sub21 class33_sub21_8 = aclass33_sub21_2[l2][i4];
								if(class33_sub21_8 != null && class33_sub21_8.aBoolean2606)
									method999(class33_sub21_8, false);
							}
						}
						if(anInt1197 == 0)
						{
							aBoolean1191 = false;
							return;
						}
					}

				}
			}

		}

		aBoolean1191 = false;
	}

	public void method974(int arg0)
	{
		anInt1196 = arg0;
		for(int i = 0; i < anInt1182; i++)
		{
			for(int j = 0; j < anInt1189; j++)
				if(aClass33_Sub21ArrayArrayArray1198[arg0][i][j] == null)
					aClass33_Sub21ArrayArrayArray1198[arg0][i][j] = new Class33_Sub21(arg0, i, j);

		}

	}

	public static void method975(int arg0[], int arg1, int arg2, int arg3, int arg4)
	{
		anInt1222 = 0;
		anInt1227 = 0;
		anInt1229 = arg3;
		anInt1228 = arg4;
		anInt1223 = arg3 / 2;
		anInt1231 = arg4 / 2;
		boolean aflag[][][][] = new boolean[9][32][53][53];
		for(int i = 128; i <= 384; i += 32)
		{
			for(int j = 0; j < 2048; j += 64)
			{
				anInt1185 = Class33_Sub6_Sub7_Sub1.anIntArray3681[i];
				anInt1179 = Class33_Sub6_Sub7_Sub1.anIntArray3678[i];
				anInt1195 = Class33_Sub6_Sub7_Sub1.anIntArray3681[j];
				anInt1187 = Class33_Sub6_Sub7_Sub1.anIntArray3678[j];
				int l = (i - 128) / 32;
				int j1 = j / 64;
				for(int l1 = -26; l1 <= 26; l1++)
				{
					for(int j2 = -26; j2 <= 26; j2++)
					{
						int k2 = l1 * 128;
						int i3 = j2 * 128;
						boolean flag1 = false;
						for(int k3 = -arg1; k3 <= arg2; k3 += 128)
						{
							if(!method1015(k2, arg0[l] + k3, i3))
								continue;
							flag1 = true;
							break;
						}

						aflag[l][j1][l1 + 25 + 1][j2 + 25 + 1] = flag1;
					}

				}

			}

		}

		for(int k = 0; k < 8; k++)
		{
			for(int i1 = 0; i1 < 32; i1++)
			{
				for(int k1 = -25; k1 < 25; k1++)
				{
					for(int i2 = -25; i2 < 25; i2++)
					{
						boolean flag = false;
label0:
						for(int l2 = -1; l2 <= 1; l2++)
						{
							for(int j3 = -1; j3 <= 1; j3++)
							{
								if(aflag[k][i1][k1 + l2 + 25 + 1][i2 + j3 + 25 + 1])
									flag = true;
								else
								if(aflag[k][(i1 + 1) % 31][k1 + l2 + 25 + 1][i2 + j3 + 25 + 1])
									flag = true;
								else
								if(aflag[k + 1][i1][k1 + l2 + 25 + 1][i2 + j3 + 25 + 1])
								{
									flag = true;
								} else
								{
									if(!aflag[k + 1][(i1 + 1) % 31][k1 + l2 + 25 + 1][i2 + j3 + 25 + 1])
										continue;
									flag = true;
								}
								break label0;
							}

						}

						aBooleanArrayArrayArrayArray1224[k][i1][k1 + 25][i2 + 25] = flag;
					}

				}

			}

		}

	}

	public boolean method976(int arg0, int arg1, int arg2, int arg3, int arg4, Class33_Sub6_Sub4 arg5, int arg6, 
			int arg7, int arg8, int arg9, int arg10, int arg11)
	{
		if(arg5 == null)
			return true;
		else
			return method968(arg0, arg8, arg9, (arg10 - arg8) + 1, (arg11 - arg9) + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public void method977(int arg0, int arg1, int arg2, int arg3)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return;
		Class23 class23 = class33_sub21.aClass23_2593;
		if(class23 == null)
		{
			return;
		} else
		{
			int i = arg1 * 128 + 64;
			int j = arg2 * 128 + 64;
			class23.anInt425 = i + ((class23.anInt425 - i) * arg3) / 16;
			class23.anInt446 = j + ((class23.anInt446 - j) * arg3) / 16;
			return;
		}
	}

	public int method978(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null || class33_sub21.aClass66_2608 == null)
			return 0;
		else
			return class33_sub21.aClass66_2608.anInt1408;
	}

	public boolean method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg1 == arg2 && arg3 == arg4)
		{
			if(!method1005(arg0, arg1, arg3))
				return false;
			int i = arg1 << 7;
			int k = arg3 << 7;
			return method966(i + 1, anIntArrayArrayArray1202[arg0][arg1][arg3] - arg5, k + 1) && method966((i + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg3] - arg5, k + 1) && method966((i + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg3 + 1] - arg5, (k + 128) - 1) && method966(i + 1, anIntArrayArrayArray1202[arg0][arg1][arg3 + 1] - arg5, (k + 128) - 1);
		}
		for(int j = arg1; j <= arg2; j++)
		{
			for(int l = arg3; l <= arg4; l++)
				if(anIntArrayArrayArray1183[arg0][j][l] == -anInt1190)
					return false;

		}

		int i1 = (arg1 << 7) + 1;
		int j1 = (arg3 << 7) + 2;
		int k1 = anIntArrayArrayArray1202[arg0][arg1][arg3] - arg5;
		if(!method966(i1, k1, j1))
			return false;
		int l1 = (arg2 << 7) - 1;
		if(!method966(l1, k1, j1))
			return false;
		int i2 = (arg4 << 7) - 1;
		if(!method966(i1, k1, i2))
			return false;
		return method966(l1, k1, i2);
	}

	public int method980(int arg0, int arg1, int arg2, int arg3)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return -1;
		if(class33_sub21.aClass66_2608 != null && class33_sub21.aClass66_2608.anInt1408 == arg3)
			return class33_sub21.aClass66_2608.anInt1401 & 0xff;
		if(class33_sub21.aClass23_2593 != null && class33_sub21.aClass23_2593.anInt483 == arg3)
			return class33_sub21.aClass23_2593.anInt488 & 0xff;
		if(class33_sub21.aClass48_2590 != null && class33_sub21.aClass48_2590.anInt1051 == arg3)
			return class33_sub21.aClass48_2590.anInt1049 & 0xff;
		for(int i = 0; i < class33_sub21.anInt2610; i++)
			if(class33_sub21.aClass62Array2604[i].anInt1318 == arg3)
				return class33_sub21.aClass62Array2604[i].anInt1310 & 0xff;

		return -1;
	}

	public boolean method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class33_Sub6_Sub4 arg6, 
			int arg7, int arg8, int arg9)
	{
		if(arg6 == null)
		{
			return true;
		} else
		{
			int i = arg1 * 128 + 64 * arg4;
			int j = arg2 * 128 + 64 * arg5;
			return method968(arg0, arg1, arg2, arg4, arg5, i, j, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	public void method982(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt1180; i++)
		{
			for(int j = 0; j < anInt1182; j++)
			{
				for(int k = 0; k < anInt1189; k++)
				{
					Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[i][j][k];
					if(class33_sub21 != null)
					{
						Class66 class66 = class33_sub21.aClass66_2608;
						if(class66 != null && (class66.aClass33_Sub6_Sub4_1416 instanceof Class33_Sub6_Sub4_Sub7))
						{
							Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = (Class33_Sub6_Sub4_Sub7)class66.aClass33_Sub6_Sub4_1416;
							method997(class33_sub6_sub4_sub7, i, j, k, 1, 1);
							if(class66.aClass33_Sub6_Sub4_1406 instanceof Class33_Sub6_Sub4_Sub7)
							{
								Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = (Class33_Sub6_Sub4_Sub7)class66.aClass33_Sub6_Sub4_1406;
								method997(class33_sub6_sub4_sub7_1, i, j, k, 1, 1);
								Class33_Sub6_Sub4_Sub7.method386(class33_sub6_sub4_sub7, class33_sub6_sub4_sub7_1, 0, 0, 0, false);
								class66.aClass33_Sub6_Sub4_1406 = class33_sub6_sub4_sub7_1.method385(class33_sub6_sub4_sub7_1.aShort3642, class33_sub6_sub4_sub7_1.aShort3632, arg0, arg1, arg2);
							}
							class66.aClass33_Sub6_Sub4_1416 = class33_sub6_sub4_sub7.method385(class33_sub6_sub4_sub7.aShort3642, class33_sub6_sub4_sub7.aShort3632, arg0, arg1, arg2);
						}
						for(int l = 0; l < class33_sub21.anInt2610; l++)
						{
							Class62 class62 = class33_sub21.aClass62Array2604[l];
							if(class62 != null && (class62.aClass33_Sub6_Sub4_1300 instanceof Class33_Sub6_Sub4_Sub7))
							{
								Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = (Class33_Sub6_Sub4_Sub7)class62.aClass33_Sub6_Sub4_1300;
								method997(class33_sub6_sub4_sub7_2, i, j, k, (class62.anInt1298 - class62.anInt1301) + 1, (class62.anInt1309 - class62.anInt1314) + 1);
								class62.aClass33_Sub6_Sub4_1300 = class33_sub6_sub4_sub7_2.method385(class33_sub6_sub4_sub7_2.aShort3642, class33_sub6_sub4_sub7_2.aShort3632, arg0, arg1, arg2);
							}
						}

						Class48 class48 = class33_sub21.aClass48_2590;
						if(class48 != null && (class48.aClass33_Sub6_Sub4_1050 instanceof Class33_Sub6_Sub4_Sub7))
						{
							Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_3 = (Class33_Sub6_Sub4_Sub7)class48.aClass33_Sub6_Sub4_1050;
							method970(class33_sub6_sub4_sub7_3, i, j, k);
							class48.aClass33_Sub6_Sub4_1050 = class33_sub6_sub4_sub7_3.method385(class33_sub6_sub4_sub7_3.aShort3642, class33_sub6_sub4_sub7_3.aShort3632, arg0, arg1, arg2);
						}
					}
				}

			}

		}

	}

	public void method983(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
		{
			return;
		} else
		{
			class33_sub21.aClass48_2590 = null;
			return;
		}
	}

	public void method984(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
		{
			return;
		} else
		{
			class33_sub21.aClass23_2593 = null;
			return;
		}
	}

	public Class23 method985(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return null;
		else
			return class33_sub21.aClass23_2593;
	}

	public Class48 method986(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null || class33_sub21.aClass48_2590 == null)
			return null;
		else
			return class33_sub21.aClass48_2590;
	}

	public void method987(Class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		int i = arg0.anIntArray92.length;
		for(int j = 0; j < i; j++)
		{
			int k = arg0.anIntArray92[j] - anInt1186;
			int i1 = arg0.anIntArray87[j] - anInt1201;
			int k1 = arg0.anIntArray82[j] - anInt1210;
			int i2 = k1 * arg3 + k * arg4 >> 16;
			k1 = k1 * arg4 - k * arg3 >> 16;
			k = i2;
			i2 = i1 * arg2 - k1 * arg1 >> 16;
			k1 = i1 * arg1 + k1 * arg2 >> 16;
			i1 = i2;
			if(k1 < 50)
				return;
			if(arg0.anIntArray84 != null)
			{
				Class1.anIntArray86[j] = k;
				Class1.anIntArray85[j] = i1;
				Class1.anIntArray83[j] = k1;
			}
			Class1.anIntArray77[j] = Class33_Sub6_Sub7_Sub1.anInt3665 + (k << 9) / k1;
			Class1.anIntArray94[j] = Class33_Sub6_Sub7_Sub1.anInt3669 + (i1 << 9) / k1;
		}

		Class33_Sub6_Sub7_Sub1.anInt3673 = 0;
		i = arg0.anIntArray78.length;
		for(int l = 0; l < i; l++)
		{
			int j1 = arg0.anIntArray78[l];
			int l1 = arg0.anIntArray95[l];
			int j2 = arg0.anIntArray76[l];
			int k2 = Class1.anIntArray77[j1];
			int l2 = Class1.anIntArray77[l1];
			int i3 = Class1.anIntArray77[j2];
			int j3 = Class1.anIntArray94[j1];
			int k3 = Class1.anIntArray94[l1];
			int l3 = Class1.anIntArray94[j2];
			if((k2 - l2) * (l3 - k3) - (j3 - k3) * (i3 - l2) > 0)
			{
				Class33_Sub6_Sub7_Sub1.aBoolean3664 = false;
				if(k2 < 0 || l2 < 0 || i3 < 0 || k2 > Class33_Sub6_Sub7_Sub1.anInt3675 || l2 > Class33_Sub6_Sub7_Sub1.anInt3675 || i3 > Class33_Sub6_Sub7_Sub1.anInt3675)
					Class33_Sub6_Sub7_Sub1.aBoolean3664 = true;
				if(aBoolean1191 && method998(anInt1178, anInt1194, j3, k3, l3, k2, l2, i3))
				{
					anInt1207 = arg5;
					anInt1214 = arg6;
				}
				if(arg0.anIntArray84 == null || arg0.anIntArray84[l] == -1)
				{
					if(arg0.anIntArray80[l] != 0xbc614e)
						Class33_Sub6_Sub7_Sub1.method439(j3, k3, l3, k2, l2, i3, arg0.anIntArray80[l], arg0.anIntArray88[l], arg0.anIntArray79[l]);
				} else
				if(!aBoolean1188)
				{
					if(arg0.aBoolean93)
						Class33_Sub6_Sub7_Sub1.method437(j3, k3, l3, k2, l2, i3, arg0.anIntArray80[l], arg0.anIntArray88[l], arg0.anIntArray79[l], Class1.anIntArray86[0], Class1.anIntArray86[1], Class1.anIntArray86[3], Class1.anIntArray85[0], Class1.anIntArray85[1], Class1.anIntArray85[3], Class1.anIntArray83[0], Class1.anIntArray83[1], Class1.anIntArray83[3], arg0.anIntArray84[l]);
					else
						Class33_Sub6_Sub7_Sub1.method437(j3, k3, l3, k2, l2, i3, arg0.anIntArray80[l], arg0.anIntArray88[l], arg0.anIntArray79[l], Class1.anIntArray86[j1], Class1.anIntArray86[l1], Class1.anIntArray86[j2], Class1.anIntArray85[j1], Class1.anIntArray85[l1], Class1.anIntArray85[j2], Class1.anIntArray83[j1], Class1.anIntArray83[l1], Class1.anIntArray83[j2], arg0.anIntArray84[l]);
				} else
				{
					int i4 = Class33_Sub6_Sub7_Sub1.anInterface1_3680.method1(arg0.anIntArray84[l], (byte)-69);
					Class33_Sub6_Sub7_Sub1.method439(j3, k3, l3, k2, l2, i3, method992(i4, arg0.anIntArray80[l]), method992(i4, arg0.anIntArray88[l]), method992(i4, arg0.anIntArray79[l]));
				}
			}
		}

	}

	public int method988(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null || class33_sub21.aClass23_2593 == null)
			return 0;
		else
			return class33_sub21.aClass23_2593.anInt483;
	}

	public void method989(Class31 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7)
	{
		int i;
		int j = i = (arg6 << 7) - anInt1186;
		int k;
		int l = k = (arg7 << 7) - anInt1210;
		int i1;
		int j1 = i1 = j + 128;
		int k1;
		int l1 = k1 = l + 128;
		int i2 = anIntArrayArrayArray1202[arg1][arg6][arg7] - anInt1201;
		int j2 = anIntArrayArrayArray1202[arg1][arg6 + 1][arg7] - anInt1201;
		int k2 = anIntArrayArrayArray1202[arg1][arg6 + 1][arg7 + 1] - anInt1201;
		int l2 = anIntArrayArrayArray1202[arg1][arg6][arg7 + 1] - anInt1201;
		int i3 = l * arg4 + j * arg5 >> 16;
		l = l * arg5 - j * arg4 >> 16;
		j = i3;
		i3 = i2 * arg3 - l * arg2 >> 16;
		l = i2 * arg2 + l * arg3 >> 16;
		i2 = i3;
		if(l < 50)
			return;
		i3 = k * arg4 + j1 * arg5 >> 16;
		k = k * arg5 - j1 * arg4 >> 16;
		j1 = i3;
		i3 = j2 * arg3 - k * arg2 >> 16;
		k = j2 * arg2 + k * arg3 >> 16;
		j2 = i3;
		if(k < 50)
			return;
		i3 = l1 * arg4 + i1 * arg5 >> 16;
		l1 = l1 * arg5 - i1 * arg4 >> 16;
		i1 = i3;
		i3 = k2 * arg3 - l1 * arg2 >> 16;
		l1 = k2 * arg2 + l1 * arg3 >> 16;
		k2 = i3;
		if(l1 < 50)
			return;
		i3 = k1 * arg4 + i * arg5 >> 16;
		k1 = k1 * arg5 - i * arg4 >> 16;
		i = i3;
		i3 = l2 * arg3 - k1 * arg2 >> 16;
		k1 = l2 * arg2 + k1 * arg3 >> 16;
		l2 = i3;
		if(k1 < 50)
			return;
		int j3 = Class33_Sub6_Sub7_Sub1.anInt3665 + (j << 9) / l;
		int k3 = Class33_Sub6_Sub7_Sub1.anInt3669 + (i2 << 9) / l;
		int l3 = Class33_Sub6_Sub7_Sub1.anInt3665 + (j1 << 9) / k;
		int i4 = Class33_Sub6_Sub7_Sub1.anInt3669 + (j2 << 9) / k;
		int j4 = Class33_Sub6_Sub7_Sub1.anInt3665 + (i1 << 9) / l1;
		int k4 = Class33_Sub6_Sub7_Sub1.anInt3669 + (k2 << 9) / l1;
		int l4 = Class33_Sub6_Sub7_Sub1.anInt3665 + (i << 9) / k1;
		int i5 = Class33_Sub6_Sub7_Sub1.anInt3669 + (l2 << 9) / k1;
		Class33_Sub6_Sub7_Sub1.anInt3673 = 0;
		if((j4 - l4) * (i4 - i5) - (k4 - i5) * (l3 - l4) > 0)
		{
			Class33_Sub6_Sub7_Sub1.aBoolean3664 = false;
			if(j4 < 0 || l4 < 0 || l3 < 0 || j4 > Class33_Sub6_Sub7_Sub1.anInt3675 || l4 > Class33_Sub6_Sub7_Sub1.anInt3675 || l3 > Class33_Sub6_Sub7_Sub1.anInt3675)
				Class33_Sub6_Sub7_Sub1.aBoolean3664 = true;
			if(aBoolean1191 && method998(anInt1178, anInt1194, k4, i5, i4, j4, l4, l3))
			{
				anInt1207 = arg6;
				anInt1214 = arg7;
			}
			if(arg0.anInt685 == -1)
			{
				if(arg0.anInt690 != 0xbc614e)
					Class33_Sub6_Sub7_Sub1.method439(k4, i5, i4, j4, l4, l3, arg0.anInt690, arg0.anInt683, arg0.anInt688);
			} else
			if(!aBoolean1188)
			{
				if(arg0.aBoolean679)
					Class33_Sub6_Sub7_Sub1.method437(k4, i5, i4, j4, l4, l3, arg0.anInt690, arg0.anInt683, arg0.anInt688, j, j1, i, i2, j2, l2, l, k, k1, arg0.anInt685);
				else
					Class33_Sub6_Sub7_Sub1.method437(k4, i5, i4, j4, l4, l3, arg0.anInt690, arg0.anInt683, arg0.anInt688, i1, i, j1, k2, l2, j2, l1, k1, k, arg0.anInt685);
			} else
			{
				int j5 = Class33_Sub6_Sub7_Sub1.anInterface1_3680.method1(arg0.anInt685, (byte)112);
				Class33_Sub6_Sub7_Sub1.method439(k4, i5, i4, j4, l4, l3, method992(j5, arg0.anInt690), method992(j5, arg0.anInt683), method992(j5, arg0.anInt688));
			}
		}
		if((j3 - l3) * (i5 - i4) - (k3 - i4) * (l4 - l3) > 0)
		{
			Class33_Sub6_Sub7_Sub1.aBoolean3664 = false;
			if(j3 < 0 || l3 < 0 || l4 < 0 || j3 > Class33_Sub6_Sub7_Sub1.anInt3675 || l3 > Class33_Sub6_Sub7_Sub1.anInt3675 || l4 > Class33_Sub6_Sub7_Sub1.anInt3675)
				Class33_Sub6_Sub7_Sub1.aBoolean3664 = true;
			if(aBoolean1191 && method998(anInt1178, anInt1194, k3, i4, i5, j3, l3, l4))
			{
				anInt1207 = arg6;
				anInt1214 = arg7;
			}
			if(arg0.anInt685 == -1)
			{
				if(arg0.anInt682 != 0xbc614e)
				{
					Class33_Sub6_Sub7_Sub1.method439(k3, i4, i5, j3, l3, l4, arg0.anInt682, arg0.anInt688, arg0.anInt683);
					return;
				}
			} else
			{
				if(!aBoolean1188)
				{
					Class33_Sub6_Sub7_Sub1.method437(k3, i4, i5, j3, l3, l4, arg0.anInt682, arg0.anInt688, arg0.anInt683, j, j1, i, i2, j2, l2, l, k, k1, arg0.anInt685);
					return;
				}
				int k5 = Class33_Sub6_Sub7_Sub1.anInterface1_3680.method1(arg0.anInt685, (byte)-64);
				Class33_Sub6_Sub7_Sub1.method439(k3, i4, i5, j3, l3, l4, method992(k5, arg0.anInt682), method992(k5, arg0.anInt688), method992(k5, arg0.anInt683));
			}
		}
	}

	public void method990()
	{
		for(int i = 0; i < anInt1177; i++)
		{
			Class62 class62 = aClass62Array1213[i];
			method1002(class62);
			aClass62Array1213[i] = null;
		}

		anInt1177 = 0;
	}

	public Class62 method991(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return null;
		for(int i = 0; i < class33_sub21.anInt2610; i++)
		{
			Class62 class62 = class33_sub21.aClass62Array2604[i];
			if((class62.anInt1318 >> 29 & 3) == 2 && class62.anInt1301 == arg1 && class62.anInt1314 == arg2)
				return class62;
		}

		return null;
	}

	public static int method992(int arg0, int arg1)
	{
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if(arg1 < 2)
			arg1 = 2;
		else
		if(arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public void method993(int arg0, int arg1, int arg2)
	{
		aBoolean1191 = true;
		anInt1208 = arg0;
		anInt1178 = arg1;
		anInt1194 = arg2;
		anInt1207 = -1;
		anInt1214 = -1;
	}

	public static void method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		Class29 class29 = new Class29();
		class29.anInt592 = arg2 / 128;
		class29.anInt589 = arg3 / 128;
		class29.anInt579 = arg4 / 128;
		class29.anInt584 = arg5 / 128;
		class29.anInt582 = arg1;
		class29.anInt581 = arg2;
		class29.anInt604 = arg3;
		class29.anInt609 = arg4;
		class29.anInt583 = arg5;
		class29.anInt605 = arg6;
		class29.anInt586 = arg7;
		aClass29ArrayArray1216[arg0][anIntArray1218[arg0]++] = class29;
	}

	public void method995()
	{
		for(int i = 0; i < anInt1180; i++)
		{
			for(int j = 0; j < anInt1182; j++)
			{
				for(int l = 0; l < anInt1189; l++)
					aClass33_Sub21ArrayArrayArray1198[i][j][l] = null;

			}

		}

		for(int k = 0; k < anInt1204; k++)
		{
			for(int i1 = 0; i1 < anIntArray1218[k]; i1++)
				aClass29ArrayArray1216[k][i1] = null;

			anIntArray1218[k] = 0;
		}

		for(int j1 = 0; j1 < anInt1177; j1++)
			aClass62Array1213[j1] = null;

		anInt1177 = 0;
		for(int k1 = 0; k1 < aClass62Array1221.length; k1++)
			aClass62Array1221[k1] = null;

	}

	public void method996(int arg0, int arg1, int arg2, int arg3, Class33_Sub6_Sub4 arg4, int arg5, int arg6, 
			int arg7, int arg8, int arg9, int arg10)
	{
		if(arg4 == null)
			return;
		Class23 class23 = new Class23();
		class23.anInt483 = arg9;
		class23.anInt488 = arg10;
		class23.anInt425 = arg1 * 128 + 64 + arg7;
		class23.anInt446 = arg2 * 128 + 64 + arg8;
		class23.anInt462 = arg3;
		class23.aClass33_Sub6_Sub4_438 = arg4;
		class23.anInt423 = arg5;
		class23.anInt441 = arg6;
		for(int i = arg0; i >= 0; i--)
			if(aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] == null)
				aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] = new Class33_Sub21(i, arg1, arg2);

		aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass23_2593 = class23;
	}

	public void method997(Class33_Sub6_Sub4_Sub7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		boolean flag = true;
		int i = arg2;
		int j = arg2 + arg4;
		int k = arg3 - 1;
		int l = arg3 + arg5;
		for(int i1 = arg1; i1 <= arg1 + 1; i1++)
			if(i1 != anInt1180)
			{
				for(int j1 = i; j1 <= j; j1++)
					if(j1 >= 0 && j1 < anInt1182)
					{
						for(int k1 = k; k1 <= l; k1++)
							if(k1 >= 0 && k1 < anInt1189 && (!flag || j1 >= j || k1 >= l || k1 < arg3 && j1 != arg2))
							{
								Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[i1][j1][k1];
								if(class33_sub21 != null)
								{
									int l1 = (anIntArrayArrayArray1202[i1][j1][k1] + anIntArrayArrayArray1202[i1][j1 + 1][k1] + anIntArrayArrayArray1202[i1][j1][k1 + 1] + anIntArrayArrayArray1202[i1][j1 + 1][k1 + 1]) / 4 - (anIntArrayArrayArray1202[arg1][arg2][arg3] + anIntArrayArrayArray1202[arg1][arg2 + 1][arg3] + anIntArrayArrayArray1202[arg1][arg2][arg3 + 1] + anIntArrayArrayArray1202[arg1][arg2 + 1][arg3 + 1]) / 4;
									Class66 class66 = class33_sub21.aClass66_2608;
									if(class66 != null)
									{
										if(class66.aClass33_Sub6_Sub4_1416 instanceof Class33_Sub6_Sub4_Sub7)
										{
											Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = (Class33_Sub6_Sub4_Sub7)class66.aClass33_Sub6_Sub4_1416;
											Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7, (j1 - arg2) * 128 + (1 - arg4) * 64, l1, (k1 - arg3) * 128 + (1 - arg5) * 64, flag);
										}
										if(class66.aClass33_Sub6_Sub4_1406 instanceof Class33_Sub6_Sub4_Sub7)
										{
											Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = (Class33_Sub6_Sub4_Sub7)class66.aClass33_Sub6_Sub4_1406;
											Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7_1, (j1 - arg2) * 128 + (1 - arg4) * 64, l1, (k1 - arg3) * 128 + (1 - arg5) * 64, flag);
										}
									}
									for(int i2 = 0; i2 < class33_sub21.anInt2610; i2++)
									{
										Class62 class62 = class33_sub21.aClass62Array2604[i2];
										if(class62 != null && (class62.aClass33_Sub6_Sub4_1300 instanceof Class33_Sub6_Sub4_Sub7))
										{
											Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = (Class33_Sub6_Sub4_Sub7)class62.aClass33_Sub6_Sub4_1300;
											int j2 = (class62.anInt1298 - class62.anInt1301) + 1;
											int k2 = (class62.anInt1309 - class62.anInt1314) + 1;
											Class33_Sub6_Sub4_Sub7.method386(arg0, class33_sub6_sub4_sub7_2, (class62.anInt1301 - arg2) * 128 + (j2 - arg4) * 64, l1, (class62.anInt1314 - arg3) * 128 + (k2 - arg5) * 64, flag);
										}
									}

								}
							}

					}

				i--;
				flag = false;
			}

	}

	public boolean method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7)
	{
		if(arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
			return false;
		if(arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
			return false;
		if(arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
			return false;
		if(arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
			return false;
		int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
		int j = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
		int k = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
		return i * k > 0 && k * j > 0;
	}

	public void method999(Class33_Sub21 arg0, boolean arg1)
	{
		aClass4_1219.method63(arg0, (byte)74);
		do
		{
			Class33_Sub21 class33_sub21;
			do
			{
				class33_sub21 = (Class33_Sub21)aClass4_1219.method54(true);
				if(class33_sub21 == null)
					return;
			} while(!class33_sub21.aBoolean2612);
			int i = class33_sub21.anInt2605;
			int j = class33_sub21.anInt2607;
			int k = class33_sub21.anInt2596;
			int l = class33_sub21.anInt2613;
			Class33_Sub21 aclass33_sub21[][] = aClass33_Sub21ArrayArrayArray1198[k];
			if(class33_sub21.aBoolean2606)
			{
				if(arg1)
				{
					if(k > 0)
					{
						Class33_Sub21 class33_sub21_1 = aClass33_Sub21ArrayArrayArray1198[k - 1][i][j];
						if(class33_sub21_1 != null && class33_sub21_1.aBoolean2612)
							continue;
					}
					if(i <= anInt1211 && i > anInt1200)
					{
						Class33_Sub21 class33_sub21_2 = aclass33_sub21[i - 1][j];
						if(class33_sub21_2 != null && class33_sub21_2.aBoolean2612 && (class33_sub21_2.aBoolean2606 || (class33_sub21.anInt2600 & 1) == 0))
							continue;
					}
					if(i >= anInt1211 && i < anInt1184 - 1)
					{
						Class33_Sub21 class33_sub21_3 = aclass33_sub21[i + 1][j];
						if(class33_sub21_3 != null && class33_sub21_3.aBoolean2612 && (class33_sub21_3.aBoolean2606 || (class33_sub21.anInt2600 & 4) == 0))
							continue;
					}
					if(j <= anInt1215 && j > anInt1181)
					{
						Class33_Sub21 class33_sub21_4 = aclass33_sub21[i][j - 1];
						if(class33_sub21_4 != null && class33_sub21_4.aBoolean2612 && (class33_sub21_4.aBoolean2606 || (class33_sub21.anInt2600 & 8) == 0))
							continue;
					}
					if(j >= anInt1215 && j < anInt1212 - 1)
					{
						Class33_Sub21 class33_sub21_5 = aclass33_sub21[i][j + 1];
						if(class33_sub21_5 != null && class33_sub21_5.aBoolean2612 && (class33_sub21_5.aBoolean2606 || (class33_sub21.anInt2600 & 2) == 0))
							continue;
					}
				} else
				{
					arg1 = true;
				}
				class33_sub21.aBoolean2606 = false;
				if(class33_sub21.aClass33_Sub21_2597 != null)
				{
					Class33_Sub21 class33_sub21_6 = class33_sub21.aClass33_Sub21_2597;
					if(class33_sub21_6.aClass31_2598 != null)
					{
						if(!method1005(0, i, j))
							method989(class33_sub21_6.aClass31_2598, 0, anInt1185, anInt1179, anInt1195, anInt1187, i, j);
					} else
					if(class33_sub21_6.aClass1_2611 != null && !method1005(0, i, j))
						method987(class33_sub21_6.aClass1_2611, anInt1185, anInt1179, anInt1195, anInt1187, i, j);
					Class66 class66 = class33_sub21_6.aClass66_2608;
					if(class66 != null)
						class66.aClass33_Sub6_Sub4_1416.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66.anInt1418 - anInt1186, class66.anInt1425 - anInt1201, class66.anInt1410 - anInt1210, class66.anInt1408);
					for(int i2 = 0; i2 < class33_sub21_6.anInt2610; i2++)
					{
						Class62 class62 = class33_sub21_6.aClass62Array2604[i2];
						if(class62 != null)
							class62.aClass33_Sub6_Sub4_1300.method317(class62.anInt1315, anInt1185, anInt1179, anInt1195, anInt1187, class62.anInt1297 - anInt1186, class62.anInt1304 - anInt1201, class62.anInt1319 - anInt1210, class62.anInt1318);
					}

				}
				boolean flag = false;
				if(class33_sub21.aClass31_2598 != null)
				{
					if(!method1005(l, i, j))
					{
						flag = true;
						if(class33_sub21.aClass31_2598.anInt690 != 0xbc614e || aBoolean1191 && k <= anInt1208)
							method989(class33_sub21.aClass31_2598, l, anInt1185, anInt1179, anInt1195, anInt1187, i, j);
					}
				} else
				if(class33_sub21.aClass1_2611 != null && !method1005(l, i, j))
				{
					flag = true;
					method987(class33_sub21.aClass1_2611, anInt1185, anInt1179, anInt1195, anInt1187, i, j);
				}
				int j1 = 0;
				int j2 = 0;
				Class66 class66_3 = class33_sub21.aClass66_2608;
				Class23 class23_1 = class33_sub21.aClass23_2593;
				if(class66_3 != null || class23_1 != null)
				{
					if(anInt1211 == i)
						j1++;
					else
					if(anInt1211 < i)
						j1 += 2;
					if(anInt1215 == j)
						j1 += 3;
					else
					if(anInt1215 > j)
						j1 += 6;
					j2 = anIntArray1233[j1];
					class33_sub21.anInt2602 = anIntArray1225[j1];
				}
				if(class66_3 != null)
				{
					if((class66_3.anInt1403 & anIntArray1235[j1]) != 0)
					{
						if(class66_3.anInt1403 == 16)
						{
							class33_sub21.anInt2616 = 3;
							class33_sub21.anInt2601 = anIntArray1232[j1];
							class33_sub21.anInt2594 = 3 - class33_sub21.anInt2601;
						} else
						if(class66_3.anInt1403 == 32)
						{
							class33_sub21.anInt2616 = 6;
							class33_sub21.anInt2601 = anIntArray1234[j1];
							class33_sub21.anInt2594 = 6 - class33_sub21.anInt2601;
						} else
						if(class66_3.anInt1403 == 64)
						{
							class33_sub21.anInt2616 = 12;
							class33_sub21.anInt2601 = anIntArray1226[j1];
							class33_sub21.anInt2594 = 12 - class33_sub21.anInt2601;
						} else
						{
							class33_sub21.anInt2616 = 9;
							class33_sub21.anInt2601 = anIntArray1236[j1];
							class33_sub21.anInt2594 = 9 - class33_sub21.anInt2601;
						}
					} else
					{
						class33_sub21.anInt2616 = 0;
					}
					if((class66_3.anInt1403 & j2) != 0 && !method1012(l, i, j, class66_3.anInt1403))
						class66_3.aClass33_Sub6_Sub4_1416.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66_3.anInt1418 - anInt1186, class66_3.anInt1425 - anInt1201, class66_3.anInt1410 - anInt1210, class66_3.anInt1408);
					if((class66_3.anInt1413 & j2) != 0 && !method1012(l, i, j, class66_3.anInt1413))
						class66_3.aClass33_Sub6_Sub4_1406.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66_3.anInt1418 - anInt1186, class66_3.anInt1425 - anInt1201, class66_3.anInt1410 - anInt1210, class66_3.anInt1408);
				}
				if(class23_1 != null && !method967(l, i, j, class23_1.aClass33_Sub6_Sub4_438.anInt2737))
					if((class23_1.anInt423 & j2) != 0)
						class23_1.aClass33_Sub6_Sub4_438.method317(class23_1.anInt441, anInt1185, anInt1179, anInt1195, anInt1187, class23_1.anInt425 - anInt1186, class23_1.anInt462 - anInt1201, class23_1.anInt446 - anInt1210, class23_1.anInt483);
					else
					if((class23_1.anInt423 & 0x300) != 0)
					{
						int j4 = class23_1.anInt425 - anInt1186;
						int l5 = class23_1.anInt462 - anInt1201;
						int k6 = class23_1.anInt446 - anInt1210;
						int i8 = class23_1.anInt441;
						int k9;
						if(i8 == 1 || i8 == 2)
							k9 = -j4;
						else
							k9 = j4;
						int k10;
						if(i8 == 2 || i8 == 3)
							k10 = -k6;
						else
							k10 = k6;
						if((class23_1.anInt423 & 0x100) != 0 && k10 < k9)
						{
							int i11 = j4 + anIntArray1206[i8];
							int k11 = k6 + anIntArray1192[i8];
							class23_1.aClass33_Sub6_Sub4_438.method317(i8 * 512 + 256, anInt1185, anInt1179, anInt1195, anInt1187, i11, l5, k11, class23_1.anInt483);
						}
						if((class23_1.anInt423 & 0x200) != 0 && k10 > k9)
						{
							int j11 = j4 + anIntArray1193[i8];
							int l11 = k6 + anIntArray1209[i8];
							class23_1.aClass33_Sub6_Sub4_438.method317(i8 * 512 + 1280 & 0x7ff, anInt1185, anInt1179, anInt1195, anInt1187, j11, l5, l11, class23_1.anInt483);
						}
					}
				if(flag)
				{
					Class48 class48 = class33_sub21.aClass48_2590;
					if(class48 != null)
						class48.aClass33_Sub6_Sub4_1050.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class48.anInt1054 - anInt1186, class48.anInt1047 - anInt1201, class48.anInt1053 - anInt1210, class48.anInt1051);
					Class55 class55_1 = class33_sub21.aClass55_2589;
					if(class55_1 != null && class55_1.anInt1167 == 0)
					{
						if(class55_1.aClass33_Sub6_Sub4_1169 != null)
							class55_1.aClass33_Sub6_Sub4_1169.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55_1.anInt1165 - anInt1186, class55_1.anInt1170 - anInt1201, class55_1.anInt1175 - anInt1210, class55_1.anInt1166);
						if(class55_1.aClass33_Sub6_Sub4_1174 != null)
							class55_1.aClass33_Sub6_Sub4_1174.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55_1.anInt1165 - anInt1186, class55_1.anInt1170 - anInt1201, class55_1.anInt1175 - anInt1210, class55_1.anInt1166);
						if(class55_1.aClass33_Sub6_Sub4_1176 != null)
							class55_1.aClass33_Sub6_Sub4_1176.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55_1.anInt1165 - anInt1186, class55_1.anInt1170 - anInt1201, class55_1.anInt1175 - anInt1210, class55_1.anInt1166);
					}
				}
				int k4 = class33_sub21.anInt2600;
				if(k4 != 0)
				{
					if(i < anInt1211 && (k4 & 4) != 0)
					{
						Class33_Sub21 class33_sub21_16 = aclass33_sub21[i + 1][j];
						if(class33_sub21_16 != null && class33_sub21_16.aBoolean2612)
							aClass4_1219.method63(class33_sub21_16, (byte)77);
					}
					if(j < anInt1215 && (k4 & 2) != 0)
					{
						Class33_Sub21 class33_sub21_17 = aclass33_sub21[i][j + 1];
						if(class33_sub21_17 != null && class33_sub21_17.aBoolean2612)
							aClass4_1219.method63(class33_sub21_17, (byte)43);
					}
					if(i > anInt1211 && (k4 & 1) != 0)
					{
						Class33_Sub21 class33_sub21_18 = aclass33_sub21[i - 1][j];
						if(class33_sub21_18 != null && class33_sub21_18.aBoolean2612)
							aClass4_1219.method63(class33_sub21_18, (byte)126);
					}
					if(j > anInt1215 && (k4 & 8) != 0)
					{
						Class33_Sub21 class33_sub21_19 = aclass33_sub21[i][j - 1];
						if(class33_sub21_19 != null && class33_sub21_19.aBoolean2612)
							aClass4_1219.method63(class33_sub21_19, (byte)74);
					}
				}
			}
			if(class33_sub21.anInt2616 != 0)
			{
				boolean flag1 = true;
				for(int k1 = 0; k1 < class33_sub21.anInt2610; k1++)
				{
					if(class33_sub21.aClass62Array2604[k1].anInt1320 == anInt1190 || (class33_sub21.anIntArray2591[k1] & class33_sub21.anInt2616) != class33_sub21.anInt2601)
						continue;
					flag1 = false;
					break;
				}

				if(flag1)
				{
					Class66 class66_1 = class33_sub21.aClass66_2608;
					if(!method1012(l, i, j, class66_1.anInt1403))
						class66_1.aClass33_Sub6_Sub4_1416.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66_1.anInt1418 - anInt1186, class66_1.anInt1425 - anInt1201, class66_1.anInt1410 - anInt1210, class66_1.anInt1408);
					class33_sub21.anInt2616 = 0;
				}
			}
			if(class33_sub21.aBoolean2609)
				try
				{
					int i1 = class33_sub21.anInt2610;
					class33_sub21.aBoolean2609 = false;
					int l1 = 0;
label0:
					for(int k2 = 0; k2 < i1; k2++)
					{
						Class62 class62_1 = class33_sub21.aClass62Array2604[k2];
						if(class62_1.anInt1320 == anInt1190)
							continue;
						for(int k3 = class62_1.anInt1301; k3 <= class62_1.anInt1298; k3++)
						{
							for(int l4 = class62_1.anInt1314; l4 <= class62_1.anInt1309; l4++)
							{
								Class33_Sub21 class33_sub21_20 = aclass33_sub21[k3][l4];
								if(class33_sub21_20.aBoolean2606)
								{
									class33_sub21.aBoolean2609 = true;
								} else
								{
									if(class33_sub21_20.anInt2616 == 0)
										continue;
									int l6 = 0;
									if(k3 > class62_1.anInt1301)
										l6++;
									if(k3 < class62_1.anInt1298)
										l6 += 4;
									if(l4 > class62_1.anInt1314)
										l6 += 8;
									if(l4 < class62_1.anInt1309)
										l6 += 2;
									if((l6 & class33_sub21_20.anInt2616) != class33_sub21.anInt2594)
										continue;
									class33_sub21.aBoolean2609 = true;
								}
								continue label0;
							}

						}

						aClass62Array1221[l1++] = class62_1;
						int i5 = anInt1211 - class62_1.anInt1301;
						int i6 = class62_1.anInt1298 - anInt1211;
						if(i6 > i5)
							i5 = i6;
						int i7 = anInt1215 - class62_1.anInt1314;
						int j8 = class62_1.anInt1309 - anInt1215;
						if(j8 > i7)
							class62_1.anInt1313 = i5 + j8;
						else
							class62_1.anInt1313 = i5 + i7;
					}

					while(l1 > 0) 
					{
						int i3 = -50;
						int l3 = -1;
						for(int j5 = 0; j5 < l1; j5++)
						{
							Class62 class62_2 = aClass62Array1221[j5];
							if(class62_2.anInt1320 != anInt1190)
								if(class62_2.anInt1313 > i3)
								{
									i3 = class62_2.anInt1313;
									l3 = j5;
								} else
								if(class62_2.anInt1313 == i3)
								{
									int j7 = class62_2.anInt1297 - anInt1186;
									int k8 = class62_2.anInt1319 - anInt1210;
									int l9 = aClass62Array1221[l3].anInt1297 - anInt1186;
									int l10 = aClass62Array1221[l3].anInt1319 - anInt1210;
									if(j7 * j7 + k8 * k8 > l9 * l9 + l10 * l10)
										l3 = j5;
								}
						}

						if(l3 == -1)
							break;
						Class62 class62_3 = aClass62Array1221[l3];
						class62_3.anInt1320 = anInt1190;
						if(!method979(l, class62_3.anInt1301, class62_3.anInt1298, class62_3.anInt1314, class62_3.anInt1309, class62_3.aClass33_Sub6_Sub4_1300.anInt2737))
							class62_3.aClass33_Sub6_Sub4_1300.method317(class62_3.anInt1315, anInt1185, anInt1179, anInt1195, anInt1187, class62_3.anInt1297 - anInt1186, class62_3.anInt1304 - anInt1201, class62_3.anInt1319 - anInt1210, class62_3.anInt1318);
						for(int k7 = class62_3.anInt1301; k7 <= class62_3.anInt1298; k7++)
						{
							for(int l8 = class62_3.anInt1314; l8 <= class62_3.anInt1309; l8++)
							{
								Class33_Sub21 class33_sub21_21 = aclass33_sub21[k7][l8];
								if(class33_sub21_21.anInt2616 != 0)
									aClass4_1219.method63(class33_sub21_21, (byte)29);
								else
								if((k7 != i || l8 != j) && class33_sub21_21.aBoolean2612)
									aClass4_1219.method63(class33_sub21_21, (byte)51);
							}

						}

					}
					if(class33_sub21.aBoolean2609)
						continue;
				}
				catch(Exception _ex)
				{
					class33_sub21.aBoolean2609 = false;
				}
			if(!class33_sub21.aBoolean2612 || class33_sub21.anInt2616 != 0)
				continue;
			if(i <= anInt1211 && i > anInt1200)
			{
				Class33_Sub21 class33_sub21_7 = aclass33_sub21[i - 1][j];
				if(class33_sub21_7 != null && class33_sub21_7.aBoolean2612)
					continue;
			}
			if(i >= anInt1211 && i < anInt1184 - 1)
			{
				Class33_Sub21 class33_sub21_8 = aclass33_sub21[i + 1][j];
				if(class33_sub21_8 != null && class33_sub21_8.aBoolean2612)
					continue;
			}
			if(j <= anInt1215 && j > anInt1181)
			{
				Class33_Sub21 class33_sub21_9 = aclass33_sub21[i][j - 1];
				if(class33_sub21_9 != null && class33_sub21_9.aBoolean2612)
					continue;
			}
			if(j >= anInt1215 && j < anInt1212 - 1)
			{
				Class33_Sub21 class33_sub21_10 = aclass33_sub21[i][j + 1];
				if(class33_sub21_10 != null && class33_sub21_10.aBoolean2612)
					continue;
			}
			class33_sub21.aBoolean2612 = false;
			anInt1197--;
			Class55 class55 = class33_sub21.aClass55_2589;
			if(class55 != null && class55.anInt1167 != 0)
			{
				if(class55.aClass33_Sub6_Sub4_1169 != null)
					class55.aClass33_Sub6_Sub4_1169.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55.anInt1165 - anInt1186, class55.anInt1170 - anInt1201 - class55.anInt1167, class55.anInt1175 - anInt1210, class55.anInt1166);
				if(class55.aClass33_Sub6_Sub4_1174 != null)
					class55.aClass33_Sub6_Sub4_1174.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55.anInt1165 - anInt1186, class55.anInt1170 - anInt1201 - class55.anInt1167, class55.anInt1175 - anInt1210, class55.anInt1166);
				if(class55.aClass33_Sub6_Sub4_1176 != null)
					class55.aClass33_Sub6_Sub4_1176.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class55.anInt1165 - anInt1186, class55.anInt1170 - anInt1201 - class55.anInt1167, class55.anInt1175 - anInt1210, class55.anInt1166);
			}
			if(class33_sub21.anInt2602 != 0)
			{
				Class23 class23 = class33_sub21.aClass23_2593;
				if(class23 != null && !method967(l, i, j, class23.aClass33_Sub6_Sub4_438.anInt2737))
					if((class23.anInt423 & class33_sub21.anInt2602) != 0)
						class23.aClass33_Sub6_Sub4_438.method317(class23.anInt441, anInt1185, anInt1179, anInt1195, anInt1187, class23.anInt425 - anInt1186, class23.anInt462 - anInt1201, class23.anInt446 - anInt1210, class23.anInt483);
					else
					if((class23.anInt423 & 0x300) != 0)
					{
						int l2 = class23.anInt425 - anInt1186;
						int j3 = class23.anInt462 - anInt1201;
						int i4 = class23.anInt446 - anInt1210;
						int k5 = class23.anInt441;
						int j6;
						if(k5 == 1 || k5 == 2)
							j6 = -l2;
						else
							j6 = l2;
						int l7;
						if(k5 == 2 || k5 == 3)
							l7 = -i4;
						else
							l7 = i4;
						if((class23.anInt423 & 0x100) != 0 && l7 >= j6)
						{
							int i9 = l2 + anIntArray1206[k5];
							int i10 = i4 + anIntArray1192[k5];
							class23.aClass33_Sub6_Sub4_438.method317(k5 * 512 + 256, anInt1185, anInt1179, anInt1195, anInt1187, i9, j3, i10, class23.anInt483);
						}
						if((class23.anInt423 & 0x200) != 0 && l7 <= j6)
						{
							int j9 = l2 + anIntArray1193[k5];
							int j10 = i4 + anIntArray1209[k5];
							class23.aClass33_Sub6_Sub4_438.method317(k5 * 512 + 1280 & 0x7ff, anInt1185, anInt1179, anInt1195, anInt1187, j9, j3, j10, class23.anInt483);
						}
					}
				Class66 class66_2 = class33_sub21.aClass66_2608;
				if(class66_2 != null)
				{
					if((class66_2.anInt1413 & class33_sub21.anInt2602) != 0 && !method1012(l, i, j, class66_2.anInt1413))
						class66_2.aClass33_Sub6_Sub4_1406.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66_2.anInt1418 - anInt1186, class66_2.anInt1425 - anInt1201, class66_2.anInt1410 - anInt1210, class66_2.anInt1408);
					if((class66_2.anInt1403 & class33_sub21.anInt2602) != 0 && !method1012(l, i, j, class66_2.anInt1403))
						class66_2.aClass33_Sub6_Sub4_1416.method317(0, anInt1185, anInt1179, anInt1195, anInt1187, class66_2.anInt1418 - anInt1186, class66_2.anInt1425 - anInt1201, class66_2.anInt1410 - anInt1210, class66_2.anInt1408);
				}
			}
			if(k < anInt1180 - 1)
			{
				Class33_Sub21 class33_sub21_11 = aClass33_Sub21ArrayArrayArray1198[k + 1][i][j];
				if(class33_sub21_11 != null && class33_sub21_11.aBoolean2612)
					aClass4_1219.method63(class33_sub21_11, (byte)34);
			}
			if(i < anInt1211)
			{
				Class33_Sub21 class33_sub21_12 = aclass33_sub21[i + 1][j];
				if(class33_sub21_12 != null && class33_sub21_12.aBoolean2612)
					aClass4_1219.method63(class33_sub21_12, (byte)108);
			}
			if(j < anInt1215)
			{
				Class33_Sub21 class33_sub21_13 = aclass33_sub21[i][j + 1];
				if(class33_sub21_13 != null && class33_sub21_13.aBoolean2612)
					aClass4_1219.method63(class33_sub21_13, (byte)83);
			}
			if(i > anInt1211)
			{
				Class33_Sub21 class33_sub21_14 = aclass33_sub21[i - 1][j];
				if(class33_sub21_14 != null && class33_sub21_14.aBoolean2612)
					aClass4_1219.method63(class33_sub21_14, (byte)34);
			}
			if(j > anInt1215)
			{
				Class33_Sub21 class33_sub21_15 = aclass33_sub21[i][j - 1];
				if(class33_sub21_15 != null && class33_sub21_15.aBoolean2612)
					aClass4_1219.method63(class33_sub21_15, (byte)39);
			}
		} while(true);
	}

	public boolean method1000(int arg0, int arg1, int arg2, int arg3, int arg4, Class33_Sub6_Sub4 arg5, int arg6, 
			int arg7, boolean arg8)
	{
		if(arg5 == null)
			return true;
		int i = arg1 - arg4;
		int j = arg2 - arg4;
		int k = arg1 + arg4;
		int l = arg2 + arg4;
		if(arg8)
		{
			if(arg6 > 640 && arg6 < 1408)
				l += 128;
			if(arg6 > 1152 && arg6 < 1920)
				k += 128;
			if(arg6 > 1664 || arg6 < 384)
				j -= 128;
			if(arg6 > 128 && arg6 < 896)
				i -= 128;
		}
		i /= 128;
		j /= 128;
		k /= 128;
		l /= 128;
		return method968(arg0, i, j, (k - i) + 1, (l - j) + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public static void method1001()
	{
		aClass62Array1221 = null;
		anIntArray1206 = null;
		anIntArray1192 = null;
		anIntArray1193 = null;
		anIntArray1209 = null;
		anIntArray1218 = null;
		aClass29ArrayArray1216 = null;
		aClass29Array1199 = null;
		aClass4_1219 = null;
		anIntArray1233 = null;
		anIntArray1235 = null;
		anIntArray1225 = null;
		anIntArray1232 = null;
		anIntArray1234 = null;
		anIntArray1226 = null;
		anIntArray1236 = null;
		aBooleanArrayArrayArrayArray1224 = null;
		aBooleanArrayArray1230 = null;
	}

	public void method1002(Class62 arg0)
	{
		for(int i = arg0.anInt1301; i <= arg0.anInt1298; i++)
		{
			for(int j = arg0.anInt1314; j <= arg0.anInt1309; j++)
			{
				Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0.anInt1303][i][j];
				if(class33_sub21 != null)
				{
					for(int k = 0; k < class33_sub21.anInt2610; k++)
					{
						if(class33_sub21.aClass62Array2604[k] != arg0)
							continue;
						class33_sub21.anInt2610--;
						for(int l = k; l < class33_sub21.anInt2610; l++)
						{
							class33_sub21.aClass62Array2604[l] = class33_sub21.aClass62Array2604[l + 1];
							class33_sub21.anIntArray2591[l] = class33_sub21.anIntArray2591[l + 1];
						}

						class33_sub21.aClass62Array2604[class33_sub21.anInt2610] = null;
						break;
					}

					class33_sub21.anInt2600 = 0;
					for(int i1 = 0; i1 < class33_sub21.anInt2610; i1++)
						class33_sub21.anInt2600 |= class33_sub21.anIntArray2591[i1];

				}
			}

		}

	}

	public void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
			int arg14, int arg15, int arg16, int arg17, int arg18, int arg19)
	{
		if(arg3 == 0)
		{
			Class31 class31 = new Class31(arg10, arg11, arg12, arg13, -1, arg18, false);
			for(int i = arg0; i >= 0; i--)
				if(aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] == null)
					aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] = new Class33_Sub21(i, arg1, arg2);

			aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass31_2598 = class31;
			return;
		}
		if(arg3 == 1)
		{
			Class31 class31_1 = new Class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for(int j = arg0; j >= 0; j--)
				if(aClass33_Sub21ArrayArrayArray1198[j][arg1][arg2] == null)
					aClass33_Sub21ArrayArrayArray1198[j][arg1][arg2] = new Class33_Sub21(j, arg1, arg2);

			aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass31_2598 = class31_1;
			return;
		}
		Class1 class1 = new Class1(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
		for(int k = arg0; k >= 0; k--)
			if(aClass33_Sub21ArrayArrayArray1198[k][arg1][arg2] == null)
				aClass33_Sub21ArrayArrayArray1198[k][arg1][arg2] = new Class33_Sub21(k, arg1, arg2);

		aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass1_2611 = class1;
	}

	public void method1004(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
		{
			return;
		} else
		{
			class33_sub21.aClass55_2589 = null;
			return;
		}
	}

	public boolean method1005(int arg0, int arg1, int arg2)
	{
		int i = anIntArrayArrayArray1183[arg0][arg1][arg2];
		if(i == -anInt1190)
			return false;
		if(i == anInt1190)
			return true;
		int j = arg1 << 7;
		int k = arg2 << 7;
		if(method966(j + 1, anIntArrayArrayArray1202[arg0][arg1][arg2], k + 1) && method966((j + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg2], k + 1) && method966((j + 128) - 1, anIntArrayArrayArray1202[arg0][arg1 + 1][arg2 + 1], (k + 128) - 1) && method966(j + 1, anIntArrayArrayArray1202[arg0][arg1][arg2 + 1], (k + 128) - 1))
		{
			anIntArrayArrayArray1183[arg0][arg1][arg2] = anInt1190;
			return true;
		} else
		{
			anIntArrayArrayArray1183[arg0][arg1][arg2] = -anInt1190;
			return false;
		}
	}

	public void method1006(int arg0, int arg1, int arg2, int arg3, Class33_Sub6_Sub4 arg4, int arg5, Class33_Sub6_Sub4 arg6, 
			Class33_Sub6_Sub4 arg7)
	{
		Class55 class55 = new Class55();
		class55.aClass33_Sub6_Sub4_1176 = arg4;
		class55.anInt1165 = arg1 * 128 + 64;
		class55.anInt1175 = arg2 * 128 + 64;
		class55.anInt1170 = arg3;
		class55.anInt1166 = arg5;
		class55.aClass33_Sub6_Sub4_1169 = arg6;
		class55.aClass33_Sub6_Sub4_1174 = arg7;
		int i = 0;
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 != null)
		{
			for(int j = 0; j < class33_sub21.anInt2610; j++)
				if((class33_sub21.aClass62Array2604[j].anInt1310 & 0x100) == 256 && (class33_sub21.aClass62Array2604[j].aClass33_Sub6_Sub4_1300 instanceof Class33_Sub6_Sub4_Sub3))
				{
					Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)class33_sub21.aClass62Array2604[j].aClass33_Sub6_Sub4_1300;
					class33_sub6_sub4_sub3.method334();
					if(((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737 > i)
						i = ((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737;
				}

		}
		class55.anInt1167 = i;
		if(aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2] == null)
			aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2] = new Class33_Sub21(arg0, arg1, arg2);
		aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass55_2589 = class55;
	}

	public int method1007(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return 0;
		for(int i = 0; i < class33_sub21.anInt2610; i++)
		{
			Class62 class62 = class33_sub21.aClass62Array2604[i];
			if((class62.anInt1318 >> 29 & 3) == 2 && class62.anInt1301 == arg1 && class62.anInt1314 == arg2)
				return class62.anInt1318;
		}

		return 0;
	}

	public void method1008(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return;
		for(int i = 0; i < class33_sub21.anInt2610; i++)
		{
			Class62 class62 = class33_sub21.aClass62Array2604[i];
			if((class62.anInt1318 >> 29 & 3) == 2 && class62.anInt1301 == arg1 && class62.anInt1314 == arg2)
			{
				method1002(class62);
				return;
			}
		}

	}

	public void method1009(int arg0, int arg1, int arg2, int arg3, Class33_Sub6_Sub4 arg4, int arg5, int arg6)
	{
		if(arg4 == null)
			return;
		Class48 class48 = new Class48();
		class48.aClass33_Sub6_Sub4_1050 = arg4;
		class48.anInt1054 = arg1 * 128 + 64;
		class48.anInt1053 = arg2 * 128 + 64;
		class48.anInt1047 = arg3;
		class48.anInt1051 = arg5;
		class48.anInt1049 = arg6;
		if(aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2] == null)
			aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2] = new Class33_Sub21(arg0, arg1, arg2);
		aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass48_2590 = class48;
	}

	public void method1010(int arg0[], int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg3][arg4][arg5];
		if(class33_sub21 == null)
			return;
		Class31 class31 = class33_sub21.aClass31_2598;
		if(class31 != null)
		{
			int i = class31.anInt694;
			if(i == 0)
				return;
			for(int j = 0; j < 4; j++)
			{
				arg0[arg1] = i;
				arg0[arg1 + 1] = i;
				arg0[arg1 + 2] = i;
				arg0[arg1 + 3] = i;
				arg1 += arg2;
			}

			return;
		}
		Class1 class1 = class33_sub21.aClass1_2611;
		if(class1 == null)
			return;
		int k = class1.anInt89;
		int l = class1.anInt75;
		int i1 = class1.anInt90;
		int j1 = class1.anInt81;
		int ai[] = anIntArrayArray1217[k];
		int ai1[] = anIntArrayArray1220[l];
		int k1 = 0;
		if(i1 != 0)
		{
			for(int l1 = 0; l1 < 4; l1++)
			{
				arg0[arg1] = ai[ai1[k1++]] != 0 ? j1 : i1;
				arg0[arg1 + 1] = ai[ai1[k1++]] != 0 ? j1 : i1;
				arg0[arg1 + 2] = ai[ai1[k1++]] != 0 ? j1 : i1;
				arg0[arg1 + 3] = ai[ai1[k1++]] != 0 ? j1 : i1;
				arg1 += arg2;
			}

			return;
		}
		for(int i2 = 0; i2 < 4; i2++)
		{
			if(ai[ai1[k1++]] != 0)
				arg0[arg1] = j1;
			if(ai[ai1[k1++]] != 0)
				arg0[arg1 + 1] = j1;
			if(ai[ai1[k1++]] != 0)
				arg0[arg1 + 2] = j1;
			if(ai[ai1[k1++]] != 0)
				arg0[arg1 + 3] = j1;
			arg1 += arg2;
		}

	}

	public Class66 method1011(int arg0, int arg1, int arg2)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2];
		if(class33_sub21 == null)
			return null;
		else
			return class33_sub21.aClass66_2608;
	}

	public boolean method1012(int arg0, int arg1, int arg2, int arg3)
	{
		if(!method1005(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int j = arg2 << 7;
		int k = anIntArrayArrayArray1202[arg0][arg1][arg2] - 1;
		int l = k - 120;
		int i1 = k - 230;
		int j1 = k - 238;
		if(arg3 < 16)
		{
			if(arg3 == 1)
			{
				if(i > anInt1186)
				{
					if(!method966(i, k, j))
						return false;
					if(!method966(i, k, j + 128))
						return false;
				}
				if(arg0 > 0)
				{
					if(!method966(i, l, j))
						return false;
					if(!method966(i, l, j + 128))
						return false;
				}
				if(!method966(i, i1, j))
					return false;
				return method966(i, i1, j + 128);
			}
			if(arg3 == 2)
			{
				if(j < anInt1210)
				{
					if(!method966(i, k, j + 128))
						return false;
					if(!method966(i + 128, k, j + 128))
						return false;
				}
				if(arg0 > 0)
				{
					if(!method966(i, l, j + 128))
						return false;
					if(!method966(i + 128, l, j + 128))
						return false;
				}
				if(!method966(i, i1, j + 128))
					return false;
				return method966(i + 128, i1, j + 128);
			}
			if(arg3 == 4)
			{
				if(i < anInt1186)
				{
					if(!method966(i + 128, k, j))
						return false;
					if(!method966(i + 128, k, j + 128))
						return false;
				}
				if(arg0 > 0)
				{
					if(!method966(i + 128, l, j))
						return false;
					if(!method966(i + 128, l, j + 128))
						return false;
				}
				if(!method966(i + 128, i1, j))
					return false;
				return method966(i + 128, i1, j + 128);
			}
			if(arg3 == 8)
			{
				if(j > anInt1210)
				{
					if(!method966(i, k, j))
						return false;
					if(!method966(i + 128, k, j))
						return false;
				}
				if(arg0 > 0)
				{
					if(!method966(i, l, j))
						return false;
					if(!method966(i + 128, l, j))
						return false;
				}
				if(!method966(i, i1, j))
					return false;
				return method966(i + 128, i1, j);
			}
		}
		if(!method966(i + 64, j1, j + 64))
			return false;
		if(arg3 == 16)
			return method966(i, i1, j + 128);
		if(arg3 == 32)
			return method966(i + 128, i1, j + 128);
		if(arg3 == 64)
			return method966(i + 128, i1, j);
		if(arg3 == 128)
			return method966(i, i1, j);
		else
			return true;
	}

	public void method1013(int arg0, int arg1)
	{
		Class33_Sub21 class33_sub21 = aClass33_Sub21ArrayArrayArray1198[0][arg0][arg1];
		for(int i = 0; i < 3; i++)
		{
			Class33_Sub21 class33_sub21_1 = aClass33_Sub21ArrayArrayArray1198[i][arg0][arg1] = aClass33_Sub21ArrayArrayArray1198[i + 1][arg0][arg1];
			if(class33_sub21_1 != null)
			{
				class33_sub21_1.anInt2596--;
				for(int j = 0; j < class33_sub21_1.anInt2610; j++)
				{
					Class62 class62 = class33_sub21_1.aClass62Array2604[j];
					if((class62.anInt1318 >> 29 & 3) == 2 && class62.anInt1301 == arg0 && class62.anInt1314 == arg1)
						class62.anInt1303--;
				}

			}
		}

		if(aClass33_Sub21ArrayArrayArray1198[0][arg0][arg1] == null)
			aClass33_Sub21ArrayArrayArray1198[0][arg0][arg1] = new Class33_Sub21(0, arg0, arg1);
		aClass33_Sub21ArrayArrayArray1198[0][arg0][arg1].aClass33_Sub21_2597 = class33_sub21;
		aClass33_Sub21ArrayArrayArray1198[3][arg0][arg1] = null;
	}

	public Class56(int arg0, int arg1, int arg2, int arg3[][][])
	{
		anInt1177 = 0;
		anInt1196 = 0;
		aClass62Array1213 = new Class62[5000];
		anInt1180 = arg0;
		anInt1182 = arg1;
		anInt1189 = arg2;
		aClass33_Sub21ArrayArrayArray1198 = new Class33_Sub21[arg0][arg1][arg2];
		anIntArrayArrayArray1183 = new int[arg0][arg1 + 1][arg2 + 1];
		anIntArrayArrayArray1202 = arg3;
		method995();
	}

	public void method1014(int arg0, int arg1, int arg2, int arg3, Class33_Sub6_Sub4 arg4, Class33_Sub6_Sub4 arg5, int arg6, 
			int arg7, int arg8, int arg9)
	{
		if(arg4 == null && arg5 == null)
			return;
		Class66 class66 = new Class66();
		class66.anInt1408 = arg8;
		class66.anInt1401 = arg9;
		class66.anInt1418 = arg1 * 128 + 64;
		class66.anInt1410 = arg2 * 128 + 64;
		class66.anInt1425 = arg3;
		class66.aClass33_Sub6_Sub4_1416 = arg4;
		class66.aClass33_Sub6_Sub4_1406 = arg5;
		class66.anInt1403 = arg6;
		class66.anInt1413 = arg7;
		for(int i = arg0; i >= 0; i--)
			if(aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] == null)
				aClass33_Sub21ArrayArrayArray1198[i][arg1][arg2] = new Class33_Sub21(i, arg1, arg2);

		aClass33_Sub21ArrayArrayArray1198[arg0][arg1][arg2].aClass66_2608 = class66;
	}

	public static boolean method1015(int arg0, int arg1, int arg2)
	{
		int i = arg2 * anInt1195 + arg0 * anInt1187 >> 16;
		int j = arg2 * anInt1187 - arg0 * anInt1195 >> 16;
		int k = arg1 * anInt1185 + j * anInt1179 >> 16;
		int l = arg1 * anInt1179 - j * anInt1185 >> 16;
		if(k < 50 || k > 3500)
			return false;
		int i1 = anInt1223 + (i << 9) / k;
		int j1 = anInt1231 + (l << 9) / k;
		return i1 >= anInt1222 && i1 <= anInt1229 && j1 >= anInt1227 && j1 <= anInt1228;
	}

	public int anInt1177;
	public static int anInt1178 = 0;
	public static int anInt1179;
	public int anInt1180;
	public static int anInt1181;
	public int anInt1182;
	public int anIntArrayArrayArray1183[][][];
	public static int anInt1184;
	public static int anInt1185;
	public static int anInt1186;
	public static int anInt1187;
	public static boolean aBoolean1188 = true;
	public int anInt1189;
	public static int anInt1190;
	public static boolean aBoolean1191 = false;
	public static int anIntArray1192[] = {
		-53, -53, 53, 53
	};
	public static int anIntArray1193[] = {
		-45, 45, 45, -45
	};
	public static int anInt1194 = 0;
	public static int anInt1195;
	public int anInt1196;
	public static int anInt1197 = 0;
	public Class33_Sub21 aClass33_Sub21ArrayArrayArray1198[][][];
	public static Class29 aClass29Array1199[] = new Class29[500];
	public static int anInt1200;
	public static int anInt1201;
	public int anIntArrayArrayArray1202[][][];
	public static int anInt1203 = 0;
	public static int anInt1204;
	public static int anInt1205 = 0;
	public static int anIntArray1206[] = {
		53, -53, -53, 53
	};
	public static int anInt1207 = -1;
	public static int anInt1208 = 0;
	public static int anIntArray1209[] = {
		45, 45, -45, -45
	};
	public static int anInt1210;
	public static int anInt1211;
	public static int anInt1212;
	public Class62 aClass62Array1213[];
	public static int anInt1214 = -1;
	public static int anInt1215;
	public static Class29 aClass29ArrayArray1216[][];
	public int anIntArrayArray1217[][] = {
		new int[16], {
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
			1, 1, 1, 1, 1, 1
		}, {
			1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 
			1, 0, 1, 1, 1, 1
		}, {
			1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 
			0, 0, 1, 0, 0, 0
		}, {
			0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 
			0, 1, 0, 0, 0, 1
		}, {
			0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 
			1, 1, 1, 1, 1, 1
		}, {
			1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 
			1, 1, 1, 1, 1, 1
		}, {
			1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 
			0, 0, 1, 1, 0, 0
		}, {
			0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 
			0, 0, 1, 1, 0, 0
		}, {
			1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 
			1, 1, 0, 0, 1, 1
		}, 
		{
			1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 
			0, 0, 1, 0, 0, 0
		}, {
			0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 
			1, 1, 0, 1, 1, 1
		}, {
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 
			1, 0, 1, 1, 1, 1
		}
	};
	public static int anIntArray1218[];
	public static Class4 aClass4_1219 = new Class4();
	public int anIntArrayArray1220[][] = {
		{
			0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
			10, 11, 12, 13, 14, 15
		}, {
			12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 
			6, 2, 15, 11, 7, 3
		}, {
			15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 
			5, 4, 3, 2, 1, 0
		}, {
			3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 
			9, 13, 0, 4, 8, 12
		}
	};
	public static Class62 aClass62Array1221[] = new Class62[100];
	public static int anInt1222;
	public static int anInt1223;
	public static boolean aBooleanArrayArrayArrayArray1224[][][][] = new boolean[8][32][51][51];
	public static int anIntArray1225[] = {
		76, 8, 137, 4, 0, 1, 38, 2, 19
	};
	public static int anIntArray1226[] = {
		0, 4, 4, 8, 0, 0, 8, 0, 0
	};
	public static int anInt1227;
	public static int anInt1228;
	public static int anInt1229;
	public static boolean aBooleanArrayArray1230[][];
	public static int anInt1231;
	public static int anIntArray1232[] = {
		0, 0, 2, 0, 0, 2, 1, 1, 0
	};
	public static int anIntArray1233[] = {
		19, 55, 38, 155, 255, 110, 137, 205, 76
	};
	public static int anIntArray1234[] = {
		2, 0, 0, 2, 0, 0, 0, 4, 4
	};
	public static int anIntArray1235[] = {
		160, 192, 80, 96, 0, 144, 80, 48, 160
	};
	public static int anIntArray1236[] = {
		1, 1, 0, 0, 0, 8, 0, 0, 8
	};

	static 
	{
		anInt1204 = 4;
		anIntArray1218 = new int[anInt1204];
		aClass29ArrayArray1216 = new Class29[anInt1204][500];
	}
}
