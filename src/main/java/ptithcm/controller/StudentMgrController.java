package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student-mgr")
public class StudentMgrController {
	
	@RequestMapping()
	public String index(ModelMap model) {
		model.addAttribute("message","Ban goi index()");
		return "student-mgr";
	}
	
	@RequestMapping(params="btnInsert")
	public String insert(ModelMap model) {
		model.addAttribute("message","Ban goi insert()");
		return "student-mgr";
	}
	@RequestMapping(params="btnUpdate")
	public String update(ModelMap model) {
		model.addAttribute("message","Ban goi update()");
		return "student-mgr";
	}
	@RequestMapping(params="btnDelete")
	public String delete(ModelMap model) {
		model.addAttribute("message","Ban goi delete()");
		return "student-mgr";
	}
	@RequestMapping(params="InkEdit")
	public String edit(ModelMap model) {
		model.addAttribute("message","Ban goi edit()");
		return "student-mgr";
	}
	
}
