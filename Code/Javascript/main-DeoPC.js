let humanScore = 0;
let computerScore = 0;

function getComputerChoice() {
  let computer = Math.floor(Math.random() * 3) + 1;

  if (computer === 1) {
    console.log("Computer: rock");
    return "rock";
  } else if (computer === 2) {
    console.log("Computer: paper");
    return "paper";
  } else {
    console.log("Computer: scissor");
    return "scissor";
  }
}
function getHumanChoice() {
  let human = parseInt(
    prompt("1 - Rock \n 2 - Paper \n 3 - Scissor \n Please Choose: ")
  );

  switch (human) {
    case 1:
      console.log("Player: rock");
      return "rock";
    case 2:
      console.log("Player: paper");
      return "paper";
    case 3:
      console.log("Player: scissor");
      return "scissor";
  }
}
function playRound(humanChoice, computerChoice) {
  if (
    (humanChoice === "rock" && computerChoice === "scissor") ||
    (humanChoice === "paper" && computerChoice === "rock") ||
    (humanChoice === "scissor" && computerChoice === "paper")
  ) {
    humanScore++;
    console.log(
      "You Win," +
        humanChoice +
        " beats " +
        computerChoice +
        "\nYour Score: " +
        humanScore
    );
  } else if (
    (computerChoice === "rock" && humanChoice === "scissor") ||
    (computerChoice === "paper" && humanChoice === "rock") ||
    (computerChoice === "scissor" && humanChoice === "paper")
  ) {
    computerScore++;
    console.log(
      "You Lose, " +
        computerChoice +
        " beats " +
        humanChoice +
        "\nComputer Score: " +
        computerScore
    );
  } else {
    console.log("It's a Tie");
  }
}
function playGame() {
  for (let i = 1; i <= 5; i++) {
    console.log(i);
    const humanChoice = getHumanChoice();
    const computerChoice = getComputerChoice();
    playRound(humanChoice, computerChoice);
  }
  console.log("Score\nPlayer: " + humanScore + "\nComputer: " + computerScore);
  if(humanScore == computerScore){
    return console.log("It's a Tie");
  }else if(humanScore > computerScore){
    return console.log("Player Win");
  }else{
    return console.log("You Lose");
  }
}

playGame();
