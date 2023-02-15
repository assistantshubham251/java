interface Sports{

    public void homeTeam(String name);
    public void team(int noOfPlayers);
}

interface Event{
    public void eventName(String name);
    public void eventDate(String date);
    public void eventPlace(String place);
}

  class FootBall implements Sports,Event {
     public void homeTeam(String name) {

         System.out.println("Our team is representing:" + name);
     }

     public void team(int noOfPlayers) {
         System.out.println("Total no of players:" + noOfPlayers);
     }

     public void goals(int score) {
         System.out.println("Total goals of team:" + score);
     }

     public void eventName(String ename) {
         System.out.println("Event Company Name:" + ename);
     }

     public void eventDate(String edate) {
         System.out.println("Sport match date:" + edate);
     }

     public void eventPlace(String place) {
         System.out.println("Sport at:" + place);
     }
 }

class InterfaceExample{
    public static void main(String[] args) {
        FootBall b = new FootBall();
        b.homeTeam("Maharashtra");
        b.team(11);
        b.goals(2);
        b.eventName("FIFA");
        b.eventDate("21st Mar,2023");
        b.eventPlace("London");


    }
}








