package LoginMahe.logindemo.service;

import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoginService {
    @Autowired
    User user;
    public String loginMethod(){


        String message="hellomahe";

     
     return message;
    }


}
