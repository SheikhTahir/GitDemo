package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class demo {
		@Test
		public void Meth2() {
			System.out.println("Bye");
		}
		
		@Parameters({ "URL" })
		@Test
		public void PersonalPara(String url) {
			System.out.println("Bye");
			System.out.println(url);
		}
		
		
		
}
