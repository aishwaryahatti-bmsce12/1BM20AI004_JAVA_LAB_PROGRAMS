import java.util.Random;
enum move{
rock,paper,scissor
}

class rps
{
  move usermove;
  move computermove;

  public void getUserMove(move um)
  {
    usermove=um;
    System.out.println("User's move = "+usermove);
  }

  public void getComputerMove()
  {
    int computersNum;
    Random random = new Random();
    computersNum = random.nextInt(3) + 1;
    if (computersNum == 1)
    {
      computermove = move.rock;
    }
    else if (computersNum == 2)
    {
      computermove = move.paper;
    }
    else 
    {
      computermove = move.scissor;
    }
    System.out.println("Computer's move = "+computermove);
  }
  public void getResult()
  {
    if (usermove.equals(computermove))
      System.out.println("It's a tie!");
    else if (usermove.equals(move.rock))
    {
      if (computermove.equals(move.scissor))
        System.out.println("You win!! Rock crushes scissors.");
      else if (computermove.equals(move.paper))
        System.out.println("You lose!! Paper eats rock.");
    }
    else if (usermove.equals(move.paper))
    {
      if (computermove.equals(move.rock))
        System.out.println("You win!! Paper eats rock.");
      else if (computermove.equals(move.scissor))
        System.out.println("You lose!! Scissor cuts paper.");
    }
    else if (usermove.equals(move.scissor))
    {
      if (computermove.equals(move.paper))
        System.out.println("You win!! Scissor cuts paper.");
      else if (computermove.equals(move.rock))
        System.out.println("You lose!! Rock breaks scissors.");
    }
    else
      System.out.println("Invalid user input.");
  }
}

class RockPaperScissor
{
  public static void main(String[] args)
  {
    move m=move.scissor;
    rps t = new rps();
    t.getUserMove(m);
    t.getComputerMove();
    t.getResult();
  }
}
