/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusc.vn;

import cusc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/")
public class StudentController {
    @RequestMapping("")
    public String showStudentForm(Model theModel){
        theModel.addAttribute("student", new Student());
        System.out.println("vo day");
        return "student-form";
    }
    @RequestMapping("process-form")
    public String processForm(@ModelAttribute("student") Student theStudent, Model model){
        model.addAttribute("sinhvien", theStudent);
        return "confirm-page";
    }
}
