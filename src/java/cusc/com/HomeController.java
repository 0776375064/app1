/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusc.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/")
    public String displayMainMenu(){
        return"main_menu";
    }
    @RequestMapping("/process-form")
    public String processForm(){
        return "result";
    }
            }
