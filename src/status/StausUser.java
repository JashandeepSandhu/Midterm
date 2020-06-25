/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * june 24th
 * @author srinivsi
 */
public class StausUser 
{
    
    public enum status{
       REJECTED, PENDING, PROCESSING, APPROVED
    };
   public void statusDetail(int code)
{
switch(code)
        {
        case 0: System.out.println("REJECTED");
        break;
        case 1: System.out.println("PENDING");
        break;
        case 2:
        System.out.println("PROCESSING");
        break;
        case 3: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
