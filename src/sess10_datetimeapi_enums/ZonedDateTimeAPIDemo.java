package sess10_datetimeapi_enums;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import util.Spacer;

/**
 * Java program to demonstrate the use of the offsetDateTime, offsetTime,
 * ZonedDateTime, zoneId & zoneOffset classes from the java.time package.
 * 
 * 1. OffsetDateTime: represents a date-time with an offset from UTC/Greenwich.
 * 2. OffsetTime: represents a time with an offset from UTC/Greenwich (no date).
 * 3. ZonedDateTime:  represents a date-time with a time zone.
 * 4. ZoneId: represents a time zone identifier (e.g. "Africa/Nairobi").
 * 5. ZoneOffset: represents a fixed offset from UTC/Greenwich
 * 
 * @author Window
 */
public class ZonedDateTimeAPIDemo
{
    //=====================================
    // Class Methods
    //Demonstrate the offsetDateTime class
    //========================================
    private static void demoOffsetDateTime()
    {
        System.out.println("1. OffsetDateTime: Handles Date-time with an offset " + "from the UTC/Greenwich.");
        
        // Get the current date 7 time with an offset from UTC
        OffsetDateTime nowWithOffset = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime (with system default " + "offset): " + nowWithOffset);
        
        // Create & display a specific OffsetDateTime (eg, 2025-03-25T07:30:00+3:00)
        OffsetDateTime birthdayOffsetDateTime = OffsetDateTime.of(2025, 3, 25, 7, 30, 0, 0, ZoneOffset.ofHours(3));
        System.out.println("Birthday with OffsetDateTime: " + "(2025-03-25T07:30:00+3:00):" + birthdayOffsetDateTime);
        
        //Add/subtract & display time with OffsetDateTime
        OffsetDateTime fourDaysLater = nowWithOffset.plusDays(4);
        System.out.println("Four days after nowWithOffset: " + fourDaysLater);
        OffsetDateTime twoHoursEarlier = nowWithOffset.minusHours(2);
        System.out.println("Two hours before nowWithOffset: " + twoHoursEarlier);
    }
    
    //=======================================
    //2. Demonstrate the offsetTime class
    //========================================
    private static void demoOffsetTime()
    {
        System.out.println("2. OffsetTime: Handles time with an offset (no date)" + "from the UTC/Greenwich.");
        
        // Get & display the current time with an offset from UTC
        OffsetTime currentTimeWithOffset = OffsetTime.now();
        System.out.println("Current OffsetTime (with system default offset) " + "is: " + currentTimeWithOffset);
        
        // Create & display a specific OffsetTime (eg, 15:30::00+2:000)
        OffsetTime specificOffsetTime = OffsetTime.of(15, 30, 0, 0, ZoneOffset.ofHours(2));
        System.out.println("Specific OffsetTime (15:30:+2:00): " +  specificOffsetTime);
        
        //Add/subtract & display time with OffsetTime
        System.out.println("Three hours after current Offset Time will be: " + currentTimeWithOffset.plusHours(3));
        System.out.println("Twenty five minutes before current Offset time " + "was: " + currentTimeWithOffset.minusMinutes(25));
    }
    
    //=========================================
    //3. Demonstrate the ZonedDateTime class
    //========================================
    private static void demoZonedDateTime()
    {
        System.out.println("3. ZonedDateTime: Handles Date-time with a time zone.");
        
        // Get the current date & time in a specific time zone (eg, Nairobi, Accra, shanghai, Seoul)
        // "Africa/Nairibi", "Africa/Accra:, "Asia/Shanghai","Asia/Seoul"
        ZonedDateTime nowInNairobi = ZonedDateTime.now(ZoneId.of("Africa/Nairobi"));
        System.out.println("Current OffsetDateTime (with system default " + "offset): " + nowInNairobi);
        
        // Create & display a specific XZonedDateTime (eg, 2025-12-12T14:30:00+08:00 Asia/Shanghai)
        ZonedDateTime shanghaiZonedDateTime = ZonedDateTime.of(2025, 12, 12, 14, 30, 0, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println("Specific ZonedDateTime in Shanghai, " + "China (2025-12-12T14:30:00+08:00 [Asia/Shanghai]) is: " + " " + shanghaiZonedDateTime);
        
        //Convert zonedDateTime to a diff time zone (eg. utc)
        System.out.println("Nairobi ZonedDateTime converted to UTC is: " + "" + nowInNairobi.withZoneSameInstant(ZoneId.of("UTC")));
    }
    
    //=============================================
    //4. Demonstrating the ZoneId class
    //=============================================
    private static void demoZoneId() 
    {
        System.out.println("4. ZoneId: Handling Time Zone Identifiers");
 
        // Get the system's default time zone
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println("System Default Time Zone: " + systemZoneId);
 
        // Get a time zone by ID (e.g., Nairobi)
        ZoneId newYorkZone = ZoneId.of("Africa/Nairobi");
        System.out.println("New York Time Zone: " + newYorkZone);
 
        // Get all available time zones
        System.out.println("Available Time Zones:");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
 
    //=============================================
    //5. Demonstrating the ZoneOffset class
    //=============================================
    private static void demoZoneOffset() 
    {
        System.out.println("5. ZoneOffset: Handling Fixed Offsets from UTC");
 
        // Get the system's current UTC offset
        ZoneOffset systemOffset = ZoneOffset.systemDefault().getRules().getOffset(java.time.Instant.now());
        System.out.println("System's Current UTC Offset: " + systemOffset);
 
        // Create a specific ZoneOffset (e.g., UTC+2 hours)
        ZoneOffset offsetPlusTwo = ZoneOffset.ofHours(2);
        System.out.println("ZoneOffset UTC+2: " + offsetPlusTwo);
 
        // Create a specific ZoneOffset (e.g., UTC-5 hours)
        ZoneOffset offsetMinusFive = ZoneOffset.ofHours(-5);
        System.out.println("ZoneOffset UTC-5: " + offsetMinusFive);
    }
    
    // Main method begins program execution
    public static void main(String[] args)
    {
        // 1. Demonstrating the OffsetDateTime class
        demoOffsetDateTime();
        Spacer.separator();
        
        // 2. Demonstrating the OffsetTime class
        demoOffsetTime();
        Spacer.separator();
        
        // 3. Demonstrating the ZonedDateTime class
        demoZonedDateTime();
        Spacer.separator();
        
        // 4. Demonstrating the ZonedDateTime class
        demoZoneId();
        Spacer.separator();
        
        // 5. Demonstrating the ZonedDateTime class
        demoZoneOffset();
        Spacer.separator();
        
    }
}
