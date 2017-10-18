class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new Cow("Cow","moo");           
      aBunchOfAnimals[1] = new Bird("Bird","tweet");       
      aBunchOfAnimals[2] = new Dog("Dog","woof");    }         
   public void animalSounds()    
   {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       
     {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
   }
}