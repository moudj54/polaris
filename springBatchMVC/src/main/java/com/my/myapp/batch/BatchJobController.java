/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under, Version 2.0 (the "License");
 * you may not use this file except in compliance with Polaris Approval.
 * You may obtain a copy of the License at
 *
 *      http://www.polarisdigitech.net
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 
 */
package com.my.myapp.batch;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Busari Mujib
   @Project Polarisdigitech.net
 *
 */

@Controller
@RequestMapping("/batch")
public class BatchJobController {
	
	@Autowired
	private JobLauncher jobLauncher;
	

}
