package com.deskover.other.util;

import java.text.DecimalFormat;

public class DecimalFormatUtil {
	
	public static String FormatDecical(String format) {
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		
		return formatter.format(Integer.parseInt(format));
	}

}
