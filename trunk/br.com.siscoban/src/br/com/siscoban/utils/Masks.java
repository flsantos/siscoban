package br.com.siscoban.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.DefaultFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class Masks {

	private static DefaultFormatter fmt;
	private static DefaultFormatterFactory r;
	private static NumberFormat percentFormat;
	
	public static DefaultFormatterFactory getMoneyMask () {
		String t = "###,###,###,###0.00";  
        fmt = new NumberFormatter(new DecimalFormat(t));  
        r = new DefaultFormatterFactory(fmt, fmt, fmt);
		return r;
	}
	
	public static DefaultFormatterFactory getPercentMask () {

		String t = "##0.00";  
        fmt = new NumberFormatter(new DecimalFormat(t));
	    fmt = new NumberFormatter(percentFormat);
	    r = new DefaultFormatterFactory(fmt, fmt, fmt);

	    return r;
	}
}
