
public class OutClass 
{

    public static void main(String[] args) 
    {
        OutClass outclass = new OutClass();
        outclass.play();
        Inner innerclass = new Inner("jerry");
        innerclass.innerfunction();



    }

    private String name;

    public void play() 
    {
        System.out.println("outclass play function");

    }

    public static class Inner
    {

        private String innername;

        public void innerfunction() 
        {

            System.out.println("Inner function:" + innername);
        }

        public Inner(String name) 
        {

            this.innername = name;

        }


    }


}
