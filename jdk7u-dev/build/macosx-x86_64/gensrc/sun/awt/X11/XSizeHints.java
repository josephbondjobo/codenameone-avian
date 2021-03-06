// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XSizeHints extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return ((XlibWrapper.dataModel == 32)?(72):(80)); }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XSizeHints(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XSizeHints() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public long get_flags() { log.finest("");return (Native.getLong(pData+0)); }
	public void set_flags(long v) { log.finest(""); Native.putLong(pData+0, v); }
	public int get_x() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(4):(8)))); }
	public void set_x(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(4):(8)), v); }
	public int get_y() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(8):(12)))); }
	public void set_y(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(8):(12)), v); }
	public int get_width() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(12):(16)))); }
	public void set_width(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(12):(16)), v); }
	public int get_height() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(16):(20)))); }
	public void set_height(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(16):(20)), v); }
	public int get_min_width() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(20):(24)))); }
	public void set_min_width(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(20):(24)), v); }
	public int get_min_height() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(24):(28)))); }
	public void set_min_height(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(24):(28)), v); }
	public int get_max_width() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(28):(32)))); }
	public void set_max_width(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(28):(32)), v); }
	public int get_max_height() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(32):(36)))); }
	public void set_max_height(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(32):(36)), v); }
	public int get_width_inc() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(36):(40)))); }
	public void set_width_inc(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(36):(40)), v); }
	public int get_height_inc() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(40):(44)))); }
	public void set_height_inc(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(40):(44)), v); }
	public int get_min_aspect_x() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(44):(48)))); }
	public void set_min_aspect_x(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(44):(48)), v); }
	public int get_min_aspect_y() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(48):(52)))); }
	public void set_min_aspect_y(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(48):(52)), v); }
	public int get_max_aspect_x() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(52):(56)))); }
	public void set_max_aspect_x(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(52):(56)), v); }
	public int get_max_aspect_y() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(56):(60)))); }
	public void set_max_aspect_y(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(56):(60)), v); }
	public int get_base_width() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(60):(64)))); }
	public void set_base_width(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(60):(64)), v); }
	public int get_base_height() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(64):(68)))); }
	public void set_base_height(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(64):(68)), v); }
	public int get_win_gravity() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(68):(72)))); }
	public void set_win_gravity(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(68):(72)), v); }


	String getName() {
		return "XSizeHints"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(720);

		ret.append("flags = ").append( get_flags() ).append(", ");
		ret.append("x = ").append( get_x() ).append(", ");
		ret.append("y = ").append( get_y() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("height = ").append( get_height() ).append(", ");
		ret.append("min_width = ").append( get_min_width() ).append(", ");
		ret.append("min_height = ").append( get_min_height() ).append(", ");
		ret.append("max_width = ").append( get_max_width() ).append(", ");
		ret.append("max_height = ").append( get_max_height() ).append(", ");
		ret.append("width_inc = ").append( get_width_inc() ).append(", ");
		ret.append("height_inc = ").append( get_height_inc() ).append(", ");
		ret.append("min_aspect_x = ").append( get_min_aspect_x() ).append(", ");
		ret.append("min_aspect_y = ").append( get_min_aspect_y() ).append(", ");
		ret.append("max_aspect_x = ").append( get_max_aspect_x() ).append(", ");
		ret.append("max_aspect_y = ").append( get_max_aspect_y() ).append(", ");
		ret.append("base_width = ").append( get_base_width() ).append(", ");
		ret.append("base_height = ").append( get_base_height() ).append(", ");
		ret.append("win_gravity = ").append( get_win_gravity() ).append(", ");
		return ret.toString();
	}


}



