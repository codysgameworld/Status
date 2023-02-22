/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{

    public enum Code {
        ZERO,
        ONE,
        TWO,
        THREE
    }

    public enum Status {
        REJECTED,
        PENDING,
        PROCESSING,
        APPROVED
    }

   public void statusDetail(String code)
{
switch(Code.valueOf(code))
        {
        case ZERO: 
            System.out.println(Status.REJECTED);
            break;
        
        case ONE: 
            System.out.println(Status.PENDING);
            break;
        
        case TWO:
            System.out.println(Status.PROCESSING);
            break;
        
        case THREE: 
            System.out.println(Status.APPROVED);
            break;
        
        default:
            System.out.println("NOT VALID CODE");
            break;
        }
}


}
