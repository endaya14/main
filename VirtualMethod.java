public class VirtualMethod {
    public static void main(String[] args) {
        Bird angrybird = new Peacock();
        angrybird.displayBirdInfo();
        
    }
}

    class Bird{
        public String getName(){
            return "unknown";
        }
        public void displayBirdInfo(){
            System.out.println("Bird name is " + getName());
        }
        
    }
    class Peacock extends Bird{
            public String getName(){
                return "Peacock";
            }


        }
   


        

