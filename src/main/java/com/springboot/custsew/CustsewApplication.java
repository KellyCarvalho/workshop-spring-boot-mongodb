package com.springboot.custsew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.custsew.entities.Address;
import com.springboot.custsew.entities.Customer;
import com.springboot.custsew.entities.Owner;
import com.springboot.custsew.entities.Person;
import com.springboot.custsew.entities.User;
import com.springboot.custsew.entities.enums.Genre;
import com.springboot.custsew.entities.enums.TypeAccess;

@SpringBootApplication
public class CustsewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustsewApplication.class, args);

/*		Address address = new Address(0, "camaçari", "Mangueiral", 2, "gramado", "proximo ao mercado");

		Person person = new Owner(0, "Kelly", "5641465456", "5456456",
				new Address(0, "camaçari", "Mangueiral", 2, "gramado", "proximo ao mercado"), 
				Genre.FEMALE,
				TypeAccess.ADMIN, 
				new User(0, "blackComet", "123456")
				);

		System.out.println(person);*/

	}

}
