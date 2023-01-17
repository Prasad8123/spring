package com.xworkz.bowser.beans;

import org.springframework.stereotype.Component;

@Component
public class Firefox  implements Browser{

	@Override
	public void getBrowser() {
		
		System.out.println("firefox is a borwser to browsering.....");
		
	}

}
