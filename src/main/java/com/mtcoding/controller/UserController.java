package com.mtcoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mtcoding.dao.UserRepository;
import com.mtcoding.model.User;
import com.mtcoding.model.Userlogindetails;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository  userRepository;
    
    
    
    
	@RequestMapping("/test")
	@ResponseBody
	public String handleTest() {
		
		return("this is testing command");
	}
	
	@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Mapping for processing user login
    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Implement your login logic here (e.g., check credentials)
        // Redirect to appropriate page based on login result
        return "redirect:/list"; // Redirect to user list page on successful login
    }

    // Mapping for displaying the signup form
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("newUser", new Userlogindetails());
        return "signup";
    }

    // Mapping for processing user signup
    @PostMapping("/signup")//@PostMapping("/signup")
    public String signupUser(@ModelAttribute("newUser") Userlogindetails newUser) {
        // Implement your signup logic here (e.g., save user to the database)
        // Redirect to appropriate page based on signup result
        return "redirect:/login"; // Redirect to login page after successful signup
    }


    // Mapping for displaying the registration form
    @GetMapping("/")//register
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    // Mapping for processing user registration
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "redirect:/list";
    }

    // Mapping for displaying the user list
    @GetMapping("/list")
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    // Mapping for displaying the user update form
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user ID: " + id));
        model.addAttribute("user", user);
        return "update";
    }

    // Mapping for processing user update
    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "redirect:/list";
    }

    // Mapping for deleting a user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return "redirect:/list";
    }
}
