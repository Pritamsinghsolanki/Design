package org.example.DesignPatterns.Behavioral.Template;

/*When to Use?

When the algorithm steps are fixed, but some parts vary.*/
public class Main {
    public static void main(String[] args)
    {
        Game game = new Football();
        game.play();

        Game game2 = new Cricket();
        game2.play();
    }
}
