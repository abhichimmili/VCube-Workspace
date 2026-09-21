# 🎮 Tic-Tac-Toe Game in Java

## 📌 Project Description

This is a simple **console-based Tic-Tac-Toe game** developed using Java.

The game is played between two players:

* Player **X**
* Player **O**

The players take turns entering the row and column positions where they want to place their symbol. The program validates the entered position, updates the board, checks for a winner, and determines whether the match ends in a draw.

---

## 🛠️ Concepts Used

This project is mainly developed using fundamental Java concepts.

### 1. Conditional Statements

Conditional statements are used to make decisions in the program.

Concepts used:

* `if`
* `else if`
* `else`
* Ternary operator `?:`

Examples of usage:

* Checking whether a position is valid.
* Checking whether a position is already occupied.
* Checking whether the board is full.
* Checking whether a player has won.
* Switching between Player X and Player O.

---

### 2. Loops

Loops are used to repeatedly execute operations.

Concepts used:

* `for` loop
* `while` loop
* `do-while` loop

Examples of usage:

* Displaying the Tic-Tac-Toe board.
* Checking rows, columns, and diagonals for a winner.
* Checking whether the board is full.
* Repeatedly taking input from players until a valid position is entered.
* Continuing the game until the board becomes full.

---

### 3. Arrays

A two-dimensional array is used to represent the Tic-Tac-Toe board.

```java
static String[][] board = new String[ROW][COL];
```

The board contains:

* `3` rows
* `3` columns

Each position stores either:

* `"X"`
* `"O"`
* `null` for an empty position

---

### 4. Methods

The program is divided into multiple methods to improve readability and modularity.

Methods used:

* `displayBoard()` – Displays the current game board.
* `choosePosition()` – Takes row and column input from the player.
* `positionValid()` – Checks whether the selected position is valid and available.
* `fillBoard()` – Places the player's symbol on the board.
* `isBoardFull()` – Checks whether all positions are filled.
* `changePlayer()` – Switches between Player X and Player O.
* `checkWinner()` – Checks and displays the winner.
* `isWin()` – Checks rows, columns, and diagonals for a winning combination.

---

### 5. Scanner Class

The `Scanner` class is used to take input from the user.

```java
Scanner sc = new Scanner(System.in);
```

The player enters:

* Row number
* Column number

Example:

```text
Enter the row: 0
Enter the col: 1
```

---

### 6. String Comparison

The game uses the `equals()` method to compare player symbols.

```java
player.equals(board[i][j])
```

This avoids problems when comparing String values and safely handles empty board positions.

---

### 7. Static Variables and Methods

Since the game is implemented inside a single class, `static` variables and methods are used to access the board and game data directly from the `main()` method.

---

## 🎯 Game Rules

1. The game is played on a `3 × 3` board.
2. Player **X** starts the game.
3. Players take turns placing their symbol.
4. A position cannot be selected if it is already occupied.
5. The entered row and column must be within the board range.
6. A player wins by placing three identical symbols in:

   * A row
   * A column
   * The main diagonal
   * The reverse diagonal
7. If all positions are filled and no player wins, the match ends in a draw.

---

## 🧠 Winner Checking Logic

The program checks for four possible winning conditions:

### Row

```text
X | X | X
```

### Column

```text
X
X
X
```

### Main Diagonal

```text
X |   |
  | X |
  |   | X
```

### Reverse Diagonal

```text
  |   | X
  | X |
X |   |
```

---

## 📚 Fundamental Java Concepts Practiced

This project helped in practicing the following Java fundamentals:

* Variables
* Data Types
* Operators
* Conditional Statements
* Loops
* Arrays
* Two-Dimensional Arrays
* Methods
* Method Calls
* Parameters and Return Types
* Static Variables and Methods
* String Comparison
* Ternary Operator
* User Input using Scanner
* Program Flow Control

---

## ▶️ How to Run the Program

1. Clone or download the project.
2. Open the project in a Java IDE such as Eclipse or IntelliJ IDEA.
3. Run the `Tic_Tac_Toe.java` file.
4. Enter the row and column position when prompted.
5. Continue playing until a player wins or the game ends in a draw.

---

## 💻 Sample Output

```text
        TIC - TAC - TOE

Let's start the game....

******** Your Board ********

    -------------
    |   |   |   |
    -------------

Player X turn

Enter the row:
0

Enter the col:
0
```

---

## 🚀 Future Improvements

Some possible improvements for this project include:

* Handling invalid non-numeric input.
* Allowing the user to play multiple games.
* Adding a score counter.
* Adding a computer opponent.
* Creating a graphical user interface (GUI).
* Allowing the board size to be customized.

---

## 👩‍💻 Author

**Java Tic-Tac-Toe Project**

A console-based project created to practice fundamental Java programming concepts including **conditional statements, loops, methods, arrays, and user input**.
