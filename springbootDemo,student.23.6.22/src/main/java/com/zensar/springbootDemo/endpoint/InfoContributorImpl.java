package com.zensar.springbootDemo.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
@Component
public class InfoContributorImpl implements InfoContributor{

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> studentDetails = new HashMap<String,Object>();
		studentDetails.put("CreatedBy", "Raghavendra");
		studentDetails.put("ModifiedOn","23.06.2022");
		//builder.withDetails(studentDetails);
		builder.withDetail("Student", studentDetails);
		
		
		
	}

}
