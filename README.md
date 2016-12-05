# EXAM: Java Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.

# Tasks
## 1. Setup a new project (~5 mins) [5p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
    - Just the src directory should be committed
- Create a package called `com.greenfox.exams.java` and work under that

## 2. The BlackJack Application (~90 mins) [15p]
The task is to create a `BlackJack` application where a `user` `Player` can play BlackJack with the `house` `Player`. The game should have a very simple graphical user interface with two labels (one for the user and one for the house) and two buttons for draw and for resetting the game.

![Start](bj_start.png)

When a new game started a new `Deck` should be generated with 52 randomly ordered `Card`s in it.
When the user hits the `drawCard` button the top card of the deck should be added to the users `played` cards. If the house's played cards sum is under 17 it will draw automatically. After drawing the labels should be updated.

One card drawn:

![Round one](bj_1.png)

Two cards drawn:

![Round two](bj_2.png)

**Layout is not important just put everything in one JPanel with the default layout (no need to change that)**

When the user hits the `reset` button, a new Deck should be generated and players should be reset as well.

### Information on the elements
- Tests will be run on your code
    - use names in the code whats used in the description
    - don't use visibility on fields
    - don't use accent in strings or in comments
    - otherwise tests will fail probably
- The `BlackJack`
    - should be a `JPanel`
    - should have two buttons, a `user` and a `house` `Player`s and a `deck`
    - should handle the button actions in one method
- The `Deck`
    - should contain two lists: `cards` and `used`, all cards should be in the cards list and after used it should go in to the used list.
    - you can use the `Collection.shuffle(list)` for shuffling the deck
    - if all cards are used `null` should be returned when drawing from the deck
- The `Card`
    - should have a color and a value
    - should have a getter for the value
    - should be displayed as `"color value"` eg. `"karo 7"`
- The `Player`
    - should have a name
    - should have a list where it stores its `played` cards
    - should be able to `sum` the value of its played cards
    - should be able to `add` a new card to its played cards
    - should be added to the panel and displayed as shown: `"Name played: color value..."` eg. `"User played: kor 7 karo 4 "`
- In your main method
    - create a JFrame
    - add BlackJack panel to it
    - make it visible

### Acceptance criteria
The application is accepted if:
- All tests pass
- You can check your results here: http://gf-exam.mobil.ninja/
    - In order to register your work you have to create a Pull Request on Github
    - Go to your forked repo (https://github.com/yourname/zerda-java-basics)
    - Click `New pull request`
    - Then `Create pull request`
    - After the pull request created your every commit will be evaluated on the site
    - You can check your results

## 3. Understand the code (~10 mins) [4p]
```java
class Apple {
  public int add(int a, int b) {
    return 5;
  }

  public int max_of_three(int a, int b, int c) {
    if (a > b) {
      return a;
    }
    return c;
  }
}

class TestApple {
  public void testAdd() {
    assertEquals(5, Apple.add(2, 3));
  }

  public void testMax() {
    assertEquals(5, Apple.max_of_three(3, 4, 5));
  }
}
```

Are the tests passing? Detail your answer! [2p] Fix the situation! [2p]

#### Explain what you did, and answer the questions here:



## 4. Question time! (~20 mins) [6p]

### Where the abstract class is useful? [2p]
#### Your answer:
The abstract class is useful, when two or more subclasses are expected to do the similar thing, method in different ways.
For example the instrument workshop we've done, where there were 3 instrument , they all have string numbers, and play methods.
So we used an abstract class to define these similarities. 
And afterwards we could customize it in every instrument class, as it was required.
The important thig is that, all of the classes that extends an abstract class, have to declare implementations of its abstract methods.

### Describe a method! Show the necessary parts and how are them called! [2p]
#### Your answer:
 1 public   2 void   3 exampleMethod   4(int i, int j)   5{};

1: this part defines the acces level of the method, can be public, private, protected
2: defines the return value, in this case it returns nothing, if it was String, the method would have to return a string value
3: the name of the method, always starts with lowercase, has to be meaningful
4:place for parameters
5: the curly braces contains the method "body", here we can emphasize all the functionalities we want this method for.



### What is the constructor? When it is used? [2p]
#### Your answer:
A Constructor is for creating an instance of a class/object. So it is  invoked exactly at the 
time of the creation of the specified object. We use it to give special parametersto an object, or initialize it properly .
There are two types, the default constructor(it is created even if it I do not declare it) which
 has no parameters, and the parameterized which has, obviously.
