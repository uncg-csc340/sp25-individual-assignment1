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


        User Rafael = new User( "Rafael Venegas" ,
                """
                        This is my second year at UNCG as a computer student. I like to code and learn about programming and I like to
                        play videogames. I was born in High Point, North Carolina. I hope to be able to get a job in either creating
                        some type of app/web application or game development when I graduate. 
                                       """
        );

        classList.add(Rafael);

        User Husnain = new User("Husnain Rafique",
                """
                        I like to play Cricket and working full time. Whenever, i get free time at work,
                        I do like to read self-improvement books recent one is " 12 Rules of Life " by Jordan B. Peterson.
                        I enjoy watching law drama serial, favorite one is "Suits". """);
        classList.add(Husnain);


        User sajid = new User("Mohamed Sajid Gani Shajahan",
                """
                        I am a sophomore. I am currently pursuing my BS in Computer Science
                        at UNCG. I like soccer and video games.
                        Just like most basic people, I also love cars and other automobiles. 
                        """
        );
        classList.add(sajid);

        User hung = new User( "Hung Nguyen" ,
                """
                        This is my second year at UNCG as a transfer student from California. During my free time, I usually play 
                        video game or watch movie. The latest movie that I watched is "Monster" by director Kore-eda (recommend to
                        anyone who enjoy the drama genre)
                        """
        );
        classList.add(hung);

        User lbowles = new User("Logan Bowles",
                """
                        I am a Senior at UNCG and also work for Apple as a College advisor.  I live a super boring life.
                        Because of that, I can really easily chronicle my every day here; I wake up at 6 in the morning,
                        make an egg-white omelette, go to the gym, then to classes, I get home and eat an amalgamation of 
                        lunch/dinner, appropriately coined: 'Linner', then work until 11 PM EST.  If my friends are up, we play
                        Valorant or R6S to make my night worse; I then play until I'm tilted and have to sleep.  Then I repeat.
                        """

        );
        classList.add(lbowles);

        /*
        ADD A NEW USER USING YOUR NAME AND BIO ABOVE, THEN ADD THE USER TO THE CLASSLIST AS SHOWN.
         */
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
