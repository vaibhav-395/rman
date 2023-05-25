public class Main {
    public static void main(String[] args) {
       Participants p1 = new Participants("Rohit", "ETC", 999999999);
       Participants p2 = new Participants("Sayali", "ETC", 999999999);
       Participants p3 = new Participants("Punit", "ETC", 999999999);
       Participants p4 = new Participants("Patrick", "ETC", 999999999);
       System.out.println("hi " + p1.getName() + " your registrationId is " + p1.getRegID());
       System.out.println("hi " + p2.getName() + " your registrationId is " + p2.getRegID());
       System.out.println("hi " + p3.getName() + " your registrationId is " + p3.getRegID());
       System.out.println("hi " + p4.getName() + " your registrationId is " + p4.getRegID());

    }
}