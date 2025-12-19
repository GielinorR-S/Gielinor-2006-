// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class5.java


public class Class5
{

	public static void method71(int arg0[], int arg1[], int arg2[], byte arg3[], int arg4, int arg5, int arg6)
	{
		int i = 0;
		for(int j = arg4; j <= arg5; j++)
		{
			for(int i2 = 0; i2 < arg6; i2++)
				if(arg3[i2] == j)
				{
					arg2[i] = i2;
					i++;
				}

		}

		for(int k = 0; k < 23; k++)
			arg1[k] = 0;

		for(int l = 0; l < arg6; l++)
			arg1[arg3[l] + 1]++;

		for(int i1 = 1; i1 < 23; i1++)
			arg1[i1] += arg1[i1 - 1];

		for(int j1 = 0; j1 < 23; j1++)
			arg0[j1] = 0;

		int j2 = 0;
		for(int k1 = arg4; k1 <= arg5; k1++)
		{
			j2 += arg1[k1 + 1] - arg1[k1];
			arg0[k1] = j2 - 1;
			j2 <<= 1;
		}

		for(int l1 = arg4 + 1; l1 <= arg5; l1++)
			arg1[l1] = (arg0[l1 - 1] + 1 << 1) - arg1[l1];

	}

	public static void method72(Class75 arg0)
	{
		byte byte4 = arg0.aByte1616;
		int i = arg0.anInt1631;
		int j = arg0.anInt1618;
		int k = arg0.anInt1597;
		int ai[] = Class68.anIntArray1448;
		int l = arg0.anInt1601;
		byte abyte0[] = arg0.aByteArray1591;
		int i1 = arg0.anInt1599;
		int j1 = arg0.anInt1628;
		int k1 = j1;
		int l1 = arg0.anInt1603 + 1;
label0:
		do
		{
			if(i > 0)
			{
				do
				{
					if(j1 == 0)
						break label0;
					if(i == 1)
						break;
					abyte0[i1] = byte4;
					i--;
					i1++;
					j1--;
				} while(true);
				if(j1 == 0)
				{
					i = 1;
					break;
				}
				abyte0[i1] = byte4;
				i1++;
				j1--;
			}
			boolean flag = true;
			while(flag) 
			{
				flag = false;
				if(j == l1)
				{
					i = 0;
					break label0;
				}
				byte4 = (byte)k;
				l = ai[l];
				byte byte0 = (byte)(l & 0xff);
				l >>= 8;
				j++;
				if(byte0 != k)
				{
					k = byte0;
					if(j1 == 0)
					{
						i = 1;
					} else
					{
						abyte0[i1] = byte4;
						i1++;
						j1--;
						flag = true;
						continue;
					}
					break label0;
				}
				if(j != l1)
					continue;
				if(j1 == 0)
				{
					i = 1;
					break label0;
				}
				abyte0[i1] = byte4;
				i1++;
				j1--;
				flag = true;
			}
			i = 2;
			l = ai[l];
			byte byte1 = (byte)(l & 0xff);
			l >>= 8;
			if(++j != l1)
				if(byte1 != k)
				{
					k = byte1;
				} else
				{
					i = 3;
					l = ai[l];
					byte byte2 = (byte)(l & 0xff);
					l >>= 8;
					if(++j != l1)
						if(byte2 != k)
						{
							k = byte2;
						} else
						{
							l = ai[l];
							byte byte3 = (byte)(l & 0xff);
							l >>= 8;
							j++;
							i = (byte3 & 0xff) + 4;
							l = ai[l];
							k = (byte)(l & 0xff);
							l >>= 8;
							j++;
						}
				}
		} while(true);
		int i2 = arg0.anInt1624;
		arg0.anInt1624 += k1 - j1;
		arg0.aByte1616 = byte4;
		arg0.anInt1631 = i;
		arg0.anInt1618 = j;
		arg0.anInt1597 = k;
		Class68.anIntArray1448 = ai;
		arg0.anInt1601 = l;
		arg0.aByteArray1591 = abyte0;
		arg0.anInt1599 = i1;
		arg0.anInt1628 = j1;
	}

	public static byte method73(Class75 arg0)
	{
		return (byte)method78(1, arg0);
	}

	public static void method74(Class75 arg0)
	{
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		boolean flag7 = false;
		boolean flag8 = false;
		boolean flag9 = false;
		boolean flag10 = false;
		boolean flag11 = false;
		boolean flag12 = false;
		boolean flag13 = false;
		boolean flag14 = false;
		boolean flag15 = false;
		boolean flag16 = false;
		boolean flag17 = false;
		int j8 = 0;
		int ai[] = null;
		int ai1[] = null;
		int ai2[] = null;
		arg0.anInt1592 = 1;
		if(Class68.anIntArray1448 == null)
			Class68.anIntArray1448 = new int[arg0.anInt1592 * 0x186a0];
		boolean flag18 = true;
		while(flag18) 
		{
			byte byte0 = method77(arg0);
			if(byte0 == 23)
				return;
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method77(arg0);
			byte0 = method73(arg0);
			arg0.anInt1600 = 0;
			byte0 = method77(arg0);
			arg0.anInt1600 = arg0.anInt1600 << 8 | byte0 & 0xff;
			byte0 = method77(arg0);
			arg0.anInt1600 = arg0.anInt1600 << 8 | byte0 & 0xff;
			byte0 = method77(arg0);
			arg0.anInt1600 = arg0.anInt1600 << 8 | byte0 & 0xff;
			for(int j = 0; j < 16; j++)
			{
				byte byte1 = method73(arg0);
				if(byte1 == 1)
					arg0.aBooleanArray1612[j] = true;
				else
					arg0.aBooleanArray1612[j] = false;
			}

			for(int k = 0; k < 256; k++)
				arg0.aBooleanArray1605[k] = false;

			for(int l = 0; l < 16; l++)
				if(arg0.aBooleanArray1612[l])
				{
					for(int i3 = 0; i3 < 16; i3++)
					{
						byte byte2 = method73(arg0);
						if(byte2 == 1)
							arg0.aBooleanArray1605[l * 16 + i3] = true;
					}

				}

			method76(arg0);
			int i4 = arg0.anInt1589 + 2;
			int j4 = method78(3, arg0);
			int k4 = method78(15, arg0);
			for(int i1 = 0; i1 < k4; i1++)
			{
				int j3 = 0;
				do
				{
					byte byte3 = method73(arg0);
					if(byte3 == 0)
						break;
					j3++;
				} while(true);
				arg0.aByteArray1621[i1] = (byte)j3;
			}

			byte abyte0[] = new byte[6];
			for(byte byte16 = 0; byte16 < j4; byte16++)
				abyte0[byte16] = byte16;

			for(int j1 = 0; j1 < k4; j1++)
			{
				byte byte17 = arg0.aByteArray1621[j1];
				byte byte15 = abyte0[byte17];
				for(; byte17 > 0; byte17--)
					abyte0[byte17] = abyte0[byte17 - 1];

				abyte0[0] = byte15;
				arg0.aByteArray1606[j1] = byte15;
			}

			for(int k3 = 0; k3 < j4; k3++)
			{
				int k6 = method78(5, arg0);
				for(int k1 = 0; k1 < i4; k1++)
				{
					do
					{
						byte byte4 = method73(arg0);
						if(byte4 == 0)
							break;
						byte4 = method73(arg0);
						if(byte4 == 0)
							k6++;
						else
							k6--;
					} while(true);
					arg0.aByteArrayArray1593[k3][k1] = (byte)k6;
				}

			}

			for(int l3 = 0; l3 < j4; l3++)
			{
				byte byte8 = 32;
				int i = 0;
				for(int l1 = 0; l1 < i4; l1++)
				{
					if(arg0.aByteArrayArray1593[l3][l1] > i)
						i = arg0.aByteArrayArray1593[l3][l1];
					if(arg0.aByteArrayArray1593[l3][l1] < byte8)
						byte8 = arg0.aByteArrayArray1593[l3][l1];
				}

				method71(arg0.anIntArrayArray1629[l3], arg0.anIntArrayArray1602[l3], arg0.anIntArrayArray1627[l3], arg0.aByteArrayArray1593[l3], byte8, i, i4);
				arg0.anIntArray1615[l3] = byte8;
			}

			int l4 = arg0.anInt1589 + 1;
			int i5 = -1;
			int j5 = 0;
			for(int i2 = 0; i2 <= 255; i2++)
				arg0.anIntArray1619[i2] = 0;

			int i9 = 4095;
			for(int k8 = 15; k8 >= 0; k8--)
			{
				for(int l8 = 15; l8 >= 0; l8--)
				{
					arg0.aByteArray1625[i9] = (byte)(k8 * 16 + l8);
					i9--;
				}

				arg0.anIntArray1598[k8] = i9 + 1;
			}

			int l5 = 0;
			if(j5 == 0)
			{
				i5++;
				j5 = 50;
				byte byte12 = arg0.aByteArray1606[i5];
				j8 = arg0.anIntArray1615[byte12];
				ai = arg0.anIntArrayArray1629[byte12];
				ai2 = arg0.anIntArrayArray1627[byte12];
				ai1 = arg0.anIntArrayArray1602[byte12];
			}
			j5--;
			int l6 = j8;
			int k7;
			byte byte9;
			for(k7 = method78(l6, arg0); k7 > ai[l6]; k7 = k7 << 1 | byte9)
			{
				l6++;
				byte9 = method73(arg0);
			}

			for(int k5 = ai2[k7 - ai1[l6]]; k5 != l4;)
				if(k5 == 0 || k5 == 1)
				{
					int i6 = -1;
					int j6 = 1;
					do
					{
						if(k5 == 0)
							i6 += j6;
						else
						if(k5 == 1)
							i6 += 2 * j6;
						j6 *= 2;
						if(j5 == 0)
						{
							i5++;
							j5 = 50;
							byte byte13 = arg0.aByteArray1606[i5];
							j8 = arg0.anIntArray1615[byte13];
							ai = arg0.anIntArrayArray1629[byte13];
							ai2 = arg0.anIntArrayArray1627[byte13];
							ai1 = arg0.anIntArrayArray1602[byte13];
						}
						j5--;
						int i7 = j8;
						int l7;
						byte byte10;
						for(l7 = method78(i7, arg0); l7 > ai[i7]; l7 = l7 << 1 | byte10)
						{
							i7++;
							byte10 = method73(arg0);
						}

						k5 = ai2[l7 - ai1[i7]];
					} while(k5 == 0 || k5 == 1);
					i6++;
					byte byte5 = arg0.aByteArray1620[arg0.aByteArray1625[arg0.anIntArray1598[0]] & 0xff];
					arg0.anIntArray1619[byte5 & 0xff] += i6;
					for(; i6 > 0; i6--)
					{
						Class68.anIntArray1448[l5] = byte5 & 0xff;
						l5++;
					}

				} else
				{
					int i11 = k5 - 1;
					byte byte6;
					if(i11 < 16)
					{
						int i10 = arg0.anIntArray1598[0];
						byte6 = arg0.aByteArray1625[i10 + i11];
						for(; i11 > 3; i11 -= 4)
						{
							int j11 = i10 + i11;
							arg0.aByteArray1625[j11] = arg0.aByteArray1625[j11 - 1];
							arg0.aByteArray1625[j11 - 1] = arg0.aByteArray1625[j11 - 2];
							arg0.aByteArray1625[j11 - 2] = arg0.aByteArray1625[j11 - 3];
							arg0.aByteArray1625[j11 - 3] = arg0.aByteArray1625[j11 - 4];
						}

						for(; i11 > 0; i11--)
							arg0.aByteArray1625[i10 + i11] = arg0.aByteArray1625[(i10 + i11) - 1];

						arg0.aByteArray1625[i10] = byte6;
					} else
					{
						int k10 = i11 / 16;
						int l10 = i11 % 16;
						int j10 = arg0.anIntArray1598[k10] + l10;
						byte6 = arg0.aByteArray1625[j10];
						for(; j10 > arg0.anIntArray1598[k10]; j10--)
							arg0.aByteArray1625[j10] = arg0.aByteArray1625[j10 - 1];

						arg0.anIntArray1598[k10]++;
						for(; k10 > 0; k10--)
						{
							arg0.anIntArray1598[k10]--;
							arg0.aByteArray1625[arg0.anIntArray1598[k10]] = arg0.aByteArray1625[(arg0.anIntArray1598[k10 - 1] + 16) - 1];
						}

						arg0.anIntArray1598[0]--;
						arg0.aByteArray1625[arg0.anIntArray1598[0]] = byte6;
						if(arg0.anIntArray1598[0] == 0)
						{
							int l9 = 4095;
							for(int j9 = 15; j9 >= 0; j9--)
							{
								for(int k9 = 15; k9 >= 0; k9--)
								{
									arg0.aByteArray1625[l9] = arg0.aByteArray1625[arg0.anIntArray1598[j9] + k9];
									l9--;
								}

								arg0.anIntArray1598[j9] = l9 + 1;
							}

						}
					}
					arg0.anIntArray1619[arg0.aByteArray1620[byte6 & 0xff] & 0xff]++;
					Class68.anIntArray1448[l5] = arg0.aByteArray1620[byte6 & 0xff] & 0xff;
					l5++;
					if(j5 == 0)
					{
						i5++;
						j5 = 50;
						byte byte14 = arg0.aByteArray1606[i5];
						j8 = arg0.anIntArray1615[byte14];
						ai = arg0.anIntArrayArray1629[byte14];
						ai2 = arg0.anIntArrayArray1627[byte14];
						ai1 = arg0.anIntArrayArray1602[byte14];
					}
					j5--;
					int j7 = j8;
					int i8;
					byte byte11;
					for(i8 = method78(j7, arg0); i8 > ai[j7]; i8 = i8 << 1 | byte11)
					{
						j7++;
						byte11 = method73(arg0);
					}

					k5 = ai2[i8 - ai1[j7]];
				}

			arg0.anInt1631 = 0;
			arg0.aByte1616 = 0;
			arg0.anIntArray1609[0] = 0;
			for(int j2 = 1; j2 <= 256; j2++)
				arg0.anIntArray1609[j2] = arg0.anIntArray1619[j2 - 1];

			for(int k2 = 1; k2 <= 256; k2++)
				arg0.anIntArray1609[k2] += arg0.anIntArray1609[k2 - 1];

			for(int l2 = 0; l2 < l5; l2++)
			{
				byte byte7 = (byte)(Class68.anIntArray1448[l2] & 0xff);
				Class68.anIntArray1448[arg0.anIntArray1609[byte7 & 0xff]] |= l2 << 8;
				arg0.anIntArray1609[byte7 & 0xff]++;
			}

			arg0.anInt1601 = Class68.anIntArray1448[arg0.anInt1600] >> 8;
			arg0.anInt1618 = 0;
			arg0.anInt1601 = Class68.anIntArray1448[arg0.anInt1601];
			arg0.anInt1597 = (byte)(arg0.anInt1601 & 0xff);
			arg0.anInt1601 >>= 8;
			arg0.anInt1618++;
			arg0.anInt1603 = l5;
			method72(arg0);
			if(arg0.anInt1618 == arg0.anInt1603 + 1 && arg0.anInt1631 == 0)
				flag18 = true;
			else
				flag18 = false;
		}
	}

	public static int method75(byte arg0[], int arg1, byte arg2[], int arg3, int arg4)
	{
		synchronized(aClass75_147)
		{
			aClass75_147.aByteArray1633 = arg2;
			aClass75_147.anInt1613 = arg4;
			aClass75_147.aByteArray1591 = arg0;
			aClass75_147.anInt1599 = 0;
			aClass75_147.anInt1628 = arg1;
			aClass75_147.anInt1626 = 0;
			aClass75_147.anInt1607 = 0;
			aClass75_147.anInt1594 = 0;
			aClass75_147.anInt1624 = 0;
			method74(aClass75_147);
			arg1 -= aClass75_147.anInt1628;
			aClass75_147.aByteArray1633 = null;
			aClass75_147.aByteArray1591 = null;
			int i = arg1;
			return i;
		}
	}

	public static void method76(Class75 arg0)
	{
		arg0.anInt1589 = 0;
		for(int i = 0; i < 256; i++)
			if(arg0.aBooleanArray1605[i])
			{
				arg0.aByteArray1620[arg0.anInt1589] = (byte)i;
				arg0.anInt1589++;
			}

	}

	public static byte method77(Class75 arg0)
	{
		return (byte)method78(8, arg0);
	}

	public static int method78(int arg0, Class75 arg1)
	{
		int i;
		do
		{
			if(arg1.anInt1626 >= arg0)
			{
				int j = arg1.anInt1607 >> arg1.anInt1626 - arg0 & (1 << arg0) - 1;
				arg1.anInt1626 -= arg0;
				i = j;
				break;
			}
			arg1.anInt1607 = arg1.anInt1607 << 8 | arg1.aByteArray1633[arg1.anInt1613] & 0xff;
			arg1.anInt1626 += 8;
			arg1.anInt1613++;
			arg1.anInt1594++;
		} while(true);
		return i;
	}

	public static void method79()
	{
		aClass75_147 = null;
	}

	public static Class75 aClass75_147 = new Class75();

}
