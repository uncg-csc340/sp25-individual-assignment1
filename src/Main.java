import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "about-me.txt";

    public static void main(String[] args) {
        List<User> classList = new ArrayList<>();

        User sunny = new User("Sunny Ntini",
                """
                        I am a lecturer of Computer Science. I have an MS in Comp Sci from UNCG, and a BS in Computer Science
                        from Indiana University of Pennsylvania. I like (some) superheroes and puzzles.
                        Just like most basic people, I like hiking. I also like history tidbits (ask me about my favorite
                        podcasts). I'm currently reading Medium Raw by uncle Tony (Bourdain).
                        This is the way.
                        """
        );
        classList.add(sunny);

        User nandor = new User("Nandor DeLaurentis",
                """
                        I was a very ferocious warrior in the Ottoman Empire, which meant doing a lot of things. A lot
                        of pillaging. People would say 'hey please don’t pillage me' and I would say 'nooooo, I’m 
                        pillaging everyone, you included'. I was relentless. They would call me Nandor The Relentless. 
                        Because I just never relent.
                        """
        );
        classList.add(nandor);

        User eduardo = new User("Eduardo Herrera-Barraza",
                """
                        I am 3rd year computer science student here at UNCG. I am really excited to complete my 
                        degree and begin working. I am orginally from the city of Goldsboro,North Carolina. I really 
                        enjoy going for walks and listinging to music, and I also really enjoy learning new languages.I also have 
                        2 cats!
                        """
        );
        classList.add(eduardo);
        
        

        User Wahhab = new User( "Wahhab Rasheed" ,
                """
                        I am a 2nd year computer science student at UNCG. I have a passion for creative 
                        endeavors such as writing stories and sketching. I was born in Queens, New York and moved to
                        North Carolina. I love to travel and hope to travel the world someday.
                        """
        );

        classList.add(Wahhab);

        writeFile(classList);
    }

    private static void writeFile(List<User> classList) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(FILE_NAME);
            for (User user : classList) {
                writer.write(user.toString());
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("IO Exception");
        }


    }
}
