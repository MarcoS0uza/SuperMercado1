/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

/**
 *
 * @author MARCOANTONIO
 */
public class Tools {

    public Tools() {
    }
    
    public String retiraMascara(String s){
        return s.replaceAll("[)(./-]", "").trim();
    }
    
}
