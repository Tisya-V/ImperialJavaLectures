package lecture1.examples.dice;

public class Main {
    public static void main(String[] args) {
        int guess = Integer.parseInt(args[0]);
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println("You guessed: " + guess);
        System.out.println("The dice rolled to " + d1.getTop() + ", " + d2.getTop());
        System.out.println("The sum is " + (d1.getTop() + d2.getTop()));
        System.out.println(guess == d1.getTop() + d2.getTop() ? "You got lucky" : "Loser");
    }
}