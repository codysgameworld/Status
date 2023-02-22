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

    public enum Status {
        REJECTED,
        PENDING,
        PROCESSING,
        APPROVED
    }

   public void statusDetail(Status x)
{
switch(x)
        {
        case REJECTED: 
            System.out.println(Status.REJECTED);
            break;
        
        case PENDING: 
            System.out.println(Status.PENDING);
            break;
        
        case PROCESSING:
            System.out.println(Status.PROCESSING);
            break;
        
        case APPROVED: 
            System.out.println(Status.APPROVED);
            break;
        
        default:
            System.out.println("NOT VALID CODE");
            break;
        }
}


}
