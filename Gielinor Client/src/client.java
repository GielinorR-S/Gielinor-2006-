// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   client.java

import java.io.IOException;
import java.net.Socket;

public class client extends Applet_Sub1 {

	public static Class33_Sub6_Sub1 method34(int arg0, byte arg1) {
		try {
			anInt1926++;
			Class33_Sub6_Sub1 class33_sub6_sub1 = (Class33_Sub6_Sub1) Class33_Sub6.aClass16_2122.method144(0, arg0);
			if (class33_sub6_sub1 != null)
				return class33_sub6_sub1;
			int i = -22 / ((arg1 - -62) / 55);
			byte abyte0[] = Class33_Sub13_Sub4.aClass30_3267.method238(false, arg0, 3);
			class33_sub6_sub1 = new Class33_Sub6_Sub1();
			if (abyte0 != null)
				class33_sub6_sub1.method302(true, new Class33_Sub11(abyte0));
			Class33_Sub6.aClass16_2122.method145(arg0, (byte) -117, class33_sub6_sub1);
			return class33_sub6_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.L(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class58 method35(Class33_Sub11 arg0, int arg1) {
		try {
			anInt1931++;
			if (arg1 != 1)
				return null;
			else
				return Class35.method850(arg0, 32767, false);
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception,
					"client.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method36(boolean arg0) {
		try {
			aClass58_1947 = null;
			aClass82_1943 = null;
			aClass58_1941 = null;
			if (arg0)
				aClass58_1942 = null;
			aClass58_1944 = null;
			aClass58_1942 = null;
			aClass30_Sub1_1940 = null;
			aClass58_1945 = null;
			aClass58_1946 = null;
			aClass58_1949 = null;
			aClass4_1933 = null;
			aClass58_1939 = null;
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.C(" + arg0 + ')');
		}
	}

	public static int method37(byte arg0[], int arg1, byte arg2) {
		try {
			int i = 45 / ((14 - arg2) / 45);
			anInt1932++;
			return Class33_Sub18.method811(0, arg1, 0xc09a5ae8, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception,
					"client.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	/**
	 * Checks if a specific location is within a specific radius.
	 * 
	 * @param rad The radius.
	 * @return True if we're within distance/range, false if not.
	 */
	public static boolean withinRange(int x, int y, int x1, int y1, int rad) {
		int dX = Math.abs(x - x1);
		int dY = Math.abs(y - y1);
		return dX <= rad && dY <= rad;
	}

	/**
	 * Gets the closest spot from a list of locations.
	 * 
	 * @param steps    The list of steps.
	 * @param location The location we want to be close to.
	 * @return The closest location.
	 */
	public static Location getClosestSpot(Location l, Location[] steps) {
		Location closestStep = null;
		for (Location p : steps) {
			if (closestStep == null || (getDistance(closestStep, l) > getDistance(p, l))) {
				// if (RS2RegionLoader.positionIsWalkalble(e, p.getX(),
				// p.getY())) {
				// System.out.println("Setting walkable pos..");
				closestStep = p;
				// }
			}
		}
		return closestStep;
	}

	public static double getDistance(Location p, Location p2) {
		return Math.sqrt(
				(p2.getX() - p.getX()) * (p2.getX() - p.getX()) + (p2.getY() - p.getY()) * (p2.getY() - p.getY()));
	}

	/**
	 * Gets a list of all the valid spots around another location, within a specific
	 * "size/range".
	 * 
	 * @param size     The size/range.
	 * @param location The location we want to get locations within range from.
	 */
	public static Location[] getValidSpots(int size, Location location) {
		Location[] list = new Location[size * 4];
		int index = 0;
		for (int i = 0; i < size; i++) {
			list[index++] = (new Location(location.getX() - 1, location.getY() + i));
			list[index++] = (new Location(location.getX() + i, location.getY() - 1));
			list[index++] = (new Location(location.getX() + i, location.getY() + size));
			list[index++] = (new Location(location.getX() + size, location.getY() + i));
		}
		return list;
	}

	public static double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static class Location {
		private final int x;
		private final int y;

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

	public static boolean positionIsWalkalble(int targetX, int targetY) {
		int clippingBlock[][] = Class51.aClass70Array1098[Class77_Sub2.anInt2645].anIntArrayArray1499;
		if (clippingBlock[targetX][targetY] == 0) {
			return true;
		}

		// TODO: Finish up those lul.
		if (targetX > 0 && (0x12c0108 & clippingBlock[targetX + -1][targetY]) == 0) {

		}
		if (targetX < 103 && (0x12c0180 & clippingBlock[targetX + 1][targetY]) == 0) {

		}
		if (~targetY < -1 && ~(clippingBlock[targetX][targetY + -1] & 0x12c0102) == -1) {

		}
		if (targetY < 103 && ~(clippingBlock[targetX][1 + targetY] & 0x12c0120) == -1) {

		}
		if (~targetX < -1 && ~targetY < -1 && (0x12c0108 & clippingBlock[targetX + -1][targetY]) == 0
				&& (0x12c0102 & clippingBlock[targetX][-1 + targetY]) == 0) {

		}
		if (targetX < 103 && targetY > 0 && ~(clippingBlock[1 + targetX][targetY + -1] & 0x12c0183) == -1
				&& (0x12c0180 & clippingBlock[1 + targetX][targetY]) == 0
				&& ~(clippingBlock[targetX][targetY - 1] & 0x12c0102) == -1) {

		}
		if (targetX > 0 && ~targetY > -104 && (clippingBlock[-1 + targetX][1 + targetY] & 0x12c0138) == 0
				&& (clippingBlock[targetX + -1][targetY] & 0x12c0108) == 0
				&& ~(clippingBlock[targetX][targetY - -1] & 0x12c0120) == -1) {

		}
		if (targetX < 103 && targetY < 103 && (0x12c01e0 & clippingBlock[targetX - -1][1 + targetY]) == 0
				&& ~(clippingBlock[1 + targetX][targetY] & 0x12c0180) == -1
				&& (clippingBlock[targetX][targetY + 1] & 0x12c0120) == 0) {

		}
		return false;
	}

	public static int fromDistance = 1;

	public static void main(String arg0[]) {
		new Thread() {
			public void run() {
				while (true) {
					try {
						long time = System.currentTimeMillis();
						if (Class33_Sub6_Sub4_Sub6.entityToFollow != null) {
							int x1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0];
							int y1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0];
							int x = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub6_Sub4_Sub6.entityToFollow)).anIntArray3554[0];
							int y = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub6_Sub4_Sub6.entityToFollow)).anIntArray3520[0];
							int size = 1;
							if (Class33_Sub6_Sub4_Sub6.entityToFollow instanceof Class33_Sub6_Sub4_Sub5_Sub2) { // NPC.
								Class33_Sub6_Sub4_Sub5_Sub2 npc = (Class33_Sub6_Sub4_Sub5_Sub2) Class33_Sub6_Sub4_Sub6.entityToFollow;
								size = npc.aClass33_Sub6_Sub16_3776.anInt3107;
							}
							Location best = getClosestSpot(new Location(x1, y1),
									getValidSpots(size, new Location(x, y)));
							if (best != null) {
								double totalDistance = getDistance(x1, y1, best.getX(), best.getY());
								if (totalDistance <= 13) {
									if (fromDistance == 1 && (best.getX() != x1 || best.getY() != y1)) {
										if (!(x1 == x && y1 == y)) {
											Class33_Sub6_Sub4_Sub4.method350(true, best.getX(), true, 0, (byte) -102, 0,
													2, 0, 0, 0, best.getY(), x1, y1);
										}
									} else if (totalDistance > fromDistance) {
										Class33_Sub6_Sub4_Sub4.method350(true, best.getX(), false, 0, (byte) -102, 0, 2,
												0, 0, 0, best.getY(), x1, y1);
									}
								} else {
									Class33_Sub6_Sub4_Sub6.entityToFollow = null;
								}
							}
						}
						long timeSpend = System.currentTimeMillis() - time;
						long newTime = 600 - timeSpend;
						if (newTime < 0) {
							newTime = 0;
						}
						sleep(newTime);
					} catch (Exception e) {
						Class33_Sub6_Sub4_Sub6.entityToFollow = null;
					}

				}
			}
		}.start();

		try {
			anInt1928++;
			try {
				arg0 = new String[] { "0", "live", "live", "highmem", "members", "english" };
				if (~arg0.length != -7)
					Class33_Sub6_Sub4_Sub1.method322(false);
				Class27.anInt560 = Integer.parseInt(arg0[0]);
				if (!arg0[1].equals("live")) {
					if (arg0[1].equals("office"))
						Class33_Sub15.anInt2445 = 1;
					else if (arg0[1].equals("local"))
						Class33_Sub15.anInt2445 = 2;
					else
						Class33_Sub6_Sub4_Sub1.method322(false);
				} else {
					Class33_Sub15.anInt2445 = 0;
				}
				if (arg0[2].equals("live"))
					Class33_Sub6_Sub3.anInt2711 = 0;
				else if (!arg0[2].equals("rc")) {
					if (!arg0[2].equals("wip"))
						Class33_Sub6_Sub4_Sub1.method322(false);
					else
						Class33_Sub6_Sub3.anInt2711 = 2;
				} else {
					Class33_Sub6_Sub3.anInt2711 = 1;
				}
				if (!arg0[3].equals("lowmem")) {
					if (arg0[3].equals("highmem"))
						Class33_Sub6_Sub4_Sub4.method357(116);
					else
						Class33_Sub6_Sub4_Sub1.method322(false);
				} else {
					Class24.method191(-105);
				}
				if (arg0[4].equals("free"))
					Class77.aBoolean1647 = false;
				else if (!arg0[4].equals("members"))
					Class33_Sub6_Sub4_Sub1.method322(false);
				else
					Class77.aBoolean1647 = true;
				if (arg0[5].equals("english"))
					Class75.anInt1617 = 0;
				else if (arg0[5].equals("german")) {
					Class33_Sub6_Sub11.method540(-106);
					Class33_Sub13_Sub4.aClass58_3321 = Class33_Sub13_Sub4.aClass58_3319;
					Class75.anInt1617 = 1;
				} else {
					Class33_Sub6_Sub4_Sub1.method322(false);
				}
				Class60.aString1289 = "127.0.0.1";
				client client1 = new client();
				client1.method24(503, "runescape", 765, 13044, 16, 459, 32 + Class33_Sub6_Sub3.anInt2711);
				return;
			} catch (Exception exception) {
				Class50.method938((byte) -126, exception, null);
			}
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.main(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void method38(int arg0) {
		anInt1930++;
		if (Class23.anInt485 == 1000)
			return;
		if (arg0 != 0)
			aClass58_1947 = null;
		boolean flag = Class69.method1112(13);
		if (!flag)
			method39(15);
	}

	public void init() {
		try {
			anInt1938++;
			if (!method13((byte) -91))
				return;
			Class27.anInt560 = Integer.parseInt(getParameter("worldid"));
			Class33_Sub6_Sub3.anInt2711 = Integer.parseInt(getParameter("modewhat"));
			Class33_Sub15.anInt2445 = Integer.parseInt(getParameter("modewhere"));
			String s = getParameter("lowmem");
			if (s == null || !s.equals("1"))
				Class33_Sub6_Sub4_Sub4.method357(116);
			else
				Class24.method191(-123);
			String s1 = getParameter("members");
			if (s1 != null && s1.equals("1"))
				Class77.aBoolean1647 = true;
			else
				Class77.aBoolean1647 = false;
			String s2 = getParameter("lang");
			if (s2 != null && s2.equals("1")) {
				Class33_Sub6_Sub11.method540(-114);
				Class33_Sub13_Sub4.aClass58_3321 = Class33_Sub13_Sub4.aClass58_3319;
				Class75.anInt1617 = 1;
			}
			try {
				Class33_Sub6_Sub3.anInt2707 = Integer.parseInt(getParameter("js"));
				Class33_Sub2.anInt2023 = Integer.parseInt(getParameter("plug"));
			} catch (Exception _ex) {
			}
			Class60.aString1289 = getCodeBase().getHost();
			method26(28818, 459, 32 - -Class33_Sub6_Sub3.anInt2711, 503, 765);
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.init(" + ')');
		}
	}

	public void method11(int arg0) {
		try {
			anInt1934++;
			boolean flag = Class35.method848(-121);
			if (flag && Class20.aBoolean381 && Class33_Sub11_Sub1.aClass79_3212 != null)
				Class33_Sub11_Sub1.aClass79_3212.method1190(2000);
			if (Class9.aBoolean167) {
				Class80.method1207(Class33_Sub6_Sub4_Sub1.aCanvas3367, -1);
				Class22.method177(0, Class33_Sub6_Sub4_Sub1.aCanvas3367);
				if (Class69.aClass49_1477 != null)
					Class69.aClass49_1477.method936(Class33_Sub6_Sub4_Sub1.aCanvas3367, 255);
				method17(0);
				Class12.method113((byte) -84, Class33_Sub6_Sub4_Sub1.aCanvas3367);
				Class17.method156(Class33_Sub6_Sub4_Sub1.aCanvas3367, (byte) 93);
				if (Class69.aClass49_1477 != null)
					Class69.aClass49_1477.method935((byte) -69, Class33_Sub6_Sub4_Sub1.aCanvas3367);
			}
			if (Class23.anInt485 == 0)
				Class57.method1024(null, -11736, Class45.anInt976, Class63.aClass58_1339);
			else if (Class23.anInt485 == 5)
				Class44.method907(Class75.aClass33_Sub6_Sub7_Sub2_1632, 80,
						Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662);
			else if (~Class23.anInt485 != -11) {
				if (Class23.anInt485 != 20) {
					if (~Class23.anInt485 != -26) {
						if (Class23.anInt485 != 30) {
							if (~Class23.anInt485 == -36)
								Class4.method62((byte) 73);
							else if (~Class23.anInt485 == -41)
								Class33_Sub11_Sub1.method677(Class49.aClass58_1067, false, Class63.aClass58_1338, 3);
						} else {
							Class33_Sub12.method686((byte) -123);
						}
					} else if (~Class55.anInt1172 == -2) {
						if (Class33_Sub6_Sub13.anInt3004 < Class33_Sub6_Sub2.anInt2697)
							Class33_Sub6_Sub13.anInt3004 = Class33_Sub6_Sub2.anInt2697;
						int i = (50 * (-Class33_Sub6_Sub2.anInt2697 + Class33_Sub6_Sub13.anInt3004))
								/ Class33_Sub6_Sub13.anInt3004;
						Class33_Sub11_Sub1.method677(Class36.aClass58_779, true,
								Class35.method846((byte) -83, new Class58[] {
										Class78.aClass58_1667, Class37.method859(15591, i), Class62.aClass58_1306
								}), 3);
					} else if (~Class55.anInt1172 == -3) {
						if (Class33_Sub6_Sub14.anInt3040 > Class33_Sub13_Sub3.anInt3245)
							Class33_Sub13_Sub3.anInt3245 = Class33_Sub6_Sub14.anInt3040;
						int j = (50 * (-Class33_Sub6_Sub14.anInt3040 + Class33_Sub13_Sub3.anInt3245))
								/ Class33_Sub13_Sub3.anInt3245 + 50;
						Class33_Sub11_Sub1.method677(Class36.aClass58_779, true,
								Class35.method846((byte) -83, new Class58[] {
										Class78.aClass58_1667, Class37.method859(15591, j), Class62.aClass58_1306
								}), 3);
					} else {
						Class33_Sub11_Sub1.method677(Class36.aClass58_779, false, null, 3);
					}
				} else {
					Class44.method907(Class75.aClass33_Sub6_Sub7_Sub2_1632, 87,
							Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662);
				}
			} else {
				Class44.method907(Class75.aClass33_Sub6_Sub7_Sub2_1632, 99,
						Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662);
			}
			Class60.anInt1277 = 0;
			int k = 18 / ((arg0 - 42) / 58);
			Class33_Sub6_Sub5.anInt2767 = 0;
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.J(" + arg0 + ')');
		}
	}

	public void method39(int arg0) {
		anInt1937++;
		if (Class11.anInt186 >= 4) {
			method15(-87, "js5crc");
			Class23.anInt485 = 1000;
			return;
		}
		if (Class66.anInt1431 >= 4)
			if (Class23.anInt485 > 5) {
				Class66.anInt1431 = 3;
				Class33_Sub18.anInt2525 = 3000;
			} else {
				method15(-109, "js5io");
				Class23.anInt485 = 1000;
				return;
			}
		if (~Class33_Sub18.anInt2525-- < -1)
			return;
		try {
			if (arg0 != 15)
				aClass58_1941 = null;
			if (Class32.anInt706 == 0) {
				Class16.aClass6_311 = Class22.aClass72_416.method1146(Class60.aString1289, Class41.anInt915,
						(byte) -69);
				Class32.anInt706++;
			}
			if (Class32.anInt706 == 1) {
				if (~Class16.aClass6_311.anInt151 == -3) {
					method41(23448, -1);
					return;
				}
				if (Class16.aClass6_311.anInt151 == 1)
					Class32.anInt706++;
			}
			if (Class32.anInt706 == 2) {
				Class33_Sub6_Sub3.aClass43_2716 = new Class43((Socket) Class16.aClass6_311.anObject149,
						Class22.aClass72_416);
				Class33_Sub11 class33_sub11 = new Class33_Sub11(5);
				class33_sub11.method640(15, arg0 ^ 0xffffd483);
				class33_sub11.method669(459, -30515);
				Class33_Sub6_Sub3.aClass43_2716.method901((byte) 42, class33_sub11.aByteArray2296, 5, 0);
				Class32.anInt706++;
				Class49.aLong1070 = Class60.method1073(false);
			}
			if (Class32.anInt706 == 3)
				if (~Class23.anInt485 >= -6 || ~Class33_Sub6_Sub3.aClass43_2716.method896(arg0 ^ 0xf) < -1) {
					int i = Class33_Sub6_Sub3.aClass43_2716.method897(27426);
					if (~i != -1) {
						method41(23448, i);
						return;
					}
					Class32.anInt706++;
				} else if (~(-Class49.aLong1070 + Class60.method1073(false)) < -30001L) {
					method41(23448, -2);
					return;
				}
			if (~Class32.anInt706 == -5) {
				RuntimeException_Sub1.method1222(Class33_Sub6_Sub3.aClass43_2716, (byte) -94, ~Class23.anInt485 < -21);
				Class32.anInt706 = 0;
				Class33_Sub6_Sub3.aClass43_2716 = null;
				Class16.aClass6_311 = null;
				Class57.anInt1252 = 0;
				return;
			}
		} catch (IOException _ex) {
			method41(arg0 + 23433, -3);
		}
	}

	public client() {
	}

	public static Class33_Sub6_Sub7_Sub4 method40(int arg0, Class30 arg1, int arg2, boolean arg3) {
		try {
			anInt1924++;
			if (arg3)
				method40(-6, null, 80, false);
			if (!Canvas_Sub1.method42(12127, arg2, arg0, arg1))
				return null;
			else
				return Class33_Sub13_Sub3.method743(!arg3);
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception,
					"client.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method28(byte arg0) {
		try {
			if (arg0 < 20)
				method11(111);
			Class12.anInt229 = Class33_Sub15.anInt2445 == 0 ? 443 : 50000 - -Class27.anInt560;
			Class62.anInt1302 = ~Class33_Sub15.anInt2445 != -1 ? Class27.anInt560 + 40000 : 43594;
			Class41.anInt915 = Class62.anInt1302;
			Class65.method1090(0xf99ff6c8);
			anInt1935++;
			Class12.method113((byte) -84, Class33_Sub6_Sub4_Sub1.aCanvas3367);
			Class17.method156(Class33_Sub6_Sub4_Sub1.aCanvas3367, (byte) 115);
			Class69.aClass49_1477 = Class26.method206(109);
			if (Class69.aClass49_1477 != null)
				Class69.aClass49_1477.method935((byte) -69, Class33_Sub6_Sub4_Sub1.aCanvas3367);
			Class33_Sub6_Sub5.anInt2770 = Class72.anInt1537;
			try {
				if (Class22.aClass72_416.aClass18_1545 != null) {
					Class33.aClass37_742 = new Class37(Class22.aClass72_416.aClass18_1545, 5200, 0);
					for (int i = 0; ~i > -17; i++)
						Class70.aClass37Array1502[i] = new Class37(Class22.aClass72_416.aClass18Array1540[i], 6000, 0);

					Class47.aClass37_1036 = new Class37(Class22.aClass72_416.aClass18_1534, 6000, 0);
					Class11.aClass12_196 = new Class12(255, Class33.aClass37_742, Class47.aClass37_1036, 0x7a120);
					Class22.aClass72_416.aClass18Array1540 = null;
					Class22.aClass72_416.aClass18_1545 = null;
					Class22.aClass72_416.aClass18_1534 = null;
				}
			} catch (IOException _ex) {
				Class47.aClass37_1036 = null;
				Class33.aClass37_742 = null;
				Class11.aClass12_196 = null;
			}
			if (~Class33_Sub15.anInt2445 != -1)
				Class33_Sub6_Sub4_Sub1.aBoolean3345 = true;
			Class15_Sub2.aClass33_Sub15_1973 = new Class33_Sub15();
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.G(" + arg0 + ')');
		}
	}

	public void method32(int arg0) {
		Class33_Sub6_Sub6.anInt2785++;
		anInt1936++;
		method38(arg0 + -10);
		Class33.method270(1000);
		Class77_Sub2.method1175(true);
		Class59.method1067(arg0 ^ 0xb);
		Class9.method85((byte) -38);
		Class33_Sub6_Sub4_Sub2.method325(112);
		if (Class69.aClass49_1477 != null) {
			int i = Class69.aClass49_1477.method937((byte) -118);
			Class33_Sub6_Sub5.anInt2767 += i;
			Class63.anInt1348 = i;
		}
		if (Class23.anInt485 == 0) {
			RuntimeException_Sub1.method1225(arg0 ^ 0xfffffff5);
			Applet_Sub1.method20(12289);
		} else if (~Class23.anInt485 != -6) {
			if (Class23.anInt485 == 10)
				Class58.method1050(this, -67);
			else if (Class23.anInt485 == 20) {
				Class58.method1050(this, -47);
				Class71.method1135(arg0 + 3784);
			} else if (~Class23.anInt485 == -26)
				Class69.method1111(-7213);
		} else {
			Class58.method1050(this, 82);
			RuntimeException_Sub1.method1225(arg0 ^ 0xfffffff5);
			Applet_Sub1.method20(12289);
		}
		if (~Class23.anInt485 == -31)
			Class59.method1069(false);
		else if (~Class23.anInt485 == -36)
			Class59.method1069(false);
		else if (~Class23.anInt485 == -41)
			Class71.method1135(arg0 ^ 0xed8);
		if (arg0 != 10)
			method29(-37);
	}

	public void method18(byte arg0) {
		if (Class33_Sub6_Sub2.aClass78_2701 != null)
			Class33_Sub6_Sub2.aClass78_2701.aBoolean1664 = false;
		anInt1925++;
		if (arg0 > -3)
			return;
		Class33_Sub6_Sub2.aClass78_2701 = null;
		if (Class62.aClass43_1316 != null) {
			Class62.aClass43_1316.method903(1);
			Class62.aClass43_1316 = null;
		}
		Class33_Sub6_Sub1.method294(0);
		Class37.method864(true);
		Class69.aClass49_1477 = null;
		if (Class33_Sub11_Sub1.aClass79_3212 != null)
			Class33_Sub11_Sub1.aClass79_3212.method1198((byte) -120);
		if (Class33_Sub6_Sub4_Sub6.aClass79_3581 != null)
			Class33_Sub6_Sub4_Sub6.aClass79_3581.method1198((byte) 88);
		Class33_Sub20.method825(-1);
		Class22.method178(true);
		try {
			if (Class33.aClass37_742 != null)
				Class33.aClass37_742.method866(-9837);
			if (Class70.aClass37Array1502 != null) {
				for (int i = 0; ~i > ~Class70.aClass37Array1502.length; i++)
					if (Class70.aClass37Array1502[i] != null)
						Class70.aClass37Array1502[i].method866(-9837);

			}
			if (Class47.aClass37_1036 != null) {
				Class47.aClass37_1036.method866(-9837);
				return;
			}
		} catch (IOException _ex) {
		}
	}

	public void method41(int arg0, int arg1) {
		Class33_Sub6_Sub3.aClass43_2716 = null;
		Class16.aClass6_311 = null;
		if (~Class62.anInt1302 == ~Class41.anInt915)
			Class41.anInt915 = Class12.anInt229;
		else
			Class41.anInt915 = Class62.anInt1302;
		if (arg0 != 23448)
			method36(false);
		anInt1927++;
		Class57.anInt1252++;
		Class32.anInt706 = 0;
		if (Class57.anInt1252 < 2 || ~arg1 != -8 && ~arg1 != -10) {
			if (Class57.anInt1252 >= 2 && ~arg1 == -7) {
				method15(arg0 + -23545, "js5connect_outofdate");
				Class23.anInt485 = 1000;
				return;
			}
			if (~Class57.anInt1252 <= -5)
				if (Class23.anInt485 > 5) {
					Class33_Sub18.anInt2525 = 3000;
					return;
				} else {
					method15(-116, "js5connect");
					Class23.anInt485 = 1000;
					return;
				}
		} else {
			if (~Class23.anInt485 >= -6) {
				method15(-112, "js5connect_full");
				Class23.anInt485 = 1000;
				return;
			}
			Class33_Sub18.anInt2525 = 3000;
		}
	}

	public void method29(int arg0) {
		try {
			anInt1929++;
			method36(false);
			Class58.method1037(false);
			Applet_Sub1.method25(-118);
			Class77.method1169((byte) 118);
			Class15.method132(119);
			Class78.method1181((byte) 74);
			Class33_Sub11.method633((byte) 125);
			Class43.method902(-63);
			Class30_Sub1.method247(-15075);
			Class37.method860(true);
			Class12.method112(-79);
			Class33_Sub6_Sub4_Sub5_Sub2.method372(-121);
			Class33_Sub11_Sub1.method680((byte) 99);
			Class33_Sub6_Sub7_Sub2.method460();
			Class56.method1001();
			Class70.method1130((byte) 110);
			Class33_Sub6_Sub4_Sub5_Sub1.method371((byte) 65);
			Class4.method56(true);
			Class33_Sub15.method798(-128);
			Class49.method934((byte) -62);
			Class82.method1216((byte) -18);
			Class33_Sub9.method611(-28853);
			Class79.method1191((byte) 38);
			Class54.method960(false);
			Class46.method921(512);
			Class33_Sub6_Sub14.method566((byte) -96);
			Class33_Sub6_Sub4_Sub5.method362((byte) 87);
			Class33_Sub5.method287(-7);
			Class33_Sub6_Sub16.method587((byte) -86);
			Class33.method271(17484);
			Class65.method1092(-5);
			Class9.method86((byte) 39);
			Class16.method149(-4);
			Class33_Sub6_Sub4_Sub3.method329();
			Class33_Sub6_Sub4_Sub7.method400();
			Class63.method1082(false);
			RuntimeException_Sub1.method1223((byte) 54);
			Class69.method1116(27250);
			Class33_Sub21.method833((byte) -115);
			Class62.method1080(8);
			Class29.method212(4280);
			Class33_Sub6_Sub4.method315(-1);
			Class66.method1098(5625);
			Class23.method185(-30303);
			Class48.method929(0);
			Class31.method254(113);
			Class1.method46();
			Class81.method1212(true);
			Class24.method192(102);
			Class60.method1072(false);
			Class30.method234(false);
			Class41.method890(0);
			Class47.method927(false);
			Class33_Sub13_Sub4.method756((byte) 100);
			Class26.method202(120);
			Class44.method909(0xffffff);
			Class36.method854(false);
			Class17.method155((byte) -124);
			Class35.method843((byte) -94);
			Class27.method210(-119);
			Class45.method910((byte) -113);
			Class39.method876(10892);
			Class33_Sub6_Sub2.method307(10);
			Class80.method1206(-2);
			Class33_Sub6_Sub7_Sub1.method432();
			Class33_Sub6_Sub7.method429();
			Class33_Sub6.method292(32331);
			Class11.method106(-17873);
			Class57.method1017(false);
			Class14.method128(-19549);
			Class33_Sub7.method606(102);
			Class10.method102();
			Class33_Sub13_Sub3.method746(-1);
			Class33_Sub10.method617(56);
			Class42.method893(0);
			Class33_Sub6_Sub12.method552(0);
			Class33_Sub6_Sub3.method308(true);
			Class33_Sub6_Sub1.method299(-1);
			Class33_Sub6_Sub17.method599(false);
			Class33_Sub6_Sub11.method543((byte) 20);
			Class33_Sub6_Sub6.method411((byte) 127);
			Class33_Sub6_Sub9.method515(-112);
			Class33_Sub6_Sub5.method404((byte) -38);
			Class33_Sub6_Sub13.method560((byte) -46);
			Class33_Sub6_Sub8.method510(101);
			Class33_Sub6_Sub15.method581(true);
			Class34.method838(115);
			Class33_Sub17.method808();
			Class20.method170(0);
			Class51.method942(0);
			Class38.method873((byte) 118);
			Class59.method1068(3);
			Class33_Sub12.method688(18485);
			Class33_Sub4.method282((byte) -96);
			Class33_Sub6_Sub10.method523(false);
			Class71.method1137(-124);
			Class32.method259((byte) 15);
			Class64.method1088();
			Class33_Sub6_Sub4_Sub6.method377(2);
			Class33_Sub6_Sub4_Sub4.method352(0);
			Class21.method173(0);
			Class74.method1156(-1);
			Class33_Sub2.method274(-1);
			Class33_Sub6_Sub4_Sub1.method321(-72);
			Class33_Sub6_Sub4_Sub2.method324((byte) -12);
			Class33_Sub3.method278((byte) -126);
			Class73.method1154(4);
			Canvas_Sub1.method44(true);
			Class22.method176(true);
			Class77_Sub2.method1179((byte) 69);
			Class15_Sub2.method139(true);
			Class50.method941((byte) 77);
			Class55.method964(true);
			Class19.method163((byte) 112);
			Class40.method886((byte) 121);
			Class79_Sub2.method1203();
			Class67.method1104();
			Class13.method123((byte) 106);
			int i = -20 / ((arg0 - -48) / 32);
			Class28.method211();
			Class33_Sub16.method802((byte) -114);
			Class5.method79();
			Class75.method1165((byte) 101);
			Class33_Sub20.method827(585);
			Class33_Sub18.method813(-19310);
			Class68.method1109((byte) -69);
			Class52.method946();
			Class25.method197();
			Class3.method51(3207);
			Class33_Sub19.method816(-57);
			return;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception, "client.M(" + arg0 + ')');
		}
	}

	public static int anInt1924;
	public static int anInt1925;
	public static int anInt1926;
	public static int anInt1927;
	public static int anInt1928;
	public static int anInt1929;
	public static int anInt1930;
	public static int anInt1931;
	public static int anInt1932;
	public static Class4 aClass4_1933 = new Class4();
	public static int anInt1934;
	public static int anInt1935;
	public static int anInt1936;
	public static int anInt1937;
	public static int anInt1938;
	public static Class58 aClass58_1939;
	public static Class30_Sub1 aClass30_Sub1_1940;
	public static Class58 aClass58_1941 = Class33_Sub6_Sub11.method535(100,
			"Startseite auf (WSpielkonto wiederherstellen(W)3");
	public static Class58 aClass58_1942 = Class33_Sub6_Sub11.method535(115, "backhmid1");
	public static Class82 aClass82_1943 = new Class82(32);
	public static Class58 aClass58_1944 = Class33_Sub6_Sub11.method535(103, "m");
	public static Class58 aClass58_1945 = Class33_Sub6_Sub11.method535(125, "An");
	public static Class58 aClass58_1946;
	public static Class58 aClass58_1947 = Class33_Sub6_Sub11.method535(99, "mapback");
	public static int anInt1948 = 0;
	public static Class58 aClass58_1949 = Class33_Sub6_Sub11.method535(101, "oberen Rand der Webseite ausw-=hlen)3");
	public static boolean aBoolean1950;

	static {
		aClass58_1939 = Class33_Sub6_Sub11.method535(118, "Please contact customer support)3");
		aClass58_1946 = aClass58_1939;
	}
}
