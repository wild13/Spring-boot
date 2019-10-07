package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul><li><a href='http://localhost:8080/doctor/1'>name doctor 1 ?</a></li>"
	        		+ "<li><a href='http://localhost:8080/doctor/2'>name doctor 2 ?</a></li>"
	        		+ "<li><a href='http://localhost:8080/doctor/3'>name doctor 3 ?</a></li>"
	        		+ "<li><a href='http://localhost:8080/doctor/4'>name doctor 4 ?</a></li>"
	        		+ "</ul>";
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "William Hartnell";
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String index2() {
        return "Patrick Troughton";
    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String index3() {
        return "Jon Pertwee";
    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String index4() {
        return "Tom Baker";
    }

}
