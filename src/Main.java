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

        User jared = new User("Jared Martinez",
                """
                        I am a junior at UNCG. I live in a small town near Virginia called Eden. 
                        If im not working or at school I'll usaully just spend my time with my girlfriend. 
                        I also love watching and playing soccer and I am Huge Real Madrid fan. 
                        """
        );
        classList.add(jared);                          

        User granados = new User("Brian Granados",
         """
                 I'm currently a junior pursuing my Bachelors in 
                 Computer Science at UNCG. I love listening to 
                 music, and I also like playing video games in my spare time.
                 """
         );
        classList.add(granados);

        User anthony = new User("Anthony Lai",
                """
                        I am a senior at UNCG. I am pursuing a second bachelor's degree in Computer Science. I spent
                        time in the military, then after a bit of time, enrolled in UNCG.
                        I am originally from California, but now I live here with my girlfriend. I mainly go to the gym
                        in my free time, and I enjoy the quiet life at home just watching tv/movies and playing with my dog.
                        """
        );
        classList.add(anthony);

        User adrian = new User("Adrian Sam",
                """
                        My name is Adrian Sam. I am a computer science student at UNCG.
                        I am from greensboro so i commute and i love listening to music and watching shows on my free time
                        """
        );
        classList.add(adrian);

        User fady = new User("Fady Eskandr",
                """
                        I am a senior in computer science in UNCG and I love breaking down cars and rebuilidng them
                        in my spare time. I am originally from Egypt and am working on picking up a third language in my spare time
                        or try to be outdoors as much as I can. 
                        """
        );
        classList.add(fady);

        User foday = new User("Isaac Foday Mami",
        """
                I am a senior in Business Administration here with a minor in Computer Science. I exercise a lot and enjoy
                playing basketball and running. I am currently in the army national guard and I also work at a local company
                apexanalytix as a corporate trainer. On my freetime I produce music and volunteer at church.
                """
        );
        classList.add(foday);

        User yasmine = new User("Yasmine Chiboub",
                """
                        I am a sophomore at UNCG. I am majoring in Computer Science. I was raised in Greensboro, 
                        but I was born in Casablanca, Morocco. In my free time I like to learn more about my religion, 
                        read books, take photos for my account, I love the outdoors or hiking (anything that has a forest),
                        and going to the gym. 
                        """
        );
        classList.add(yasmine);

        User lily = new User("Lily Nguyen",
                """
                        Hi, I'm Lily. I am senior at UNCG. I transferred to UNCG as a computer science major after
                        doing two years as a biology major at App State. In my free time I'm usually spending time at 
                        the gym or with my boyfriend. I am a competitive bodybuilder and compete in my first pro show in
                        September this year. 
                        """
        );
        classList.add(lily);

        User robertson = new User("Robertson Siu",
                """
                        I am a senior and a Computer Science major at UNCG.
                        I like to play games, listen to music, play basketball and read manga/manhwa/manhua.
                        I'm from Greensboro but currently live in High Point.
                        """
        );
        classList.add(robertson);

        User Elijah = new User("Elijah Alford",
                """
                        I am a junior majoring in Computer Science at UNCG.
                        I like to play video games and basketball, watching football (Go Steelers),and being outdoors.
                        I'm from Fayetteville, North Carolina.
                        """
        );
        classList.add(Elijah);
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
