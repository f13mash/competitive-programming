import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;
 
public class IDNumberVerification
{
  public String verify(String id, String[] regionCodes) {
 
    Set<String> rc = new HashSet<String>();
    for (String s : regionCodes) {
      rc.add(s);
    }
 
    String s1 = id.substring(0, 6);
    String s2 = id.substring(6, 14);
    String s3 = id.substring(14, 17);
    String s4 = id.substring(17, 18);
 
    if (!rc.contains(s1)) {
      return "Invalid";
    }
 
    if (s3.equals("000")) {
      return "Invalid";
    }
 
    if (!isDateValid(s2)) {
      return "Invalid";
    }
 
    if (!isDateValid2(s2)) {
      return "Invalid";
    }
 
    int x = s4.equals("X") ? 10 : Integer.parseInt(s4);
    if (valid(id, x)) {
      return gr(s3);
    }
    return "Invalid";
  }
 
  private String gr(String s3) {
    Integer i = Integer.parseInt(s3);
    return (i % 2 == 0) ? "Female" : "Male";
  }
 
  private static boolean valid(String id, int x) {
    long total = 0;
    for (int i = 0; i < id.length() - 1; i++) {
      int q = id.charAt(i) - '0';
      total += q * Math.pow(2, 17 - i);
    }
    total += x;
    total %= 11;
    return total == 1;
  }
 
  private static boolean isDateValid2(String date) {
    if (date.compareTo("19000101") < 0 || date.compareTo("20111231") > 0) {
      return false;
    } else {
      return true;
    }
  }
 
  private static boolean isDateValid(String date) {
    try {
      DateFormat df = new SimpleDateFormat("yyyyMMdd");
      df.setLenient(false);
      df.parse(date);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }
  
  
}
//Powered by [KawigiEdit] 2.0!