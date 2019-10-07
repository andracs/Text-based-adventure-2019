package Skabninger;

public class Hund extends SkabningsPrototype {
    public Hund() {
        super();
        this.navn = "Falconhoof";
        this.beskrivelse = "Host of Limmy's Show.";
        this.vaegt = 90;

        laerNytEmne("Kill Jester", "you can't kill jester, jester is our friend!");
        laerNytEmne("Left", "you can't go lef- what do yo- what do you mean with left? there is no left!?");
        laerNytEmne("I wanna go left", "There is a castle infront of you, there is no LEFT!!!");
        laerNytEmne("It's my adventure right? kill Jester.", "Jester is INTEGRAL to our journey!!");
        laerNytEmne("Kill the Jester", "Fine. Jester is dead, you can now continue on your adventure");
        laerNytEmne("Nice One Mate, well worth it", "*Confusion*");
    }
}
