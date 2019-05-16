package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        Email e1 = new Email("JON", "DOE");
       // e1.setMailBoxCapacity(300);
       // e1.setAlternateEmail("xxxx@onecompany.com");
        //System.out.println(e1.getAlternateEmail());
        System.out.println(e1.showInfo());
    }
}

