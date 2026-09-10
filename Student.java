
package VoLamNhatTan_7374.Lec08_ObjectAndClass;

import java.util.*;
public class Student {
    private String studentId;
    private String fullName;
    private String major;
    
    public Student(){
        
    }
    public Student(String StudentId, String fullname, String major){
        this.studentId = StudentId;
        this.fullName = fullname;
        this.major = major;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfo() {
        System.out.println(studentId + " - " + fullName + " - " + major);
    }
}
    



    
    

    
    

    
        
    
    

