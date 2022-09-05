package co.develhope.loginSystem.auth.controllers;

import co.develhope.loginSystem.auth.entities.SignUpActivationDTO;
import co.develhope.loginSystem.auth.entities.SignUpDTO;
import co.develhope.loginSystem.auth.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signUp")
    public void signUp(@RequestBody SignUpDTO signUpDTO) throws Exception {
        signUpService.signUp(signUpDTO);
    }

    @PostMapping("/signUp/activation")
    public void signUpActivation(@RequestBody SignUpActivationDTO signUpActivationDTO) throws Exception {
        signUpService.activate(signUpActivationDTO);
    }
}
