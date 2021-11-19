/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11.bai5;

import java.net.URL;
/**
 *
 * @author phamv
 */
public class TestURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        URL url = new URL("https://www.youtube.com/"); 
        displayURL(url); 
    } 
    private static void displayURL(URL url) 
    { 
        System.out.println("URL: " + url); 
        System.out.printf(" Protocol: %-32s Host: %-32s\n",url.getProtocol(),url.getHost()); 
        System.out.printf(" Port: %-32d Path: %-32s\n",url.getPort(),url.getPath()); 
        System.out.printf(" Authority: %-32s Query: %-32s\n",url.getAuthority(),url.getQuery()); 
        System.out.println(" User Info: " + url.getUserInfo()); 
    }
}
