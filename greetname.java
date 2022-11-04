class greetname extends basic
{
    public static void main (String param[]) throws Exception
    {
        output out = new output();
        String yourname = "";
        input in = new input();

        out.write("What's your name? ");
        yourname = in.readline();

        out.write("Hello ");
        out.writeln(yourname);

        out.close();
        in.close();
    }
}
