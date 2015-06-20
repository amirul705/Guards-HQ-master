/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.List;

/**
 *
 * @author Asveni
 */
public class Login extends DataEngine {  
    private static String _UserRole = "0";
    List<String[]> LoginData;
    public Login(String FileName) {
        super(FileName);
        LoginData = ReadFile();
    }
    
    public static String UserRole () {
        return _UserRole;
    }
    
    public static void SetUserRole (String UserRole) {
        _UserRole = UserRole;
    }
    
    public int Authenticate (String Username, String Password) {
        for (String[] Data : LoginData) {
            if (Data[0].split("\\.")[1].equals(Username) && Data[1].split("\\.")[1].equals(Password)){
                _UserRole = Data[2].split("\\.")[1];
                 break;
            }
        }
        if (_UserRole == null) {
            return 0;
        }
        else if (_UserRole.equals("Admin")) {
            return 1;
        }
        else if (_UserRole.equals("Reservation Staff")) {
            return 2;
        }
        else if (_UserRole.equals("Front Desk Staff")) {
            return 3;
        }
        else if (_UserRole.equals("Cleaning Staff")) {
            return 4;
        }
        else if (_UserRole.equals("Manager")) {
            return 5;
        }        
        return 0;
    }    
   
}
