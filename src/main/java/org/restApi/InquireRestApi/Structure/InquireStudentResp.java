package org.restApi.InquireRestApi.Structure;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class InquireStudentResp {

    private String studentId,
            studentName,
            studentDOB,
            studentGender,
            studentClass,
            studentAge;

}
