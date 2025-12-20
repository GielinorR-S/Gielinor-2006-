// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub17.java


public class Class33_Sub6_Sub17 extends Class33_Sub6
{

	public boolean method590(int arg0)
	{
		try
		{
			anInt3135++;
			if(anIntArray3169 == null)
				return ~anInt3127 != 0 || anIntArray3150 != null;
			int i = 0;
			int j = -8 / ((arg0 - 6) / 62);
			for(; anIntArray3169.length > i; i++)
				if(anIntArray3169[i] != -1)
				{
					Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-92, anIntArray3169[i]);
					if(~class33_sub6_sub17.anInt3127 != 0 || class33_sub6_sub17.anIntArray3150 != null)
						return true;
				}

			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.L(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub17 method591(int arg0)
	{
		try
		{
			anInt3168++;
			int i = -1;
			if(~anInt3167 == 0)
			{
				if(~anInt3136 != 0)
					i = Class33_Sub5.anIntArray2120[anInt3136];
			} else
			{
				i = Class22.method179((byte)110, anInt3167);
			}
			if(arg0 != -16431)
				return null;
			if(i < 0 || i >= anIntArray3169.length || ~anIntArray3169[i] == 0)
				return null;
			else
				return Class33_Sub5.method285((byte)-97, anIntArray3169[i]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.C(" + arg0 + ')');
		}
	}

	public void method592(Class33_Sub11 arg0, int arg1)
	{
		anInt3157++;
		do
		{
			int i = arg0.method639((byte)123);
			if(~i == -1)
				break;
			method601(i, (byte)-72, arg0);
		} while(true);
		if(arg1 <= 91)
			aClass16_3140 = null;
	}

	public static void method593(int arg0, long arg1)
	{
		try
		{
			anInt3161++;
			if(~arg1 >= -1L)
				return;
			if((long)arg0 == arg1 % 10L)
			{
				Class33_Sub6_Sub5.method406((byte)-97, -1L + arg1);
				Class33_Sub6_Sub5.method406((byte)-86, 1L);
				return;
			} else
			{
				Class33_Sub6_Sub5.method406((byte)-114, arg1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method594(int arg0, int arg1, int arg2)
	{
		try
		{
			if(arg2 != 0x7c1ca9b0)
				aClass58_3173 = null;
			anInt3152++;
			long l = (arg0 << 0x7c1ca9b0) - -arg1;
			Class33_Sub6_Sub2 class33_sub6_sub2 = (Class33_Sub6_Sub2)Class33_Sub12.aClass82_2324.method1220(12, l);
			if(class33_sub6_sub2 == null)
			{
				return;
			} else
			{
				Class80.aClass39_1727.method878(117, class33_sub6_sub2);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.O(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static int method595(int arg0, int arg1, int arg2, byte arg3)
	{
		try
		{
			int i = -26 % ((arg3 - -29) / 56);
			anInt3158++;
			if(~arg0 < -180)
				arg2 /= 2;
			if(arg0 > 192)
				arg2 /= 2;
			if(~arg0 < -218)
				arg2 /= 2;
			if(~arg0 < -244)
				arg2 /= 2;
			int j = ((arg1 / 4 << 0x3a4babea) - -(arg2 / 32 << 0x8e584fc7)) + arg0 / 2;
			return j;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method596(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			anInt3154++;
			int i = 32 / ((arg0 - 63) / 51);
			long l;
			if(anIntArray3185 == null)
				l = arg2 + (anInt3123 << 0x8505148a);
			else
				l = arg2 + ((anInt3123 << 0xf4b1188a) + (arg5 << 0x993605c3));
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class33_Sub6_Sub5.aClass16_2766.method144(0, l);
			if(class33_sub6_sub4_sub3 == null)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = method598(24144, arg5, arg2);
				if(class33_sub6_sub4_sub7 == null)
					return null;
				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(anInt3170 + 64, 5 * anInt3171 + 768, -50, -10, -50);
				Class33_Sub6_Sub5.aClass16_2766.method145(l, (byte)-125, class33_sub6_sub4_sub3);
			}
			if(aBoolean3186)
				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub3.method328(arg3, arg6, arg1, arg4, true);
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public boolean method597(int arg0)
	{
		try
		{
			anInt3147++;
			if(anIntArray3131 == null)
				return true;
			boolean flag = true;
			if(arg0 > -66)
				return true;
			for(int i = 0; ~i > ~anIntArray3131.length; i++)
				flag &= Class37.aClass30_835.method225(anIntArray3131[i] & 0xffff, -74, 0);

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.I(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method598(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt3125++;
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = null;
			if(anIntArray3185 == null)
			{
				if(~arg1 != -11)
					return null;
				if(anIntArray3131 == null)
					return null;
				boolean flag = aBoolean3180 ^ (~arg2 < -4);
				int j = anIntArray3131.length;
				for(int l = 0; l < j; l++)
				{
					int j1 = anIntArray3131[l];
					if(flag)
						j1 += 0x10000;
					class33_sub6_sub4_sub7 = (Class33_Sub6_Sub4_Sub7)Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method144(arg0 ^ 0x5e50, j1);
					if(class33_sub6_sub4_sub7 == null)
					{
						class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class37.aClass30_835, j1 & 0xffff, 0);
						if(class33_sub6_sub4_sub7 == null)
							return null;
						if(flag)
							class33_sub6_sub4_sub7.method382();
						Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method145(j1, (byte)-125, class33_sub6_sub4_sub7);
					}
					if(j > 1)
						Class63.aClass33_Sub6_Sub4_Sub7Array1335[l] = class33_sub6_sub4_sub7;
				}

				if(~j < -2)
					class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(Class63.aClass33_Sub6_Sub4_Sub7Array1335, j);
			} else
			{
				int i = -1;
				for(int k = 0; anIntArray3185.length > k; k++)
				{
					if(~arg1 != ~anIntArray3185[k])
						continue;
					i = k;
					break;
				}

				if(~i == 0)
					return null;
				int i1 = anIntArray3131[i];
				boolean flag3 = aBoolean3180 ^ (arg2 > 3);
				if(flag3)
					i1 += 0x10000;
				class33_sub6_sub4_sub7 = (Class33_Sub6_Sub4_Sub7)Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method144(0, i1);
				if(class33_sub6_sub4_sub7 == null)
				{
					class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class37.aClass30_835, i1 & 0xffff, 0);
					if(class33_sub6_sub4_sub7 == null)
						return null;
					if(flag3)
						class33_sub6_sub4_sub7.method382();
					Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method145(i1, (byte)-118, class33_sub6_sub4_sub7);
				}
			}
			boolean flag1;
			if(~anInt3179 == -129 && ~anInt3121 == -129 && ~anInt3149 == -129)
				flag1 = false;
			else
				flag1 = true;
			boolean flag2;
			if(anInt3120 != 0 || ~anInt3141 != -1 || anInt3139 != 0)
				flag2 = true;
			else
				flag2 = false;
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = new Class33_Sub6_Sub4_Sub7(class33_sub6_sub4_sub7, ~arg2 == -1 && !flag1 && !flag2, aShortArray3176 == null, true);
			arg2 &= 3;
			if(arg2 == 1)
				class33_sub6_sub4_sub7_1.method388();
			else
			if(arg2 == 2)
				class33_sub6_sub4_sub7_1.method401();
			else
			if(~arg2 == -4)
				class33_sub6_sub4_sub7_1.method387();
			if(aShortArray3176 != null)
			{
				for(int k1 = 0; aShortArray3176.length > k1; k1++)
					class33_sub6_sub4_sub7_1.method389(aShortArray3176[k1], aShortArray3144[k1]);

			}
			if(flag1)
				class33_sub6_sub4_sub7_1.method384(anInt3179, anInt3121, anInt3149);
			if(arg0 != 24144)
				aClass58_3173 = null;
			if(flag2)
				class33_sub6_sub4_sub7_1.method393(anInt3120, anInt3141, anInt3139);
			return class33_sub6_sub4_sub7_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.M(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method599(boolean arg0)
	{
		try
		{
			aClass58_3132 = null;
			aClass58_3189 = null;
			aClass58_3151 = null;
			aClass58_3191 = null;
			aClass58_3122 = null;
			aClass16_3140 = null;
			aClass58_3137 = null;
			aClass58_3128 = null;
			aClass58_3173 = null;
			if(arg0)
				aClass58_3166 = null;
			aClass58Array3172 = null;
			aClass58_3166 = null;
			aClass58_3178 = null;
			aClass15_3124 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.K(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method600(Class33_Sub6_Sub14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			byte arg7, int arg8)
	{
		try
		{
			anInt3146++;
			long l;
			if(anIntArray3185 == null)
				l = (anInt3123 << 0xed0d8dea) - -arg3;
			else
				l = arg3 + (arg6 << 0x5aec5603) + (anInt3123 << 0xf81ee16a);
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class33_Sub6_Sub5.aClass16_2766.method144(arg7 + -9, l);
			if(class33_sub6_sub4_sub3 == null)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = method598(24144, arg6, arg3);
				if(class33_sub6_sub4_sub7 == null)
					return null;
				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(anInt3170 + 64, 5 * anInt3171 + 768, -50, -10, -50);
				Class33_Sub6_Sub5.aClass16_2766.method145(l, (byte)-108, class33_sub6_sub4_sub3);
			}
			if(arg0 == null && !aBoolean3186)
				return class33_sub6_sub4_sub3;
			if(arg0 == null)
				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub3.method333(true);
			else
				class33_sub6_sub4_sub3 = arg0.method568(false, arg8, class33_sub6_sub4_sub3, arg3);
			if(aBoolean3186)
				class33_sub6_sub4_sub3.method328(arg5, arg2, arg1, arg4, false);
			if(arg7 != 9)
				method594(-125, 75, -118);
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
		}
	}

	public void method601(int arg0, byte arg1, Class33_Sub11 arg2)
	{
		try
		{
			if(arg0 != 1)
			{
				if(arg0 != 2)
				{
					if(arg0 != 5)
					{
						if(arg0 == 14)
							anInt3181 = arg2.method639((byte)123);
						else
						if(arg0 == 15)
							anInt3165 = arg2.method639((byte)123);
						else
						if(~arg0 == -18)
						{
							anInt3159 = 0;
							aBoolean3184 = false;
						} else
						if(arg0 != 18)
						{
							if(arg0 != 19)
							{
								if(~arg0 == -22)
									aBoolean3186 = true;
								else
								if(arg0 == 22)
									aBoolean3183 = true;
								else
								if(arg0 == 23)
									aBoolean3188 = true;
								else
								if(arg0 != 24)
								{
									if(~arg0 != -28)
									{
										if(~arg0 != -29)
										{
											if(arg0 == 29)
												anInt3170 = arg2.method661((byte)-105);
											else
											if(arg0 == 39)
												anInt3171 = arg2.method661((byte)-121) * 5;
											else
											if(arg0 < 30 || ~arg0 <= -36)
											{
												if(~arg0 != -41)
												{
													if(~arg0 == -61)
														anInt3148 = arg2.method666(30);
													else
													if(arg0 == 62)
														aBoolean3180 = true;
													else
													if(~arg0 == -65)
														aBoolean3130 = false;
													else
													if(~arg0 == -66)
														anInt3179 = arg2.method666(117);
													else
													if(arg0 == 66)
														anInt3121 = arg2.method666(65);
													else
													if(~arg0 == -68)
														anInt3149 = arg2.method666(100);
													else
													if(~arg0 == -69)
														anInt3177 = arg2.method666(124);
													else
													if(arg0 == 69)
														anInt3162 = arg2.method639((byte)123);
													else
													if(~arg0 == -71)
														anInt3120 = arg2.method672(83);
													else
													if(~arg0 != -72)
													{
														if(~arg0 != -73)
														{
															if(arg0 != 73)
															{
																if(~arg0 == -75)
																	aBoolean3164 = true;
																else
																if(arg0 == 75)
																	anInt3134 = arg2.method639((byte)123);
																else
																if(arg0 == 77)
																{
																	anInt3167 = arg2.method666(105);
																	if(anInt3167 == 65535)
																		anInt3167 = -1;
																	anInt3136 = arg2.method666(79);
																	if(~anInt3136 == 0xffff0000)
																		anInt3136 = -1;
																	int i = arg2.method639((byte)123);
																	anIntArray3169 = new int[i - -1];
																	for(int k1 = 0; k1 <= i; k1++)
																	{
																		anIntArray3169[k1] = arg2.method666(85);
																		if(~anIntArray3169[k1] == 0xffff0000)
																			anIntArray3169[k1] = -1;
																	}

																} else
																if(~arg0 == -79)
																{
																	anInt3127 = arg2.method666(107);
																	anInt3142 = arg2.method639((byte)123);
																} else
																if(arg0 == 79)
																{
																	anInt3145 = arg2.method666(121);
																	anInt3126 = arg2.method666(127);
																	anInt3142 = arg2.method639((byte)123);
																	int j = arg2.method639((byte)123);
																	anIntArray3150 = new int[j];
																	for(int l1 = 0; ~j < ~l1; l1++)
																		anIntArray3150[l1] = arg2.method666(59);

																}
															} else
															{
																aBoolean3155 = true;
															}
														} else
														{
															anInt3139 = arg2.method672(115);
														}
													} else
													{
														anInt3141 = arg2.method672(125);
													}
												} else
												{
													int k = arg2.method639((byte)123);
													aShortArray3176 = new short[k];
													aShortArray3144 = new short[k];
													for(int i2 = 0; k > i2; i2++)
													{
														aShortArray3176[i2] = (short)arg2.method666(112);
														aShortArray3144[i2] = (short)arg2.method666(82);
													}

												}
											} else
											{
												aClass58Array3133[arg0 + -30] = arg2.method646(-119);
												if(aClass58Array3133[-30 + arg0].method1059(-1, Class17.aClass58_348))
													aClass58Array3133[arg0 - 30] = null;
											}
										} else
										{
											anInt3174 = arg2.method639((byte)123);
										}
									} else
									{
										anInt3159 = 1;
									}
								} else
								{
									anInt3160 = arg2.method666(55);
									if(anInt3160 == 65535)
										anInt3160 = -1;
								}
							} else
							{
								anInt3143 = arg2.method639((byte)123);
							}
						} else
						{
							aBoolean3184 = false;
						}
					} else
					{
						int l = arg2.method639((byte)123);
						if(l > 0)
							if(anIntArray3131 != null && !Class33_Sub6_Sub12.aBoolean2980)
							{
								arg2.anInt2239 += l * 2;
							} else
							{
								anIntArray3185 = null;
								anIntArray3131 = new int[l];
								for(int j2 = 0; ~l < ~j2; j2++)
									anIntArray3131[j2] = arg2.method666(105);

							}
					}
				} else
				{
					aClass58_3187 = arg2.method646(-125);
				}
			} else
			{
				int i1 = arg2.method639((byte)123);
				if(~i1 < -1)
					if(anIntArray3131 != null && !Class33_Sub6_Sub12.aBoolean2980)
					{
						arg2.anInt2239 += i1 * 3;
					} else
					{
						anIntArray3131 = new int[i1];
						anIntArray3185 = new int[i1];
						for(int k2 = 0; ~k2 > ~i1; k2++)
						{
							anIntArray3131[k2] = arg2.method666(60);
							anIntArray3185[k2] = arg2.method639((byte)123);
						}

					}
			}
			int j1 = 110 % ((16 - arg1) / 37);
			anInt3190++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.B(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public void method602(int arg0)
	{
		int i = -34 % ((arg0 - -68) / 58);
		if(anInt3143 == -1)
		{
			anInt3143 = 0;
			if(anIntArray3131 != null && (anIntArray3185 == null || anIntArray3185[0] == 10))
				anInt3143 = 1;
			for(int j = 0; ~j > -6; j++)
				if(aClass58Array3133[j] != null)
					anInt3143 = 1;

		}
		anInt3182++;
		if(anInt3134 == -1)
			anInt3134 = ~anInt3159 != -1 ? 1 : 0;
	}

	public boolean method603(byte arg0, int arg1)
	{
		try
		{
			if(arg0 >= -17)
				method598(123, 104, -117);
			anInt3156++;
			if(anIntArray3185 == null)
			{
				if(anIntArray3131 == null)
					return true;
				if(~arg1 != -11)
					return true;
				boolean flag = true;
				for(int j = 0; ~j > ~anIntArray3131.length; j++)
					flag &= Class37.aClass30_835.method225(anIntArray3131[j] & 0xffff, -99, 0);

				return flag;
			}
			for(int i = 0; anIntArray3185.length > i; i++)
				if(arg1 == anIntArray3185[i])
					return Class37.aClass30_835.method225(0xffff & anIntArray3131[i], -87, 0);

			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.J(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub4 method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			anInt3163++;
			long l;
			if(anIntArray3185 != null)
				l = (arg5 << 0x7c1a2f23) + ((anInt3123 << 0xc34eb6a) + arg2);
			else
				l = arg2 + (anInt3123 << 0x20af5d4a);
			Object obj = (Class33_Sub6_Sub4)Class22.aClass16_410.method144(arg0 ^ arg0, l);
			if(obj == null)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = method598(24144, arg5, arg2);
				if(class33_sub6_sub4_sub7 == null)
					return null;
				if(aBoolean3183)
				{
					class33_sub6_sub4_sub7.aShort3632 = (short)(5 * anInt3171 + 768);
					obj = class33_sub6_sub4_sub7;
					class33_sub6_sub4_sub7.aShort3642 = (short)(64 + anInt3170);
					class33_sub6_sub4_sub7.method397();
				} else
				{
					obj = class33_sub6_sub4_sub7.method385(64 - -anInt3170, 768 - -(anInt3171 * 5), -50, -10, -50);
				}
				Class22.aClass16_410.method145(l, (byte)-116, ((Class33_Sub6) (obj)));
			}
			if(aBoolean3183)
				obj = ((Class33_Sub6_Sub4_Sub7)obj).method392();
			if(aBoolean3186)
				if(obj instanceof Class33_Sub6_Sub4_Sub3)
					obj = ((Class33_Sub6_Sub4_Sub3)obj).method328(arg3, arg6, arg4, arg1, true);
				else
				if(obj instanceof Class33_Sub6_Sub4_Sub7)
					obj = ((Class33_Sub6_Sub4_Sub7)obj).method399(arg3, arg6, arg4, arg1, true);
			return ((Class33_Sub6_Sub4) (obj));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ve.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public Class33_Sub6_Sub17()
	{
		anInt3121 = 128;
		anInt3136 = -1;
		anInt3126 = 0;
		anInt3145 = 0;
		anInt3127 = -1;
		anInt3148 = -1;
		anInt3134 = -1;
		anInt3143 = -1;
		anInt3149 = 128;
		anInt3120 = 0;
		anInt3162 = 0;
		anInt3160 = -1;
		aBoolean3130 = true;
		anInt3170 = 0;
		aBoolean3155 = false;
		anInt3165 = 1;
		anInt3167 = -1;
		aClass58Array3133 = new Class58[5];
		anInt3174 = 16;
		anInt3139 = 0;
		anInt3177 = -1;
		anInt3141 = 0;
		aBoolean3164 = false;
		aClass58_3187 = Class33_Sub6_Sub12.aClass58_2964;
		anInt3171 = 0;
		anInt3142 = 0;
		anInt3179 = 128;
		anInt3181 = 1;
		aBoolean3184 = true;
		aBoolean3186 = false;
		aBoolean3180 = false;
		aBoolean3183 = false;
		anInt3159 = 2;
		aBoolean3188 = false;
	}

	public int anInt3120;
	public int anInt3121;
	public static Class58 aClass58_3122 = Class33_Sub6_Sub11.method535(104, " x ");
	public int anInt3123;
	public static Class15 aClass15_3124;
	public static int anInt3125;
	public int anInt3126;
	public int anInt3127;
	public static Class58 aClass58_3128 = Class33_Sub6_Sub11.method535(119, "headicons_hint");
	public static int anInt3129;
	public boolean aBoolean3130;
	public int anIntArray3131[];
	public static Class58 aClass58_3132;
	public Class58 aClass58Array3133[];
	public int anInt3134;
	public static int anInt3135;
	public int anInt3136;
	public static Class58 aClass58_3137 = Class33_Sub6_Sub11.method535(110, "Aus");
	public static int anInt3138;
	public int anInt3139;
	public static Class16 aClass16_3140 = new Class16(64);
	public int anInt3141;
	public int anInt3142;
	public int anInt3143;
	public short aShortArray3144[];
	public int anInt3145;
	public static int anInt3146;
	public static int anInt3147;
	public int anInt3148;
	public int anInt3149;
	public int anIntArray3150[];
	public static Class58 aClass58_3151 = Class33_Sub6_Sub11.method535(116, "Willkommen auf RuneScape");
	public static int anInt3152;
	public static int anInt3153;
	public static int anInt3154;
	public boolean aBoolean3155;
	public static int anInt3156;
	public static int anInt3157;
	public static int anInt3158;
	public int anInt3159;
	public int anInt3160;
	public static int anInt3161;
	public int anInt3162;
	public static int anInt3163;
	public boolean aBoolean3164;
	public int anInt3165;
	public static Class58 aClass58_3166 = Class33_Sub6_Sub11.method535(127, "Sie haben gerade eine andere Welt verlassen)3");
	public int anInt3167;
	public static int anInt3168;
	public int anIntArray3169[];
	public int anInt3170;
	public int anInt3171;
	public static Class58 aClass58Array3172[] = new Class58[100];
	public static Class58 aClass58_3173 = Class33_Sub6_Sub11.method535(101, "Welt");
	public int anInt3174;
	public static boolean aBoolean3175 = false;
	public short aShortArray3176[];
	public int anInt3177;
	public static Class58 aClass58_3178 = Class33_Sub6_Sub11.method535(114, "Benutzen Sie bitte eine andere Welt)3");
	public int anInt3179;
	public boolean aBoolean3180;
	public int anInt3181;
	public static int anInt3182;
	public boolean aBoolean3183;
	public boolean aBoolean3184;
	public int anIntArray3185[];
	public boolean aBoolean3186;
	public Class58 aClass58_3187;
	public boolean aBoolean3188;
	public static Class58 aClass58_3189 = Class33_Sub6_Sub11.method535(119, "Benutzen");
	public static int anInt3190;
	public static Class58 aClass58_3191;

	static 
	{
		aClass58_3191 = Class33_Sub6_Sub11.method535(107, "Enter name of friend to add to list");
		aClass58_3132 = aClass58_3191;
	}
}
