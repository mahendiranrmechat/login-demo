package LoginMahe.logindemo.controller;

import LoginMahe.logindemo.service.LoginService;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    LoginService loginService;


    @PostMapping("login")
    public String loginMethod(){
         String method=loginService.loginMethod();

         return method;
    }
}
