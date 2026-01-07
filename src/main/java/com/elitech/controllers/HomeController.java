package com.elitech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class HomeController {
@GetMapping("hello") // localhost:8080/hello
public String sayHello()
{
return "<h1>hello spring</h1>";	
}
@GetMapping("hi")
public String sayHi(@RequestParam(required = false,defaultValue = "") String nom,@RequestParam(required = false,defaultValue = "") String prenom)
{
return "hello "+nom+" "+prenom;	

}
@PostMapping("hi")
public String sayMyName(@RequestParam(required = false,defaultValue = "") String nom,@RequestParam(required = false,defaultValue = "") String prenom)
{
return "hello "+nom+" "+prenom;	

}
@GetMapping("/welcome/{id}")
public String welcome(@PathVariable int id)
{
return "hello "+id;	
}
}
