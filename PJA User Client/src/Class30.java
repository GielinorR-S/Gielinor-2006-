// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class30.java


public abstract class Class30
{

	public void method216(int arg0, byte arg1)
	{
		try
		{
			anInt628++;
			int i = 0;
			if(arg1 != -94)
				method224(null, false);
			for(; i < anObjectArrayArray655[arg0].length; i++)
				anObjectArrayArray655[arg0][i] = null;

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.R(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method217(int arg0)
	{
		try
		{
			if(arg0 >= -90)
				aBoolean634 = false;
			anInt643++;
			return anObjectArrayArray655.length;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.IA(" + arg0 + ')');
		}
	}

	public int method218(int arg0, boolean arg1)
	{
		try
		{
			anInt617++;
			if(arg1)
				method218(57, false);
			return anObjectArrayArray655[arg0].length;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.U(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method219(int arg0, byte arg1)
	{
		try
		{
			if(arg1 > -70)
			{
				return;
			} else
			{
				anInt672++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public byte[] method220(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt657++;
			if(~arg0 > -1 || ~arg0 <= ~anObjectArrayArray655.length || anObjectArrayArray655[arg0] == null || arg1 < 0 || arg1 >= anObjectArrayArray655[arg0].length)
				return null;
			if(anObjectArrayArray655[arg0][arg1] == null)
			{
				boolean flag = method240(7033, arg0, null);
				if(!flag)
				{
					method222(arg0, (byte)91);
					boolean flag1 = method240(arg2 + 32883, arg0, null);
					if(!flag1)
						return null;
				}
			}
			byte abyte0[] = Class80.method1204(-12653, false, anObjectArrayArray655[arg0][arg1]);
			if(arg2 != -25850)
				method236(47);
			return abyte0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.FA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public byte[] method221(int arg0, Class58 arg1, Class58 arg2)
	{
		try
		{
			anInt633++;
			if(arg0 != 5)
				aLong670 = 86L;
			arg2 = arg2.method1045(true);
			arg1 = arg1.method1045(true);
			int i = aClass11_614.method103((byte)20, arg2.method1054(true));
			int j = aClass11Array626[i].method103((byte)20, arg1.method1054(true));
			return method238(false, j, i);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.GA(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public void method222(int arg0, byte arg1)
	{
		try
		{
			if(arg1 != 91)
				anInt663 = -92;
			anInt644++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method223(byte arg0)
	{
		try
		{
			anInt637++;
			boolean flag = true;
			for(int i = 0; ~i > ~anIntArray646.length; i++)
			{
				int j = anIntArray646[i];
				if(anObjectArray664[j] == null)
				{
					method222(j, (byte)91);
					if(anObjectArray664[j] == null)
						flag = false;
				}
			}

			if(arg0 > -125)
				method217(94);
			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.W(" + arg0 + ')');
		}
	}

	public void method224(byte arg0[], boolean arg1)
	{
		anInt661 = client.method37(arg0, arg0.length, (byte)-112);
		anInt639++;
		Class33_Sub11 class33_sub11 = new Class33_Sub11(Class24.method189(arg0, -1));
		int i = class33_sub11.method639((byte)123);
		if(i != 5 && i != 6)
			throw new RuntimeException("Incorrect JS5 protocol number: " + i);
		if(i < 6)
			anInt663 = 0;
		else
			anInt663 = class33_sub11.method623((byte)32);
		if(arg1)
			method233((byte)92);
		int j = class33_sub11.method639((byte)123);
		anInt638 = class33_sub11.method666(114);
		int i1 = -1;
		int k = 0;
		anIntArray646 = new int[anInt638];
		for(int j1 = 0; anInt638 > j1; j1++)
		{
			anIntArray646[j1] = k += class33_sub11.method666(75);
			if(anIntArray646[j1] > i1)
				i1 = anIntArray646[j1];
		}

		anIntArrayArray662 = new int[1 + i1][];
		anObjectArrayArray655 = new Object[i1 - -1][];
		anIntArray616 = new int[1 + i1];
		anIntArray623 = new int[i1 + 1];
		anObjectArray664 = new Object[1 + i1];
		anIntArray636 = new int[1 + i1];
		if(~j != -1)
		{
			anIntArray651 = new int[i1 - -1];
			for(int k1 = 0; ~anInt638 < ~k1; k1++)
				anIntArray651[anIntArray646[k1]] = class33_sub11.method623((byte)-110);

			aClass11_614 = new Class11(anIntArray651);
		}
		for(int l1 = 0; ~l1 > ~anInt638; l1++)
			anIntArray636[anIntArray646[l1]] = class33_sub11.method623((byte)-121);

		for(int i2 = 0; anInt638 > i2; i2++)
			anIntArray616[anIntArray646[i2]] = class33_sub11.method623((byte)-99);

		for(int j2 = 0; anInt638 > j2; j2++)
			anIntArray623[anIntArray646[j2]] = class33_sub11.method666(44);

		for(int k2 = 0; anInt638 > k2; k2++)
		{
			int l = 0;
			int l2 = anIntArray646[k2];
			int l3 = -1;
			int j3 = anIntArray623[l2];
			anIntArrayArray662[l2] = new int[j3];
			for(int j4 = 0; ~j4 > ~j3; j4++)
			{
				int l4 = anIntArrayArray662[l2][j4] = l += class33_sub11.method666(50);
				if(~l3 > ~l4)
					l3 = l4;
			}

			anObjectArrayArray655[l2] = new Object[1 + l3];
		}

		if(j != 0)
		{
			aClass11Array626 = new Class11[1 + i1];
			anIntArrayArray621 = new int[i1 - -1][];
			for(int i3 = 0; ~i3 > ~anInt638; i3++)
			{
				int k3 = anIntArray646[i3];
				int i4 = anIntArray623[k3];
				anIntArrayArray621[k3] = new int[anObjectArrayArray655[k3].length];
				for(int k4 = 0; ~k4 > ~i4; k4++)
					anIntArrayArray621[k3][anIntArrayArray662[k3][k4]] = class33_sub11.method623((byte)-110);

				aClass11Array626[k3] = new Class11(anIntArrayArray621[k3]);
			}

		}
	}

	public boolean method225(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt632++;
			if(arg0 < 0 || ~arg0 <= ~anObjectArrayArray655.length || anObjectArrayArray655[arg0] == null || arg2 < 0 || anObjectArrayArray655[arg0].length <= arg2)
				return false;
			if(anObjectArrayArray655[arg0][arg2] != null)
				return true;
			if(arg1 >= -69)
				aClass58_631 = null;
			if(anObjectArray664[arg0] != null)
				return true;
			method222(arg0, (byte)91);
			return anObjectArray664[arg0] != null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.HA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public boolean method226(int arg0, int arg1)
	{
		try
		{
			int i = 39 % ((78 - arg1) / 42);
			anInt630++;
			if(anObjectArray664[arg0] != null)
				return true;
			method222(arg0, (byte)91);
			return anObjectArray664[arg0] != null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.LA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method227(byte arg0, Class58 arg1)
	{
		try
		{
			anInt640++;
			if(arg0 < 0)
				aClass58_642 = null;
			arg1 = arg1.method1045(true);
			return aClass11_614.method103((byte)20, arg1.method1054(true));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.S(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method228(int arg0)
	{
		try
		{
			if(arg0 <= 55)
				return;
			anInt668++;
			if(Class21.anInt402 > 0)
			{
				Class11.method108(125);
				return;
			} else
			{
				Class29.method215(40, (byte)-47);
				Class33_Sub6_Sub8.aClass43_2814 = Class62.aClass43_1316;
				Class62.aClass43_1316 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.CA(" + arg0 + ')');
		}
	}

	public int method229(boolean arg0, int arg1, Class58 arg2)
	{
		try
		{
			anInt671++;
			arg2 = arg2.method1045(arg0);
			return aClass11Array626[arg1].method103((byte)20, arg2.method1054(true));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.MA(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public void method230(byte arg0, Class58 arg1)
	{
		arg1 = arg1.method1045(true);
		anInt659++;
		int i = aClass11_614.method103((byte)20, arg1.method1054(true));
		if(i < 0)
			return;
		method219(i, (byte)-113);
		if(arg0 != -124)
			aClass58_642 = null;
	}

	public byte[] method231(byte arg0, int arg1)
	{
		try
		{
			if(arg0 != -90)
				anInt661 = 76;
			anInt649++;
			if(anObjectArrayArray655.length == 1)
				return method220(0, arg1, -25850);
			if(anObjectArrayArray655[arg1].length == 1)
				return method220(arg1, 0, arg0 + -25760);
			else
				throw new RuntimeException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.JA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method232(Class58 arg0, int arg1, Class58 arg2)
	{
		try
		{
			anInt615++;
			if(arg1 != -31245)
				method226(4, -10);
			arg2 = arg2.method1045(true);
			arg0 = arg0.method1045(true);
			int i = aClass11_614.method103((byte)20, arg2.method1054(true));
			int j = aClass11Array626[i].method103((byte)20, arg0.method1054(true));
			return method225(i, -103, j);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.DA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method233(byte arg0)
	{
		try
		{
			anInt669++;
			while(Class39.method877((byte)-34)) 
				if(Class33_Sub6_Sub14.anInt3013 == -1 || ~Class12.anInt227 != ~Class33_Sub6_Sub14.anInt3013)
				{
					if(Class33_Sub10.aBoolean2208)
					{
						if(~Class49.anInt1073 == -86 && Class33_Sub13_Sub4.aClass58_3322.method1035(27) > 0)
						{
							Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3322.method1063(0, (byte)127, -1 + Class33_Sub13_Sub4.aClass58_3322.method1035(27));
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if(Class33_Sub6_Sub5.method407(-10320, Class41.anInt906) && Class33_Sub13_Sub4.aClass58_3322.method1035(27) < 80)
						{
							Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3322.method1039(Class41.anInt906, (byte)-120);
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if(Class49.anInt1073 == 84)
						{
							Class33_Sub10.aBoolean2208 = false;
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
							if(Class37.anInt834 == 1)
							{
								long l = Class33_Sub13_Sub4.aClass58_3322.method1062((byte)11);
								Class33_Sub6_Sub10.method521(l, false);
							}
							if(~Class37.anInt834 == -3 && Class33_Sub6_Sub12.anInt2979 > 0)
							{
								long l1 = Class33_Sub13_Sub4.aClass58_3322.method1062((byte)11);
								Applet_Sub1.method21(l1, true);
							}
							if(Class37.anInt834 == 3 && ~Class33_Sub13_Sub4.aClass58_3322.method1035(27) < -1)
							{
								Class46.aClass33_Sub11_Sub1_989.method683(59, -1198);
								Class46.aClass33_Sub11_Sub1_989.method640(0, -11124);
								Class33_Sub6_Sub9.anInt2844++;
								int i = ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239;
								Class46.aClass33_Sub11_Sub1_989.method675(Class33_Sub6_Sub4_Sub2.aLong3385, (byte)119);
								Class75.method1163(0, Class46.aClass33_Sub11_Sub1_989, Class33_Sub13_Sub4.aClass58_3322);
								Class46.aClass33_Sub11_Sub1_989.method638(-1, -i + ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239);
								if(~Class33.anInt727 == -3)
								{
									Class33.anInt727 = 1;
									Class15_Sub2.aBoolean1979 = true;
									Class33_Sub6_Sub15.anInt3048++;
									Class46.aClass33_Sub11_Sub1_989.method683(120, -1198);
									Class46.aClass33_Sub11_Sub1_989.method640(Class17.anInt350, -11124);
									Class46.aClass33_Sub11_Sub1_989.method640(Class33.anInt727, -11124);
									Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub6_Sub12.anInt2974, -11124);
								}
							}
							if(Class37.anInt834 == 4 && ~Class65.anInt1388 > -101)
							{
								long l2 = Class33_Sub13_Sub4.aClass58_3322.method1062((byte)11);
								Class63.method1081(l2, 124);
							}
							if(Class37.anInt834 == 5 && ~Class65.anInt1388 < -1)
							{
								long l3 = Class33_Sub13_Sub4.aClass58_3322.method1062((byte)11);
								Applet_Sub1.method19(1, l3);
							}
						}
					} else
					if(~Class33_Sub20.anInt2567 == -2)
					{
						if(Class49.anInt1073 == 85 && ~Class33_Sub13_Sub4.aClass58_3303.method1035(27) < -1)
						{
							Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1063(0, (byte)124, -1 + Class33_Sub13_Sub4.aClass58_3303.method1035(27));
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if(Class43.method905(5757, Class41.anInt906) && ~Class33_Sub13_Sub4.aClass58_3303.method1035(27) > -11)
						{
							Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1039(Class41.anInt906, (byte)-121);
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if(Class49.anInt1073 == 84)
						{
							if(Class33_Sub13_Sub4.aClass58_3303.method1035(27) > 0)
							{
								int j = 0;
								Class33_Sub16.anInt2486++;
								if(Class33_Sub13_Sub4.aClass58_3303.method1025(30350))
									j = Class33_Sub13_Sub4.aClass58_3303.method1032(122);
								Class46.aClass33_Sub11_Sub1_989.method683(35, -1198);
								Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
							}
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
							Class33_Sub20.anInt2567 = 0;
						}
					} else
					if(Class33_Sub20.anInt2567 != 2)
					{
						if(~Class33_Sub20.anInt2567 != -4)
						{
							if(Class33_Sub20.anInt2567 == 4)
							{
								if(~Class49.anInt1073 == -86 && Class33_Sub13_Sub4.aClass58_3303.method1035(27) > 0)
								{
									Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1063(0, (byte)121, -1 + Class33_Sub13_Sub4.aClass58_3303.method1035(27));
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
								}
								if((Class33_Sub6_Sub5.method407(-10320, Class41.anInt906) || Class41.anInt906 == 32) && Class33_Sub13_Sub4.aClass58_3303.method1035(27) < 80)
								{
									Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1039(Class41.anInt906, (byte)-26);
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
								}
								if(~Class49.anInt1073 == -85)
								{
									if(Class33_Sub13_Sub4.aClass58_3303.method1035(27) > 0)
									{
										Class46.aClass33_Sub11_Sub1_989.method683(106, -1198);
										Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub13_Sub4.aClass58_3303.method1035(27) - -1, -11124);
										Class46.aClass33_Sub11_Sub1_989.method632((byte)-73, Class33_Sub13_Sub4.aClass58_3303);
										Class22.anInt411++;
									}
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
									Class33_Sub20.anInt2567 = 0;
								}
							} else
							if(~Class45.anInt965 == 0 && ~Class70.anInt1496 == 0)
							{
								if(~Class33_Sub15.anInt2445 != -1 || Class33_Sub19.anInt2547 > 1)
									Class15_Sub2.method142(19);
								if(Class49.anInt1073 == 85 && ~Class33_Sub13_Sub4.aClass58_3316.method1035(27) < -1)
								{
									Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1063(0, (byte)125, -1 + Class33_Sub13_Sub4.aClass58_3316.method1035(27));
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
								}
								if(Class33_Sub6_Sub5.method407(-10320, Class41.anInt906) && ~Class33_Sub13_Sub4.aClass58_3316.method1035(27) > -81)
								{
									Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1039(Class41.anInt906, (byte)117);
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
								}
								if(~Class49.anInt1073 == -85 && Class33_Sub13_Sub4.aClass58_3316.method1035(27) > 0)
								{
									if(~Class33_Sub15.anInt2445 != -1 || Class33_Sub19.anInt2547 > 1)
									{
										Class44.aClass58Array962[Class77.anInt1646++] = Class33_Sub13_Sub4.aClass58_3316;
										Class33_Sub6_Sub4_Sub2.anInt3394 = -1;
										if(~Class77.anInt1646 <= -21)
											Class77.anInt1646 = 0;
									}
									if(Class33_Sub19.anInt2547 == 2)
									{
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class33_Sub2.aClass58_2033))
											System.gc();
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class73.aClass58_1561))
											method228(120);
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class57.aClass58_1240))
											Class33_Sub6_Sub4_Sub1.aBoolean3345 = true;
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class24.aClass58_512))
											Class33_Sub6_Sub4_Sub1.aBoolean3345 = false;
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class66.aClass58_1420))
										{
											for(int k = 0; k < 4; k++)
											{
												for(int j1 = 1; ~j1 > -104; j1++)
												{
													for(int k1 = 1; k1 < 103; k1++)
														Class51.aClass70Array1098[k].anIntArrayArray1499[j1][k1] = 0;

												}

											}

										}
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Applet_Sub1.aClass58_45) && ~Class33_Sub15.anInt2445 == -3)
											throw new RuntimeException();
										if(Class33_Sub13_Sub4.aClass58_3316.method1059(-1, Class33_Sub6_Sub4_Sub2.aClass58_3372))
											Class74.aBoolean1583 = true;
									}
									if(Class33_Sub13_Sub4.aClass58_3316.method1052(Class33_Sub4.aClass58_2072, -113))
									{
										Class33_Sub6_Sub4_Sub5_Sub1.anInt3773++;
										Class46.aClass33_Sub11_Sub1_989.method683(116, -1198);
										Class46.aClass33_Sub11_Sub1_989.method640(-1 + Class33_Sub13_Sub4.aClass58_3316.method1035(27), -11124);
										Class46.aClass33_Sub11_Sub1_989.method632((byte)-73, Class33_Sub13_Sub4.aClass58_3316.method1028(2, (byte)120));
									} else
									{
										Class33_Sub2.anInt2032++;
										Class58 class58 = Class33_Sub13_Sub4.aClass58_3316.method1045(true);
										byte byte0 = 0;
										byte byte1 = 0;
										if(!class58.method1052(Class36.aClass58_795, -117))
										{
											if(class58.method1052(Class33_Sub6_Sub5.aClass58_2779, -116))
											{
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub5.aClass58_2779.method1035(27), (byte)120);
												byte0 = 1;
											} else
											if(class58.method1052(Class33_Sub6_Sub4_Sub4.aClass58_3457, -72))
											{
												byte0 = 2;
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub4.aClass58_3457.method1035(27), (byte)120);
											} else
											if(class58.method1052(Class33_Sub6_Sub3.aClass58_2724, -101))
											{
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub3.aClass58_2724.method1035(27), (byte)120);
												byte0 = 3;
											} else
											if(!class58.method1052(Class39.aClass58_878, -112))
											{
												if(!class58.method1052(Class33_Sub6_Sub10.aClass58_2885, -108))
												{
													if(class58.method1052(Class74.aClass58_1570, -76))
													{
														Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class74.aClass58_1570.method1035(27), (byte)120);
														byte0 = 6;
													} else
													if(!class58.method1052(Class33_Sub6_Sub4_Sub4.aClass58_3490, -93))
													{
														if(class58.method1052(Class33_Sub6_Sub4.aClass58_2749, -61))
														{
															byte0 = 8;
															Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4.aClass58_2749.method1035(27), (byte)120);
														} else
														if(!class58.method1052(Class81.aClass58_1755, -80))
														{
															if(!class58.method1052(aClass58_677, -75))
															{
																if(class58.method1052(Class63.aClass58_1330, -118))
																{
																	Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class63.aClass58_1330.method1035(27), (byte)120);
																	byte0 = 11;
																} else
																if(~Class75.anInt1617 != -1)
																	if(class58.method1052(Class36.aClass58_794, -117))
																	{
																		byte0 = 0;
																		Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class36.aClass58_794.method1035(27), (byte)120);
																	} else
																	if(class58.method1052(Class33_Sub6_Sub5.aClass58_2780, -111))
																	{
																		byte0 = 1;
																		Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub5.aClass58_2780.method1035(27), (byte)120);
																	} else
																	if(class58.method1052(Class33_Sub6_Sub4_Sub4.aClass58_3474, -76))
																	{
																		byte0 = 2;
																		Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub4.aClass58_3474.method1035(27), (byte)120);
																	} else
																	if(class58.method1052(Class33_Sub6_Sub3.aClass58_2721, -100))
																	{
																		Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub3.aClass58_2721.method1035(27), (byte)120);
																		byte0 = 3;
																	} else
																	if(!class58.method1052(Class39.aClass58_865, -67))
																	{
																		if(!class58.method1052(Class33_Sub6_Sub10.aClass58_2883, -87))
																		{
																			if(class58.method1052(Class74.aClass58_1571, -90))
																			{
																				byte0 = 6;
																				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class74.aClass58_1571.method1035(27), (byte)120);
																			} else
																			if(class58.method1052(Class33_Sub6_Sub4_Sub4.aClass58_3482, -114))
																			{
																				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub4.aClass58_3482.method1035(27), (byte)120);
																				byte0 = 7;
																			} else
																			if(class58.method1052(Class33_Sub6_Sub4.aClass58_2750, -110))
																			{
																				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4.aClass58_2750.method1035(27), (byte)120);
																				byte0 = 8;
																			} else
																			if(class58.method1052(Class81.aClass58_1766, -119))
																			{
																				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class81.aClass58_1766.method1035(27), (byte)120);
																				byte0 = 9;
																			} else
																			if(!class58.method1052(aClass58_675, -83))
																			{
																				if(class58.method1052(Class63.aClass58_1333, -84))
																				{
																					byte0 = 11;
																					Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class63.aClass58_1333.method1035(27), (byte)120);
																				}
																			} else
																			{
																				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(aClass58_675.method1035(27), (byte)120);
																				byte0 = 10;
																			}
																		} else
																		{
																			byte0 = 5;
																			Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub10.aClass58_2883.method1035(27), (byte)120);
																		}
																	} else
																	{
																		Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class39.aClass58_865.method1035(27), (byte)120);
																		byte0 = 4;
																	}
															} else
															{
																Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(aClass58_677.method1035(27), (byte)120);
																byte0 = 10;
															}
														} else
														{
															byte0 = 9;
															Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class81.aClass58_1755.method1035(27), (byte)120);
														}
													} else
													{
														Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub4.aClass58_3490.method1035(27), (byte)120);
														byte0 = 7;
													}
												} else
												{
													Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub10.aClass58_2885.method1035(27), (byte)120);
													byte0 = 5;
												}
											} else
											{
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class39.aClass58_878.method1035(27), (byte)120);
												byte0 = 4;
											}
										} else
										{
											Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class36.aClass58_795.method1035(27), (byte)120);
											byte0 = 0;
										}
										class58 = Class33_Sub13_Sub4.aClass58_3316.method1045(true);
										if(class58.method1052(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3794, -69))
										{
											byte1 = 1;
											Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3794.method1035(27), (byte)120);
										} else
										if(!class58.method1052(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3783, -102))
										{
											if(class58.method1052(Class33_Sub7.aClass58_2161, -113))
											{
												byte1 = 3;
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub7.aClass58_2161.method1035(27), (byte)120);
											} else
											if(class58.method1052(Class78.aClass58_1660, -72))
											{
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class78.aClass58_1660.method1035(27), (byte)120);
												byte1 = 4;
											} else
											if(class58.method1052(aClass58_635, -84))
											{
												byte1 = 5;
												Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(aClass58_635.method1035(27), (byte)120);
											} else
											if(Class75.anInt1617 != 0)
												if(!class58.method1052(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3789, -116))
												{
													if(class58.method1052(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3784, -111))
													{
														byte1 = 2;
														Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3784.method1035(27), (byte)120);
													} else
													if(class58.method1052(Class33_Sub7.aClass58_2151, -91))
													{
														byte1 = 3;
														Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub7.aClass58_2151.method1035(27), (byte)120);
													} else
													if(!class58.method1052(Class78.aClass58_1662, -113))
													{
														if(class58.method1052(aClass58_653, -123))
														{
															Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(aClass58_653.method1035(27), (byte)120);
															byte1 = 5;
														}
													} else
													{
														byte1 = 4;
														Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class78.aClass58_1662.method1035(27), (byte)120);
													}
												} else
												{
													byte1 = 1;
													Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3789.method1035(27), (byte)120);
												}
										} else
										{
											Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3316.method1028(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3783.method1035(27), (byte)120);
											byte1 = 2;
										}
										Class46.aClass33_Sub11_Sub1_989.method683(36, -1198);
										Class46.aClass33_Sub11_Sub1_989.method640(0, -11124);
										int i2 = ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239;
										Class46.aClass33_Sub11_Sub1_989.method640(byte0, -11124);
										Class46.aClass33_Sub11_Sub1_989.method640(byte1, -11124);
										Class75.method1163(0, Class46.aClass33_Sub11_Sub1_989, Class33_Sub13_Sub4.aClass58_3316);
										Class46.aClass33_Sub11_Sub1_989.method638(-1, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239 - i2);
										if(Class17.anInt350 == 2)
										{
											Class15_Sub2.aBoolean1979 = true;
											Class17.anInt350 = 3;
											Class33_Sub6_Sub15.anInt3048++;
											Class46.aClass33_Sub11_Sub1_989.method683(120, -1198);
											Class46.aClass33_Sub11_Sub1_989.method640(Class17.anInt350, -11124);
											Class46.aClass33_Sub11_Sub1_989.method640(Class33.anInt727, -11124);
											Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub6_Sub12.anInt2974, -11124);
										}
									}
									Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
									Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3261;
								}
							}
						} else
						{
							if(Class49.anInt1073 == 85 && ~Class33_Sub13_Sub4.aClass58_3303.method1035(27) < -1)
							{
								Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1063(0, (byte)124, -1 + Class33_Sub13_Sub4.aClass58_3303.method1035(27));
								Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
							}
							if(Class33_Sub6_Sub5.method407(-10320, Class41.anInt906) && ~Class33_Sub13_Sub4.aClass58_3303.method1035(27) > -41)
							{
								Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1039(Class41.anInt906, (byte)-127);
								Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
							}
						}
					} else
					{
						if(Class49.anInt1073 == 85 && Class33_Sub13_Sub4.aClass58_3303.method1035(27) > 0)
						{
							Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1063(0, (byte)125, Class33_Sub13_Sub4.aClass58_3303.method1035(27) - 1);
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if((Class15_Sub2.method140(-16687, Class41.anInt906) || ~Class41.anInt906 == -33) && Class33_Sub13_Sub4.aClass58_3303.method1035(27) < 12)
						{
							Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3303.method1039(Class41.anInt906, (byte)-127);
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
						if(~Class49.anInt1073 == -85)
						{
							if(~Class33_Sub13_Sub4.aClass58_3303.method1035(27) < -1)
							{
								Class46.aClass33_Sub11_Sub1_989.method683(216, -1198);
								Class46.aClass33_Sub11_Sub1_989.method675(Class33_Sub13_Sub4.aClass58_3303.method1062((byte)11), (byte)123);
								Class33_Sub6_Sub4_Sub6.anInt3604++;
							}
							Class33_Sub20.anInt2567 = 0;
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						}
					}
				} else
				{
					if(~Class49.anInt1073 == -86 && ~Class33_Sub13_Sub4.aClass58_3294.method1035(27) < -1)
						Class33_Sub13_Sub4.aClass58_3294 = Class33_Sub13_Sub4.aClass58_3294.method1063(0, (byte)124, -1 + Class33_Sub13_Sub4.aClass58_3294.method1035(27));
					if((Class15_Sub2.method140(-16687, Class41.anInt906) || Class41.anInt906 == 32) && Class33_Sub13_Sub4.aClass58_3294.method1035(27) < 12)
						Class33_Sub13_Sub4.aClass58_3294 = Class33_Sub13_Sub4.aClass58_3294.method1039(Class41.anInt906, (byte)116);
				}
			int i1 = 68 / ((-22 - arg0) / 53);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.KA(" + arg0 + ')');
		}
	}

	public static void method234(boolean arg0)
	{
		try
		{
			aClass58_650 = null;
			aClass58_635 = null;
			aClass58_619 = null;
			anIntArrayArrayArray645 = null;
			aClass58_653 = null;
			aClass58_622 = null;
			if(arg0)
				aClass58_622 = null;
			aClass58_656 = null;
			aClass58_627 = null;
			aClass58_631 = null;
			aClass58_677 = null;
			aClass58_675 = null;
			aClass30_Sub1_674 = null;
			aClass58_648 = null;
			aClass33_Sub6_Sub7_Sub4_658 = null;
			aClass58_624 = null;
			aClass58_667 = null;
			aClass4_613 = null;
			aClass58_660 = null;
			aClass58_642 = null;
			aClass58_676 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.AA(" + arg0 + ')');
		}
	}

	public byte[] method235(byte arg0, int arg1)
	{
		try
		{
			anInt618++;
			if(~anObjectArrayArray655.length == -2)
				return method238(false, arg1, 0);
			if(~anObjectArrayArray655[arg1].length == -2)
				return method238(false, 0, arg1);
			if(arg0 != 26)
				anApplet_Sub1_629 = null;
			throw new RuntimeException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.O(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method236(int arg0)
	{
		try
		{
			for(int i = 0; ~i > ~anObjectArrayArray655.length; i++)
				if(anObjectArrayArray655[i] != null)
				{
					for(int j = 0; j < anObjectArrayArray655[i].length; j++)
						anObjectArrayArray655[i][j] = null;

				}

			if(arg0 != -5239)
				method220(-108, 106, -28);
			anInt666++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.P(" + arg0 + ')');
		}
	}

	public int[] method237(int arg0, boolean arg1)
	{
		try
		{
			anInt647++;
			if(!arg1)
				method228(102);
			return anIntArrayArray662[arg0];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.V(" + arg0 + ',' + arg1 + ')');
		}
	}

	public byte[] method238(boolean arg0, int arg1, int arg2)
	{
		try
		{
			if(arg0)
				method223((byte)-91);
			anInt641++;
			return method239(0, null, arg2, arg1);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.BA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public byte[] method239(int arg0, int arg1[], int arg2, int arg3)
	{
		try
		{
			anInt612++;
			if(arg0 > arg2 || arg2 >= anObjectArrayArray655.length || anObjectArrayArray655[arg2] == null || arg3 < 0 || arg3 >= anObjectArrayArray655[arg2].length)
				return null;
			if(anObjectArrayArray655[arg2][arg3] == null)
			{
				boolean flag = method240(7033, arg2, arg1);
				if(!flag)
				{
					method222(arg2, (byte)91);
					boolean flag1 = method240(arg0 ^ 0x1b79, arg2, arg1);
					if(!flag1)
						return null;
				}
			}
			byte abyte0[] = Class80.method1204(-12653, false, anObjectArrayArray655[arg2][arg3]);
			if(aBoolean634)
				anObjectArrayArray655[arg2][arg3] = null;
			return abyte0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.Q(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public Class30(boolean arg0, boolean arg1)
	{
		try
		{
			aBoolean625 = arg0;
			aBoolean634 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.<init>(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method240(int arg0, int arg1, int arg2[])
	{
		try
		{
			if(arg0 != 7033)
				return false;
			anInt652++;
			if(anObjectArray664[arg1] == null)
				return false;
			int i = anIntArray623[arg1];
			int ai[] = anIntArrayArray662[arg1];
			Object aobj[] = anObjectArrayArray655[arg1];
			boolean flag = true;
			for(int j = 0; ~j > ~i; j++)
			{
				if(aobj[ai[j]] != null)
					continue;
				flag = false;
				break;
			}

			if(flag)
				return true;
			byte abyte0[];
			if(arg2 == null || ~arg2[0] == -1 && ~arg2[1] == -1 && ~arg2[2] == -1 && arg2[3] == 0)
			{
				abyte0 = Class80.method1204(-12653, false, anObjectArray664[arg1]);
			} else
			{
				abyte0 = Class80.method1204(arg0 ^ 0xffffd5ea, true, anObjectArray664[arg1]);
				Class33_Sub11 class33_sub11 = new Class33_Sub11(abyte0);
				class33_sub11.method650(arg2, class33_sub11.aByteArray2296.length, (byte)-111, 5);
			}
			byte abyte1[];
			try
			{
				abyte1 = Class24.method189(abyte0, -1);
			}
			catch(RuntimeException runtimeexception1)
			{
				throw Class33.method263(runtimeexception1, "T3 - " + (arg2 != null) + "," + arg1 + "," + abyte0.length + "," + client.method37(abyte0, abyte0.length, (byte)-99) + "," + client.method37(abyte0, abyte0.length + -2, (byte)110) + "," + anIntArray636[arg1] + "," + anInt661);
			}
			if(aBoolean625)
				anObjectArray664[arg1] = null;
			if(~i < -2)
			{
				int k = abyte1.length;
				int l = 0xff & abyte1[--k];
				Class33_Sub11 class33_sub11_1 = new Class33_Sub11(abyte1);
				k -= l * (i * 4);
				int ai1[] = new int[i];
				class33_sub11_1.anInt2239 = k;
				for(int i1 = 0; ~i1 > ~l; i1++)
				{
					int j1 = 0;
					for(int k1 = 0; ~i < ~k1; k1++)
					{
						j1 += class33_sub11_1.method623((byte)117);
						ai1[k1] += j1;
					}

				}

				byte abyte2[][] = new byte[i][];
				for(int l1 = 0; i > l1; l1++)
				{
					abyte2[l1] = new byte[ai1[l1]];
					ai1[l1] = 0;
				}

				class33_sub11_1.anInt2239 = k;
				int i2 = 0;
				for(int j2 = 0; ~l < ~j2; j2++)
				{
					int k2 = 0;
					for(int i3 = 0; ~i3 > ~i; i3++)
					{
						k2 += class33_sub11_1.method623((byte)-104);
						Class53.method955(abyte1, i2, abyte2[i3], ai1[i3], k2);
						i2 += k2;
						ai1[i3] += k2;
					}

				}

				for(int l2 = 0; ~i < ~l2; l2++)
					if(!aBoolean634)
						aobj[ai[l2]] = Class81.method1214(abyte2[l2], false, (byte)110);
					else
						aobj[ai[l2]] = abyte2[l2];

			} else
			if(aBoolean634)
				aobj[ai[0]] = abyte1;
			else
				aobj[ai[0]] = Class81.method1214(abyte1, false, (byte)-96);
			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jb.EA(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt612;
	public static Class4 aClass4_613 = new Class4();
	public Class11 aClass11_614;
	public static int anInt615;
	public int anIntArray616[];
	public static int anInt617;
	public static int anInt618;
	public static Class58 aClass58_619;
	public static int anInt620 = 3;
	public int anIntArrayArray621[][];
	public static Class58 aClass58_622;
	public int anIntArray623[];
	public static Class58 aClass58_624 = Class33_Sub6_Sub11.method535(121, "va");
	public boolean aBoolean625;
	public Class11 aClass11Array626[];
	public static Class58 aClass58_627 = Class33_Sub6_Sub11.method535(121, "Duell akzeptieren");
	public static int anInt628;
	public static Applet_Sub1 anApplet_Sub1_629 = null;
	public static int anInt630;
	public static Class58 aClass58_631 = Class33_Sub6_Sub11.method535(123, "Verbindung abgebrochen)3");
	public static int anInt632;
	public static int anInt633;
	public boolean aBoolean634;
	public static Class58 aClass58_635;
	public int anIntArray636[];
	public static int anInt637;
	public int anInt638;
	public static int anInt639;
	public static int anInt640;
	public static int anInt641;
	public static Class58 aClass58_642;
	public static int anInt643;
	public static int anInt644;
	public static int anIntArrayArrayArray645[][][] = new int[4][105][105];
	public int anIntArray646[];
	public static int anInt647;
	public static Class58 aClass58_648 = Class33_Sub6_Sub11.method535(107, "RuneScape wurde aktualisiert(Q");
	public static int anInt649;
	public static Class58 aClass58_650 = Class33_Sub6_Sub11.method535(99, "gelb:");
	public int anIntArray651[];
	public static int anInt652;
	public static Class58 aClass58_653;
	public static int anInt654;
	public Object anObjectArrayArray655[][];
	public static Class58 aClass58_656;
	public static int anInt657;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_658;
	public static int anInt659;
	public static Class58 aClass58_660;
	public int anInt661;
	public int anIntArrayArray662[][];
	public int anInt663;
	public Object anObjectArray664[];
	public static int anInt665;
	public static int anInt666;
	public static Class58 aClass58_667 = Class33_Sub6_Sub11.method535(111, " )2> <col=ffff00>");
	public static int anInt668;
	public static int anInt669;
	public static long aLong670;
	public static int anInt671;
	public static int anInt672;
	public static int anInt673 = 0;
	public static Class30_Sub1 aClass30_Sub1_674;
	public static Class58 aClass58_675;
	public static Class58 aClass58_676;
	public static Class58 aClass58_677;

	static 
	{
		aClass58_619 = Class33_Sub6_Sub11.method535(101, "Try again in 60 secs)3)3)3");
		aClass58_656 = Class33_Sub6_Sub11.method535(114, "slide:");
		aClass58_660 = aClass58_619;
		aClass58_622 = Class33_Sub6_Sub11.method535(100, "Loaded wordpack");
		aClass58_635 = aClass58_656;
		aClass58_653 = aClass58_656;
		aClass58_642 = aClass58_622;
		aClass58_676 = Class33_Sub6_Sub11.method535(127, "glow2:");
		aClass58_675 = aClass58_676;
		aClass58_677 = aClass58_676;
	}
}
