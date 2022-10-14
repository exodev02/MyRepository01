package com.exodev.source;

public class PasswordGenerator {

    public PasswordGenerator() {
    }
    
    public String genPassword(int s){
        StringBuilder chars = new StringBuilder();
        chars.append(uppercase);
        chars.append(lowercase);
        chars.append(numbers);
        chars.append(signs);
        
        StringBuilder password = new StringBuilder();
        
        for(int i = 0; i < s; i++){
            int count = chars.length();
            int random = (int)(Math.random() * count);
            
            password.append((chars.toString()).charAt(random));
        }
        
        return password.toString();
    }
    
    // - Class Fields - //
    char[] uppercase    =   {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char[] lowercase    =   {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] numbers      =   {'0','1','2','3','4','5','6','7','8','9'};
    char[] signs        =   {'#','$','?','¿','@','*',',','.'};
    // - - - - - - - - - //
}
