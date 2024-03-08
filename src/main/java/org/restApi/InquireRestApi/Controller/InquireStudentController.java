package org.restApi.InquireRestApi.Controller;

import org.restApi.InquireRestApi.Structure.InquireStudentReq;
import org.restApi.InquireRestApi.Structure.InquireStudentResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquireStudentController {

    @GetMapping("/inquireStudent")
    public InquireStudentResp inquireStudent(@RequestBody InquireStudentReq inquireStudentReq){

        InquireStudentResp obj = new InquireStudentResp();
        obj.setStudentName("Ankit");
        obj.setStudentClass("12");
        obj.setStudentAge("14");
        obj.setStudentDOB("01-01-1996");
        obj.setStudentGender("M");
        return obj;

    }

}
