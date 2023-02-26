package com.konloch.constants;

/**
 * @author Konloch
 * @since 04/10/2020
 */
public class NS
{
	/**
	 * Represents one nanosecond in nanoseconds
	 */
	public static final long NANOSECOND = 1;
	
	/**
	 * Represents one millisecond in nanoseconds
	 */
	public static final long MILLISECOND = 1000000 * NANOSECOND;
	
	/**
	 * Represents one second in nanoseconds
	 */
	public static final long SECOND = 1000 * MILLISECOND;
	
	/**
	 * Represents one minute in nanoseconds
	 */
	public static final long MINUTE = 60 * SECOND;
	
	/**
	 * Represents one hour in nanoseconds
	 */
	public static final long HOUR = 60 * MINUTE;
	
	/**
	 * Represents one day in nanoseconds
	 */
	public static final long DAY = 24 * HOUR;
	
	/**
	 * Represents one month in nanoseconds
	 */
	public static final long MONTH = 31 * DAY;
	
	/**
	 * Represents one year in nanoseconds
	 */
	public static final long YEAR = 12 * MONTH;
	
	/**
	 * Represents one decade in nanoseconds
	 */
	public static final long DECADE = 10 * YEAR;
	
	/**
	 * Represents one century in nanoseconds
	 */
	public static final long CENTURY = 10 * DECADE;
}
