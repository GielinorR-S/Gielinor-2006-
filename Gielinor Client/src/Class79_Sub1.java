// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class79_Sub1.java

import java.awt.Component;
import javax.sound.sampled.*;

public class Class79_Sub1 extends Class79
{

	public void method1186(Component arg0)
	{
		anAudioFormat2649 = new AudioFormat(Class39.anInt863, 16, Class39.aBoolean857 ? 2 : 1, true, false);
		aByteArray2648 = new byte[256 << (Class39.aBoolean857 ? 2 : 1)];
	}

	public int method1187() {
		int i;
		try {
			i = anInt2647 - (aSourceDataLine2646.available()
					>> (Class39.aBoolean857 ? 2 : 1));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public void method1194()
	{
		if(aSourceDataLine2646 != null)
		{
			aSourceDataLine2646.close();
			aSourceDataLine2646 = null;
		}
	}

	public void method1196()
	{
		int i = 256;
		if(Class39.aBoolean857)
			i <<= 1;
		for(int j = 0; j < i; j++)
		{
			int k = anIntArray1687[j];
			if((k + 0x800000 & 0xff000000) != 0)
				k = 0x7fffff ^ k >> 31;
			aByteArray2648[j * 2] = (byte)(k >> 8);
			aByteArray2648[j * 2 + 1] = (byte)(k >> 16);
		}

		aSourceDataLine2646.write(aByteArray2648, 0, i << 1);
	}

	public void method1192(int arg0)
		throws LineUnavailableException
	{
		try
		{
			javax.sound.sampled.DataLine.Info info = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, anAudioFormat2649, arg0 << (Class39.aBoolean857 ? 2 : 1));
			aSourceDataLine2646 = (SourceDataLine)AudioSystem.getLine(info);
			aSourceDataLine2646.open();
			aSourceDataLine2646.start();
			anInt2647 = arg0;
		}
		catch(LineUnavailableException lineunavailableexception)
		{
			if(-2 != ~Class33_Sub6_Sub1.method303((byte)86, arg0))
			{
				method1192(Class38.method872(arg0, false));
				return;
			} else
			{
				aSourceDataLine2646 = null;
				throw lineunavailableexception;
			}
		}
	}

	public void method1188()
	{
		aSourceDataLine2646.flush();
	}

	public Class79_Sub1()
	{
	}

	public SourceDataLine aSourceDataLine2646;
	public int anInt2647;
	public byte aByteArray2648[];
	public AudioFormat anAudioFormat2649;
}
