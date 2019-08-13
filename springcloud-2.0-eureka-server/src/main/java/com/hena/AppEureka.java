/**
 * 
 */
package com.hena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hena
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppEureka.class, args);
	}

}
