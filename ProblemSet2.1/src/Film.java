public class Film {
    private String director, title;
    private int duration;
    static int filmNo=0;

    //Accessor Method for String data type : director : return type : String
    public String getDirector()
    {
        return  director;
    }

    //Accessor Method for String data type : title : return type : String
    public String getTitle()
    {
        return title;
    }

    //Accessor Method for Integer data type : duration : return type : int
    public int getDuration()
    {
        return duration;
    }

    //Mutator Method for String data type : director : return type : void
    public void setDirector(String director)
    {
        this.director = director;
    }

    //Mutator Method for String data type : title : return type : void
    public void setTitle(String title)
    {
        this.title = title;
    }

    //Mutator Method for Integer data type : duration : return type : void
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    //No Argument Constructor Method
    public Film ()
    {
        this("", "", 0);
        filmNo++;
    }

    //Three Argument Constructor Method : String, String, Int
    public Film(String director, String title, int duration)
    {
        setDirector(director);
        setTitle(title);
        setDuration(duration);
        filmNo++;
    }

    //toString Method which displays the attributes of Film Objects
    // in a formatted fashion.
    public String toString()
    {
        String details = String.format("%-8s : %s\n%-8s : %s\n%-8s : " +
                "%d mins\n\n", "Director", getDirector() , "Title", getTitle(),
                "Duration", getDuration());

        return details;
    }
}
