// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub5_Sub1.java

import java.io.*;
import java.lang.reflect.*;

public class Class33_Sub6_Sub4_Sub5_Sub1 extends Class33_Sub6_Sub4_Sub5
{

	public void method368(Class33_Sub11 arg0, int arg1)
	{
		try
		{
			anInt3771++;
			arg0.anInt2239 = 0;
			int i = arg0.method639((byte)123);
			int k = 70 % ((arg1 - 35) / 50);
			anInt3745 = arg0.method661((byte)-103);
			int ai[] = new int[12];
			int j = -1;
			anInt3766 = arg0.method661((byte)-109);
			anInt3764 = 0;
			for(int l = 0; ~l > -13; l++)
			{
				int i1 = arg0.method639((byte)123);
				if(i1 == 0)
				{
					ai[l] = 0;
					continue;
				}
				int j1 = arg0.method639((byte)123);
				ai[l] = (i1 << 0x58b156a8) + j1;
				if(l == 0 && ai[0] == 65535)
				{
					j = arg0.method666(39);
					break;
				}
				if(~ai[l] <= -513)
				{
					int l1 = Class14.method127(-512 + ai[l], (byte)90).anInt2913;
					if(~l1 != -1)
						anInt3764 = l1;
				}
			}

			int ai1[] = new int[5];
			for(int k1 = 0; k1 < 5; k1++)
			{
				int i2 = arg0.method639((byte)123);
				if(~i2 > -1 || Class38.aShortArrayArray843[k1].length <= i2)
					i2 = 0;
				ai1[k1] = i2;
			}

			super.anInt3569 = arg0.method666(42);
			if(super.anInt3569 == 65535)
				super.anInt3569 = -1;
			super.anInt3525 = arg0.method666(32);
			if(~super.anInt3525 == 0xffff0000)
				super.anInt3525 = -1;
			super.anInt3496 = super.anInt3525;
			super.anInt3532 = arg0.method666(96);
			if(~super.anInt3532 == 0xffff0000)
				super.anInt3532 = -1;
			super.anInt3541 = arg0.method666(42);
			if(~super.anInt3541 == 0xffff0000)
				super.anInt3541 = -1;
			super.anInt3506 = arg0.method666(76);
			if(super.anInt3506 == 65535)
				super.anInt3506 = -1;
			super.anInt3504 = arg0.method666(87);
			if(~super.anInt3504 == 0xffff0000)
				super.anInt3504 = -1;
			super.anInt3545 = arg0.method666(31);
			if(super.anInt3545 == 65535)
				super.anInt3545 = -1;
			aClass58_3755 = Class33_Sub19.method817(arg0.method655(-13628), 114).method1065(-122);
			anInt3738 = arg0.method639((byte)123);
			anInt3749 = arg0.method666(33);
			if(aClass46_3754 == null)
				aClass46_3754 = new Class46();
			aClass46_3754.method919(~i == -2, ai1, ai, j, (byte)-114);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.O(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method369(int arg0, int arg1)
	{
		try
		{
			Class33_Sub18.anInt2513 = arg1;
			if(arg0 != 23672)
			{
				return;
			} else
			{
				anInt3769++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.N(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method370(int arg0, Class33_Sub11_Sub1 arg1, boolean arg2)
	{
		try
		{
			anInt3758++;
			if(!arg2)
				aClass58_3750 = null;
			do
			{
				Class33_Sub19 class33_sub19 = (Class33_Sub19)Class30.aClass4_613.method68(18823);
				if(class33_sub19 == null)
					return;
				boolean flag = false;
				for(int i = 0; ~i > ~class33_sub19.anInt2550; i++)
				{
					if(class33_sub19.aClass6Array2536[i] != null)
					{
						if(~class33_sub19.aClass6Array2536[i].anInt151 == -3)
							class33_sub19.anIntArray2545[i] = -5;
						if(class33_sub19.aClass6Array2536[i].anInt151 == 0)
							flag = true;
					}
					if(class33_sub19.aClass6Array2539[i] != null)
					{
						if(class33_sub19.aClass6Array2539[i].anInt151 == 2)
							class33_sub19.anIntArray2545[i] = -6;
						if(class33_sub19.aClass6Array2539[i].anInt151 == 0)
							flag = true;
					}
				}

				if(flag)
					return;
				arg1.method683(arg0, -1198);
				arg1.method640(0, -11124);
				int j = ((Class33_Sub11) (arg1)).anInt2239;
				arg1.method669(class33_sub19.anInt2537, -30515);
				for(int k = 0; k < class33_sub19.anInt2550; k++)
					if(class33_sub19.anIntArray2545[k] != 0)
						arg1.method640(class33_sub19.anIntArray2545[k], -11124);
					else
						try
						{
							int l = class33_sub19.anIntArray2549[k];
							if(l != 0)
							{
								if(~l != -2)
								{
									if(~l == -3)
									{
										Field field = (Field)class33_sub19.aClass6Array2536[k].anObject149;
										int i1 = field.getModifiers();
										arg1.method640(0, -11124);
										arg1.method669(i1, -30515);
									}
								} else
								{
									Field field1 = (Field)class33_sub19.aClass6Array2536[k].anObject149;
									field1.setInt(null, class33_sub19.anIntArray2534[k]);
									arg1.method640(0, -11124);
								}
							} else
							{
								Field field2 = (Field)class33_sub19.aClass6Array2536[k].anObject149;
								int j1 = field2.getInt(null);
								arg1.method640(0, -11124);
								arg1.method669(j1, -30515);
							}
							if(~l != -4)
							{
								if(~l == -5)
								{
									Method method = (Method)class33_sub19.aClass6Array2539[k].anObject149;
									int k1 = method.getModifiers();
									arg1.method640(0, -11124);
									arg1.method669(k1, -30515);
								}
							} else
							{
								Method method1 = (Method)class33_sub19.aClass6Array2539[k].anObject149;
								byte abyte0[][] = class33_sub19.aByteArrayArrayArray2538[k];
								Object aobj[] = new Object[abyte0.length];
								for(int l1 = 0; ~abyte0.length < ~l1; l1++)
								{
									ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(abyte0[l1]));
									aobj[l1] = objectinputstream.readObject();
								}

								Object obj = method1.invoke(null, aobj);
								if(obj != null)
								{
									if(obj instanceof Number)
									{
										arg1.method640(1, -11124);
										arg1.method675(((Number)obj).longValue(), (byte)118);
									} else
									if(obj instanceof Class58)
									{
										arg1.method640(2, -11124);
										arg1.method632((byte)-73, (Class58)obj);
									} else
									{
										arg1.method640(4, -11124);
									}
								} else
								{
									arg1.method640(0, -11124);
								}
							}
						}
						catch(ClassNotFoundException _ex)
						{
							arg1.method640(-10, -11124);
						}
						catch(InvalidClassException _ex)
						{
							arg1.method640(-11, -11124);
						}
						catch(StreamCorruptedException _ex)
						{
							arg1.method640(-12, -11124);
						}
						catch(OptionalDataException _ex)
						{
							arg1.method640(-13, -11124);
						}
						catch(IllegalAccessException _ex)
						{
							arg1.method640(-14, -11124);
						}
						catch(IllegalArgumentException _ex)
						{
							arg1.method640(-15, -11124);
						}
						catch(InvocationTargetException _ex)
						{
							arg1.method640(-16, -11124);
						}
						catch(SecurityException _ex)
						{
							arg1.method640(-17, -11124);
						}
						catch(IOException _ex)
						{
							arg1.method640(-18, -11124);
						}
						catch(NullPointerException _ex)
						{
							arg1.method640(-19, -11124);
						}
						catch(Exception _ex)
						{
							arg1.method640(-20, -11124);
						}
						catch(Throwable _ex)
						{
							arg1.method640(-21, -11124);
						}

				arg1.method662(j, -115);
				arg1.method638(-1, ((Class33_Sub11) (arg1)).anInt2239 + -j);
				class33_sub19.method266(-76);
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method319(int arg0)
	{
		try
		{
			anInt3752++;
			if(aClass46_3754 == null)
				return null;
			Class33_Sub6_Sub14 class33_sub6_sub14 = super.anInt3567 == -1 || ~super.anInt3544 != -1 ? null : Class33_Sub21.method830(super.anInt3567, -91);
			Class33_Sub6_Sub14 class33_sub6_sub14_1 = super.anInt3499 != -1 && !aBoolean3762 && (~super.anInt3499 != ~super.anInt3569 || class33_sub6_sub14 == null) ? Class33_Sub21.method830(super.anInt3499, arg0 + 6821) : null;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = aClass46_3754.method923(super.anInt3502, class33_sub6_sub14, super.anInt3498, class33_sub6_sub14_1, (byte)1);
			if(class33_sub6_sub4_sub3 == null)
				return null;
			class33_sub6_sub4_sub3.method334();
			if(arg0 != -6941)
				return null;
			super.anInt3512 = ((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737;
			if(!aBoolean3762 && ~super.anInt3564 != 0 && ~super.anInt3511 != 0)
			{
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1 = Class63.method1083((byte)51, super.anInt3564).method518(super.anInt3511, false);
				if(class33_sub6_sub4_sub3_1 != null)
				{
					class33_sub6_sub4_sub3_1.method337(0, -super.anInt3531, 0);
					Class33_Sub6_Sub4_Sub3 aclass33_sub6_sub4_sub3[] = {
						class33_sub6_sub4_sub3, class33_sub6_sub4_sub3_1
					};
					class33_sub6_sub4_sub3 = new Class33_Sub6_Sub4_Sub3(aclass33_sub6_sub4_sub3, 2);
				}
			}
			if(!aBoolean3762 && aClass33_Sub6_Sub4_Sub3_3756 != null)
			{
				if(~anInt3742 >= ~Class33_Sub6_Sub6.anInt2785)
					aClass33_Sub6_Sub4_Sub3_3756 = null;
				if(anInt3740 <= Class33_Sub6_Sub6.anInt2785 && Class33_Sub6_Sub6.anInt2785 < anInt3742)
				{
					Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_2 = aClass33_Sub6_Sub4_Sub3_3756;
					class33_sub6_sub4_sub3_2.method337(anInt3751 - super.anInt3548, anInt3746 + -anInt3757, -super.anInt3510 + anInt3741);
					Class33_Sub6_Sub4_Sub3 aclass33_sub6_sub4_sub3_1[] = {
						class33_sub6_sub4_sub3, class33_sub6_sub4_sub3_2
					};
					if(~super.anInt3519 == -513)
					{
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
					} else
					if(~super.anInt3519 == -1025)
					{
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
					} else
					if(~super.anInt3519 == -1537)
						class33_sub6_sub4_sub3_2.method339();
					class33_sub6_sub4_sub3 = new Class33_Sub6_Sub4_Sub3(aclass33_sub6_sub4_sub3_1, 2);
					if(super.anInt3519 == 512)
						class33_sub6_sub4_sub3_2.method339();
					else
					if(~super.anInt3519 == -1025)
					{
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
					} else
					if(super.anInt3519 == 1536)
					{
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
						class33_sub6_sub4_sub3_2.method339();
					}
					class33_sub6_sub4_sub3_2.method337(super.anInt3548 + -anInt3751, anInt3757 - anInt3746, -anInt3741 + super.anInt3510);
				}
			}
			class33_sub6_sub4_sub3.aBoolean3404 = true;
			return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.B(" + arg0 + ')');
		}
	}

	public boolean method366(boolean arg0)
	{
		try
		{
			anInt3774++;
			if(aClass46_3754 == null)
				return false;
			return arg0 ? true : true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.C(" + arg0 + ')');
		}
	}

	public static void method371(byte arg0)
	{
		try
		{
			if(arg0 != 65)
				method369(1, 119);
			aClass58_3750 = null;
			aClass58_3767 = null;
			aClass58_3747 = null;
			aClass58_3760 = null;
			aClass58_3768 = null;
			anIntArray3753 = null;
			aClass58_3763 = null;
			aClass58_3770 = null;
			aClass30_3743 = null;
			aClass58_3759 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cf.D(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub5_Sub1()
	{
		anInt3738 = 0;
		anInt3749 = 0;
		anInt3766 = -1;
		anInt3740 = 0;
		aBoolean3762 = false;
		anInt3764 = 0;
		anInt3742 = 0;
		anInt3745 = -1;
	}

	public int anInt3737;
	public int anInt3738;
	public static int anInt3739;
	public int anInt3740;
	public int anInt3741;
	public int anInt3742;
	public static Class30 aClass30_3743;
	public static int anInt3744 = 0;
	public int anInt3745;
	public int anInt3746;
	public static Class58 aClass58_3747;
	public int anInt3748;
	public int anInt3749;
	public static Class58 aClass58_3750 = Class33_Sub6_Sub11.method535(116, "Bitte geben Sie Ihr Passwort ein)3");
	public int anInt3751;
	public static int anInt3752;
	public static int anIntArray3753[];
	public Class46 aClass46_3754;
	public Class58 aClass58_3755;
	public Class33_Sub6_Sub4_Sub3 aClass33_Sub6_Sub4_Sub3_3756;
	public int anInt3757;
	public static int anInt3758;
	public static Class58 aClass58_3759;
	public static Class58 aClass58_3760 = Class33_Sub6_Sub11.method535(109, " )2> <col=ffffff>");
	public static int anInt3761 = 99;
	public boolean aBoolean3762;
	public static Class58 aClass58_3763 = Class33_Sub6_Sub11.method535(99, "backright2");
	public int anInt3764;
	public int anInt3765;
	public int anInt3766;
	public static Class58 aClass58_3767;
	public static Class58 aClass58_3768;
	public static int anInt3769;
	public static Class58 aClass58_3770 = Class33_Sub6_Sub11.method535(109, "ams");
	public static int anInt3771;
	public int anInt3772;
	public static int anInt3773;
	public static int anInt3774;

	static 
	{
		aClass58_3747 = Class33_Sub6_Sub11.method535(103, "Type");
		aClass58_3759 = aClass58_3747;
		aClass58_3767 = Class33_Sub6_Sub11.method535(122, "Loading)3)3)3");
		aClass58_3768 = aClass58_3767;
	}
}
