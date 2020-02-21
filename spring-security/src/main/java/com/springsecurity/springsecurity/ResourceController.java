package com.springsecurity.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceController {
@GetMapping("/")
public String home()
{
	return ("<h1>Welcome<h1>");
}

@GetMapping("/user")
public String user()
{
	return ("<h1>Welcomeuser<h1>");
}
@GetMapping("/admin")
public String admin()
{
	return ("<h1>Welcomeadmin<h1>");
}
}