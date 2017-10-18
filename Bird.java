class Bird implements Animal {     
     private String myType;     
     private String mySound;      
     public Bird(String type, String sound)     
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Bird()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}