// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub16.java


public class Class33_Sub6_Sub16 extends Class33_Sub6
{

	public Class33_Sub6_Sub4_Sub7 method582(byte arg0)
	{
		try
		{
			anInt3099++;
			if(anIntArray3071 != null)
			{
				Class33_Sub6_Sub16 class33_sub6_sub16 = method586(80);
				if(class33_sub6_sub16 == null)
					return null;
				else
					return class33_sub6_sub16.method582((byte)-80);
			}
			if(anIntArray3108 == null)
				return null;
			boolean flag = false;
			for(int i = 0; anIntArray3108.length > i; i++)
				if(!Class24.aClass30_503.method225(anIntArray3108[i], -122, 0))
					flag = true;

			if(flag)
				return null;
			Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[anIntArray3108.length];
			for(int j = 0; ~j > ~anIntArray3108.length; j++)
				aclass33_sub6_sub4_sub7[j] = Class33_Sub6_Sub4_Sub7.method398(Class24.aClass30_503, anIntArray3108[j], 0);

			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7;
			if(~aclass33_sub6_sub4_sub7.length != -2)
				class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, aclass33_sub6_sub4_sub7.length);
			else
				class33_sub6_sub4_sub7 = aclass33_sub6_sub4_sub7[0];
			if(aShortArray3084 != null)
			{
				for(int k = 0; k < aShortArray3084.length; k++)
					class33_sub6_sub4_sub7.method389(aShortArray3084[k], aShortArray3100[k]);

			}
			int l = -7 / ((arg0 - -4) / 60);
			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.B(" + arg0 + ')');
		}
	}

	public void method583(Class33_Sub11 arg0, int arg1, int arg2)
	{
		if(arg1 != 1)
		{
			if(arg1 == 2)
				aClass58_3113 = arg0.method646(-109);
			else
			if(~arg1 == -13)
				anInt3107 = arg0.method639((byte)123);
			else
			if(~arg1 != -14)
			{
				if(arg1 == 14)
					anInt3106 = arg0.method666(103);
				else
				if(~arg1 != -16)
				{
					if(arg1 == 16)
						anInt3085 = arg0.method666(36);
					else
					if(~arg1 != -18)
					{
						if(arg1 >= 30 && ~arg1 > -36)
						{
							aClass58Array3101[arg1 - 30] = arg0.method646(arg2 + -11064);
							if(aClass58Array3101[arg1 - 30].method1059(-1, Class17.aClass58_348))
								aClass58Array3101[arg1 + -30] = null;
						} else
						if(~arg1 != -41)
						{
							if(~arg1 == -61)
							{
								int i = arg0.method639((byte)123);
								anIntArray3108 = new int[i];
								for(int i1 = 0; i1 < i; i1++)
									anIntArray3108[i1] = arg0.method666(Class73.method1150(arg2, 10934));

							} else
							if(~arg1 != -94)
							{
								if(~arg1 != -96)
								{
									if(arg1 != 97)
									{
										if(arg1 == 98)
											anInt3104 = arg0.method666(112);
										else
										if(~arg1 == -100)
											aBoolean3102 = true;
										else
										if(~arg1 != -101)
										{
											if(arg1 != 101)
											{
												if(arg1 != 102)
												{
													if(~arg1 == -104)
														anInt3078 = arg0.method666(66);
													else
													if(~arg1 != -107)
													{
														if(arg1 != 107)
														{
															if(arg1 == 109)
																aBoolean3114 = false;
														} else
														{
															aBoolean3070 = false;
														}
													} else
													{
														anInt3068 = arg0.method666(72);
														if(~anInt3068 == 0xffff0000)
															anInt3068 = -1;
														anInt3076 = arg0.method666(112);
														if(anInt3076 == 65535)
															anInt3076 = -1;
														int j = arg0.method639((byte)123);
														anIntArray3071 = new int[j - -1];
														for(int j1 = 0; ~j1 >= ~j; j1++)
														{
															anIntArray3071[j1] = arg0.method666(arg2 + -10908);
															if(~anIntArray3071[j1] == 0xffff0000)
																anIntArray3071[j1] = -1;
														}

													}
												} else
												{
													anInt3075 = arg0.method666(arg2 ^ 0x2ab3);
												}
											} else
											{
												anInt3117 = arg0.method661((byte)-102) * 5;
											}
										} else
										{
											anInt3081 = arg0.method661((byte)-110);
										}
									} else
									{
										anInt3096 = arg0.method666(127);
									}
								} else
								{
									anInt3091 = arg0.method666(123);
								}
							} else
							{
								aBoolean3083 = false;
							}
						} else
						{
							int k = arg0.method639((byte)123);
							aShortArray3100 = new short[k];
							aShortArray3084 = new short[k];
							for(int k1 = 0; k1 < k; k1++)
							{
								aShortArray3084[k1] = (short)arg0.method666(109);
								aShortArray3100[k1] = (short)arg0.method666(31);
							}

						}
					} else
					{
						anInt3106 = arg0.method666(arg2 + -10849);
						anInt3111 = arg0.method666(arg2 + -10829);
						anInt3090 = arg0.method666(88);
						anInt3073 = arg0.method666(66);
					}
				} else
				{
					anInt3105 = arg0.method666(88);
				}
			} else
			{
				anInt3098 = arg0.method666(54);
			}
		} else
		{
			int l = arg0.method639((byte)123);
			anIntArray3095 = new int[l];
			for(int l1 = 0; l1 < l; l1++)
				anIntArray3095[l1] = arg0.method666(50);

		}
		anInt3082++;
		if(arg2 != 10945)
			anInt3106 = 14;
	}

	public Class33_Sub6_Sub4_Sub3 method584(Class33_Sub6_Sub14 arg0, Class33_Sub6_Sub14 arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			anInt3088++;
			if(anIntArray3071 != null)
			{
				Class33_Sub6_Sub16 class33_sub6_sub16 = method586(-96);
				if(class33_sub6_sub16 == null)
					return null;
				else
					return class33_sub6_sub16.method584(arg0, arg1, 0, arg3, arg4);
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class30_Sub1.aClass16_1995.method144(arg2, anInt3118);
			if(class33_sub6_sub4_sub3 == null)
			{
				boolean flag = false;
				for(int i = 0; anIntArray3095.length > i; i++)
					if(!Class24.aClass30_503.method225(anIntArray3095[i], -92, 0))
						flag = true;

				if(flag)
					return null;
				Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[anIntArray3095.length];
				for(int j = 0; anIntArray3095.length > j; j++)
					aclass33_sub6_sub4_sub7[j] = Class33_Sub6_Sub4_Sub7.method398(Class24.aClass30_503, anIntArray3095[j], 0);

				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7;
				if(~aclass33_sub6_sub4_sub7.length != -2)
					class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, aclass33_sub6_sub4_sub7.length);
				else
					class33_sub6_sub4_sub7 = aclass33_sub6_sub4_sub7[0];
				if(aShortArray3084 != null)
				{
					for(int k = 0; ~aShortArray3084.length < ~k; k++)
						class33_sub6_sub4_sub7.method389(aShortArray3084[k], aShortArray3100[k]);

				}
				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(anInt3081 + 64, anInt3117 + 850, -30, -50, -30);
				Class30_Sub1.aClass16_1995.method145(anInt3118, (byte)-107, class33_sub6_sub4_sub3);
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1;
			if(arg0 == null || arg1 == null)
			{
				if(arg0 == null)
				{
					if(arg1 != null)
						class33_sub6_sub4_sub3_1 = arg1.method569(class33_sub6_sub4_sub3, arg3, (byte)-17);
					else
						class33_sub6_sub4_sub3_1 = class33_sub6_sub4_sub3.method333(true);
				} else
				{
					class33_sub6_sub4_sub3_1 = arg0.method569(class33_sub6_sub4_sub3, arg4, (byte)-17);
				}
			} else
			{
				class33_sub6_sub4_sub3_1 = arg0.method575(arg1, arg3, class33_sub6_sub4_sub3, 23214, arg4);
			}
			if(~anInt3096 != -129 || ~anInt3104 != -129)
				class33_sub6_sub4_sub3_1.method338(anInt3096, anInt3104, anInt3096);
			return class33_sub6_sub4_sub3_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.E(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public void method585(boolean arg0)
	{
		try
		{
			if(!arg0)
			{
				return;
			} else
			{
				anInt3069++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.F(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub16 method586(int arg0)
	{
		try
		{
			int i = 45 % ((arg0 - 9) / 42);
			anInt3110++;
			int j = -1;
			if(anInt3068 != -1)
				j = Class22.method179((byte)101, anInt3068);
			else
			if(~anInt3076 != 0)
				j = Class33_Sub5.anIntArray2120[anInt3076];
			if(j < 0 || ~j <= ~anIntArray3071.length || anIntArray3071[j] == -1)
				return null;
			else
				return Class46.method922(9, anIntArray3071[j]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.G(" + arg0 + ')');
		}
	}

	public static void method587(byte arg0)
	{
		try
		{
			aClass58_3072 = null;
			aClass15_3094 = null;
			aClass58_3115 = null;
			aClass30_Sub1_3092 = null;
			anIntArray3093 = null;
			aClass33_Sub6_Sub7_Sub4_3116 = null;
			aClass58_3087 = null;
			int i = -49 % ((arg0 - -4) / 37);
			aClass58_3119 = null;
			aClass58_3097 = null;
			aLongArray3103 = null;
			anIntArray3067 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.D(" + arg0 + ')');
		}
	}

	public void method588(Class33_Sub11 arg0, byte arg1)
	{
		try
		{
			while(true) 
			{
				int i = arg0.method639((byte)123);
				if(i == 0)
					break;
				method583(arg0, i, 10945);
			}
			if(arg1 > -61)
			{
				return;
			} else
			{
				anInt3079++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public boolean method589(int arg0)
	{
		try
		{
			anInt3109++;
			if(anIntArray3071 == null)
				return true;
			int i = -89 % ((-4 - arg0) / 52);
			int j = -1;
			if(~anInt3068 == 0)
			{
				if(anInt3076 != -1)
					j = Class33_Sub5.anIntArray2120[anInt3076];
			} else
			{
				j = Class22.method179((byte)119, anInt3068);
			}
			return j >= 0 && j < anIntArray3071.length && ~anIntArray3071[j] != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "tc.A(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub16()
	{
		anInt3073 = -1;
		aBoolean3083 = true;
		anInt3075 = -1;
		anInt3076 = -1;
		anInt3068 = -1;
		anInt3090 = -1;
		anInt3081 = 0;
		anInt3078 = 32;
		anInt3091 = -1;
		anInt3085 = -1;
		aClass58Array3101 = new Class58[5];
		aBoolean3070 = true;
		anInt3104 = 128;
		aBoolean3102 = false;
		aBoolean3114 = true;
		anInt3105 = -1;
		aClass58_3113 = Class34.aClass58_1851;
		anInt3096 = 128;
		anInt3107 = 1;
		anInt3117 = 0;
		anInt3098 = -1;
		anInt3111 = -1;
		anInt3106 = -1;
	}

	public static int anIntArray3067[];
	public int anInt3068;
	public static int anInt3069;
	public boolean aBoolean3070;
	public int anIntArray3071[];
	public static Class58 aClass58_3072 = Class33_Sub6_Sub11.method535(115, "Freunde)2Server)3)3)3");
	public int anInt3073;
	public static int anInt3074;
	public int anInt3075;
	public int anInt3076;
	public static int anInt3077 = -1;
	public int anInt3078;
	public static int anInt3079;
	public static int anInt3080;
	public int anInt3081;
	public static int anInt3082;
	public boolean aBoolean3083;
	public short aShortArray3084[];
	public int anInt3085;
	public static int anInt3086;
	public static Class58 aClass58_3087 = Class33_Sub6_Sub11.method535(117, "Wordpack geladen)3");
	public static int anInt3088;
	public static int anInt3089 = 0;
	public int anInt3090;
	public int anInt3091;
	public static Class30_Sub1 aClass30_Sub1_3092;
	public static int anIntArray3093[];
	public static Class15 aClass15_3094;
	public int anIntArray3095[];
	public int anInt3096;
	public static Class58 aClass58_3097;
	public int anInt3098;
	public static int anInt3099;
	public short aShortArray3100[];
	public Class58 aClass58Array3101[];
	public boolean aBoolean3102;
	public static long aLongArray3103[] = new long[100];
	public int anInt3104;
	public int anInt3105;
	public int anInt3106;
	public int anInt3107;
	public int anIntArray3108[];
	public static int anInt3109;
	public static int anInt3110;
	public int anInt3111;
	public static boolean aBoolean3112 = false;
	public Class58 aClass58_3113;
	public boolean aBoolean3114;
	public static Class58 aClass58_3115;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_3116;
	public int anInt3117;
	public int anInt3118;
	public static Class58 aClass58_3119 = Class33_Sub6_Sub11.method535(116, "headicons_prayer");

	static 
	{
		aClass58_3097 = Class33_Sub6_Sub11.method535(109, "Loading interfaces )2 ");
		aClass58_3115 = aClass58_3097;
	}
}
