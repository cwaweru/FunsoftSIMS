/*
 * SendClaimMail.java
 *
 * Created on July 2, 2006, 10:54 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package biz.systempartners.claims;

/**
 *
 * @author root
 */
public class SendClaim{
    
    /** Creates a new instance of SendClaimMail */
    public static void sendClaim(java.io.File claimFile,  String schemeMailAddress) {
        
        biz.systempartners.claims.SendFile sendFile = new biz.systempartners.claims.SendFile();
        
        System.out.println("Claim File Name :::: ["+claimFile+"]"); 
        
        System.out.println("Scheme mail adress 111 : ["+schemeMailAddress+"]");
        
        sendFile.SendFile(claimFile.getPath(), schemeMailAddress);
        
    }
    
}
