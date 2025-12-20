// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class50_Sub1.java

import java.nio.ByteBuffer;

public class Class50_Sub1 extends Class50
{

	public byte[] method940(byte arg0) {
		byte[] is;
		try {
			if (arg0 > -2)
				aByteBuffer2619 = null;
			byte[] is_0_ = new byte[aByteBuffer2619.capacity()];
			aByteBuffer2619.position(0);
			aByteBuffer2619.get(is_0_);
			is = is_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}
    
	public void method939(int arg0, byte arg1[])
	{
		if(arg0 != 64)
			aByteBuffer2619 = (ByteBuffer)null;
		aByteBuffer2619 = ByteBuffer.allocateDirect(arg1.length);
		aByteBuffer2619.position(0);
		aByteBuffer2619.put(arg1);
	}

	public Class50_Sub1()
	{
	}

	public ByteBuffer aByteBuffer2619;
}
