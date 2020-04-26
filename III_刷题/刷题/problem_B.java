import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_B {

	public static void main(String[] args) {
		String string = "   -42".trim().split(" ")[0];
		
		Pattern pattern = Pattern.compile("(\\+|\\-)?\\d+");
		Matcher matcher = pattern.matcher(string);
		if (matcher.find()) {
			String temp = matcher.group();
			boolean flag1 = false, flag2 = false;
			if (temp.charAt(0) == '-') {
				flag1 = true;
				temp = temp.substring(1);
			} else if (temp.charAt(0) == '+') {
				flag2 = true;
				temp = temp.substring(1);
			}
				
			try {
				if (flag1) {
					System.out.println("-"+Integer.parseInt(temp));
				} else if (flag2) {
					System.out.println("+"+Integer.parseInt(temp));
				} else {
					System.out.println("-"+Integer.parseInt(temp));
				}				
			} catch (Exception e) {
				if (flag1) {
					System.out.println("-2147483648");
				} else {
					System.out.println("2147483647");
				}
			}
		} else {
			System.out.println(0);
		}	
	}
	
}