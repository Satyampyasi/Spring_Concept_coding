package com.nit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configclass {
	@Bean
  public Address createAdsobj() {
	  Address add = new Address(200,"hatta",8454);
	  
//	  add.setCity("Denmark");
//	  add.setHouseno(454);
//	  add.setPincode(844220);
//	  
	return add;
	  
  }
	@Bean
	public Student createStuObj() {
		Student sta = new Student( createAdsobj(),"satyam",454,99);
//	   sta.setMarks(95);
//	   sta.setName("smith");
//	   sta.setRollNo(108);
//	   sta.setAddress(createAdsobj( ));
		  
		return sta;
		
	}
}
