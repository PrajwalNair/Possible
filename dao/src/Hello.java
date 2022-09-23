import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.dsig.XMLSignature.SignatureValue;

public class Hello {

	public static void main(String[] args) {
//		String value = "Hi Good evening Hanamant";
//		String.valueOf(value);
//		System.out.println(value.subSequence(0, 3));
//		System.out.println(value.subSequence(3, 7));
//		System.out.println(value.subSequence(8, 16));
//		System.out.println(value.subSequence(16, 24));

		HashMap map = new HashMap();
		map.put(1, "Java");
		map.put(2, "Program");
		map.put(3, "Code");
		
		
		
		
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(3));
	}
}
