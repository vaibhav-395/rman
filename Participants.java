public class Participants {
    static int counter;
    String name, branch;
    String  registrationId;
    long contactNumber;

    static {
        counter = 1001;
    }

   //this is a parameterised constructor
   public Participants(String name, String branch, long contactNumber) {
       this.name = name;
       this.contactNumber = contactNumber;
       this.branch = branch;
       this.registrationId = "D" + counter;
       Participants.counter++;
   }

    //getter methods
    public String getRegID() {

        return this.registrationId;
    }
    public String getName() {

        return this.name;
    }
    public long getContact_number() {

        return this.contactNumber;
    }
    public static int getCounter() {

        
        return Participants.counter = counter;
    }
    //setter methods
    public void setCounter(int counter) {

        this.counter = counter;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setContact_number(long contactNumber) {

        this.contactNumber =contactNumber;
    }
    public void setBranch (String branch){

        this.branch = branch;
    }
}



