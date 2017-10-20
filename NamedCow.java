class NamedCow extends Cow
{    
   private String mySound;
   private String myName;
   private String myType;
   public NamedCow(String name, String type, String sound)     
     {         
         myName = name;         
         mySound = sound;
         myType = type;
     }     
     public NamedCow()     {         
         myName = "unknown";         
         mySound = "unknown";
         myType = "unknown";
     }      
     public String getSound(){return mySound;}     
     public String getName(){return myName;}
     public String getType(){return myType;}
}