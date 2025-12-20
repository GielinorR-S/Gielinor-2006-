// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class69.java

import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;

public class Class69
{

	public static void method1111(int arg0)
	{
		try
		{
			anInt1465++;
			boolean flag = true;
			Class82.method1217(0, false);
			Class33_Sub6_Sub2.anInt2697 = 0;
			int i = 0;
			if(arg0 != -7213)
				method1114(null, -62, null);
			for(; Class33_Sub6_Sub4.aByteArrayArray2747.length > i; i++)
			{
				if(~Class33_Sub16.anIntArray2474[i] != 0 && Class33_Sub6_Sub4.aByteArrayArray2747[i] == null)
				{
					Class33_Sub6_Sub4.aByteArrayArray2747[i] = aClass30_Sub1_1469.method238(false, 0, Class33_Sub16.anIntArray2474[i]);
					if(Class33_Sub6_Sub4.aByteArrayArray2747[i] == null)
					{
						Class33_Sub6_Sub2.anInt2697++;
						flag = false;
					}
				}
				if(~Class24.anIntArray501[i] != 0 && Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[i] == null)
				{
					Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[i] = aClass30_Sub1_1469.method239(0, Class33_Sub20.anIntArrayArray2578[i], Class24.anIntArray501[i], 0);
					if(Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[i] == null)
					{
						flag = false;
						Class33_Sub6_Sub2.anInt2697++;
					}
				}
			}

			if(!flag)
			{
				Class55.anInt1172 = 1;
				return;
			}
			Class33_Sub6_Sub14.anInt3040 = 0;
			flag = true;
			for(int j = 0; ~Class33_Sub6_Sub4.aByteArrayArray2747.length < ~j; j++)
			{
				byte abyte0[] = Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[j];
				if(abyte0 != null)
				{
					int l = (Class13.anIntArray263[j] >> 0x39b8d2e8) * 64 + -anInt1475;
					int j1 = -Class33_Sub2.anInt2036 + (Class13.anIntArray263[j] & 0xff) * 64;
					if(Class33_Sub6_Sub8.aBoolean2810)
					{
						l = 10;
						j1 = 10;
					}
					flag &= Class37.method868(arg0 + 7190, l, j1, abyte0);
				}
			}

			if(!flag)
			{
				Class55.anInt1172 = 2;
				return;
			}
			if(Class55.anInt1172 != 0)
				Class33_Sub11_Sub1.method677(Class36.aClass58_779, true, Class33_Sub7.aClass58_2171, arg0 + 7216);
			Class59.method1067(1);
			Class33_Sub6_Sub13.method553(-126);
			Class59.method1067(1);
			Class33_Sub2.aClass56_2035.method995();
			Class59.method1067(arg0 ^ 0xffffe3d2);
			System.gc();
			for(int k = 0; k < 4; k++)
				Class51.aClass70Array1098[k].method1127(18580);

			for(int i1 = 0; i1 < 4; i1++)
			{
				for(int k1 = 0; k1 < 104; k1++)
				{
					for(int i2 = 0; ~i2 > -105; i2++)
						Class35.aByteArrayArrayArray761[i1][k1][i2] = 0;

				}

			}

			Class59.method1067(1);
			Class33_Sub11.method674(true);
			int l1 = Class33_Sub6_Sub4.aByteArrayArray2747.length;
			Class33.method262(55);
			Class82.method1217(0, true);
			if(!Class33_Sub6_Sub8.aBoolean2810)
			{
				for(int j2 = 0; ~l1 < ~j2; j2++)
				{
					int i3 = (Class13.anIntArray263[j2] >> 0xf1a60bc8) * 64 + -anInt1475;
					int j4 = (Class13.anIntArray263[j2] & 0xff) * 64 + -Class33_Sub2.anInt2036;
					byte abyte1[] = Class33_Sub6_Sub4.aByteArrayArray2747[j2];
					try {
					//	abyte1 = MapUtils.grabMap(Class33_Sub16.anIntArray2474[j2]);
					} catch(Exception e) {
						e.printStackTrace();
					}
					if(abyte1 != null)
					{
						Class59.method1067(1);
						Class33_Sub6_Sub2.method304(i3, 22335, abyte1, j4, Class51.aClass70Array1098, 8 * (Class44.anInt961 - 6), (-6 + Class33_Sub6_Sub4_Sub1.anInt3338) * 8);
					}
				}

				for(int j3 = 0; l1 > j3; j3++)
				{
					int j6 = -Class33_Sub2.anInt2036 + 64 * (Class13.anIntArray263[j3] & 0xff);
					byte abyte3[] = Class33_Sub6_Sub4.aByteArrayArray2747[j3];
					int k4 = -anInt1475 + 64 * (Class13.anIntArray263[j3] >> 0x1c775a48);
					if(abyte3 == null && ~Class44.anInt961 > -801)
					{
						Class59.method1067(1);
						Class33_Sub6_Sub4_Sub4.method355(k4, 64, (byte)81, 64, j6);
					}
				}

				Class82.method1217(0, true);
				for(int l4 = 0; ~l1 < ~l4; l4++)
				{
					byte abyte2[] = Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[l4];
					try {
						abyte2 = MapUtils.grabMap(Class24.anIntArray501[l4]);
					} catch(Exception e) {
						abyte2 = Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[l4];
						e.printStackTrace();
					}
					if (fileExists("./cache/.jagex_cache_32/maps/" + (Class24.anIntArray501[l4]) + ".dat")) {
						MapUtils.objectLoader("./cache/.jagex_cache_32/maps/" + (Class24.anIntArray501[l4]) + ".dat");
					} else if(abyte2 != null)
					{
						int j7 = -anInt1475 + 64 * (Class13.anIntArray263[l4] >> 0x96fe2308);
						int j8 = 64 * (0xff & Class13.anIntArray263[l4]) - Class33_Sub2.anInt2036;
						Class59.method1067(arg0 ^ 0xffffe3d2);
						Applet_Sub1.method33(j7, -21078, abyte2, Class33_Sub2.aClass56_2035, j8, Class51.aClass70Array1098);
					}
				}

			}
			if(Class33_Sub6_Sub8.aBoolean2810)
			{
				for(int k2 = 0; ~k2 > -5; k2++)
				{
					Class59.method1067(1);
					for(int k3 = 0; ~k3 > -14; k3++)
					{
						for(int i5 = 0; i5 < 13; i5++)
						{
							int k7 = Class79.anIntArrayArrayArray1713[k2][k3][i5];
							boolean flag1 = false;
							if(~k7 != 0)
							{
								int k8 = k7 >> 0x99881518 & 3;
								int j9 = 3 & k7 >> 0x62cf9dc1;
								int l10 = 0x7ff & k7 >> 0x864ad9a3;
								int i10 = k7 >> 0x5b6b17ee & 0x3ff;
								int j11 = l10 / 8 + (i10 / 8 << 0x2224ae48);
								for(int l11 = 0; Class13.anIntArray263.length > l11; l11++)
								{
									if(j11 != Class13.anIntArray263[l11] || Class33_Sub6_Sub4.aByteArrayArray2747[l11] == null)
										continue;
									flag1 = true;
									Class33_Sub9.method608(Class51.aClass70Array1098, 8 * (7 & i10), (l10 & 7) * 8, k3 * 8, 8 * i5, k2, true, k8, j9, Class33_Sub6_Sub4.aByteArrayArray2747[l11]);
									break;
								}

							}
							if(!flag1)
								Class57.method1023(-121, i5 * 8, k3 * 8, k2);
						}

					}

				}

				for(int l3 = 0; l3 < 13; l3++)
				{
					for(int j5 = 0; ~j5 > -14; j5++)
					{
						int k6 = Class79.anIntArrayArrayArray1713[0][l3][j5];
						if(k6 == -1)
							Class33_Sub6_Sub4_Sub4.method355(8 * l3, 8, (byte)106, 8, j5 * 8);
					}

				}

				Class82.method1217(0, true);
				for(int k5 = 0; k5 < 4; k5++)
				{
					Class59.method1067(1);
					for(int l6 = 0; ~l6 > -14; l6++)
					{
						for(int l7 = 0; ~l7 > -14; l7++)
						{
							int l8 = Class79.anIntArrayArrayArray1713[k5][l6][l7];
							if(~l8 != 0)
							{
								int k9 = 3 & l8 >> 0x340f0618;
								int j10 = (l8 & 7) >> 0x59bfddc1;
								int i11 = (l8 & 0xffed0f) >> 0xb037c86e;
								int k11 = l8 >> 0xe381ede3 & 0x7ff;
								int i12 = (i11 / 8 << 0x57ec9f88) + k11 / 8;
								for(int j12 = 0; ~j12 > ~Class13.anIntArray263.length; j12++)
								{
									if(Class13.anIntArray263[j12] != i12 || Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[j12] == null)
										continue;
									byte landscape[] = Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778[j12];
									try {
										landscape = MapUtils.grabMap(Class24.anIntArray501[j12]);
									} catch(Exception e) {
										e.printStackTrace();
									}
									Class17.method154(k5, l6 * 8, j10, (i11 & 7) * 8, (k11 & 7) * 8, arg0 + 7213, landscape, Class33_Sub2.aClass56_2035, l7 * 8, Class51.aClass70Array1098, k9);
									break;
								}

							}
						}

					}

				}

			}
			Class82.method1217(0, true);
			Class33_Sub6_Sub13.method553(-120);
			Class59.method1067(1);
			method1114(Class51.aClass70Array1098, arg0 ^ 0x7e04, Class33_Sub2.aClass56_2035);
			Class82.method1217(0, true);
			int l2 = Class33_Sub6_Sub4_Sub5_Sub1.anInt3761;
			if(Class77_Sub2.anInt2645 < l2)
				l2 = Class77_Sub2.anInt2645;
			if(~l2 > ~(Class77_Sub2.anInt2645 - 1))
				l2 = -1 + Class77_Sub2.anInt2645;
			if(Class33_Sub3.aBoolean2058)
				Class33_Sub2.aClass56_2035.method974(Class33_Sub6_Sub4_Sub5_Sub1.anInt3761);
			else
				Class33_Sub2.aClass56_2035.method974(0);
			for(int i4 = 0; i4 < 104; i4++)
			{
				for(int l5 = 0; ~l5 > -105; l5++)
					Class32.method260(1, l5, i4);

			}

			Class59.method1067(1);
			Class29.method213(23868);
			Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method147((byte)-54);
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
			{
				Class81.anInt1741++;
				Class46.aClass33_Sub11_Sub1_989.method683(97, -1198);
				Class46.aClass33_Sub11_Sub1_989.method669(0x3f008edd, arg0 ^ 0x6b1e);
			}
			if(!Class33_Sub6_Sub8.aBoolean2810)
			{
				int i6 = (Class33_Sub6_Sub4_Sub1.anInt3338 + -6) / 8;
				int i7 = (Class33_Sub6_Sub4_Sub1.anInt3338 - -6) / 8;
				int i9 = (Class44.anInt961 - -6) / 8;
				int i8 = (Class44.anInt961 + -6) / 8;
				for(int l9 = -1 + i6; ~l9 >= ~(i7 + 1); l9++)
				{
					for(int k10 = i8 + -1; ~(i9 - -1) <= ~k10; k10++)
						if(~i6 < ~l9 || i7 < l9 || ~k10 > ~i8 || ~k10 < ~i9)
						{
							aClass30_Sub1_1469.method230((byte)-124, Class35.method846((byte)-83, new Class58[] {
								client.aClass58_1944, Class37.method859(15591, l9), Class33_Sub15.aClass58_2370, Class37.method859(arg0 + 22804, k10)
							}));
							aClass30_Sub1_1469.method230((byte)-124, Class35.method846((byte)-83, new Class58[] {
								Class47.aClass58_1029, Class37.method859(arg0 + 22804, l9), Class33_Sub15.aClass58_2370, Class37.method859(15591, k10)
							}));
						}

				}

			}
			if(~Class70.anInt1496 == 0)
				Class29.method215(30, (byte)-47);
			else
				Class29.method215(35, (byte)-47);
			Class59.method1067(1);
			Class33_Sub11.method634(arg0 ^ 0x85a4d4f8);
			Class46.aClass33_Sub11_Sub1_989.method683(31, -1198);
			Class74.method1159(true);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.D(" + arg0 + ')');
		}
	}
	
	private static boolean fileExists(String dir) {
		File file = new File(dir);
		return file.exists();
	}

	public static boolean method1112(int arg0)
	{
		try
		{
			anInt1471++;
			if(arg0 != 13)
				method1111(59);
			long l = Class60.method1073(false);
			int i = (int)(-Class23.aLong476 + l);
			Class23.aLong476 = l;
			if(~i < -201)
				i = 200;
			Class63.anInt1351 += i;
			if(Class33_Sub6_Sub4_Sub5_Sub2.anInt3786 == 0 && Class58.anInt1922 == 0 && ~Class33_Sub6_Sub4_Sub5_Sub2.anInt3779 == -1 && Class33_Sub7.anInt2143 == 0)
				return true;
			if(Class63.aClass43_1336 == null)
				return false;
			try
			{
				if(Class63.anInt1351 > 30000)
					throw new IOException();
				for(; Class58.anInt1922 < 20 && Class33_Sub7.anInt2143 > 0; Class33_Sub7.anInt2143--)
				{
					Class33_Sub6_Sub2 class33_sub6_sub2 = (Class33_Sub6_Sub2)Class34.aClass82_1838.method1221(arg0 + -13);
					Class33_Sub11 class33_sub11 = new Class33_Sub11(4);
					class33_sub11.method640(1, -11124);
					class33_sub11.method637((int)((Class33) (class33_sub6_sub2)).aLong747, 990);
					Class63.aClass43_1336.method901((byte)42, class33_sub11.aByteArray2296, 4, 0);
					Class23.aClass82_429.method1218(class33_sub6_sub2, (byte)124, ((Class33) (class33_sub6_sub2)).aLong747);
					Class58.anInt1922++;
				}

				for(; Class33_Sub6_Sub4_Sub5_Sub2.anInt3786 < 20 && ~Class33_Sub6_Sub4_Sub5_Sub2.anInt3779 < -1; Class33_Sub6_Sub4_Sub5_Sub2.anInt3786++)
				{
					Class33_Sub6_Sub2 class33_sub6_sub2_1 = (Class33_Sub6_Sub2)Class80.aClass39_1727.method875((byte)47);
					Class33_Sub11 class33_sub11_1 = new Class33_Sub11(4);
					class33_sub11_1.method640(0, -11124);
					class33_sub11_1.method637((int)((Class33) (class33_sub6_sub2_1)).aLong747, 990);
					Class63.aClass43_1336.method901((byte)42, class33_sub11_1.aByteArray2296, 4, 0);
					class33_sub6_sub2_1.method289(arg0 + -123);
					Class19.aClass82_361.method1218(class33_sub6_sub2_1, (byte)30, ((Class33) (class33_sub6_sub2_1)).aLong747);
					Class33_Sub6_Sub4_Sub5_Sub2.anInt3779--;
				}

				for(int j = 0; j < 100; j++)
				{
					int k = Class63.aClass43_1336.method896(arg0 + -13);
					if(~k > -1)
						throw new IOException();
					if(k == 0)
						break;
					Class63.anInt1351 = 0;
					byte byte0 = 0;
					if(Class15_Sub2.aClass33_Sub6_Sub2_1977 == null)
						byte0 = 8;
					else
					if(Canvas_Sub1.anInt58 == 0)
						byte0 = 1;
					if(~byte0 < -1)
					{
						int i1 = byte0 + -Class77_Sub2.aClass33_Sub11_2637.anInt2239;
						if(i1 > k)
							i1 = k;
						Class63.aClass43_1336.method894(i1, Class77_Sub2.aClass33_Sub11_2637.anInt2239, (byte)122, Class77_Sub2.aClass33_Sub11_2637.aByteArray2296);
						if(Class33_Sub6_Sub4.aByte2745 != 0)
						{
							for(int k1 = 0; i1 > k1; k1++)
								Class77_Sub2.aClass33_Sub11_2637.aByteArray2296[k1 + Class77_Sub2.aClass33_Sub11_2637.anInt2239] = (byte)Class73.method1150(Class77_Sub2.aClass33_Sub11_2637.aByteArray2296[k1 + Class77_Sub2.aClass33_Sub11_2637.anInt2239], Class33_Sub6_Sub4.aByte2745);

						}
						Class77_Sub2.aClass33_Sub11_2637.anInt2239 += i1;
						if(~Class77_Sub2.aClass33_Sub11_2637.anInt2239 > ~byte0)
							break;
						if(Class15_Sub2.aClass33_Sub6_Sub2_1977 == null)
						{
							Class77_Sub2.aClass33_Sub11_2637.anInt2239 = 0;
							int l1 = Class77_Sub2.aClass33_Sub11_2637.method639((byte)123);
							int j2 = Class77_Sub2.aClass33_Sub11_2637.method666(121);
							long l4 = j2 + (l1 << 0xb37d8010);
							int j3 = Class77_Sub2.aClass33_Sub11_2637.method639((byte)123);
							int k3 = Class77_Sub2.aClass33_Sub11_2637.method623((byte)74);
							Class33_Sub6_Sub2 class33_sub6_sub2_2 = (Class33_Sub6_Sub2)Class23.aClass82_429.method1220(16, l4);
							Class39.aBoolean859 = true;
							if(class33_sub6_sub2_2 == null)
							{
								class33_sub6_sub2_2 = (Class33_Sub6_Sub2)Class19.aClass82_361.method1220(87, l4);
								Class39.aBoolean859 = false;
							}
							if(class33_sub6_sub2_2 == null)
								throw new IOException();
							byte byte1 = ((byte)(j3 != 0 ? 9 : 5));
							Class15_Sub2.aClass33_Sub6_Sub2_1977 = class33_sub6_sub2_2;
							Class77.aClass33_Sub11_1653 = new Class33_Sub11(Class15_Sub2.aClass33_Sub6_Sub2_1977.aByte2685 + (k3 + byte1));
							Class77.aClass33_Sub11_1653.method640(j3, arg0 ^ 0xffffd481);
							Class77.aClass33_Sub11_1653.method669(k3, arg0 ^ 0xffff88c0);
							Class77_Sub2.aClass33_Sub11_2637.anInt2239 = 0;
							Canvas_Sub1.anInt58 = 8;
						} else
						if(Canvas_Sub1.anInt58 == 0)
							if(~Class77_Sub2.aClass33_Sub11_2637.aByteArray2296[0] != 0)
							{
								Class15_Sub2.aClass33_Sub6_Sub2_1977 = null;
							} else
							{
								Canvas_Sub1.anInt58 = 1;
								Class77_Sub2.aClass33_Sub11_2637.anInt2239 = 0;
							}
						continue;
					}
					int j1 = -Class15_Sub2.aClass33_Sub6_Sub2_1977.aByte2685 + Class77.aClass33_Sub11_1653.aByteArray2296.length;
					int i2 = 512 + -Canvas_Sub1.anInt58;
					if(~i2 < ~(j1 - Class77.aClass33_Sub11_1653.anInt2239))
						i2 = -Class77.aClass33_Sub11_1653.anInt2239 + j1;
					if(k < i2)
						i2 = k;
					Class63.aClass43_1336.method894(i2, Class77.aClass33_Sub11_1653.anInt2239, (byte)124, Class77.aClass33_Sub11_1653.aByteArray2296);
					if(Class33_Sub6_Sub4.aByte2745 != 0)
					{
						for(int k2 = 0; k2 < i2; k2++)
							Class77.aClass33_Sub11_1653.aByteArray2296[k2 + Class77.aClass33_Sub11_1653.anInt2239] = (byte)Class73.method1150(Class77.aClass33_Sub11_1653.aByteArray2296[k2 + Class77.aClass33_Sub11_1653.anInt2239], Class33_Sub6_Sub4.aByte2745);

					}
					Class77.aClass33_Sub11_1653.anInt2239 += i2;
					Canvas_Sub1.anInt58 += i2;
					if(j1 != Class77.aClass33_Sub11_1653.anInt2239)
					{
						if(Canvas_Sub1.anInt58 != 512)
							break;
						Canvas_Sub1.anInt58 = 0;
					} else
					{
						if(~((Class33) (Class15_Sub2.aClass33_Sub6_Sub2_1977)).aLong747 != 0xffffffffff00ff00L)
						{
							Class33_Sub10.aCRC32_2202.reset();
							Class33_Sub10.aCRC32_2202.update(Class77.aClass33_Sub11_1653.aByteArray2296, 0, j1);
							int l2 = (int)Class33_Sub10.aCRC32_2202.getValue();
							if(Class15_Sub2.aClass33_Sub6_Sub2_1977.anInt2684 != l2)
							{
								try
								{
									Class63.aClass43_1336.method903(1);
								}
								catch(Exception _ex) { }
								Class11.anInt186++;
								Class63.aClass43_1336 = null;
								Class33_Sub6_Sub4.aByte2745 = (byte)(int)(Math.random() * 255D + 1.0D);
								return false;
							}
							Class11.anInt186 = 0;
							Class66.anInt1431 = 0;
							Class15_Sub2.aClass33_Sub6_Sub2_1977.aClass30_Sub1_2688.method250(~(((Class33) (Class15_Sub2.aClass33_Sub6_Sub2_1977)).aLong747 & 0xff0000L) == 0xffffffffff00ffffL, Class77.aClass33_Sub11_1653.aByteArray2296, Class39.aBoolean859, (int)(((Class33) (Class15_Sub2.aClass33_Sub6_Sub2_1977)).aLong747 & 65535L), 123);
						} else
						{
							Class33_Sub11.aClass33_Sub11_2264 = Class77.aClass33_Sub11_1653;
							for(int i3 = 0; i3 < 256; i3++)
							{
								Class30_Sub1 class30_sub1 = Class33_Sub11.aClass30_Sub1Array2237[i3];
								if(class30_sub1 != null)
								{
									Class33_Sub11.aClass33_Sub11_2264.anInt2239 = 5 + i3 * 8;
									int l3 = Class33_Sub11.aClass33_Sub11_2264.method623((byte)96);
									int i4 = Class33_Sub11.aClass33_Sub11_2264.method623((byte)83);
									class30_sub1.method251(-103, i4, l3);
								}
							}

						}
						Class15_Sub2.aClass33_Sub6_Sub2_1977.method266(-105);
						Class77.aClass33_Sub11_1653 = null;
						if(!Class39.aBoolean859)
							Class33_Sub6_Sub4_Sub5_Sub2.anInt3786--;
						else
							Class58.anInt1922--;
						Canvas_Sub1.anInt58 = 0;
						Class15_Sub2.aClass33_Sub6_Sub2_1977 = null;
					}
				}

				return true;
			}
			catch(IOException _ex) { }
			try
			{
				Class63.aClass43_1336.method903(1);
			}
			catch(Exception _ex) { }
			Class66.anInt1431++;
			Class63.aClass43_1336 = null;
			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.F(" + arg0 + ')');
		}
	}

	public static void method1113(Class30 arg0, int arg1, Class30 arg2)
	{
		try
		{
			Class41.aClass30_905 = arg0;
			anInt1473++;
			Class33_Sub13_Sub4.aClass30_3267 = arg2;
			if(arg1 != -105)
			{
				return;
			} else
			{
				Class19.anInt377 = Class33_Sub13_Sub4.aClass30_3267.method218(3, false);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.E(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1114(Class70 arg0[], int arg1, Class56 arg2)
	{
		try
		{
			anInt1466++;
			int i = 0;
			if(arg1 != -25129)
				aClass33_Sub6_Sub7_Sub4Array1476 = null;
			for(; i < 4; i++)
			{
				for(int j = 0; j < 104; j++)
				{
					for(int l = 0; ~l > -105; l++)
						if((Class35.aByteArrayArrayArray761[i][j][l] & 1) == 1)
						{
							int j1 = i;
							if(~(Class35.aByteArrayArrayArray761[1][j][l] & 2) == -3)
								j1--;
							if(j1 >= 0)
								arg0[j1].method1117(arg1 ^ 0xffdf9dd7, j, l);
						}

				}

			}

			Class12.anInt238 += (int)(Math.random() * 5D) + -2;
			Class12.anInt204 += (int)(5D * Math.random()) - 2;
			if(~Class12.anInt238 > 15)
				Class12.anInt238 = -16;
			if(~Class12.anInt238 < -17)
				Class12.anInt238 = 16;
			if(~Class12.anInt204 > 7)
				Class12.anInt204 = -8;
			if(Class12.anInt204 > 8)
				Class12.anInt204 = 8;
			for(int k = 0; k < 4; k++)
			{
				byte abyte0[][] = Class12.aByteArrayArrayArray239[k];
				int k1 = (int)Math.sqrt(5100D);
				int j2 = 768 * k1 >> 0x21d44f48;
				for(int l2 = 1; l2 < 103; l2++)
				{
					for(int j3 = 1; j3 < 103; j3++)
					{
						int i4 = Class30.anIntArrayArrayArray645[k][j3 + 1][l2] - Class30.anIntArrayArrayArray645[k][-1 + j3][l2];
						int l4 = -Class30.anIntArrayArrayArray645[k][j3][l2 - 1] + Class30.anIntArrayArrayArray645[k][j3][1 + l2];
						int l5 = (int)Math.sqrt(l4 * l4 + (0x10000 + i4 * i4));
						int i7 = (i4 << 0x4b9d3ac8) / l5;
						int l8 = 0x10000 / l5;
						int j10 = (l4 << 0xb6b15be8) / l5;
						int k11 = 96 - -((-50 * j10 + l8 * -10 + i7 * -50) / j2);
						int l12 = (abyte0[j3][-1 + l2] >> 0x180e8202) + ((abyte0[j3 + -1][l2] >> 0x314d142) - (-(abyte0[j3 + 1][l2] >> 0xd191f6c3) - (abyte0[j3][l2 + 1] >> 0x3c36b263) - (abyte0[j3][l2] >> 0x22f7eb41)));
						Class23.anIntArrayArray472[j3][l2] = -l12 + k11;
					}

				}

				for(int k3 = 0; ~k3 > -105; k3++)
				{
					Class33_Sub5.anIntArray2118[k3] = 0;
					Class33_Sub11.anIntArray2261[k3] = 0;
					Class16.anIntArray328[k3] = 0;
					Class21.anIntArray394[k3] = 0;
					Class33_Sub3.anIntArray2059[k3] = 0;
				}

				for(int j4 = -5; ~j4 > -110; j4++)
				{
					for(int i5 = 0; i5 < 104; i5++)
					{
						int i6 = j4 + 5;
						if(~i6 <= -1 && i6 < 104)
						{
							int j7 = 0xff & Canvas_Sub1.aByteArrayArrayArray57[k][i6][i5];
							if(~j7 < -1)
							{
								Class33_Sub6_Sub3 class33_sub6_sub3 = Class33_Sub6_Sub13.method562((byte)118, j7 - 1);
								Class33_Sub5.anIntArray2118[i5] += class33_sub6_sub3.anInt2714;
								Class33_Sub11.anIntArray2261[i5] += class33_sub6_sub3.anInt2708;
								Class16.anIntArray328[i5] += class33_sub6_sub3.anInt2718;
								Class21.anIntArray394[i5] += class33_sub6_sub3.anInt2712;
								Class33_Sub3.anIntArray2059[i5]++;
							}
						}
						int k7 = -5 + j4;
						if(~k7 <= -1 && ~k7 > -105)
						{
							int i9 = 0xff & Canvas_Sub1.aByteArrayArrayArray57[k][k7][i5];
							if(i9 > 0)
							{
								Class33_Sub6_Sub3 class33_sub6_sub3_1 = Class33_Sub6_Sub13.method562((byte)118, -1 + i9);
								Class33_Sub5.anIntArray2118[i5] -= class33_sub6_sub3_1.anInt2714;
								Class33_Sub11.anIntArray2261[i5] -= class33_sub6_sub3_1.anInt2708;
								Class16.anIntArray328[i5] -= class33_sub6_sub3_1.anInt2718;
								Class21.anIntArray394[i5] -= class33_sub6_sub3_1.anInt2712;
								Class33_Sub3.anIntArray2059[i5]--;
							}
						}
					}

					if(j4 >= 1 && ~j4 > -104)
					{
						int l7 = 0;
						int j6 = 0;
						int j9 = 0;
						int k10 = 0;
						int l11 = 0;
						for(int i13 = -5; ~i13 > -110; i13++)
						{
							int k15 = i13 - -5;
							int i16 = i13 - 5;
							if(k15 >= 0 && ~k15 > -105)
							{
								k10 += Class21.anIntArray394[k15];
								j6 += Class33_Sub5.anIntArray2118[k15];
								l7 += Class33_Sub11.anIntArray2261[k15];
								l11 += Class33_Sub3.anIntArray2059[k15];
								j9 += Class16.anIntArray328[k15];
							}
							if(i16 >= 0 && i16 < 104)
							{
								j6 -= Class33_Sub5.anIntArray2118[i16];
								k10 -= Class21.anIntArray394[i16];
								l7 -= Class33_Sub11.anIntArray2261[i16];
								l11 -= Class33_Sub3.anIntArray2059[i16];
								j9 -= Class16.anIntArray328[i16];
							}
							if(i13 >= 1 && i13 < 103 && (!Class33_Sub3.aBoolean2058 || ~(Class35.aByteArrayArrayArray761[0][j4][i13] & 2) != -1 || ~(0x10 & Class35.aByteArrayArrayArray761[k][j4][i13]) == -1 && ~Class57.method1019(k, (byte)33, j4, i13) == ~Class32.anInt709))
							{
								if(Class33_Sub6_Sub4_Sub5_Sub1.anInt3761 > k)
									Class33_Sub6_Sub4_Sub5_Sub1.anInt3761 = k;
								int i17 = 0xff & Canvas_Sub1.aByteArrayArrayArray57[k][j4][i13];
								int l17 = Class78.aByteArrayArrayArray1676[k][j4][i13] & 0xff;
								if(i17 > 0 || ~l17 < -1)
								{
									int k19 = Class30.anIntArrayArrayArray645[k][1 + j4][i13 - -1];
									int k18 = Class30.anIntArrayArrayArray645[k][j4][i13];
									int j19 = Class30.anIntArrayArrayArray645[k][j4 + 1][i13];
									int l19 = Class30.anIntArrayArrayArray645[k][j4][i13 + 1];
									int i20 = Class23.anIntArrayArray472[j4][i13];
									int j20 = Class23.anIntArrayArray472[1 + j4][i13];
									int k20 = Class23.anIntArrayArray472[j4 - -1][1 + i13];
									int l20 = Class23.anIntArrayArray472[j4][1 + i13];
									int i21 = -1;
									int j21 = -1;
									if(~i17 < -1)
									{
										int i22 = l7 / l11;
										int k21 = (256 * j6) / k10;
										int k22 = j9 / l11;
										i21 = Class33_Sub6_Sub17.method595(k22, k21, i22, (byte)-90);
										k22 += Class12.anInt238;
										if(~k22 > -1)
											k22 = 0;
										else
										if(k22 > 255)
											k22 = 255;
										k21 = k21 + Class12.anInt204 & 0xff;
										j21 = Class33_Sub6_Sub17.method595(k22, k21, i22, (byte)104);
									}
									if(k > 0)
									{
										boolean flag = true;
										if(i17 == 0 && ~RuntimeException_Sub1.aByteArrayArrayArray1812[k][j4][i13] != -1)
											flag = false;
										if(~l17 < -1 && !Class33.method264(l17 - 1, 4).aBoolean2972)
											flag = false;
										if(flag && j19 == k18 && ~k19 == ~k18 && l19 == k18)
											Class17.anIntArrayArrayArray351[k][j4][i13] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[k][j4][i13], 2340);
									}
									int l21 = 0;
									if(j21 != -1)
										l21 = Class33_Sub6_Sub7_Sub1.anIntArray3682[Class33_Sub6_Sub5.method410((byte)-112, 96, j21)];
									if(l17 != 0)
									{
										int j22 = RuntimeException_Sub1.aByteArrayArrayArray1812[k][j4][i13] + 1;
										byte byte0 = Class33_Sub9.aByteArrayArrayArray2180[k][j4][i13];
										Class33_Sub6_Sub12 class33_sub6_sub12 = Class33.method264(l17 - 1, 4);
										int l22 = class33_sub6_sub12.anInt2970;
										int i23;
										int j23;
										if(l22 >= 0)
										{
											j23 = Class33_Sub6_Sub7_Sub1.anInterface1_3680.method1(l22, (byte)-15);
											i23 = -1;
										} else
										if(class33_sub6_sub12.anInt2954 == 0xff00ff)
										{
											i23 = -2;
											j23 = -2;
											l22 = -1;
										} else
										{
											i23 = Class33_Sub6_Sub17.method595(class33_sub6_sub12.anInt2960, class33_sub6_sub12.anInt2978, class33_sub6_sub12.anInt2965, (byte)-99);
											int j24 = Class12.anInt238 + class33_sub6_sub12.anInt2960;
											int l23 = 0xff & Class12.anInt204 + class33_sub6_sub12.anInt2978;
											if(~j24 > -1)
												j24 = 0;
											else
											if(~j24 < -256)
												j24 = 255;
											j23 = Class33_Sub6_Sub17.method595(j24, l23, class33_sub6_sub12.anInt2965, (byte)100);
										}
										int i24 = 0;
										if(j23 != -2)
											i24 = Class33_Sub6_Sub7_Sub1.anIntArray3682[Class37.method862(7371, j23, 96)];
										if(~class33_sub6_sub12.anInt2958 != 0)
										{
											int k24 = class33_sub6_sub12.anInt2966 - -Class12.anInt204 & 0xff;
											int l24 = Class12.anInt238 + class33_sub6_sub12.anInt2950;
											if(~l24 > -1)
												l24 = 0;
											else
											if(l24 > 255)
												l24 = 255;
											int k23 = Class33_Sub6_Sub17.method595(l24, k24, class33_sub6_sub12.anInt2949, (byte)-111);
											i24 = Class33_Sub6_Sub7_Sub1.anIntArray3682[Class37.method862(7371, k23, 96)];
										}
										arg2.method1003(k, j4, i13, j22, byte0, l22, k18, j19, k19, l19, Class33_Sub6_Sub5.method410((byte)-118, i20, i21), Class33_Sub6_Sub5.method410((byte)-107, j20, i21), Class33_Sub6_Sub5.method410((byte)-122, k20, i21), Class33_Sub6_Sub5.method410((byte)-115, l20, i21), Class37.method862(7371, i23, i20), Class37.method862(7371, i23, j20), Class37.method862(7371, i23, k20), Class37.method862(7371, i23, l20), l21, i24);
									} else
									{
										arg2.method1003(k, j4, i13, 0, 0, -1, k18, j19, k19, l19, Class33_Sub6_Sub5.method410((byte)-97, i20, i21), Class33_Sub6_Sub5.method410((byte)-123, j20, i21), Class33_Sub6_Sub5.method410((byte)-105, k20, i21), Class33_Sub6_Sub5.method410((byte)-103, l20, i21), 0, 0, 0, 0, l21, 0);
									}
								}
							}
						}

					}
				}

				for(int j5 = 1; ~j5 > -104; j5++)
				{
					for(int k6 = 1; ~k6 > -104; k6++)
						arg2.method969(k, k6, j5, Class57.method1019(k, (byte)-96, k6, j5));

				}

				Canvas_Sub1.aByteArrayArrayArray57[k] = null;
				Class78.aByteArrayArrayArray1676[k] = null;
				RuntimeException_Sub1.aByteArrayArrayArray1812[k] = null;
				Class33_Sub9.aByteArrayArrayArray2180[k] = null;
				Class12.aByteArrayArrayArray239[k] = null;
			}

			arg2.method982(-50, -10, -50);
			for(int i1 = 0; ~i1 > -105; i1++)
			{
				for(int l1 = 0; ~l1 > -105; l1++)
					if((Class35.aByteArrayArrayArray761[1][i1][l1] & 2) == 2)
						arg2.method1013(i1, l1);

			}

			int i2 = 1;
			int k2 = 2;
			int i3 = 4;
			for(int l3 = 0; l3 < 4; l3++)
			{
				if(l3 > 0)
				{
					k2 <<= 3;
					i2 <<= 3;
					i3 <<= 3;
				}
				for(int k4 = 0; l3 >= k4; k4++)
				{
					for(int k5 = 0; ~k5 >= -105; k5++)
					{
						for(int l6 = 0; l6 <= 104; l6++)
						{
							if(~(Class17.anIntArrayArrayArray351[k4][l6][k5] & i2) != -1)
							{
								int i8 = k5;
								int l10 = k4;
								int k9;
								for(k9 = k5; k9 < 104 && (Class17.anIntArrayArrayArray351[k4][l6][1 + k9] & i2) != 0; k9++);
								for(; i8 > 0 && (i2 & Class17.anIntArrayArrayArray351[k4][l6][-1 + i8]) != 0; i8--);
								int i12 = k4;
label0:
								for(; ~l10 < -1; l10--)
								{
									for(int j13 = i8; ~j13 >= ~k9; j13++)
										if(~(i2 & Class17.anIntArrayArrayArray351[l10 + -1][l6][j13]) == -1)
											break label0;

								}

label1:
								for(; ~i12 > ~l3; i12++)
								{
									for(int k13 = i8; ~k9 <= ~k13; k13++)
										if((Class17.anIntArrayArrayArray351[i12 - -1][l6][k13] & i2) == 0)
											break label1;

								}

								int l13 = ((i12 + 1) - l10) * (1 + (-i8 + k9));
								if(~l13 <= -9)
								{
									char c = '\360';
									int j16 = -c + Class30.anIntArrayArrayArray645[i12][l6][i8];
									int j17 = Class30.anIntArrayArrayArray645[l10][l6][i8];
									Class56.method994(l3, 1, 128 * l6, l6 * 128, i8 * 128, 128 + k9 * 128, j16, j17);
									for(int i18 = l10; ~i18 >= ~i12; i18++)
									{
										for(int l18 = i8; k9 >= l18; l18++)
											Class17.anIntArrayArrayArray351[i18][l6][l18] = Class12.method110(Class17.anIntArrayArrayArray351[i18][l6][l18], ~i2);

									}

								}
							}
							if(~(k2 & Class17.anIntArrayArrayArray351[k4][l6][k5]) != -1)
							{
								int j8 = l6;
								int l9;
								for(l9 = l6; l9 < 104 && ~(k2 & Class17.anIntArrayArrayArray351[k4][l9 - -1][k5]) != -1; l9++);
								int i11 = k4;
								int j12 = k4;
								for(; j8 > 0 && ~(Class17.anIntArrayArrayArray351[k4][j8 - 1][k5] & k2) != -1; j8--);
label2:
								for(; i11 > 0; i11--)
								{
									for(int i14 = j8; i14 <= l9; i14++)
										if(~(k2 & Class17.anIntArrayArrayArray351[-1 + i11][i14][k5]) == -1)
											break label2;

								}

label3:
								for(; ~j12 > ~l3; j12++)
								{
									for(int j14 = j8; l9 >= j14; j14++)
										if(~(k2 & Class17.anIntArrayArrayArray351[j12 + 1][j14][k5]) == -1)
											break label3;

								}

								int k14 = (1 + l9 + -j8) * ((-i11 + j12) - -1);
								if(~k14 <= -9)
								{
									char c1 = '\360';
									int k16 = Class30.anIntArrayArrayArray645[j12][j8][k5] + -c1;
									int k17 = Class30.anIntArrayArrayArray645[i11][j8][k5];
									Class56.method994(l3, 2, 128 * j8, 128 + l9 * 128, k5 * 128, k5 * 128, k16, k17);
									for(int j18 = i11; ~j18 >= ~j12; j18++)
									{
										for(int i19 = j8; l9 >= i19; i19++)
											Class17.anIntArrayArrayArray351[j18][i19][k5] = Class12.method110(Class17.anIntArrayArrayArray351[j18][i19][k5], ~k2);

									}

								}
							}
							if((i3 & Class17.anIntArrayArrayArray351[k4][l6][k5]) != 0)
							{
								int j11 = k5;
								int i10 = l6;
								for(; j11 > 0 && (i3 & Class17.anIntArrayArrayArray351[k4][l6][j11 + -1]) != 0; j11--);
								int k12 = k5;
								int k8 = l6;
								for(; k12 < 104 && (i3 & Class17.anIntArrayArrayArray351[k4][l6][1 + k12]) != 0; k12++);
label4:
								for(; k8 > 0; k8--)
								{
									for(int l14 = j11; ~k12 <= ~l14; l14++)
										if((Class17.anIntArrayArrayArray351[k4][k8 + -1][l14] & i3) == 0)
											break label4;

								}

label5:
								for(; i10 < 104; i10++)
								{
									for(int i15 = j11; ~i15 >= ~k12; i15++)
										if(~(Class17.anIntArrayArrayArray351[k4][1 + i10][i15] & i3) == -1)
											break label5;

								}

								if(~((1 + -k8 + i10) * (1 + -j11 + k12)) <= -5)
								{
									int j15 = Class30.anIntArrayArrayArray645[k4][k8][j11];
									Class56.method994(l3, 4, 128 * k8, 128 * i10 - -128, j11 * 128, 128 + 128 * k12, j15, j15);
									for(int l15 = k8; ~i10 <= ~l15; l15++)
									{
										for(int l16 = j11; k12 >= l16; l16++)
											Class17.anIntArrayArrayArray351[k4][l15][l16] = Class12.method110(Class17.anIntArrayArrayArray351[k4][l15][l16], ~i3);

									}

								}
							}
						}

					}

				}

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static boolean method1115(int arg0, Class33_Sub15 arg1)
	{
		try
		{
			anInt1470++;
			int i = arg1.anInt2446;
			if(i >= 1 && ~i >= -201 || ~i <= -702 && ~i >= -901)
			{
				if(i >= 801)
					i -= 701;
				else
				if(i >= 701)
					i -= 601;
				else
				if(~i > -102)
					i--;
				else
					i -= 101;
				Class13.anInt266++;
				Class74.method1157(0, 13, Class35.method846((byte)-83, new Class58[] {
					Class33.aClass58_743, Class32.aClass58Array711[i]
				}), 0, Class47.aClass58_1039, true, 0);
				Class74.method1157(0, 11, Class35.method846((byte)-83, new Class58[] {
					Class33.aClass58_743, Class32.aClass58Array711[i]
				}), 0, Class45.aClass58_979, true, 0);
				Class24.anInt507++;
				return true;
			}
			if(i >= 401 && ~i >= -501)
			{
				Class74.method1157(0, 22, Class35.method846((byte)-83, new Class58[] {
					Class33.aClass58_743, arg1.aClass58_2428
				}), 0, Class47.aClass58_1039, true, 0);
				Class82.anInt1783++;
				return true;
			} else
			{
				int j = 113 % ((arg0 - -57) / 48);
				return false;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.C(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1116(int arg0)
	{
		try
		{
			aClass49_1477 = null;
			aClass33_Sub6_Sub7_Sub4_1479 = null;
			aClass33_Sub6_Sub7_Sub4Array1468 = null;
			aClass4_1463 = null;
			aClass58_1478 = null;
			aClass30_Sub1_1469 = null;
			aClass33_Sub6_Sub7_Sub4Array1476 = null;
			if(arg0 != 27250)
				aBoolean1480 = false;
			aClass16_1472 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tb.B(" + arg0 + ')');
		}
	}

	public static Class4 aClass4_1463 = new Class4();
	public static int anInt1464 = 0;
	public static int anInt1465;
	public static int anInt1466;
	public static int anInt1467;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1468[];
	public static Class30_Sub1 aClass30_Sub1_1469;
	public static int anInt1470;
	public static int anInt1471;
	public static Class16 aClass16_1472 = new Class16(64);
	public static int anInt1473;
	public static int anInt1474;
	public static int anInt1475;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1476[];
	public static Class49 aClass49_1477;
	public static Class58 aClass58_1478 = Class33_Sub6_Sub11.method535(107, "<)4col>");
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1479;
	public static boolean aBoolean1480 = true;

}
