package pl.com.generic;

import pl.dwasiedemPAX.animal.Animal;
// generic
// only Animals and extends
// method enterHome (xxx)
// method goOutside (xxx)
// xxx = placeholder

public class Home <Zwierz extends Animal> {
    
    private Zwierz someone;

//        public Zwierz getZwierz(){ return someone; }
//        public void setZwierz (Zwierz someone){this.someone = someone;}
        
        public void enterHome (Zwierz someone){
           this.someone = someone;
           someone.whichAnimal();
        }

        public Zwierz goOutside (){
        return someone;
    }



}
