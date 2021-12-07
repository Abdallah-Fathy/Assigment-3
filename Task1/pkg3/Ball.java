/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment.pkg3;

/**
 *
 * @author DELL
 */
public class Ball implements Tossable{
    
    

    private String brandName;
    
    public Ball(String brandName){
        this.brandName = brandName;
    }
    @Override
    public void toss() {
        
    }
    public void bounce(){
        
    }

    public String getBrandName() {
        return brandName;
    }

    
    
}
