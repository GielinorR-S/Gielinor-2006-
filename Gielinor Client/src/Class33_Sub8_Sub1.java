// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub8_Sub1.java


public class Class33_Sub8_Sub1 extends Class33_Sub8
{

	public Class33_Sub8_Sub1 method607(Class54 arg0)
	{
		aByteArray3194 = arg0.method959(aByteArray3194, (byte)-39);
		anInt3195 = arg0.method957(true, anInt3195);
		if(anInt3196 == anInt3193)
		{
			anInt3196 = anInt3193 = arg0.method958(anInt3196, (byte)66);
		} else
		{
			anInt3196 = arg0.method958(anInt3196, (byte)24);
			anInt3193 = arg0.method958(anInt3193, (byte)123);
			if(anInt3196 == anInt3193)
				anInt3196--;
		}
		return this;
	}

	public Class33_Sub8_Sub1(int arg0, byte arg1[], int arg2, int arg3)
	{
		anInt3195 = arg0;
		aByteArray3194 = arg1;
		anInt3196 = arg2;
		anInt3193 = arg3;
	}

	public Class33_Sub8_Sub1(int arg0, byte arg1[], int arg2, int arg3, boolean arg4)
	{
		anInt3195 = arg0;
		aByteArray3194 = arg1;
		anInt3196 = arg2;
		anInt3193 = arg3;
		aBoolean3192 = arg4;
	}

	public boolean aBoolean3192;
	public int anInt3193;
	public byte aByteArray3194[];
	public int anInt3195;
	public int anInt3196;
}
