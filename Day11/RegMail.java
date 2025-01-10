/*Task: Write a Java program to validate a list of email addresses using regular expressions. The program should:
Accept a list of email addresses as input.
Validate each email address against the following rules:
It must start with a letter or a number.
It can include letters, numbers, dots (.), hyphens (-), and underscores (_).
The domain name should be valid, ending with .com, .org, or .net.
Print whether each email address is valid or invalid.*/

package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMail {

	public static void main(String[] args) {
		
		String []gmail= {"user@example.com","user.name@domain.org","invalid-email@domain","user@domain_net","@missinguser.com"};
		String f="^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
		Pattern p=Pattern.compile(f);
		
		for(String s:gmail) {
			Matcher m=p.matcher(s);
			if(m.matches()) {
				System.out.println(s+":"+" "+"Valid");
			}else {
				System.out.println(s+":"+" "+"InValid");
			}
		}
		
	}

}
