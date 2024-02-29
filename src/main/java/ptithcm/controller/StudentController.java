
package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
@Controller
public class StudentController {
	
	@RequestMapping(value = "/student", method= RequestMethod.GET)
	public String showForm() {
		return "student/form";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String saveData(HttpServletRequest req)
	{
		String name = req.getParameter("name");
		String mark = req.getParameter("mark");
		String major = req.getParameter("major");
		
		req.setAttribute("name", name);
		req.setAttribute("mark", mark);
		req.setAttribute("major", major);
		
		return "student/success";
	}
	
	
	
}
