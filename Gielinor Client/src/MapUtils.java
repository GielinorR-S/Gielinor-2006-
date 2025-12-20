/*
 * Class: MapDecompressor.java
 * Loads decompressed maps from a subcache.
 * @ Author: Zee best
*/

import java.io.RandomAccessFile;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MapUtils {

	public static List<Integer> mapIndices = null;
	public static Map<Integer, byte[]> mapBuffer = new HashMap<Integer, byte[]>();
	
	public static byte[] grabMap(int id) throws IOException
	{
		if(mapIndices == null)
			loadIndex2();
		if(mapBuffer.get(id) == null)
		{
			RandomAccessFile raf_cache = new RandomAccessFile("./cache/.jagex_cache_32/maps/MAP_CACHE.dat", "rw");
			RandomAccessFile raf_index = new RandomAccessFile("./cache/.jagex_cache_32/maps/MAP_CACHE.idx", "rw");
			int pos = getIndexPosition(id);
			if(pos == -1)
				return null;
			raf_index.seek(pos * 12);
			raf_cache.seek(raf_index.readInt());
			byte[] b = new byte[raf_index.readInt()];
			raf_cache.readFully(b);
			b = inflate(b, raf_index.readInt());
			mapBuffer.put(id, b);
			return mapBuffer.get(id);
		}
		return mapBuffer.get(id);
	}

	public static void loadIndex2() throws IOException
	{
		mapIndices = new ArrayList<Integer>();
		DataInputStream dis = new DataInputStream(new FileInputStream("./cache/.jagex_cache_32/maps/MAP_CACHE.idx2"));
		for (int i = 0; i < (int) new File("./cache/.jagex_cache_32/maps/MAP_CACHE.idx2").length() / 2; i++)
			mapIndices.add((int) dis.readShort());
	}

	public static int getIndexPosition(int id) throws IOException
	{
		if(mapIndices.contains(id))
			for (int i = 0; i < mapIndices.size(); i++)
				if(mapIndices.get(i) == id)
					return i;
		return -1;
	}

	public static byte[] inflate(byte[] b, int l) throws IOException
	{
		byte[] buf = new byte[l];
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		DataInputStream dis = new DataInputStream(new GZIPInputStream(bais));
		dis.readFully(buf, 0, buf.length);
		dis.close();
		return buf;
	}

	public static void objectLoader(String file){
		try {
			RandomAccessFile in = new RandomAccessFile(file, "r");
			int totalObjects = in.readInt();
			for (int index = 0; index < totalObjects; index++) {
				String data = in.readUTF();
				int objectId = Integer.parseInt(data.substring(data.indexOf("i:")+3, data.indexOf("x")-1));
				int x = Integer.parseInt(data.substring(data.indexOf("x:")+3, data.indexOf("y")-1));
				int y = Integer.parseInt(data.substring(data.indexOf("y:")+3, data.indexOf("z")-1));
				int objectPlane = Integer.parseInt(data.substring(data.indexOf("z:")+3, data.indexOf("d")-1));
				int direction = Integer.parseInt(data.substring(data.indexOf("d:")+3, data.indexOf("t")-1));
				int type = Integer.parseInt(data.substring(data.indexOf("t:")+3));
				if(objectId != -1){
				spawnObject(objectId, x, y, objectPlane, direction, type);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void spawnObject(int objectId, int x, int y, int z, int rotation, int type) {
		try {
			final Class70[] groundData = Class51.aClass70Array1098;
			int localX = x - Class69.anInt1475;
			int localY = y - Class33_Sub2.anInt2036;
			int plane = z;
			if ((Class35.aByteArrayArrayArray761[1][localX][localY] & 2) == 2) {
				plane--;
			}

			Class70 class70 = null;
			if (~plane <= -1) {
				class70 = groundData[z];
			}
			if (~localX < -1 && ~localY < -1 && ~localX > -104 && ~localY > -104) {
				Class33_Sub20.method823(rotation, localY, Class33_Sub2.aClass56_2035, localX, objectId, class70, type, (byte) 87, z);
			}
		} catch (Exception e) {
		}

	}

}