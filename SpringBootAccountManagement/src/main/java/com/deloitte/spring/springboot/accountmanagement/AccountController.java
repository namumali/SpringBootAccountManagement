package com.deloitte.spring.springboot.accountmanagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Operation(summary = "It's the Get API for creating account")
	@GetMapping("/createAccount")
	public String createAccount() {
		return "account created";
	}
	
	@Operation(summary = "It's the Get API for updating account")
	@GetMapping("/updateAccount")
	public String updateAccount() {
		return "account updated";
	}
	
	@Operation(summary = "It's the Get API for deleting account")
	@GetMapping("/deleteAccount")
	public String deleteAccount() {
		return "account deleted";
	}
	
	@Operation(summary = "It's the Get API for getting account by id")
	@GetMapping("/getAccount/{id}")
	public String getAccount(@PathVariable int accountId) {
		return "The user "+ accountId;
		
	}
	
	@Operation(summary = "It's the Get API for getting account")
	@GetMapping("/getAccount")
	public String getAccount(@RequestParam int accountId, @RequestParam String accountName) {
		return "The user details are accountId "+ accountId+" "+"accountName "+accountName;
		
	}
	
	


}
