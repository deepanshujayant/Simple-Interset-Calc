/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.i.calc;

/**
 *
 * @author Deepanshu
 */
public class Xres {
    
    float num1,num2;
    int num3;
    public float Xmul(int p, float r, int t) {
        float xprod, x,a;
        a = r/100;
        x = a*t;
        xprod = p*(1+x);
        return xprod;
    }
    
}
