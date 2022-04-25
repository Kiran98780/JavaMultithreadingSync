public class Synch2
{
    int tickets = 3;
    static int i = 1, j = 2, k = 3;
    public void bookticket (String name, int wantedtickets)
    {
        if (wantedtickets <= tickets)
        {
            System.out.println (wantedtickets + " booked to " + name);
            tickets = tickets - wantedtickets;
        }
        else
        {
            System.out.println ("No tickets to book");
        }
    }
    public void start1 (String names)
    {
        String name = names;
        if (name.equals ("t1"))
        {
            bookticket (name, i);
        }
        else if (name.equals ("t2"))
        {
            bookticket (name, j);
        }
        else
        {
            bookticket (name, k);
        }
    }

    public static void main (String[]args)
    {
        Synch2 s1 = new Synch2 ();

        //Thread t1 = new Thread (s);
       // Thread t2 = new Thread (s);
        //Thread t3 = new Thread (s);
        //t1.setName ("t1");
        //t2.setName ("t2");
        //t3.setName ("t3");
        s1.start1 ("t1");
        s1.start1 ("t2");
        s1.start1 ("t3");
    }
}