package com.hirewheel.hirewheel;

import com.hirewheel.hirewheel.dao.BookingDao;
import com.hirewheel.hirewheel.dao.UsersDao;
import com.hirewheel.hirewheel.entities.Booking;
import com.hirewheel.hirewheel.entities.Location;
import com.hirewheel.hirewheel.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HirewheelApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(HirewheelApplication.class, args);

		UsersDao usersDao = context.getBean(UsersDao.class) ;

		Users user1 = new Users() ;
		Users user2 = new Users() ;
		Users user3 = new Users() ;

		user1.setFirstName("Rahul");
		user1.setLastName("Sharma");
		user1.setEmail("rahul@gmail.com");
		user1.setPassword("rahul123");
		user1.setMobileNumber("8692927930");
		user1.setWalletMoney(500.00);


		user2.setFirstName("Kelvin");
		user2.setLastName("shaw");
		user2.setEmail("k@gmail.com");
		user2.setPassword("kelvin123");
		user2.setMobileNumber("8692927931");
		user2.setWalletMoney(1500.00);
//		user3.setFirstName("Ram");

		List<Users> usersList = new ArrayList<>() ;
		usersList.add(user1) ;
		usersList.add(user2) ;
//		usersList.add(user3) ;

		usersDao.saveAll(usersList) ;

		System.out.println("*** Custom Query first name ***");
		usersDao.findByFirstName("KeLvin")
				.forEach(users -> System.out.println("Name: " + users.getFirstName() + "Mobile Number " + users.getMobileNumber()
				+ "Wallet Money " + users.getWalletMoney())) ; // OUTPUT: Name: KelvinMobile Number 8692927931Wallet Money 1500.0

		System.out.println("** Custom Query first name or last name ***");
		usersDao.findByFirstNameOrLastName("","Sharma")
				.forEach(users -> System.out.println(users.getEmail())); //OUTPUT: rahul@gmail.com

		System.out.println("*** Custom Query find by email ***");
		usersDao.findByEmail("k@gmail.com")
				.forEach(users -> System.out.println(users.getFirstName() + " " + users.getLastName()));

		System.out.println("*** Custom Query find by mobile number ***");
		usersDao.findByMobileNumber("8692927930")
				.forEach(users -> System.out.println(users.getFirstName())); // OUTPUT: Rahul

		// Pagination
		System.out.println("****************** Finding First Page of the Users *********************");
		Page<Users> page0 = usersDao.findAll(PageRequest.of(0,2)) ;
		page0.stream().forEach(users -> System.out.println(users.getFirstName()));

		BookingDao bookingDao = context.getBean(BookingDao.class) ;

		Booking booking1 = new Booking() ;
		booking1.setBookingDate(LocalDateTime.of(2016,3,25,2,31));
		booking1.setAmount(500.00);
		booking1.setDropOffDate(LocalDateTime.of(2016,3,25,1,10));
		booking1.setPickupDate(LocalDateTime.of(2016,3,25,2,31));

	}

}
