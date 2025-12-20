// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class24.java

import java.awt.event.*;

public class Class24
	implements MouseListener, MouseMotionListener, FocusListener
{

	public synchronized void mousePressed(MouseEvent arg0)
	{
		anInt518++;
		if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
		{
			Class33_Sub18.anInt2513 = 0;
			Class33_Sub20.anInt2574 = arg0.getX();
			Class54.anInt1152 = arg0.getY();
			Class35.aLong753 = Class60.method1073(false);
			if(arg0.isMetaDown())
			{
				Class33.anInt737 = 2;
				Class33_Sub3.anInt2052 = 2;
			} else
			{
				Class33.anInt737 = 1;
				Class33_Sub3.anInt2052 = 1;
			}
		}
		if(arg0.isPopupTrigger())
			arg0.consume();
	}

	public synchronized void focusLost(FocusEvent arg0)
	{
		anInt514++;
		if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			Class33_Sub3.anInt2052 = 0;
	}

	public static byte[] method189(byte arg0[], int arg1)
	{
		try
		{
			anInt502++;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0);
			int i = class33_sub11.method639((byte)123);
			int j = class33_sub11.method623((byte)98);
			if(~j > arg1 || Class12.anInt221 != 0 && j > Class12.anInt221)
				throw new RuntimeException();
			if(i == 0)
			{
				byte abyte0[] = new byte[j];
				class33_sub11.method644(0, abyte0, 15162, j);
				return abyte0;
			}
			int k = class33_sub11.method623((byte)114);
			if(~k > -1 || Class12.anInt221 != 0 && Class12.anInt221 < k)
				return new byte[100];
			if(k >= 2000000)
				return new byte[100];
				//throw new RuntimeException();
			byte abyte1[] = new byte[k];
			if(i != 1)
				Class79.aClass57_1690.method1018(class33_sub11, false, abyte1);
			else
				Class5.method75(abyte1, k, arg0, j, 9);
			return abyte1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method190(boolean arg0)
	{
		try
		{
			Class58 class58 = null;
			anInt517++;
			for(int i = 0; Class14.anInt276 > i; i++)
			{
				if(~Class39.aClass58Array868[i].method1046((byte)-107, Class27.aClass58_556) == 0)
					continue;
				class58 = Class39.aClass58Array868[i].method1028(Class39.aClass58Array868[i].method1046((byte)-104, Class27.aClass58_556), (byte)120);
				break;
			}

			if(class58 == null)
			{
				Class33_Sub6_Sub4_Sub5_Sub2.method373(-92);
				return;
			}
			int l = Class26.anInt550;
			if(l > 190)
				l = 190;
			int j = Class78.anInt1673;
			int k = Class77_Sub2.anInt2642;
			if(~j > -1)
				j = 0;
			int i1 = Class33_Sub6_Sub4_Sub5.anInt3537;
			int j1 = 0x5d5447;
			Class33_Sub6_Sub7.method424(j, k, l, i1, j1);
			Class33_Sub6_Sub7.method424(j + 1, k + 1, l + -2, 16, 0);
			Class33_Sub6_Sub7.method415(j - -1, k + 18, l - 2, i1 - 19, 0);
			Class75.aClass33_Sub6_Sub7_Sub2_1632.method464(class58, j + 3, 14 + k, j1, -1);
			int k1 = Applet_Sub1.anInt41;
			int l1 = Class13.anInt254;
			if(~Class33_Sub6.anInt2127 == -1)
			{
				l1 -= 4;
				k1 -= 4;
			}
			if(arg0)
				aClass58_515 = null;
			if(~Class33_Sub6.anInt2127 == -2)
			{
				k1 -= 553;
				l1 -= 205;
			}
			if(Class33_Sub6.anInt2127 == 2)
			{
				k1 -= 17;
				l1 -= 357;
			}
			for(int i2 = 0; i2 < Class14.anInt276; i2++)
			{
				int j2 = 31 + (k - -(15 * (-i2 + -1 + Class14.anInt276)));
				int k2 = 0xffffff;
				Class58 class58_1 = Class39.aClass58Array868[i2];
				if(~k1 < ~j && ~(j - -l) < ~k1 && j2 - 13 < l1 && 3 + j2 > l1)
					k2 = 0xffff00;
				if(class58_1.method1047(class58, (byte)-8))
				{
					class58_1 = class58_1.method1063(0, (byte)123, class58_1.method1035(27) + -class58.method1035(27));
					if(class58_1.method1047(Class48.aClass58_1057, (byte)-8))
						class58_1 = class58_1.method1063(0, (byte)127, class58_1.method1035(27) + -Class48.aClass58_1057.method1035(27));
				}
				Class75.aClass33_Sub6_Sub7_Sub2_1632.method464(class58_1, j + 3, j2, k2, 0);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.A(" + arg0 + ')');
		}
	}

	public void focusGained(FocusEvent arg0)
	{
		try
		{
			anInt492++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.focusGained(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method191(int arg0)
	{
		try
		{
			Class56.aBoolean1188 = true;
			anInt500++;
			if(arg0 >= -102)
				aClass58_515 = null;
			Class33_Sub3.aBoolean2058 = true;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.D(" + arg0 + ')');
		}
	}

	public Class24()
	{
	}

	public void mouseClicked(MouseEvent arg0)
	{
		anInt499++;
		if(arg0.isPopupTrigger())
			arg0.consume();
	}

	public synchronized void mouseReleased(MouseEvent arg0)
	{
		try
		{
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			{
				Class33_Sub18.anInt2513 = 0;
				Class33_Sub3.anInt2052 = 0;
			}
			if(arg0.isPopupTrigger())
				arg0.consume();
			anInt496++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.mouseReleased(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public synchronized void mouseDragged(MouseEvent arg0)
	{
		try
		{
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			{
				Class33_Sub18.anInt2513 = 0;
				Class81.anInt1750 = arg0.getX();
				Class33_Sub20.anInt2559 = arg0.getY();
			}
			anInt498++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.mouseDragged(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public synchronized void mouseExited(MouseEvent arg0)
	{
		try
		{
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			{
				Class33_Sub18.anInt2513 = 0;
				Class81.anInt1750 = -1;
				Class33_Sub20.anInt2559 = -1;
			}
			anInt510++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.mouseExited(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method192(int arg0)
	{
		try
		{
			aClass58_497 = null;
			aClass15_509 = null;
			aClass58_494 = null;
			aClass58_512 = null;
			aClass58_493 = null;
			aClass58_508 = null;
			aClass30_503 = null;
			aClass58_506 = null;
			aClass58_515 = null;
			aClass58_513 = null;
			aClass58_505 = null;
			aClass33_Sub6_Sub7_Sub4_516 = null;
			int i = 61 / ((arg0 - 6) / 55);
			anIntArray501 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.C(" + arg0 + ')');
		}
	}

	public synchronized void mouseEntered(MouseEvent arg0)
	{
		try
		{
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			{
				Class33_Sub18.anInt2513 = 0;
				Class81.anInt1750 = arg0.getX();
				Class33_Sub20.anInt2559 = arg0.getY();
			}
			anInt495++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.mouseEntered(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public synchronized void mouseMoved(MouseEvent arg0)
	{
		try
		{
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
			{
				Class33_Sub18.anInt2513 = 0;
				Class81.anInt1750 = arg0.getX();
				Class33_Sub20.anInt2559 = arg0.getY();
			}
			anInt511++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hd.mouseMoved(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt492;
	public static Class58 aClass58_493 = Class33_Sub6_Sub11.method535(111, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
	public static Class58 aClass58_494 = Class33_Sub6_Sub11.method535(111, "lila:");
	public static int anInt495;
	public static int anInt496;
	public static Class58 aClass58_497 = Class33_Sub6_Sub11.method535(123, "auf einer freien Welt zu spielen)3");
	public static int anInt498;
	public static int anInt499;
	public static int anInt500;
	public static int anIntArray501[];
	public static int anInt502;
	public static Class30 aClass30_503;
	public static int anInt504 = 0;
	public static Class58 aClass58_505;
	public static Class58 aClass58_506;
	public static int anInt507;
	public static Class58 aClass58_508;
	public static Class15 aClass15_509;
	public static int anInt510;
	public static int anInt511;
	public static Class58 aClass58_512 = Class33_Sub6_Sub11.method535(121, "::fpsoff");
	public static Class58 aClass58_513 = Class33_Sub6_Sub11.method535(114, "@cr1@");
	public static int anInt514;
	public static Class58 aClass58_515;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_516;
	public static int anInt517;
	public static int anInt518;

	static 
	{
		aClass58_505 = Class33_Sub6_Sub11.method535(99, "Loading ignore list");
		aClass58_508 = Class33_Sub6_Sub11.method535(117, "This world is running a closed Beta)3");
		aClass58_515 = aClass58_505;
		aClass58_506 = aClass58_508;
	}
}
